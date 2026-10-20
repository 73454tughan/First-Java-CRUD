# First Java CRUD Application

**Course Assignment:** First Java CRUD – 15.10  
**Repository:** [https://github.com/73454tughan/First-Java-CRUD](https://github.com/73454tughan/First-Java-CRUD)

---

## 👥 Team Members

| Role | Name | Student ID | GitHub Profile |
| :--- | :--- | :--- | :--- |
| **Repository Owner (Student A)** | Tughan Bulut Kurtulus | **73454** | [@73454tughan](https://github.com/73454tughan) |
| **Collaborator (Student B)** | Cihan Karayigit | **70407** | [@cihankara70407](https://github.com/cihankara70407) |

---

## 🚀 Overview

This repository contains a full-stack Java CRUD (Create, Read, Update, Delete) web application built using **Spring Boot** and **Vaadin**.

### Key Features:
- **Full CRUD Functionality**: Create, view, update, and delete customer records.
- **Dynamic Search & Filtering**: Live filter customers by last name.
- **Modern Responsive UI**: Built with Vaadin Flow components (Grid, Form layout, Buttons, Dialogs).
- **In-Memory H2 Database**: Pre-seeded with initial records on startup.
- **Git & GitHub Collaboration**: Pull Request workflow with contributions from both team members.

---

## 🛠️ Technology Stack

- **Java**: 17 (Eclipse Adoptium OpenJDK 17)
- **Framework**: Spring Boot 3.5.8
- **Frontend / UI**: Vaadin Flow 24.9.6
- **Persistence**: Spring Data JPA & Hibernate
- **Database**: H2 In-Memory Database
- **Build Tool**: Apache Maven (via included Maven Wrapper `mvnw`)

---

## 💻 How to Run Locally

### Prerequisites
- JDK 17 installed
- Git installed

### Steps

1. **Clone the repository:**
   ```bash
   git clone https://github.com/73454tughan/First-Java-CRUD.git
   cd First-Java-CRUD
   ```

2. **Run using Maven Wrapper:**
   - On Windows:
     ```cmd
     mvnw.cmd spring-boot:run
     ```
   - On Linux / macOS:
     ```bash
     ./mvnw spring-boot:run
     ```

3. **Open the application:**
   Navigate to [http://localhost:8080/](http://localhost:8080/) in your web browser.

---

## 📸 Documentation (`doc/` directory)

All verification screenshots are stored in the [`doc/`](doc/) directory:
1. `app_running.png` - Application running locally in the browser.
2. `crud_functionality.png` - Interactive CRUD operations (Add/Edit customer).
3. `startup_logs.png` - Console output and terminal logs showing successful startup.
4. `commit_history.png` - GitHub commit history demonstrating collaboration and commits from both students.
