# Java Strings


- In Java, String is immutable, meaning once you create it, it cannot be changed.
- If you modify strings many times (loops, concatenations), Strings become slow and memory-wasteful.
- So Java gives us:
  - StringBuilder
  - StringBuffer
- They create mutable strings (modifiable without creating new objects).


## StringBuilder (Non-thread-safe, Faster)

- In Java, the StringBuilder class (part of the java.lang package) provides a mutable sequence of characters.
- Unlike the String class (which is immutable), StringBuilder allows modification of character sequences without creating new objects, making it memory-efficient and faster for frequent string operations.
- StringBuilder is a class in Java that allows you to create changeable (mutable) strings.
- This means:
  - You can add text
  - Remove text
  - Replace text
- without creating new objects every time.


- without using StringBUilder

```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = str+" world";
        System.out.println(str1);
    }
}
```

- using StringBUilder

```java
