package collections;
import java.util.ArrayList;

public class ArrList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println("list.size : " + list.size());
		
		list.add("Hello");
		list.add("Java");
		list.add("World");
		System.out.println("list : "+ list);
		
		list.add(2,"Program");
		System.out.println("list.size : " + list.size());
		
		list.set(1, "C");
		
		String str = list.get(2);
		System.out.println("list.get(2) : " + str);
		System.out.println("list : "+ list);
		
		str = list.remove(2);
		System.out.println("list.remove(2) : " + str);
		System.out.println("list : " + list);
		
		list.clear(); //keep object only data
		System.out.println("list : " + list);
		
		boolean b = list.isEmpty();
		System.out.println("list.isEmpty() : " + b);
		
	}

}
