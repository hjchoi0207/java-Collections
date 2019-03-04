## Collections : list와 map
많은 양의 데이터를 관리하기 위해 java에서는 주로 list와 map을 이용하여 관리한다.
**list는 data들을 Index를 이용하여 관리하고 map은 key를 이용해서 관리한다는 것이 가장 큰 차이점이다**

### 1. Arraylist
```java
import java.util.ArrayList;
```
ArrayList를 이용하기 위해 미리 만들어진 Class(?)를 import해준다.
```java
ArrayList<String> list = new ArrayList<String>();
System.out.println("list.size : " + list.size());
```

```
list.size : 0
```
ArrayList를 이용하여 객체를 생성하는 방법이다. .size()를 이용해서 현재 list의 크기를 알 수도 있다. (시작은 0)

```java
list.add("Hello");
list.add("Java");
list.add("World");
System.out.println("list : "+ list);  //[Hello, Java, World]
```
또한 기본적으로 add를 활용하여 배열에 요소를 추가해 줄 수도있으며 **Index(0부터 시작)** 를 활용하여 추가하거나 변경할 수도 있다.
```java
list.add(2,"Program");
list.set(1, "C");
System.out.println("list : "+ list);  //[Hello, C, Program, World]
```
또한 데이터 추출 [ .get(Index); ]과 데이터를 전부 비우거나 [ .clear(); ] 특정 부분만을 제거할 수도 있다 [ .remove(Index); ] 
```java
String str = list.get(2);
System.out.println("list.get(2) : " + str);      //Program

str = list.remove(2);//remove [Program]
System.out.println("list.remove(2) : " + str);   //Program
System.out.println("list : " + list);            //[Hello, C, World]

boolean b = list.isEmpty();
System.out.println("list.isEmpty() : " + b);     //true
```
***
### 2. Map
```java
import java.util.HashMap;
```
Map을 이용하기 위해서도 당연히 import가 필요하다.

```java
HashMap<Integer, String> map = new HashMap<Integer, String>(); // <key, data>
System.out.println(map.size());
```
HashMap선언이며 왼쪽에는 Index와 같은 Key 오른쪽에는 data가 들어간다. 시작size는 당연히 0부터 시작한다.

```java
map.put(5, "Hello");
map.put(6, "Java");
map.put(7, "World");
map.put(8, "!!!!");
System.out.println("map : " + map);               //{5=Hello, 6=Java, 7=World, 8=!!!!}
System.out.println("map.size() : " + map.size()); //4
```
Map은 list와 다르게 put을 이용하지만 크게 차이는 없다 이 때 만약 key가 충돌하면 기존요소는 삭제된다.
```java
map.put(6, "C");      //{5=Hello, 6=C, 7=World, 8=!!!!}
```
또한 ArrayList에서 기존에 사용하던 .remove(key) .get(key) .clear() 모두 사용가능하며 특정 key와 data의 존재유무도 알 수 있다.
```java
boolean b = map.containsKey(7);
System.out.println("map.containsKey(7) : " + b);            //true
		
b = map.containsValue("World");
System.out.println("map.containsValue(\"World\"); : " + b); //true
```

- List와 Map을 제외하고도 java에는 데이터를 관리하기 위한 다양한 요소들이 있다. List에서도 Vector 
