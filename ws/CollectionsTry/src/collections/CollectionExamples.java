package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExamples {
	public static void main(String[] args) {
		
		// List interface- ArrayList
		System.out.println("Declaring a ArrayList");
		List<String> arrayListObj = new ArrayList<String>();
		System.out.println("List is empty now- size" + arrayListObj.size());
		
		// add something to the arraylist
		arrayListObj.add("Zero");
		arrayListObj.add("One");
		arrayListObj.add("Two");
		printList(arrayListObj);
		// add a string at position 1
		System.out.println("index-1, override by text-\"Overriden text\"");
		arrayListObj.add(1, "Overriden text");

		printList(arrayListObj);
		
		// remove from index
		System.out.println("remove from index-1");
		arrayListObj.remove(1);
		printList(arrayListObj);
		
		List<String> arrayListObj2 = new ArrayList<String>();
		
		
		arrayListObj2.add("Zero");

		printList(arrayListObj2);
		arrayListObj2.addAll(0, arrayListObj);
		printList(arrayListObj2);
	}
	
	public static void printList(List<String> list) {
		Iterator<String> obj = list.iterator();
		System.out.println("------------------------Print Start------------------------");
		while(obj.hasNext()) {
			System.out.println(obj.next());		
		}
		System.out.println("------------------------Print End------------------------");
	}
}
