package ito.assignment.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class HashMapAssignment {

	/* to create a HashMap of key as student id(Integer) and value as Student name (String).
	Add some entries and print the hash map.*/ 
	public static HashMap<Integer,String> createHashMap(){
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1,"Vaibhav");
		hm.put(2,"Ajith");
		hm.put(3,"Ramesh");
		hm.put(4,"Nitin");
		System.out.println(hm);
		return hm;
	}
	
	//to count the number of key-value (size) mappings in a map.
	public static int countSize(HashMap<Integer,String> hm) {
		return hm.size();
	}
	
	// to get the value of a specified key in a map.
	public static String getValue(HashMap<Integer,String> hm,int key) {
		return hm.get(key);
	}
	
	// to get a set view of the keys contained in this map.
	public static Set<Integer> setView(HashMap<Integer,String> hm){
		return hm.keySet();
	}
	
	//to test if a map contains a mapping for the specified key.
	public static boolean testIfContainsKey(HashMap<Integer,String> hm,int key) {
		return hm.containsKey(key);
	}
	
	//to test if a map contains a mapping for the specified value.
	public static boolean testIfContainsValue(HashMap<Integer,String> hm,String value) {
		return hm.containsValue(value);
	}
	
	// to get a collection view of the values contained in this map.
	public static Collection<String> getCollectionView(HashMap<Integer,String> hm){
		return hm.values();
	}
	
	//to remove all of the mappings from a map.
	public static HashMap<Integer,String> removeAllMappings(HashMap<Integer,String> hm){
		hm.clear();
		return hm;
	}
	
	// to iterate over all the entries in the HashMap.     
	public static void iterateHashMap(HashMap<Integer,String> hm) {
		Iterator<Integer> itr=hm.keySet().iterator();
		while(itr.hasNext()) {
			int key=itr.next();
			System.out.println(key+":"+hm.get(key));
		}
	}
 }
