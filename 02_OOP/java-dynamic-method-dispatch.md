# Dynamic Method Dispatch

- To understand Dynamic Method Dispatch, you need to understand **object** and **reference**.

### Object

- It is the real thing created in the memory.
- An object is created using the new keyword.
- It is stored in heap memory.

```java
new Student();
```

### Reference

- It is a variable that stores the address of the object.
- It is used to access the objects.
- It is stored in stack memory.

```java
Student s
```

## Dynamic Method Dispatch

- Dynamic Method Dispatch is a mechanism by which JVM decides which version of an overriden method to be executed at the run time.
- In simple words, java decides which method to run based on the object not the reference.

```java
class DynamicMethodDispatch {
    public static void main(String[] args){
        Engine e;
        e = new Engine();
        e.start();
        e = new Car();
        e.start();
        e = new Bike();
        e.start();
    }
}

class Engine {
    void start() {
        System.out.println("Engine started");
    }
}
class Car extends Engine {
    void start() {
        System.out.println("Car started");
    }
}
class Bike extends Engine {
    void start() {
        System.out.println("Bike started");
    }
}
```


- Here we are using Parent class to create objects for child class because, using parent class we can access any child's objects.
- But if we create objects using child class, it is strictly restricted to that class only, it cannot be accessed by parent class.

