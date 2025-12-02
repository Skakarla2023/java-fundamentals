# Wrapper Classes in Java

- Wrapper Classes in Java are usually class representation of Primitive datatypes.

| Primitive Type | Wrapper Class |
| -------------- | ------------- |
| `byte`         | `Byte`        |
| `short`        | `Short`       |
| `int`          | `Integer`     |
| `long`         | `Long`        |
| `float`        | `Float`       |
| `double`       | `Double`      |
| `char`         | `Character`   |
| `boolean`      | `Boolean`     |

#### Example

```java
int x = 10;                 // primitive
Integer y = Integer.valueOf(10);   // wrapper object
```

## Why Do We Need Wrapper Classes?

- Wrapper classes exist mainly because Java is an object-oriented language, and primitives are not objects.

### 1. For use in Collections

- Collections like:
  - ArrayList
  - HashMap
  - HashSet

cannot store primitives — they store objects only

- So this is allowed:

```java
ArrayList<Integer> list = new ArrayList<>();
```
- But this is not allowed:

```java
ArrayList<int> list = new ArrayList<>();  // ❌ error
```

### 2. For Utility Methods

- Wrapper classes provide many useful methods.

Example:

```java
Integer.parseInt("123");     // converts string to int
Double.toString(12.5);       // convert to string
Character.isDigit('5');      // checks digit
```

### 3. For OOP features

- Primitives → not objects
- Wrapper classes → objects
- Objects are required in:

  - Serialization
  - Reflection
  - Generics
  - Method overloading

 ### 4. They can store `null`

 ```java
Integer a = null;   // valid
int b = null;       // ❌ error
```

## Autoboxing and unboxing

### Autoboxing

- Automatic conversion: primitive → wrapper

```java
int x = 10;
Integer y = x;       // autoboxing
```

- It is equivalent to:

```java
Integer y = Integer.valueOf(x);
```

### Unboxing

- Automatic conversion: wrapper → primitive

```java
Integer a = 20;
int b = a;            // unboxing
```

- It is equivalent to:

```java
int b = a.intValue();
```


## Memory Difference Between Primitive & Wrapper


| Primitive         | Stored in     | Fast?    | Memory |
| ----------------- | ------------- | -------- | ------ |
| `int x = 10;`     | stack         | ✔ fast   | small  |
| `Integer y = 10;` | heap (object) | ❌ slower | larger |

## Creating Wrapper Objects

- Using constructors (deprecated)

```java
Integer x = new Integer(5);  // not recommended
```

- Using valueOf() (recommended)

```java
Integer x = Integer.valueOf(5);
```

- Using autoboxing

```java
Integer x = 5;
```

## Wrapper Class Caching

- Wrapper class caching in Java is a memory optimization technique used for certain wrapper objects like:

  - Integer

  - Byte

  - Short

  - Long

  - Character

  - Boolean
  
- Java reuses some wrapper objects instead of creating new ones every time.
- Values from -128 to +127 are cached.
- So:

```java
Integer a = 100;
Integer b = 100;
System.out.println(a == b);   // true
```

- But:

```java
Integer a = 200;
Integer b = 200;
System.out.println(a == b);   // false  (different objects)
```

> == compares references for objects, not values.
Use .equals() to compare values.


### Useful Methods

- Integer

```java
Integer.parseInt("123");
Integer.valueOf("10");
Integer.toString(10);
```

- Character

```java
Character.isDigit('4');
Character.isLetter('A');
Charcter.toUpperCase('a');
```

- Boolean

```java
Boolean.parseBoolean("true");
```

- Double

```java
Double.parseDouble("3.14");
```




| Feature             | Primitive  | Wrapper Class |
| ------------------- | ---------- | ------------- |
| Type                | Not object | Object        |
| Memory              | Less       | More          |
| Speed               | Faster     | Slower        |
| Can be null?        | ❌          | ✔             |
| Use in collections? | ❌          | ✔             |
| Methods             | ❌          | ✔             |
| Autoboxing?         | n/a        | ✔             |



### Summary

- Wrapper classes convert primitive → object, giving access to:

  - methods
  - collections
  - null values
  - OOP features

- Java automatically converts between primitive and wrapper using:

  - autoboxing
  - unboxing
