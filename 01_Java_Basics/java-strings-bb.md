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
public class Main {
    public static void main(String[] args) {
        // creating a StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial: "+sb);
        
        // append(add text at the end)
        sb.append(" World");
        System.out.println("After append: "+sb);
        
        // insert (add text in middle)
        sb.insert(5,",Java");
        System.out.println("After insert: "+sb);
        
        //delete
        sb.delete(5,10);
        System.out.println("After delete: "+sb);
        
        //replace
        sb.replace(6,8,"Everyone");
        System.out.println("After replacing: "+sb);
        
        // reverse(reverse the text)
        sb.reverse();
        System.out.println("After reversing: "+sb);
        
        // check length and capacity
        System.out.println("Length:"+sb.length());
        System.out.println("Capacity:"+sb.capacity());
        
        String normalString = sb.toString();
        System.out.println("Converted to string:"+normalString);
        
    }
}
```
