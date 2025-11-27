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
