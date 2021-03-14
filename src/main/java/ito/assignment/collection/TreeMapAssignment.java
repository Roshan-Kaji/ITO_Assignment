package ito.assignment.collection;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

import org.springframework.stereotype.Component;

@Component
public class TreeMapAssignment {
	

	// to create a TreeMap of <studentId(Integer), studentName(String)>. Add some student reocrds with random student ids. 
	public static TreeMap<Integer,String> createTreeMap(){
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(25,"Vaibhav");
		tm.put(20,"Ajith");
		tm.put(38,"Ramesh");
		tm.put(44,"Nitin");
		System.out.println(tm);
		return tm;
	}
	
	// to get all keys from the given a Tree Map.
	public static Set<Integer> getAllKey(TreeMap<Integer, String> treemap){
		return treemap.keySet();
	}
	
	// to sort keys in Tree Map by using comparator.
	public static TreeMap<Integer,String> sortWithComparator(TreeMap<Integer, String> treemap){
		treemap.comparator();
		return treemap;
	}
	
	//to get the first (lowest) key and the last (highest) key currently in a map.
	public static int[] getFirstAndLastKey(TreeMap<Integer, String> treemap) {
		int[] arr=new int[2];
		arr[0]=treemap.firstKey();
		arr[1]=treemap.lastKey();
		return arr;
	}
	
	//to get a reverse order view of the keys contained in a given map.
	public static NavigableSet<Integer> getReverseKey(TreeMap<Integer, String> treemap) {
		NavigableSet<Integer> reverseKeySet = treemap.descendingKeySet();
		return reverseKeySet;
	}
	
	//to delete all elements from a given Tree Map.
	public static TreeMap<Integer,String> deleteAllElements(TreeMap<Integer, String> treemap){
		return treemap;
	}
}
