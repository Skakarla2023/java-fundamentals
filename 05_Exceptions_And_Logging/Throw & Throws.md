## Throw in Java

- The throw keyword in Java is used to explicitly throw an exception from a method or any block of code. 
- We can throw either checked or unchecked exception.
- The throw keyword is mainly used to throw custom exceptions.

<img width="1216" height="405" alt="image" src="https://github.com/user-attachments/assets/0caa5705-53d8-4c49-9a44-482c0d48e313" />

#### Mechanism:

The flow of execution of the program stops immediately after the throw statement is executed and the nearest enclosing try block is checked to see if it has a catch statement that matches the type of exception. If it finds a match, controlled is transferred to that statement otherwise next enclosing try block is checked and so on. If no matching catch is found then the default exception handler will halt the program. 

```java
class ThrowExample {
    static void fun() {
        try {
            throw new NullPointerException("demo");
        } catch(NullPointerException e){
            System.out.println("Caught inside fun().");
            throw e;
        }
    }
    public static void main(String[] args){
        try{
            fun();
        } catch(NullPointerException e) {
            System.out.println("Caught in main.");
        }
    }
}
```

**Output**:
```
Caught inside fun().
Caught in main.
```

The follwing example demonstrates ArithmeticException:

```java
class ArithmeticEE {
    public static void main(String[] args){
        int numerator = 10;
        int denominator = 0;
        if(denominator == 0){
            throw new ArithmeticException("Cannot divide by zero!!");
        } else {
            System.out.println(numerator / denominator);
        }
    }
}
```

**Output**:

<img width="1590" height="139" alt="image" src="https://github.com/user-attachments/assets/dedc9bea-aa85-4097-b4fd-f645364fdd17" />


#### throw with try-catch block:

```java
public class ThrowExample2 {
    public  static void main(String[] args) {
        try {
            int balance = 500;
            if(balance < 1000) {
                throw new Exception("Insufficient Balance");
            }
            System.out.println("Sufficient balance");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
```

**Output** :
```
Insufficient Balance
```

### Real World examples of throw 

**1. ATM Withdrawal**
```java
if (amount > balance) {
    throw new Exception("Not enough money");
}

```

**2. Login System**
```java
if (!password.equals("1234")) {
    throw new Exception("Wrong password");
}
```

**3.Exam Marks Validation**
```java
if (marks > 100) {
    throw new Exception("Invalid marks");
}
```

**4. Online Booking**
```java
if (seats == 0) {
    throw new Exception("No seats available");
}
```

**5. Age Restriction Apps**
```java
if (age < 18) {
    throw new Exception("Access denied");
}
```

**Note**:

1. Throw is used to throw only one exception at a time.
2. After throw, code won’t run.
3. After a throw keyword is written, it must be handles using try-catch or declared(throws).

---

## Throws in Java

- The throws keyword is a declaration that serves as a warning to callers that a method may produce certain exceptions.
- The throws keyword indicates what exception type may be thrown by a method.
- In simple note: It passes the responsibility of handling an exception to the caller.

<img width="1395" height="374" alt="image" src="https://github.com/user-attachments/assets/1acc3422-8991-4cf0-acfe-0153e2df3b29" />


```java
import java.io.FileReader;
import java.io.IOException;

class ThrowsExample {
    static void readFile() throws IOException{
        FileReader fr = new FileReader("data.txt");
        System.out.println("File opened successfully");
    }
    public static void main(String[] args){
        try{
            readFile();
        } catch(IOException es){
            System.out.println("File not found!");
        }
    }
}
```

**Output**:


<img width="1589" height="119" alt="image" src="https://github.com/user-attachments/assets/4f742ed6-d538-4258-98a1-a2c05572573e" />

