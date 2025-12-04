<img width="1260" height="366" alt="image" src="https://github.com/user-attachments/assets/2c5f47f8-26bf-4cd7-9fdb-a3793da2513a" />

```java
public class Car extends Veichle {
    private String modelName="Mustang";
    public static void main(String[] args){
        Car mycar = new Car();
        mycar.honk();
        System.out.println(mycar.brand+" "+mycar.modelName);
    }
}
class Veichle {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut tuut!");
    }
}
```


<img width="1261" height="141" alt="image" src="https://github.com/user-attachments/assets/25d51039-d477-4899-a508-81bbda77010b" />

<img width="1241" height="189" alt="image" src="https://github.com/user-attachments/assets/48ffade5-f124-4160-86e1-4ab1530c9392" />

```java
public class Car extends Veichle {
    private String modelName="Mustang";
    public static void main(String[] args){
        Car mycar = new Car();
        mycar.honk();
        System.out.println(mycar.brand+" "+mycar.modelName);
    }
}
final class Veichle {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut tuut!");
    }
}
```

#### Output:

```
ERROR!
/tmp/zcbZTn7wQk/Main.java:1: error: cannot inherit from final Veichle
public class Car extends Veichle {
                         ^
1 error
ERROR!
error: compilation failed
```
