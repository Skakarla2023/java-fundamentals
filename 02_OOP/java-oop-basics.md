# OOP

- OOP stands for Object-Oriented Programming.
- Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods.

<img width="1289" height="432" alt="image" src="https://github.com/user-attachments/assets/3d35dc50-c55d-461a-92a1-cf1a3a6964a3" />

### Class

- “A class is a user-defined blueprint that defines the structure (variables) and behavior (methods) an object should have.”
- A class is a template for creating objects.
- A Class is like an object constructor, or a "blueprint" for creating objects.
- To create a class, use the keyword class.

```java
public class Main {
    int x = 5;
}
```

### Object

- An object is a runtime instance of a class that holds real data and can perform the actions defined in the class.
- Objects are real world entities.
- We can create multiple objects inside a class.

```java
public class Main {
    int x = 5;
    
    public static void main(String[] args){
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
    
}
```

- You can also create an object of a class and access it in another class.
-  This is often used for better organization of classes (one class has all the attributes and methods, while the other class holds the main() method (code to be executed)).

```java
class Main {
    int x = 5;
}


class Second {
    public static void main(String[] args){
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}
```

