# Core API in Java

- Core API in Java refers to the collection of predefined packages, classes, interfaces, and methods that are part of the Java SE (Standard Edition) platform.
- These APIs provide foundational functionalities for building general-purpose Java applications.
- They are ready-made classes and packages provided by Java to perform common programming tasks.

---

## Why Do We Need Core API?

- Before Core API existed, programmers had to:
  - Write basic data structures manually.
  - Handle memory and errors by themselves.
  - Create their own methods for everything.
- This resulted in more bugs, more code, and slower development.
- Core APIs solved this problem by providing essential tools for basic tasks in Java.
- Developers can directly use these features by importing the required packages or classes.

---

## Key Core Java API Packages

- These packages are bundled with the Java Development Kit (JDK) and are essential in many programming tasks.

---

### java.lang

- Contains fundamental classes such as `Object`, `String`, `Thread`, and `Math`.
- This package is automatically imported into every Java program.

---

### java.util

- Contains utility classes and data structures such as `ArrayList`, `LinkedList`, `HashMap`, `Date`, and `Scanner`.

Example:

```java
import java.util.*;

class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        System.out.println("User entered: " + n);
    }
}
```

**Output**:

```
Enter a number:
3
User entered: 3
```

### java.io

- Used for input and output operations such as file handling, streams (`FileInputStream`, `FileOutputStream`), and serialization.

---

### java.math

- Provides classes for high-precision arithmetic such as `BigInteger` and `BigDecimal`.

---

### java.lang.Math

- Provides mathematical methods such as `pow()`, `sqrt()`, `max()`, and `min()`.

Example:

```java
class Main {
    public static void main(String[] args) {
        double a = Math.pow(3, 2);
        double b = Math.sqrt(27);

        System.out.println(a);
        System.out.println(b);
    }
}
```


**Output**:
```
9.0
5.196152422706632
```


### java.awt & java.swing

Provide classes for building graphical user interfaces (GUI) in Java.

### java.sql

Provides JDBC (Java Database Connectivity) API to connect and interact with relational databases.

### java.time

A modern API for handling date and time, introduced in Java 8.

### Core API vs Java Language

| Core Java Language                     | Core API                                          |
| -------------------------------------- | ------------------------------------------------- |
| It is the Java language itself.        | It is the ready-made library provided by Java.    |
| Defines how to write code.             | Provides tools for common tasks.                  |
| Includes syntax and structure rules.   | Includes reusable classes and methods.            |
| Example: `class`, `if`, `for`, `while` | Example: `String`, `Scanner`, `ArrayList`, `Math` |
