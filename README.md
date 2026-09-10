# 🎓 Student Grade & Class Performance Analyzer

## 📌 About the Project

**Student Grade & Class Performance Analyzer** is a simple Java console application that analyzes a student's marks in comparison with the overall class performance.

The program takes four inputs:

- Student's marks
- Class average
- Highest marks in the class
- Lowest marks in the class

It then generates a simple performance report.

---

## 🎯 Objectives

The main objectives of this project are:

- Calculate the student's grade.
- Compare the student's marks with the class average.
- Find the difference between student's marks and class average.
- Compare the student's marks with the highest marks.
- Display a clear performance report.
- Practice basic Java programming concepts.

---

## ⚙️ Features

### 1. Grade Calculation

The program assigns a grade based on the student's marks.

| Marks | Grade |
|---|---|
| 90–100 | S |
| 80–89 | A |
| 70–79 | B |
| 60–69 | C |
| 50–59 | D |
| Below 50 | F |

### 2. Class Average Comparison

The program determines whether the student's marks are:

- Above the class average
- Below the class average
- Equal to the class average

### 3. Performance Difference

The program calculates:

`Student Marks - Class Average`

### 4. Highest Score Comparison

The program calculates the student's marks as a percentage of the highest score in the class.

---

## 🛠️ Technologies Used

- **Programming Language:** Java
- **Interface:** Command Line / Console
- **IDE:** VS Code / IntelliJ IDEA / Eclipse
- **Java Version:** Java 8 or above

---

## 📂 Project Structure

```text
Student-Grade-Analyzer/
│
├── GradeAnalyzer.java
└── README.md
```

---

## ▶️ How to Run

### Step 1: Install Java

Install the Java Development Kit (JDK) on your computer.

### Step 2: Create the Java file

Create a file named:

```text
GradeAnalyzer.java
```

### Step 3: Compile the program

Open the terminal in the project folder and run:

```bash
javac GradeAnalyzer.java
```

### Step 4: Run the program

```bash
java GradeAnalyzer
```

### Step 5: Enter the required data

For example:

```text
Enter your marks: 78
Enter class average: 65
Enter highest marks: 92
Enter lowest marks: 34
```

---

## 💻 Sample Output

```text
=================================
 STUDENT GRADE & CLASS ANALYZER
=================================

Enter your marks: 78
Enter class average: 65
Enter highest marks: 92
Enter lowest marks: 34

========== RESULT ==========
Your Marks       : 78.0
Class Average    : 65.0
Highest Marks    : 92.0
Lowest Marks     : 34.0
----------------------------
Grade            : B
Difference       : 13.0
Performance      : Above Class Average
Highest Score %  : 84.78%
============================
```

---

## 📚 Java Concepts Used

This project helps demonstrate:

- Variables
- Data types
- `Scanner`
- User input
- `if-else if-else`
- Arithmetic operators
- Strings
- `System.out.println()`
- `System.out.printf()`
- Basic program structure

---

## 🔮 Future Improvements

The project can be improved in the future by adding:

- Multiple subjects
- Overall percentage
- Overall grade
- Multiple student records
- `ArrayList`
- Classes and objects
- File handling
- Student search
- Student result history
- GUI using Java Swing or JavaFX

---

## 👨‍💻 Conclusion

The Student Grade & Class Performance Analyzer is a simple beginner-level Java project that demonstrates how programming can be used to analyze academic performance. It provides a foundation for developing a more advanced student management and result analysis system in the future.
