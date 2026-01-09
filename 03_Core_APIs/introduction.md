# Core API in Java

- Core API in Java refers to the collection of predefined packages, classes, interfaces and methods that are part of Java SE(Standard edition) platform.
- These APIs provide the foundational functionalities for building general-purpose Java applications.
- These are the ready made classes and packages provided by Java to perform some tasks.

### Why do we need Core API?

- Before core API existed programmers had to:
  - Write basic data structures manually.
  - Handle memory and errors by themselves.
  - Create own methods for everything.
- Due to which it caused more bugs, more code leading to slower development.
- Core APIs solved this problem by providing essential and necessary for basic tasks in Java so that everytime one needs a class or anything, they can use it directly by importing the proper package or class.

### Key Core Java API Packages

- These packages are bundled with Java Development Kit(JDK) and are essesntial in maany programming tasks.

**java.lang**:

- This package contains classes which are fundamental to the design of Java programming, such as `Object`, `String`, `Thread` and `Math`.
- This package is automatially imported into every class.

**java.util**:

-  This package contains utility classes and data structures including Collections Framework(ArrayList, LinkedList, HashMap) like Date, and `Scanner` for handling input.

```java
import java.util.*;

class Basics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("User entered :"+n);
    }
}
```

Output:

```
Enter a number:
3
User entered :3
```

**java.io**:

- This package is used for handling input and output operations such as file handling,streams(FileInputStream, FileOutputStream etc) and serialization.

**java.math**:

- This package provides packages for performing `mathematical` operations such as `pow`, `sqrt` etc.

```java
import java.math.*;

class Main{
    public static void main(String[] args){
        double a = Math.pow(3,2);
        double b = Math.sqrt(27);
        
        System.out.println(a);
        System.out.println(b);
    }
}
```

Output:
```
9.0
5.196152422706632
```

**java.awt** & **java.swing**:

- This package provides classes for creating graphical user interfaces and handling user interfaces.

**java.sql**

- The API for database connectivity, known as JDBC (Java Database Connectivity), which allows Java applications to interact with relational databases.

**java.time**

- The modern and robust API for handling dates and times, introduced in Java 8.


## Core API vs Java Language 

| **Core Java Language** | **Core API** |
|------------------------|--------------|
| It is the Java language itself. | It is the ready-made library provided by Java.|
| It tells Java how to write code. | It provides tools bor basic tasks. |
| Includes rules like syntax and structure. | Includes classes and methods to use. |
| eg: `class`, `object`, `if` , `for`, `while`.| eg: `String`, `Scanner`, `ArrayList`, `Math`|
