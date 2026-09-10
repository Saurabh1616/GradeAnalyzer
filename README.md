# 🎓 Student Grade & Class Performance Analyzer

## 📌 About the Project

**Student Grade & Class Performance Analyzer** is a beginner-friendly Java console application designed to analyze a student's performance using **relative grading**.

Unlike absolute grading, where fixed marks determine the grade, this project compares the student's marks with the **class average, highest marks, and lowest marks**.

All marks are considered **out of 50**.

The program calculates:

* Relative grade
* Difference from class average
* Performance compared with class average
* Relative position between the lowest and highest marks

---

## 🎯 Objectives

The main objectives of this project are:

* To understand basic Java programming.
* To implement relative grading.
* To compare a student's performance with the class.
* To perform basic mathematical calculations.
* To practice conditional statements.
* To take and validate user input.
* To generate a simple performance report.

---

## ⚙️ Features

### 1. Marks Out of 50

The program accepts all marks on a scale of **0 to 50**.

The user enters:

```text
Your Marks
Class Average
Highest Marks
Lowest Marks
```

---

### 2. Relative Grading

The project uses relative grading instead of fixed absolute marks.

The grade depends on the student's position relative to the class performance.

The grades used are:

| Grade | Relative Performance                  |
| ----- | ------------------------------------- |
| S     | Very close to the highest marks       |
| A     | Clearly above the class average       |
| B     | Around the class average              |
| C     | Below the class average               |
| D     | Significantly below the class average |
| F     | Very close to the lowest marks        |

> **Note:** The exact grade boundaries are calculated dynamically using the class average, highest marks, and lowest marks.

---

## 🧮 Grading Logic

First, the program calculates the range:

```text
Range = Highest Marks - Lowest Marks
```

The program then uses this range to determine the student's relative grade.

### Grade S

```text
Your Marks >= Highest Marks - 10% of Range
```

### Grade A

```text
Your Marks >= Class Average + 10% of Range
```

### Grade B

```text
Your Marks >= Class Average - 10% of Range
```

### Grade C

```text
Your Marks >= Class Average - 25% of Range
```

### Grade D

```text
Your Marks >= Lowest Marks + 10% of Range
```

Otherwise:

```text
F
```

---

## 📊 Relative Position

The program calculates the student's position between the lowest and highest marks.

The formula used is:

```text
Relative Position =
((Your Marks - Lowest Marks) / (Highest Marks - Lowest Marks)) × 100
```

For example:

```text
Your Marks = 38
Highest = 45
Lowest = 15
```

Then:

```text
((38 - 15) / (45 - 15)) × 100

= (23 / 30) × 100

= 76.67%
```

This means the student's marks are approximately **76.67% of the way from the lowest score to the highest score**.

> This is a relative-position measure, not a percentile or actual class rank.

---

## 📈 Class Average Comparison

The program calculates the difference between the student's marks and the class average.

Formula:

```text
Difference = Your Marks - Class Average
```

For example:

```text
Your Marks = 38
Class Average = 30

Difference = 38 - 30
           = +8
```

The program will display:

```text
Performance : Above Class Average
```

Possible performance results are:

* **Above Class Average**
* **Below Class Average**
* **Equal to Class Average**

---

## ✅ Input Validation

The program checks whether all entered marks are between **0 and 50**.

If the user enters an invalid value, the program displays:

```text
Invalid marks!
All marks must be between 0 and 50.
```

The program then stops without calculating the result.

---

## 🛠️ Technologies Used

* **Programming Language:** Java
* **Interface:** Command Line / Console
* **Input:** `Scanner`
* **Java Version:** Java 8 or above
* **IDE:** VS Code / IntelliJ IDEA / Eclipse

---

## 📂 Project Structure

```text
Student-Grade-Analyzer/
│
├── GradeAnalyzer.java
├── ProjectReport.md
└── README.md

```

---

## ▶️ How to Run

### Step 1: Install Java

Install **JDK 8 or above** on your computer.

Check whether Java is installed:

```bash
java -version
```

Check the Java compiler:

```bash
javac -version
```

---

### Step 2: Create the Java File

Create a file named:

```text
GradeAnalyzer.java
```

---

### Step 3: Compile the Program

Open the terminal inside the project folder and run:

```bash
javac GradeAnalyzer.java
```

---

### Step 4: Run the Program

```bash
java GradeAnalyzer
```

---

## 💻 Sample Input

```text
======================================
 STUDENT GRADE & CLASS ANALYZER
       Relative Grading / 50
======================================

Enter your marks (out of 50): 38
Enter class average (out of 50): 30
Enter highest marks (out of 50): 45
Enter lowest marks (out of 50): 15
```

---

## 📋 Sample Output

```text
========== RESULT ==========

Your Marks       : 38.00 / 50
Class Average    : 30.00 / 50
Highest Marks    : 45.00 / 50
Lowest Marks     : 15.00 / 50
----------------------------
Difference       : 8.00 marks
Performance      : Above Class Average
Relative Grade   : A
Relative Position: 76.67%
============================
```

---

## 📚 Java Concepts Used

This project demonstrates the following Java concepts:

### 1. Import

```java
import java.util.Scanner;
```

Used to import the `Scanner` class.

### 2. Scanner

```java
Scanner sc = new Scanner(System.in);
```

Used to take input from the user.

### 3. Variables

The project uses variables such as:

```java
double yourMarks;
double classAverage;
double highestMarks;
double lowestMarks;
```

### 4. Conditional Statements

`if`, `else if`, and `else` are used for:

* Input validation
* Grade calculation
* Performance comparison

### 5. Arithmetic Operators

The project uses:

```text
+
-
*
/
```

for calculations.

### 6. String Variables

Strings are used to store:

```java
String grade;
String performance;
```

### 7. Formatted Output

The project uses:

```java
System.out.printf();
```

to display values with two decimal places.

---

## 🔄 Program Flow

```text
             START
               |
               ↓
        Take User Input
               |
               ↓
        Validate Marks
               |
          ┌────┴────┐
          │         │
       Invalid     Valid
          │         │
          ↓         ↓
       Display    Calculate
        Error     Difference
                    |
                    ↓
             Calculate Range
                    |
                    ↓
          Calculate Relative
              Position
                    |
                    ↓
           Calculate Grade
                    |
                    ↓
       Compare Class Average
                    |
                    ↓
          Display Result
                    |
                    ↓
                   END
```

---

## 🔮 Future Improvements

The current project is intentionally simple. It can be expanded in the future with:

### Version 2

* Multiple subjects
* Overall marks
* Overall grade
* Subject-wise performance

### Version 3

* Multiple students
* Automatic calculation of class average
* Automatic highest and lowest marks
* Student ranking

### Version 4

* `ArrayList`
* Classes and objects
* Encapsulation
* File handling

### Version 5

* Save student results
* Search previous results
* Update student records

### Version 6

* Graphical User Interface using **Java Swing**
* Performance charts
* Better result presentation

---

## ⚠️ Limitations

The current version requires the user to manually enter:

* Class average
* Highest marks
* Lowest marks

It does not calculate these values from individual student records.

Also, **relative position is not the same as percentile or rank** because individual marks of all students are not available.

---

## 👨‍💻 Author

**Name:** Saurabh Rajpoot

**Registration Number:** 25BAI11031

**Course:** B.Tech CSE

**Academic Year:** 2026–27


## 📜 License

This project is created for **educational and academic purposes**.
