<div align="center">

# ⚙️ ArgoCD GitOps Jenkins Shared Library

**A specialized, reusable Groovy component library designed specifically for GitOps Continuous Integration workflows with ArgoCD.**

</div>

---

## 📌 Overview

This repository serves as a **Jenkins Shared Library**, enabling developers and DevOps engineers to write modular, DRY (Don't Repeat Yourself) Jenkins pipelines.

In a pure GitOps architecture, **Jenkins updates Git, while ArgoCD updates Kubernetes**:
1. **BuildApp**: Compiles and packages the Java application via Maven.
2. **BuildImage**: Builds and pushes Docker images to Docker Hub.
3. **Update GitOps Repository (`updateGitOpsRepo`)**: Updates `manifests/deployment.yaml` with the new image tag and pushes the commit back to **GitHub**.
4. **ArgoCD Reconciliation**: ArgoCD detects the new commit in Git and automatically synchronizes the Kubernetes cluster.

---

## 📂 Repository Structure

```text
ArgoCD-shared-library/
│
├── vars/
│   ├── buildApp.groovy          # Compiles Java code via Maven (mvn clean package)
│   ├── buildImage.groovy        # Builds and pushes Docker images to Docker Hub
│   └── updateGitOpsRepo.groovy  # Updates deployment.yaml & pushes commit to GitHub for ArgoCD
│
└── README.md
```

---

## 🚀 How to Use (GitOps Pipeline)

Import the library in your `Jenkinsfile` and invoke the parameterized functions:

```groovy
@Library('shared-library') _

pipeline {
    agent {
        label 'devops-agent'
    }

    stages {
        stage('BuildApp') {
            steps {
                buildApp(workingDir: '<PATH_TO_APPLICATION>')
            }
        }

        stage('BuildImage') {
            steps {
                buildImage(
                    workingDir: '<PATH_TO_APPLICATION>',
                    imageName: '<YOUR_DOCKERHUB_USERNAME>/<IMAGE_NAME>',
                    dockerCredentialsId: 'dockerhub'
                )
            }
        }

        stage('Update GitOps Repository') {
            steps {
                updateGitOpsRepo(
                    workingDir: '<PATH_TO_APPLICATION>',
                    manifestPath: 'manifests/deployment.yaml',
                    imageName: '<YOUR_DOCKERHUB_USERNAME>/<IMAGE_NAME>',
                    githubCredentialsId: 'github-creds'
                )
            }
        }
    }

    post {
        always {
            echo 'Pipeline execution completed.'
            cleanWs()
        }

        success {
            echo 'GitOps repository updated successfully.'
            echo 'ArgoCD will automatically synchronize the new application version to Kubernetes.'
        }

        failure {
            echo 'Pipeline execution failed.'
        }
    }
}
```

---

## 🛠 Available Functions

### `buildApp(Map config = [:])`
Executes a Maven build to compile and package a Java application while skipping tests for faster deployment cycles.
* **`workingDir`** *(Optional)*: The directory where `pom.xml` is located. Defaults to `.`.

---

### `buildImage(Map config = [:])`
Builds a Docker image tagged with `${imageName}:${BUILD_NUMBER}` and pushes it to Docker Hub using stored Jenkins credentials.
* **`workingDir`** *(Optional)*: Directory containing `Dockerfile`. Defaults to `.`.
* **`imageName`** *(Optional)*: Target Docker Hub repository (e.g., `<YOUR_DOCKERHUB_USERNAME>/<IMAGE_NAME>`).
* **`imageTag`** *(Optional)*: Tag version. Defaults to `env.BUILD_NUMBER`.
* **`dockerCredentialsId`** *(Optional)*: Jenkins Credentials ID for Docker Hub authentication.

---

### `updateGitOpsRepo(Map config = [:])` *(GitOps Action)*
Updates the image tag in `manifests/deployment.yaml` via `sed` and commits/pushes the changes back to GitHub to trigger **ArgoCD auto-synchronization**.
* **`workingDir`** *(Optional)*: Working directory containing the manifest path.
* **`manifestPath`** *(Optional)*: Path to the deployment manifest (defaults to `manifests/deployment.yaml`).
* **`imageName`** *(Optional)*: Docker image repository name (e.g., `<YOUR_DOCKERHUB_USERNAME>/<IMAGE_NAME>`).
* **`imageTag`** *(Optional)*: New image tag to write into the manifest (defaults to `env.BUILD_NUMBER`).
* **`githubCredentialsId`** *(Optional)*: Jenkins Credentials ID for GitHub commit & push access.

---

> 💡 **Core GitOps Rule:** Jenkins updates Git ➔ Git triggers ArgoCD ➔ ArgoCD updates Kubernetes! No `kubectl` or direct cluster deployment in Jenkins!
