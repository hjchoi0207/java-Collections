
package collections;
import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>(); // <key, data>
		System.out.println(map.size());
		
		map.put(5, "Hello");
		map.put(6, "Java");
		map.put(7, "World");
		System.out.println("map : " + map);
		System.out.println("map.size() : " + map.size());
		
		map.put(8, "!!!!");
		System.out.println("map : " + map);
		
		map.put(6, "C");
		System.out.println("map : " + map);
		
		String str = map.get(5);
		System.out.println("map.get(5) : " + str);
		
		map.remove(8);
		System.out.println("map : " + map);
		
		boolean b = map.containsKey(7);
		System.out.println("map.containsKey(7) : " + b);
		
		b = map.containsValue("World");
		System.out.println("map.containsValue(\"World\"); : " + b);
		
		map.clear();
		System.out.println("map : " + map);
		
		b = map.isEmpty();
		System.out.println("map.isEmpty() : " + b);
		
	
	}

}

