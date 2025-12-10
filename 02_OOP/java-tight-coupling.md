# Tight Coupling

- Tight coupling in Java refers to a situation where two or more classes are highly dependent on each other's concrete implementations, meaning a change in one class often necessitates changes in the other(s).
- If one class changes, the other class must change too. This reduces flexibility, makes testing harder, and violates good design principles.


## WHAT is Tight Coupling about?

- One class is directly dependent on other class.
- Changing one often requires changing other.
- It happens when:
  - You create objects directly inside a class.
  - You use classes instead of interfaces.
 
```java
class Car{
  void start(){
    System.out.println("car started");
  }
}
class Engine{
  Car car = new Car();
}
```

## WHY do we need Tight Coupling?

- When you are writing small codes, we use tight coupling. It makes code short and easy.
- Loose coupling uses interfaces,abstraction or dependency, which adds a layer overheaad.
- Tight coupling = direct calls → slightly faster.
- When you're building a small project, prototype, or a college assignment,tight coupling helps you write code quickly without thinking about architecture.

## WHAT does it do in my code?

- It creates strong dependency between classes.
- Promotes fixed behavior.
- Reduces flexibility but increases straightforward readability.
- Makes your class control everything.


## HOW is it useful for me?

- Easy to build starting projects.
- Helps you understand the flow.
- Useful in small script,utilities and tools.


```java
public class TightCoupling {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}

class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    Engine engine = new Engine();

    void drive() {
        engine.start();
        System.out.println("car is moving");
    }
}
```


## WHAT are the disadvantages?

- Hard to replace a component (Engine → ElectricEngine).
- Hard to test (can’t mock dependencies).
- Not reusable — classes are stuck with each other.

## WHERE does Tight Coupling happen?

- When you create objects inside a class.
- When you call concrete implementations instead of interfaces
- When you avoid dependency injection (constructor injection/setter injection)



##  Using Interfaces

- Tight coupling can also be performed using interfaces:

```java
public class Main {
    public static void main(String[] args){
        Car car = new Car();
        car.drive();
    }
}
interface Engine {
    void start();
}

class DieselEngine implements Engine {
    public void start(){
        System.out.println("Diesel Engine started");
    }
}

class Car {
    Engine engine = new DieselEngine();
    void drive(){
        engine.start();
        System.out.println("Car is moving");
    }
}
```
