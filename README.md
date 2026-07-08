<div align="center">

# 🚀 iVolve Technologies — Cloud DevOps Internship

**A hands-on portfolio of labs, assignments, and projects completed during the Cloud DevOps internship at iVolve Technologies.**

![Progress](https://img.shields.io/badge/Progress-4%2F30_Labs-blue?style=flat-square)
![Status](https://img.shields.io/badge/Status-In_Progress-success?style=flat-square)
![Focus](https://img.shields.io/badge/Focus-Cloud_%26_DevOps-orange?style=flat-square)
![Last Commit](https://img.shields.io/github/last-commit/WaleedDarwesh/ivolve-cloud-devops-internship?style=flat-square)
![Repo Size](https://img.shields.io/github/repo-size/WaleedDarwesh/ivolve-cloud-devops-internship?style=flat-square)
[![License](https://img.shields.io/badge/License-MIT-green?style=flat-square)](LICENSE)

<p>
  <a href="#lab-catalog"><b>Labs</b></a> ·
  <a href="#architecture--learning-path"><b>Architecture</b></a> ·
  <a href="#current-progress"><b>Progress</b></a> ·
  <a href="#skills-youll-gain"><b>Skills</b></a> ·
  <a href="#contact"><b>Contact</b></a>
</p>

</div>

---

## 📑 Table of Contents

- [Overview](#overview)
- [Architecture & Learning Path](#architecture--learning-path)
- [Internship Overview](#internship-overview)
- [Skills You'll Gain](#skills-youll-gain)
- [Objectives](#objectives)
- [Tech Stack](#tech-stack)
- [Repository Structure](#repository-structure)
- [Lab Catalog](#lab-catalog)
  - [01 · Build Tools](#01--build-tools)
  - [02 · Docker](#02--docker)
  - [03 · Kubernetes](#03--kubernetes)
  - [04 · Jenkins (CI/CD)](#04--jenkins-cicd)
  - [05 · ArgoCD (GitOps)](#05--argocd-gitops)
  - [06 · Ansible](#06--ansible)
- [Current Progress](#current-progress)
- [What Each Lab Contains](#what-each-lab-contains)
- [Learning Philosophy](#learning-philosophy)
- [Purpose of This Repository](#purpose-of-this-repository)
- [Contact](#contact)

---

<a id="overview"></a>

## 📖 Overview

This repository documents my learning journey through the **Cloud DevOps internship** at **iVolve Technologies** — a structured, hands-on curriculum of **30 labs** spanning the modern DevOps toolchain.

The program moves progressively from **build automation** through **containerization**, **orchestration**, **CI/CD**, **GitOps**, and **configuration management**, culminating in cloud-native deployment on AWS. Each lab captures real, reproducible implementations — manifests, Dockerfiles, pipelines, scripts, screenshots, and lessons learned.

---

<a id="architecture--learning-path"></a>

## 🗺️ Architecture & Learning Path

The internship mirrors the real journey of an application — from source code all the way to a running cloud deployment. Each stage introduces the tool that owns that step in a production DevOps workflow:

```mermaid
flowchart TD
    A["☕ Java Application<br/><i>source code</i>"] --> B["🔨 Build &amp; Package<br/>Gradle · Maven"]
    B --> C["🐳 Containerize<br/>Docker"]
    C --> D["☸️ Orchestrate<br/>Kubernetes"]
    D --> E["⚙️ Continuous Integration &amp; Delivery<br/>Jenkins"]
    E --> F["🔄 GitOps Delivery<br/>ArgoCD"]
    F --> G["🤖 Configuration &amp; Provisioning<br/>Ansible"]
    G --> H["☁️ Cloud Deployment<br/>AWS"]
```

---

<a id="internship-overview"></a>

## 🧭 Internship Overview

The internship follows a progressive, project-based curriculum that builds skills layer by layer — from packaging an application, to shipping it in a container, to orchestrating, automating, and continuously delivering it. The **30 labs** are grouped into **six hands-on tracks**:

| # | Track | What It Covers | Labs |
|:-:|-------|----------------|:----:|
| 01 | 🔨 **Build Tools** | Building & packaging Java applications with Gradle and Maven | 2 |
| 02 | 🐳 **Docker** | Containerization, multi-stage builds, networking, volumes, and Compose | 7 |
| 03 | ☸️ **Kubernetes** | Container orchestration — workloads, storage, networking, and security | 11 |
| 04 | ⚙️ **Jenkins** | CI/CD pipelines, agents, and shared libraries | 3 |
| 05 | 🔄 **ArgoCD** | GitOps-driven continuous delivery workflows | 1 |
| 06 | 🤖 **Ansible** | Linux automation and configuration management | 5 |

> 📅 **Timeline:** Started July 2026 · 🚀 In Progress

---

<a id="skills-youll-gain"></a>

## 🎓 Skills You'll Gain

Practical, portfolio-ready competencies developed across the program:

| Domain | Skills |
|--------|--------|
| **Foundations** | Linux administration · Shell scripting · Git & GitHub workflows |
| **Build & Package** | Java build automation with Gradle & Maven · Artifact management |
| **Containers** | Docker image optimization · Multi-stage builds · Networking · Docker Compose |
| **Orchestration** | Kubernetes workloads, storage, networking, RBAC & resource management |
| **Automation & Delivery** | Jenkins CI/CD pipelines · GitOps with ArgoCD · Ansible configuration management |
| **Cloud & Ops** | AWS deployment · Infrastructure automation · Troubleshooting real environments |

---

<a id="objectives"></a>

## 🎯 Objectives

- Build a strong foundation in **Cloud & DevOps engineering**.
- Gain hands-on experience with **industry-standard tools**.
- Master modern **deployment and automation** workflows.
- Document every task to a **professional, reproducible** standard.
- Assemble a portfolio that demonstrates **practical DevOps skills**.

---

<a id="tech-stack"></a>

## 🛠 Tech Stack

| Category | Technologies |
|----------|--------------|
| Operating System | Linux |
| Version Control | Git, GitHub |
| Build Tools | Gradle, Maven |
| Programming | Java, Python, Bash |
| Containers | Docker, Docker Compose |
| Orchestration | Kubernetes |
| CI/CD | Jenkins |
| GitOps | ArgoCD |
| Configuration Management | Ansible |
| Cloud Platform | AWS |
| Database | MySQL |
| Web Server | Nginx |

---

<a id="repository-structure"></a>

## 📂 Repository Structure

```text
ivolve-cloud-devops-internship/
│
├── 01-Build-Tools/
│   ├── Lab01-Gradle/
│   └── Lab02-Maven/
│
├── 02-Docker/
│   ├── Lab03-SpringBoot-Container/
│   ├── Lab04-JAR-Container/
│   ├── Lab05-MultiStage-Build/
│   ├── Lab06-Environment-Variables/
│   ├── Lab07-Volumes-BindMounts/
│   ├── Lab08-Custom-Network/
│   └── Lab09-Docker-Compose/
│
├── 03-Kubernetes/
│   ├── Lab10-Taints/
│   ├── Lab11-Namespaces/
│   ├── Lab12-ConfigMaps-Secrets/
│   ├── Lab13-Persistent-Volumes/
│   ├── Lab14-StatefulSets/
│   ├── Lab15-Deployments/
│   ├── Lab16-Init-Containers/
│   ├── Lab17-Resource-Management/
│   ├── Lab18-Network-Policies/
│   ├── Lab19-DaemonSets/
│   └── Lab20-RBAC/
│
├── 04-Jenkins/
│   ├── Lab21-Role-Based-Authorization/
│   ├── Lab22-CI-CD-Pipeline/
│   └── Lab23-Shared-Libraries/
│
├── 05-ArgoCD/
│   └── Lab25-GitOps-Workflow/
│
├── 06-Ansible/
│   ├── Lab26-Initial-Configuration/
│   ├── Lab27-Playbooks/
│   ├── Lab28-Roles/
│   ├── Lab29-Vault/
│   └── Lab30-Dynamic-Inventory/
│
├── Assets/
│   └── Images/
│
└── README.md
```

---

<a id="lab-catalog"></a>

## 📚 Lab Catalog

Status legend: ✅ Completed · 🚧 In Progress · ⬜ Planned

<a id="01--build-tools"></a>

### 01 · Build Tools

| Lab | Title | Summary | Status |
|:---:|-------|---------|:------:|
| 01 | [Gradle](01-Build-Tools/Lab01-Gradle) | Build & package a Java calculator app with Gradle → `build/libs/calculator.jar`. | ✅ |
| 02 | [Maven](01-Build-Tools/Lab02-Maven) | Build & package a Java calculator app with Maven → `target/calculator.jar`. | ✅ |

<a id="02--docker"></a>

### 02 · Docker

| Lab | Title | Summary | Status |
|:---:|-------|---------|:------:|
| 03 | [Spring Boot Container](02-Docker/Lab03-SpringBoot-Container) | Containerize a Spring Boot app, building from source on a Maven + Java 17 base image. | ✅ |
| 04 | [JAR Container](02-Docker/Lab04-JAR-Container) | Package a pre-built JAR on a slim Java 17 image and compare the resulting image size. | ✅ |
| 05 | Multi-Stage Build | Split build and runtime into stages for a lean final image. | ⬜ |
| 06 | Environment Variables | Inject `APP_MODE` / `APP_REGION` via CLI flags, an env-file, and the Dockerfile. | ⬜ |
| 07 | Volumes & Bind Mounts | Run Nginx with a named volume for logs and a host bind mount for custom HTML. | ⬜ |
| 08 | Custom Network | Connect frontend/backend microservices over a user-defined bridge network. | ⬜ |
| 09 | Docker Compose | Orchestrate a Node.js + MySQL stack, expose health/readiness, and push to Docker Hub. | ⬜ |

<a id="03--kubernetes"></a>

### 03 · Kubernetes

| Lab | Title | Summary | Status |
|:---:|-------|---------|:------:|
| 10 | Taints & Tolerations | Isolate a node with a `node=worker:NoSchedule` taint. | ⬜ |
| 11 | Namespaces & Resource Quotas | Create the `ivolve` namespace and cap it to two pods via a ResourceQuota. | ⬜ |
| 12 | ConfigMaps & Secrets | Externalize MySQL config and base64-encoded credentials. | ⬜ |
| 13 | Persistent Volumes & PVCs | Provision a 1Gi `hostPath` PV with `ReadWriteMany` and a matching PVC. | ⬜ |
| 14 | StatefulSet + Headless Service | Run MySQL as a StatefulSet with persistent storage and a headless service. | ⬜ |
| 15 | Deployment + ClusterIP Service | Deploy a Node.js app with config/secret env vars behind a ClusterIP service. | ⬜ |
| 16 | Init Containers | Bootstrap the `ivolve` database and app user before the app starts. | ⬜ |
| 17 | Resource Requests & Limits | Set CPU/memory requests and limits and verify with `describe` / `top`. | ⬜ |
| 18 | Network Policies | Restrict ingress to MySQL (port 3306) to the application pods only. | ⬜ |
| 19 | DaemonSets | Roll out Prometheus `node-exporter` on every node, tolerating all taints. | ⬜ |
| 20 | RBAC & Service Accounts | Grant a `jenkins-sa` account read-only access to pods via Role + RoleBinding. | ⬜ |

<a id="04--jenkins-cicd"></a>

### 04 · Jenkins (CI/CD)

| Lab | Title | Summary | Status |
|:---:|-------|---------|:------:|
| 21 | Role-Based Authorization | Configure admin and read-only users with Jenkins RBAC. | ⬜ |
| 22 | CI/CD Pipeline | Test → build → image → push → update manifest → deploy to Kubernetes, with post actions. | ⬜ |
| 23 | Agents & Shared Libraries | Reuse pipeline logic across jobs via a shared library on a Jenkins agent. | ⬜ |

<a id="05--argocd-gitops"></a>

### 05 · ArgoCD (GitOps)

| Lab | Title | Summary | Status |
|:---:|-------|---------|:------:|
| 25 | GitOps Workflow | CI builds and pushes an image, commits the updated manifest, and ArgoCD auto-syncs it. | ⬜ |

> ℹ️ Lab 24 is intentionally omitted from the program's numbering.

<a id="06--ansible"></a>

### 06 · Ansible

| Lab | Title | Summary | Status |
|:---:|-------|---------|:------:|
| 26 | Initial Configuration | Set up Ansible, exchange SSH keys, build inventory, and run ad-hoc commands. | ⬜ |
| 27 | Playbooks | Automate Nginx installation and a custom web page on a managed node. | ⬜ |
| 28 | Roles | Structure reusable roles for Docker, `kubectl`, and Jenkins. | ⬜ |
| 29 | Vault | Provision MySQL with an `ivolve` DB and user, securing secrets with Ansible Vault. | ⬜ |
| 30 | Dynamic Inventory | Auto-discover tagged AWS EC2 hosts and run the MySQL role against them. | ⬜ |

---

<a id="current-progress"></a>

## 📈 Current Progress

> 📅 **Last Updated:** July 2026

**4 of 30 labs complete — 13.3%**

```text
████░░░░░░░░░░░░░░░░░░░░░░░░░░░░  13.3%
```

---

<a id="what-each-lab-contains"></a>

## 📦 What Each Lab Contains

Every lab is self-documenting and may include:

- 📄 A dedicated `README.md` with objectives and step-by-step instructions
- ⚙️ Configuration files, Dockerfiles, and Kubernetes manifests
- 🤖 Automation scripts (Bash, Ansible, pipelines)
- 📷 Screenshots verifying the working result
- 💡 Troubleshooting notes, best practices, and key takeaways

---

<a id="learning-philosophy"></a>

## 💡 Learning Philosophy

Each lab focuses on understanding not only **how** a technology works, but **why** it is used in real-world DevOps workflows. Every implementation is accompanied by documentation, troubleshooting notes, and best practices — so the repository serves as both a record of progress and a practical reference I can return to.

---

<a id="purpose-of-this-repository"></a>

## 📌 Purpose of This Repository

This repository serves as:

- 📚 A personal **knowledge base** for Cloud & DevOps.
- 💼 A professional **portfolio** of hands-on work.
- 🚀 A living record of my **internship journey**.
- 📖 A **reference** for future projects and implementations.

---

<a id="contact"></a>

## 📬 Contact

<div align="center">

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Waleed_Darwesh-0A66C2?style=flat-square&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/waleeddarwesh1)
[![GitHub](https://img.shields.io/badge/GitHub-WaleedDarwesh-181717?style=flat-square&logo=github&logoColor=white)](https://github.com/WaleedDarwesh)
[![Email](https://img.shields.io/badge/Email-Contact-EA4335?style=flat-square&logo=gmail&logoColor=white)](mailto:Waleeddarweshsaad1@gmail.com)

</div>

---

<div align="center">

⭐ **If you find this repository helpful, consider giving it a star.** ⭐

_Thank you for visiting my Cloud DevOps internship repository!_

</div>
