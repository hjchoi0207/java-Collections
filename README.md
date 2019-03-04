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
