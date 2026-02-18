# Exception Propagation in Java

- In Java, an exception is first thrown from the top of the stack, and if it is not caught, it drops down the call stack to the previous method. After a method throws an exception, the runtime system attempts to find something to handle it.
- The set of possible "somethings" to handle the exception is the ordered list of methods that had been called to get to the method where the error occurred.
- The list of methods is known as the call stack, and the method of searching is Exception Propagation.
