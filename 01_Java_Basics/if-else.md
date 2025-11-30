# Java if-else

```
if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
```


```java
public class Main {
    public static void main(String[] args) {
        
        int weather = 1;
        // sunny=1,rainy=2,winter=3
        if(weather==2){
            System.out.println("Carry umbrella");
        }
        else if(weather==1){
            System.out.println("Carry a hat");
        }
        else {
            System.out.println("Go free");
        }
    }
}
```

