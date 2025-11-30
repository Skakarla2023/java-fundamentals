# Loops

- Loops can execute a block of code as long as a specified condition is true.

- Loops are handy because they save time, reduce errors, and they make code more readable.

## Java While Loop

- The while loop repeats a block of code as long as the specified condition is true:

```
while (condition) {
  // code block to be executed
}
```

#### Example:

```java
public class Main {
    public static void main(String[] args) {
        
        int i=1;
        while(i<5){
            System.out.println(i);
            i++;
        }
    }
}
```

#### Output:

```
1
2
3
4
```

> Note: Do not forget to modify(increase or decrease) the variable used in the condition (i++), otherwise the loop will never end!


- A real life example where we can use while-loop:

```java
public class Main {
  public static void main(String[] args) {
    int countdown = 10;

    while (countdown > 0) {
      System.out.println(countdown);
      countdown--;
    }

    System.out.println("Happy New Year!!");  
  }
}
```

#### Output:

```
10
9
8
7
6
5
4
3
2
1
Happy New Year!!
```

