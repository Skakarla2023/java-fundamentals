<img width="1258" height="472" alt="image" src="https://github.com/user-attachments/assets/41c28895-c99f-4ac0-8cb4-e4ba55a54775" />

<img width="1242" height="163" alt="image" src="https://github.com/user-attachments/assets/d11c7ce5-25e6-45c5-b765-e24ece5010ae" />

```java
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    HashMap<String,String> cities = new HashMap<>();
    cities.put("Austria","Wien");
    cities.put("USA","Washington");
    cities.put("India","New Delhi");
    System.out.println(cities);
  }
}
```

- keys in a HashMap must be unique.

<img width="1250" height="161" alt="image" src="https://github.com/user-attachments/assets/538ef467-7038-43f9-920e-0598537d656f" />

```java
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<>();
    capitalCities.put("England", "London");
    capitalCities.put("India", "New Delhi");
    capitalCities.put("Austria", "Wien");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    
    System.out.println(capitalCities.get("India"));
  }
}
```

<img width="1244" height="168" alt="image" src="https://github.com/user-attachments/assets/3a366af7-65a6-4e0e-ab3c-b0a3cf3813dd" />

```java
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<>();
    capitalCities.put("England", "London");
    capitalCities.put("India", "New Delhi");
    capitalCities.put("Austria", "Wien");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println("Before removing:");
    System.out.println(capitalCities);
    capitalCities.remove("India");
    System.out.println("After removing:");
    System.out.println(capitalCities);
    
  }
}
```

#### Output:

```
Before removing:
{Austria=Wien, USA=Washington DC, Norway=Oslo, England=London, India=New Delhi}
After removing:
{Austria=Wien, USA=Washington DC, Norway=Oslo, England=London}
```

- To remove all items, use the clear() method:

```java
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<>();
    capitalCities.put("England", "London");
    capitalCities.put("India", "New Delhi");
    capitalCities.put("Austria", "Wien");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println("Before clearing :");
    System.out.println(capitalCities);
    capitalCities.clear();
    System.out.println("After clearing:");
    System.out.println(capitalCities);
    
  }
}
```

#### Output:

```
Before clearing :
{Austria=Wien, USA=Washington DC, Norway=Oslo, England=London, India=New Delhi}
After clearing:
{}
```

<img width="1248" height="168" alt="image" src="https://github.com/user-attachments/assets/aebb3ee5-1317-4064-8260-366354241de0" />

```java
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<>();
    capitalCities.put("England", "London");
    capitalCities.put("India", "New Delhi");
    capitalCities.put("Austria", "Wien");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities.size());    
  }
}
```

#### Output:

```
5
```

<img width="1220" height="271" alt="image" src="https://github.com/user-attachments/assets/4a00faf1-23d0-45cb-ae3c-1431fa0998bf" />

```java
package javaprograms;

import java.util.HashMap;

public class Hashmap {
	public static void main(String[] args) {
		HashMap<String, String> cities = new HashMap<>();
		cities.put("India", "New Delhi");
		cities.put("England", "London");
		cities.put("USA", "Washington DC");

		System.out.println("keys:");
		// loop through keys
		for (String i : cities.keySet()) {
			System.out.println(i);
		}

		System.out.println("Values:");
		// loop through values
		for (String i : cities.values()) {
			System.out.println(i);
		}
	}
}
```

- other types in Hashmap:

```java
package javaprograms;

import java.util.HashMap;

public class Hashmap2 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Kiran", 25);
		map.put("Anikha", 23);
		map.put("Manoj", 26);
		map.put("Vyshnavi", 22);
		System.out.println("Key value pairs:");
		for (String i : map.keySet()) {
			System.out.println("key:" + i + " " + "value:" + map.get(i));
		}
	}
}
```

Output:
```
Key value pairs:
key:Anikha value:23
key:Kiran value:25
key:Manoj value:26
key:Vyshnavi value:22
```

