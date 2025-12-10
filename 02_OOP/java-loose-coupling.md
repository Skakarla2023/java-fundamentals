# Loose Coupling

- Loose coupling in Java is a software design principle where components or classes have minimal dependencies on each other. This means that changes made in one class have little or no impact on other components, resulting in a more flexible, maintainable, and testable system.
- Loose coupling focuses on reducing the dependency strength between classes.
- Loose coupling is primarily achieved through abstraction rather than concrete implementations.


```java
public class LooseCouplingDemo{
    public static void main(String[] args){
        Engine diesel = new DieselEngine();
        Car car1 = new Car(diesel);
        car1.drive();
        
        
        Engine electric = new ElectricEngine();
        Car car2 = new Car(electric);
        car2.drive();
    }
}
interface Engine {
    void start();
}

class DieselEngine implements Engine {
    public void start() {
        System.out.println("Diesel Engine started");
    }
}

class ElectricEngine implements Engine {
    public void start() {
        System.out.println("Electric Engine started");
    }
}

class Car {
    private Engine engine;
    
    public Car(Engine engine){
        this.engine=engine;
    }
    
    public void drive(){
        engine.start();
        System.out.println("Car is moving");
    }
}
```
