// try-catch-finally block is used in exception handling in Java
// the try block contains the code that might throw an exception
// the catch block contains the code to be executed if an exception is raised
// finally block gets executed everytime after try and catch are executed, irrespective of the try-catch block.

public class TryCatchExample {
    public static void main(String[] args) {
        try {            
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; 
            System.out.println("Result: " + result); 
        } catch (ArithmeticException e) {
            System.err.println("Error: Cannot divide by zero.");
        }
        System.out.println("Program continues after the try-catch block.");
    }
}

// Output:
// Error: Cannot divide by zero.
// Program continues after the try-catch block.
