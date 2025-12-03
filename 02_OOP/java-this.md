# Java this Keyword

- The this keyword in Java refers to the current object in a method or constructor.
- The this keyword is often used to avoid confusion when class attributes have the same name as method or constructor parameters.

<img width="1274" height="265" alt="image" src="https://github.com/user-attachments/assets/13b5d654-fac6-4414-a64d-087b163ef312" />


```java
public class Main {
  int x;  // Class variable x

  // Constructor with one parameter x
  public Main(int x) {
    this.x = x; // refers to the class variable x
  }

  public static void main(String[] args) {
    // Create an object of Main and pass the value 5 to the constructor
    Main myObj = new Main(5);
    System.out.println("Value of x = " + myObj.x);
  }
}
```


<img width="1274" height="245" alt="image" src="https://github.com/user-attachments/assets/de0330f0-1d0c-4c6b-b808-0833f2234053" />
