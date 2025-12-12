# Call Stack in Java

<img width="1319" height="260" alt="image" src="https://github.com/user-attachments/assets/27153ad5-a1a3-45a8-ae35-0127d6e3bfd4" />

Each **stack frame** typically stores:

1. Local variables of the method
2. Parameters passed to the method
3. Return address (where to resume after the method returns)
4. Intermediate computation values

Each method call gets its **own** stack frame.


### Simple flow depicting call stack

```java
public static void main(String[] args) {
    int x = add(5, 3);
    System.out.println(x);
}

static int add(int a, int b) {
    return multiply(a, b);
}

static int multiply(int x, int y) {
    return x * y;
}
```

**Order of execution on the call stack**:

1. main() is pushed.
2. add(5,3) is called → push frame for add()
3. multiply(5,3) is called → push frame for multiply()
4. multiply() returns → its frame is popped
5. add() returns → its frame is popped
6. main() finishes → its frame is popped

Stack grew like this:


Top(multiply)
1. multiply()
2. add()
3. main()
     
Bottom (main)





### Key Points to remember

1. It is called a **stack** because it follows LIFO, the last method called is the **first** one that gets executed.
2. If your method calls itself repeatedly without stopping (infinite recursion), frames keep getting added, this is called **StackOverflowError**.
3. The call stack belongs to the Thread Stack Memory.
4. Each thread in Java has its own separate call stack,This is why threads do not interfere with each other's method calls.
5. A new frame is created everytime a method is invoked,a constructor is invoked and a recursive call occurs.


<img width="1322" height="314" alt="image" src="https://github.com/user-attachments/assets/d67681de-fdfb-450c-8490-ab549a02a7dd" />
