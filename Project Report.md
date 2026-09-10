# **STUDENT GRADE & CLASS PERFORMANCE ANALYZER**

## **PROJECT REPORT**

### **Submitted By**

**Name:** Saurabh Rajpoot  
**Registration / Roll Number:** 25BAI11031  
**Course:** B.Tech CSE (Specialization in AI & ML)  
**Semester:** 3rd Semester  
**Subject:** Java Programming  
**Academic Year:** 2026–27

# **1\. Introduction**

The **Student Grade & Class Performance Analyzer** is a console-based Java application developed to evaluate and contextualize individual academic performance.  
In an academic environment, absolute marks alone do not provide a complete evaluation of a student's standing. Understanding whether a score falls above or below the central tendency of the cohort requires comparative metric analysis.  
This project addresses this need by ingesting a student's raw score along with foundational cohort parameters—class average, highest score, and lowest score. Utilizing these metrics, the application computes an absolute letter grade, benchmarks performance against the cohort mean, and calculates the score ratio relative to the cohort peak.

# **2\. Problem Statement**

Individual marks lack context without comparative metrics against class distribution benchmarks.  
The application systematically automates this analysis by fulfilling the following computational requirements:

> 1. Accept the student's marks.  
> 2. Accept the class average.  
> 3. Accept the highest marks obtained in the class.  
> 4. Accept the lowest marks obtained in the class.  
> 5. Validate inputs against logical constraints (e.g., $0 \\le \\text{marks} \\le 50$, $\\text{lowest} \\le \\text{average} \\le \\text{highest}$).  
> 6. Determine the student's letter grade using predefined categorical intervals.  
> 7. Compute the deviation from the class average.  
> 8. Compute the relative ratio against the highest cohort score.  
> 9. Output a structured, formatted performance report to the console.

# **3\. Objectives**

* Implement a modular, robust Java console application for basic academic performance evaluation.  
* Utilize conditional logic (if-else if-else) for boundary-checked grade mapping.  
* Calculate quantitative deviations:  
  $$\\text{Deviation} \= \\text{Student Marks} \- \\text{Class Average}$$  
* Compute the relative attainment ratio against the top mark:  
  $$\\text{Highest Score Attainment \\%} \= \\left(\\frac{\\text{Student Marks}}{\\text{Highest Marks}}\\right) \\times 100$$  
* Ensure clean standard stream formatting using System.out.printf().  
* Reinforce foundational object-oriented and procedural Java programming concepts.

# **4\. Scope of the Project**

The current version processes a single student's subject marks alongside aggregate class benchmarks per runtime execution.

### **Future Scope**

* **Multi-Subject Aggregation:** Cumulative GPA (CGPA) and credit-weighted grade mapping.  
* **Batch Processing:** Dynamic student cohort analysis utilizing collections (ArrayList, HashMap).  
* **Persistence Layer:** Archival of evaluation histories via File I/O (CSV/JSON) or Relational Database Management Systems (JDBC / SQLite).  
* **GUI Layer:** Migration to JavaFX or web-based interfaces.  
* **Statistical Expansion:** Computation of cohort variance, standard deviation, percentile ranking, and median.

# **5\. Technologies & Tools Used**

| Component | Specification / Purpose |
| :---- | :---- |
| **Language** | Java (JDK 17 or higher recommended, JDK 8+ compatible) |
| **Input Mechanism** | java.util.Scanner via standard input stream (System.in) |
| **Output Mechanism** | Formatted standard output (System.out.printf, System.out.println) |
| **IDE / Editor** | Visual Studio Code / IntelliJ IDEA / Eclipse |
| **Build & Run Tool** | Java Compiler (javac) and Java Virtual Machine (java) via Terminal |

# 

# **6\. System Requirements**

### **Hardware Requirements**

* **Processor:** Modern 64-bit Dual-Core processor or higher (Intel/AMD/Apple Silicon)  
* **RAM:** Minimum 2 GB (4 GB recommended)  
* **Storage:** Minimum 200 MB free disk space for JDK and compiled binaries

### **Software Requirements**

* **Operating System:** Windows 10/11, macOS, or Linux  
* **Java Runtime Environment:** OpenJDK or Oracle JDK version 8 or higher  
* **Shell / Terminal:** Bash, Zsh, Command Prompt, or PowerShell

