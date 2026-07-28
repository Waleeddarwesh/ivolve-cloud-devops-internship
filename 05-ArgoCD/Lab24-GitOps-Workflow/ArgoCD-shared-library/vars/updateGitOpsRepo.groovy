def call(Map config = [:]) {
    def workingDir = config.workingDir ?: '.'
    def manifestPath = config.manifestPath ?: 'manifests/deployment.yaml'
    def imageName = config.imageName ?: 'waleeddarwesh/jenkins-app'
    def imageTag = config.imageTag ?: env.BUILD_NUMBER
    def githubCredentialsId = config.githubCredentialsId
    def gitEmail = config.gitEmail ?: 'Waleeddarwesh2002@gmail.com'
    def gitUser = config.gitUser ?: 'waleeddarwesh'

    dir(workingDir) {
        echo "GitOps Action: Updating image tag in ${manifestPath} to ${imageName}:${imageTag}..."
        
        // Update manifest file image tag using sed
        sh "sed -i 's|image: .*|image: ${imageName}:${imageTag}|g' ${manifestPath}"
        
        if (githubCredentialsId) {
            echo "Pushing updated deployment manifest to GitHub for ArgoCD auto-synchronization..."
            withCredentials([usernamePassword(credentialsId: githubCredentialsId, passwordVariable: 'GITHUB_TOKEN', usernameVariable: 'GITHUB_USER')]) {
                sh """
                git config user.email "${gitEmail}"
                git config user.name "${gitUser}"
                git add ${manifestPath}
                git commit -m "ci(gitops): update image tag to ${imageName}:${imageTag} [skip ci]" || echo "No changes to commit"
                git push https://\$GITHUB_USER:\$GITHUB_TOKEN@github.com/\$GITHUB_USER/ivolve-cloud-devops-internship.git HEAD:main || echo "Git push completed or up to date"
                """
            }
        } else {
            echo "⚠️ Notice: githubCredentialsId not specified. Manifest updated locally."
        }
    }
}
