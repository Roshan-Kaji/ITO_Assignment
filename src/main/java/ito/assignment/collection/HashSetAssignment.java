package ito.assignment.collection;

import java.util.HashSet;
import java.util.Iterator;

import org.springframework.stereotype.Component;

@Component
public class HashSetAssignment {

	// to add student names in a hash set.      
	public static HashSet<String> addStudent() {
		HashSet<String> hs=new HashSet<String>();
		hs.add("Vaibhav");
		hs.add("Ajith");
		hs.add("Ramesh");
		hs.add("Nitin");
		System.out.println(hs);
		return hs;
	}

	//to get the number of elements in a hash set.
	public static int numberOfElements(HashSet<String> hs) {
		System.out.println(hs.size());
		return hs.size();
	}

	//to convert a hash set to a List/ArrayList.
	public static Object[] hashSetToArray(HashSet<Integer> hs) {
		Object[] arr=hs.toArray();
		System.out.print("Array:");
		for(Object x:arr) {
			System.out.print(x+" ");
		}
		return arr;
	}

	//to compare two hash set.
	public static boolean compareHashSet(HashSet<String> hs1,HashSet<String> hs2) {
		return hs1.equals(hs2);
	}

	//to remove all of the elements from a hash set.
	public static void removeAllElements(HashSet<String> hs) {
		hs.removeAll(hs);
	}

	// to iterate through all elements in a hash list.
	public static void iterateHashSet(HashSet<String> hs) {
		Iterator<String> itr=hs.iterator();
		int i=1;
		while(itr.hasNext()) {
			System.out.println(i+":"+itr.next());
			i++;
		}
	}
	
	//to empty an hash set.
	public static HashSet<String> emptyHashSet(HashSet<String> hs) {
		hs.clear();
		return hs;
	}


}
