# The Do/While Loop

- The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true. Then it will repeat the loop as long as the condition is true.

```
do {
  // code block to be executed
}
while (condition);
```

#### Example:

```java
public class Main {
  public static void main(String[] args) {
    int i = 0;
    do {
      System.out.println(i);
      i++;
    }
    while (i < 5);  
  }
}

```

#### Output:

```
0
1
2
3
4
```
