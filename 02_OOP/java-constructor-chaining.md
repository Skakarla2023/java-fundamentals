# Constructor chaining

- Constructor chaining is when one constructor calls another—using this() within the same class or super() to the parent class—to reuse initialization logic, avoid code repetition, and build objects in an organized way.
- Imagine a scenario like this:

```

Imagine a class with four constructors:

1. No parameters
2. One parameter
3. Two parameters
4. Three parameters

Instead of writing the same initialization logic in all four constructors, you can write the logic once in the last constructor (the one with three parameters) and have the other constructors reuse it by calling it.

This can be done in two ways:

-> this() → when calling a constructor within the same class
-> super() → when calling a constructor from the parent class

This mechanism of one constructor calling another to reuse logic and organize object creation is called constructor chaining.
```


#### Example:

```java
class ConstructorChaining {
    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println("--------");
        Student s2 = new Student("Satwika");
    }
}

class Student {
    int no;
    String name;

    Student(){
        this("Unknown",0);
        System.out.println("Default contructor");
    }
    Student(String name){
        this(name,0);
        System.out.println("Name constructor called");
    }
    Student(String name, int no){
        this.name=name;
        this.no=no;
        System.out.println("Full constructor called");
    }
}
```
