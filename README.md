# 🎓 Student Management System

A Java-based Student Management System that allows users to manage student records efficiently. This project uses Java, JDBC, and MySQL to perform CRUD (Create, Read, Update, Delete) operations through a simple console-based interface.

## 📌 Features

- ➕ Add New Student
- 📋 View All Students
- ✏️ Update Student Details
- ❌ Delete Student Records
- 🔍 Search Student by ID
- 💾 Store data in MySQL Database

## 🛠️ Technologies Used

- Java
- JDBC
- MySQL
- IntelliJ IDEA
- Git & GitHub

## 📂 Project Structure

```
Student-Management-System/
│── src/
│   ├── dao/
│   ├── db/
│   ├── model/
│   └── main/
│
│── .gitignore
│── Student Management System.iml
│── README.md
```

## ⚙️ Prerequisites

Before running the project, install:

- Java JDK 17 or above
- MySQL Server
- IntelliJ IDEA (or any Java IDE)

## 🚀 How to Run

1. Clone the repository

```bash
git clone https://github.com/GiriSumitcode/Student-Management-System.git
```

2. Open the project in IntelliJ IDEA.

3. Create a MySQL database.

Example:

```sql
CREATE DATABASE student_db;
```

4. Update your database credentials in the DB connection class.

```java
String url = "jdbc:mysql://localhost:3306/student_db";
String username = "your_username";
String password = "your_password";
```

5. Run the `Client.java` file.

## 📸 Output

You can add screenshots here.

Example:

```
Main Menu
---------
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
```

## 🤝 Contributing

Contributions are welcome!

Fork the repository and submit a Pull Request.

## 👨‍💻 Author

**Sumit Giri**

GitHub:
https://github.com/GiriSumitcode

---

⭐ If you like this project, don't forget to give it a Star!
