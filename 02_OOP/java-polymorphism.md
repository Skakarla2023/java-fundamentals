# Java Polymorphism

- Polymorphism in Java is a core Object-Oriented Programming (OOP) concept that allows an object to take on many forms or, more simply, allows a single action to be performed in different ways. This means one method name can have multiple implementations depending on the object it is called on.
- There are two main types of polymorphism in Java:
  1. Compile-time Polymorphism (Static Binding/Method Overloading)
  2. Runtime Polymorphism (Dynamic Binding/Method Overriding) 

## Compile-Time Polymorphism (Method Overloading) 

- Compile-time polymorphism is achieved through method overloading, where multiple methods within the same class share the same name but have different parameters. The compiler determines which specific method to call at compile time based on the number, type, and order of arguments passed.

```java
class Main {
    public int add(int x,int y){
        return x+y;
    }
    public double add(double a,double b){
        return a+b;
    }
    public int add(int z,int y,int x){
        return x+y+z;
    }
    public static void main(String[] args){
        Main obj=new Main();
        System.out.println(obj.add(3,4));
        System.out.println(obj.add(3.6,8.2));
        System.out.println(obj.add(5,3,7));
    }
}
```

## Runtime Polymorphism (Method Overriding)

- Runtime polymorphism is achieved through method overriding and inheritance. It occurs when a subclass provides its own specific implementation of a method that is already defined in its parent class. The actual method invoked is determined by the Java Virtual Machine (JVM) at runtime, based on the actual object type (not the reference variable type).


```java
class Main {
    public static void main(String[] args){
        Animal animal = new Animal();
        Animal mypig = new Pig();
        animal.Animalsound();
        mypig.Animalsound();
    }
}

class Animal {
    public void Animalsound() {
        System.out.println("The animal makes a sound");
    }
}
class Pig extends Animal {
    public void Animalsound() {
        System.out.println("The pig says : wee wee");
    }
}
```