# **7\. System Architecture & Workflow**

The execution workflow and system logic flow are depicted below:

```
[START]
  │
  ▼
[Initialize Scanner Object]
  │
  ▼
[Read Inputs: Student Marks, Class Average, Highest Marks, Lowest Marks]
  │
  ▼
[Validate Input Boundaries]
  ├─────────────────────────────────────────┐
  │ (Valid Inputs)                          │ (Invalid Inputs)
  ▼                                         ▼
[Compute Metrics]                          [Display Error Message & Terminate]
  ├─ 1. Determine Letter Grade
  ├─ 2. Calculate Deviation (Marks - Average)
  └─ 3. Calculate Ratio (Marks / Highest * 100)
  │
  ▼
[Generate Formatted Output Report]
  │
  ▼
[Close Scanner Resource]
  │
  ▼
[END]
```

# 

# **8\. Input Specification**

| Parameter | Identifier | Type | Valid Domain | Description |
| :---- | :---- | :---- | :---- | :---- |
| Student Marks | studentMarks | double | \[0.0, 50.0\] | Marks obtained by the individual |
| Class Average | classAverage | double | \[0.0, 50.0\] | Arithmetic mean of the cohort |
| Highest Marks | highestMarks | double | \[studentMarks, 50.0\] | Maximum score achieved in the cohort |
| Lowest Marks | lowestMarks | double | \[0.0, studentMarks\] | Minimum score achieved in the cohort |

# **9\. Grade Mapping Criteria**

The relative academic evaluation adheres to the following grade boundary scheme based on the score range ($\\text{range} \= \\text{highestMarks} \- \\text{lowestMarks}$):

| Condition / Range Boundary | Grade | Qualitative Evaluation |
| :---- | :---- | :---- |
| Marks ≥ Highest \- (Range × 0.10) | **S** | Outstanding (Top Performance) |
| Marks ≥ Average \+ (Range × 0.10) | **A** | Excellent |
| Marks ≥ Average \- (Range × 0.10) | **B** | Good |
| Marks ≥ Average \- (Range × 0.25) | **C** | Average |
| Marks ≥ Lowest \+ (Range × 0.10) | **D** | Below Average |
| Otherwise | **F** | Fail |

# **10\. Performance Benchmarking Logic**

The program establishes two comparative vectors:

### **1\. Absolute Deviation & Relative Attainment**

Deviation and Relative Attainment equations:  
$$\\Delta \= \\text{yourMarks} \- \\text{classAverage}$$  
$$\\text{Relative Position \\%} \= \\left(\\frac{\\text{yourMarks} \- \\text{lowestMarks}}{\\text{highestMarks} \- \\text{lowestMarks}}\\right) \\times 100$$

* If $\\Delta \> 0$: **Above Class Average** (Positive Variance)  
* If $\\Delta \< 0$: **Below Class Average** (Negative Variance)  
* If $\\Delta \= 0$: **Equal to Class Average** (Neutral Variance)

### **2\. Relative Grading Thresholds (0–50 Scale)**

Grade boundaries are evaluated dynamically using the cohort score range ($\\text{range} \= \\text{highestMarks} \- \\text{lowestMarks}$):

* **Grade S:** $\\text{yourMarks} \\ge \\text{highestMarks} \- (\\text{range} \\times 0.10)$  
* **Grade A:** $\\text{yourMarks} \\ge \\text{classAverage} \+ (\\text{range} \\times 0.10)$  
* **Grade B:** $\\text{yourMarks} \\ge \\text{classAverage} \- (\\text{range} \\times 0.10)$  
* **Grade C:** $\\text{yourMarks} \\ge \\text{classAverage} \- (\\text{range} \\times 0.25)$  
* **Grade D:** $\\text{yourMarks} \\ge \\text{lowestMarks} \+ (\\text{range} \\times 0.10)$  
* **Grade F:** Otherwise

# **11\. Algorithm**

