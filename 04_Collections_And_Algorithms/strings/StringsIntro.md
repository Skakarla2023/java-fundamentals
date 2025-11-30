# Strings Declaration  

- Strings are usually declared in two ways.

## 1. Normal String Declaration (String literal)

```java
String str = "Hello";
```

#### Example:

```java
String a = "Hello";
String b = "Hello";
```

- a and b point to the same object in memory.
- The string "Hello" is stored in the String Constant Pool (SCP).
- If another variable also uses "Hello", Java will reuse the same object.

## 2. Using new String()

- A new String object is created in Heap memory, even if "Hello" already exists in SCP.
- This means new String("Hello") never reuses the existing string.
- In SCP if same strings are declared it uses the existing one only,  but in heap it never uses the existing ne instead it creates a new string everytime


#### Example:

```java
String a = "Hello";
String b = new String("Hello");
```

- "Hello" in SCP → used by a

- A separate object in Heap → used by b

- So a and b are NOT the same object.


## String Concatenation

- You can combine two strings in java using the '+' operator.

```java
public class Main {
    public static void main(String[] args) {
        String fname = "John";
        String lname = "Doe";
        System.out.println("My name is "+fname+" "+lname);
        
        String name = fname+lname;
        System.out.println(name);
    }
}
```

- You can also join more than two strings by chaining concat() calls:

```java
public class Main {
    public static void main(String[] args) {
        
        String a = "Java ";
        String b = "is ";
        String c = "fun";
        
        System.out.println(a.concat(b).concat(c));
        
    }
}
```

> Note: While you can use concat() to join multiple strings, most developers prefer the + operator because it is shorter and easier to read.



### Java Numbers and Strings

- Java uses the + operator for both addition and concatenation.

- Numbers are added. Strings are concatenated.

```java
public class Main {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 5;
        System.out.println(a+b);
        
        int c = 20;
        String d = "30";
        System.out.println(c+d);
        
        String x = "apple ";
        String y = "is tasty";
        System.out.println(x+y);
        
    }
}
```

#### Output:

```
15
2030
apple is tasty
```

### Strings - Special Characters

```java
public class Main {
    public static void main(String[] args) {
        
        String text = "Java is \"fun\" to learn";
        System.out.println(text);
        
        String a = "Java is 'fun' to learn";
        System.out.println(a);
        String b = "Java is \"fun\" to learn";
        System.out.println(b);
        
    }
}
```

#### Output:

```
Java is "fun" to learn
Java is 'fun' to learn
Java is "fun" to learn
```

