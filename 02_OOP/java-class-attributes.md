# Java Class Attributes

```java
public class Main {
    int x = 5;
}
```

- Here x is called an attribute of the class, or it is an attribute within the class.
- Attributes are also known as **fields**.
<img width="1244" height="171" alt="image" src="https://github.com/user-attachments/assets/6702ce95-516f-4100-b896-4cae9c71ce0d" />


```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```

<img width="1215" height="192" alt="image" src="https://github.com/user-attachments/assets/35bab3e4-badc-436c-b5a2-cd0d1d91c815" />

```java
public class Main {
  int x;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 40;
    System.out.println(myObj.x);
  }
}
```

- If you don't want the ability to override existing values, declare the attribute as final:

```java
public class Main {
  final int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
```

```
ERROR!
Main.java:6: error: cannot assign a value to final variable x
        myObj.x=10;
             ^
1 error
```

- The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).
- The final keyword is called a "modifier".

<img width="1224" height="213" alt="image" src="https://github.com/user-attachments/assets/bfab9893-5121-4fee-b430-2474b5fb4054" />

```java
public class Sample {
    int x=5;
    public static void main(String[] args){
        Sample obj1 = new Sample();
        Sample obj2 = new Sample();
        obj1.x=10;
        System.out.println(obj1.x);
        System.out.println(obj2.x);
    }
}
```

<img width="1224" height="179" alt="image" src="https://github.com/user-attachments/assets/afe3b7ce-e125-4e85-95fb-b516f9a2e6bb" />

```java
public class Main {
  String fname = "John";
  String lname = "Doe";
  int age = 24;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
  }
}
```

## Java Constructors

- A constructor in Java is a special method that is used to initialize objects.
- The constructor is called when an object of a class is created.
- The constructor name must match the class name, and it cannot have a return type (like void).

<img width="1245" height="173" alt="image" src="https://github.com/user-attachments/assets/4cd11560-f282-457e-80a5-f348a81e1f4a" />

```java
public class JavaConstructor {
    int x;
    public JavaConstructor(int y){
        x=y;
    }
    public static void main(String[] args){
        JavaConstructor obj = new JavaConstructor(10);
        System.out.println(obj.x);
    }
}
```

- You can have as many parameters as you want:

```java
public class Main {
  int modelYear;
  String modelName;

  public Main(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Main myCar = new Main(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}
```