```
SStep 1:  Begin execution.
Step 2:  Instantiate Scanner bound to System.in.
Step 3:  Prompt and read yourMarks, classAverage, highestMarks, and lowestMarks.
Step 4:  Verify boundary constraints:
         - If any mark is < 0 or > 50, print error and exit program.
Step 5:  Compute range = highestMarks - lowestMarks.
Step 6:  Compute relative position = ((yourMarks - lowestMarks) / range) * 100 (if range > 0).
Step 7:  Evaluate relative grade based on range boundary checks:
         - yourMarks >= highestMarks - (range * 0.10) -> "S"
         - yourMarks >= classAverage + (range * 0.10)  -> "A"
         - yourMarks >= classAverage - (range * 0.10)  -> "B"
         - yourMarks >= classAverage - (range * 0.25)  -> "C"
         - yourMarks >= lowestMarks + (range * 0.10)   -> "D"
         - Otherwise                                  -> "F"
Step 8:  Compute difference = yourMarks - classAverage.
Step 9:  Determine performance status label:
         - If yourMarks > classAverage  -> "Above Class Average"
         - If yourMarks < classAverage  -> "Below Class Average"
         - Otherwise                    -> "Equal to Class Average"
Step 10: Print formatted result report card to standard output stream.
Step 11: Close Scanner resource.
Step 12: End execution.

```

# 

# 

# 

# 

# 

# 

# 

# 

# 

# 

# **12\. Sample Execution & Test Cases**

### **Test Case 1: Standard Input**

**Input:**

```


Enter Student Marks (0-50): 42.0


Enter Class Average (0-50): 34.0

Enter Highest Marks in Class: 48.0

Enter Lowest Marks in Class: 18.0

```

**Output:**

```
=================== RESULT ===================

Student Marks            : 42.00

Class Average            : 34.00

Highest Marks            : 48.00

Lowest Marks             : 18.00
----------------------------------------------

Grade Awarded            : A

Difference from Average  : +8.00
Performance Benchmark    : Above Class Average

Relative Position        : 80.00%
=============================================="
```

### **Test Case 2: Below Average Execution**

**Input:**

```


Enter Student Marks (0-50): 22.0


Enter Class Average (0-50): 32.5

Enter Highest Marks in Class: 47.0

Enter Lowest Marks in Class: 12.0

```

**Output:**

```
=================== RESULT ===================

Student Marks            : 22.00

Class Average            : 32.50

Highest Marks            : 47.00

Lowest Marks             : 12.00
----------------------------------------------
Grade Awarded            : D

Difference from Average  : -10.50
Performance Benchmark    : Below Class Average

Relative Position        : 28.57%
=============================================="
```

# 

# 

# 

# 

# 

# **13\. Key Java Concepts Demonstrated**

* **Primitive & Reference Types:** Use of double for precision handling and String for immutable text output.  
* **Console I/O (java.util.Scanner):** Reading tokenized floating-point inputs from standard input.  
* **Control Flow:** Multi-branch conditional structures (if-else if-else) used for interval checking.  
* **Arithmetic & Logical Operators:** Relational checks (\>=, \<=, ||), division, and signed arithmetic.  
* **Stream Formatting:** Use of System.out.printf() with format specifiers (%-24s, %.2f, %+.2f) for tabular console output.  
* **Resource Management:** Explicit closure of the Scanner object preventing potential memory/stream leaks.

# **14\. Advantages & Limitations**

### **Advantages**

* Minimal resource overhead and fast execution inside any JVM environment.  
* Formatted tabular reporting provides immediate visual clarity.  
* Includes boundary validation to catch invalid inputs.

### **Limitations**

* Stateless execution: data is lost upon process termination.  
* Aggregates (average, max, min) must be precomputed and provided manually rather than derived dynamically from raw student arrays.  
* Single-course, single-student evaluation per run.

# **15\. Conclusion**

The **Student Grade & Class Performance Analyzer** project illustrates core procedural Java programming techniques applied to an academic reporting problem. By organizing relational comparisons and standard stream operations into a clean command-line interface, the tool delivers both absolute and relative academic performance indicators. The project serves as an extensible base for future iterations incorporating OOP principles, dynamic data collections, and GUI frontends.

# **16\. References**

> 1. Schildt, Herbert. *Java: The Complete Reference*. McGraw-Hill Education.  
> 2. Oracle Java Documentation: java.util.Scanner Specification.  
> 3. Oracle Java Documentation: Formatted Output and Format Specifiers (java.util.Formatter).
