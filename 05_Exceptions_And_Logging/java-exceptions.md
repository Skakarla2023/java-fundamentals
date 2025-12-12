# Java Exceptions


```php
                Throwable
                /        \
           Error        Exception
                        /       \
               Checked Exception  Unchecked Exception
                        (compile-time)     (runtime)
```

- In Java, an exception is an event that occurs during the execution of a program which disrupts the normal flow of instructions.
- Errors and Exceptions occur during runtime, but their nature and how we handle them are different.


## Errors 

- Errors represent serious problems that occur in the JVM environment and are not meant to be handled by your program.
- These are caused by the JVM, but not by the programmer.
- The following are the types of errors:
  - StackOverFlowError
  - OutOfMemoryError
  - VirtualmemoryError
- Errors are unchecked(They occur at runtime).

## Exceptions

- Exceptions represent abnormal conditions that arise due to program logic, invalid inputs, or external conditions (like missing files, bad user input, etc.).
- They give you a chance to handle the situation and allow the program to continue.

#### Exception types

1. Checked Exceptions
2. Unchecked Exceptions


### Checked Excpetions

- These are the exceptions that the compiler forces you to handle using try-catch or throws declaration.
- Checked exceptions represent expected or recoverable conditions.
- Following are the examples for checked exceptions:

1. IOException
2. SQLException
3. InterruptedException
4. ClassNotFoundException
5. FileNotFoundException

```
SQLException is an exception that occurs while performing database operations using JDBC(java database connectivity).

1. It exists to inform the programmer that the database operation did not complete successfully.
2. Database systems are external resources and can fail during runtime. SQLException helps you detect and handle such failures safely.

```
<img width="1308" height="327" alt="image" src="https://github.com/user-attachments/assets/6c9f1568-c54f-473a-af3b-1f749d960d3e" />


### Unchecked Exceptions

- Unchecked exceptions occur at runtime and do not need to be caught or declared.

<img width="1245" height="486" alt="image" src="https://github.com/user-attachments/assets/6180f686-3af5-4e29-ad3e-e700c370a7db" />

- Because these issues are due to bad logic, not external recoverable events. They should be prevented through better coding.


```java
int a = 10/0;   // ArithmeticException
```


### Differences between Errors and Exceptions


| Aspect         | Errors                               | Exceptions                        |
| -------------- | ------------------------------------ | --------------------------------- |
| Nature         | Serious system-level failures        | Application-level issues          |
| Recoverable?   | No                                   | Often yes                         |
| Handling       | Should not be caught                 | Should be caught/declared         |
| Compiler Check | No                                   | Checked exceptions are enforced   |
| Examples       | OutOfMemoryError, StackOverflowError | IOException, NullPointerException |


### Difference Between Checked and Unchecked Exceptions

| Feature             | Checked Exceptions        | Unchecked Exceptions             |
| ------------------- | ------------------------- | -------------------------------- |
| Compile-time check  | Yes                       | No                               |
| Caused by           | External conditions       | Programmer mistakes              |
| Handling mandatory? | Yes                       | No                               |
| Examples            | IOException, SQLException | NPE, AIOOBE, ArithmeticException |



<img width="1258" height="596" alt="image" src="https://github.com/user-attachments/assets/e5254023-e73c-40f5-9e75-b7f81c12ed0e" />

