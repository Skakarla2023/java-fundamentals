<h2 align="center"><b>Custom Exceptions</b></h2>

- A Custom Exception is a user-defined Exception class cretaed by programmer to represent application specific errors.
- Java already gives:
  - NullPointerException
  - SQLException
  - FileNotFoundException
- But in some cases built-in exceptions are not enough:
  - age < 18 exception
  - invalid password exception
  - bank balance insufficient
- In such cases we create our own.


### Types of Custom Exceptions

**1. Checked Exception**

- Extends Exception class.
- Must be handled using try-catch OR declared using throws.

**2. Unchecked Exception**

- Extends `RuntimeException`.
- Handling is optional.


#### Create Custom Exception

Scenario : Insufficient Bank Balance

```java
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException (String message){
        super(message);
    }
}
class BankAccount {
    double balance = 5000;
    public void withdraw(double amount) throws InsufficientBalanceException {
        if(amount > balance) {
            throw new InsufficientBalanceException ("Not enough balance!!");
        }
        balance -= amount;
        System.out.println("Withdrawl successful. Remaining balance: "+balance);
    }
}
public class BankMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        try {
            account.withdraw(7000);
        } catch (InsufficientBalanceException e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
```

**Output**:

```
Exception : Not enough balance!!
```

Scenario : Invalid age to vote

```java
class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(String message){
        super(message);
    }
}
class VotingSystem {
    public void checkAge(int age){
        if(age < 18){
            throw new InvalidAgeException("Age must be 18 or above!");
        }
        System.out.println("Eligible to vote");
    }
}
class AgeMain {
    public static void main(String[] args){
        VotingSystem vote = new VotingSystem();
        vote.checkAge(16);
    }
}
```

**Output**:

<img width="1367" height="184" alt="image" src="https://github.com/user-attachments/assets/8fa8033b-4365-4d89-a242-cf83761d5d32" />




> Custom exceptions are user-defined exception classes in Java used to represent application-specific error conditions. They are created by extending either Exception (checked) or RuntimeException (unchecked). They improve code readability, maintainability, and provide meaningful error handling in business logic."
