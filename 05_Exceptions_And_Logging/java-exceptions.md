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

1. 
```
