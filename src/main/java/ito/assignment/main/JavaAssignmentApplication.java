package ito.assignment.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ito.assignment.array.ArrayAssignment;
import ito.assignment.collection.ArrayListAssignment;
import ito.assignment.collection.HashMapAssignment;
import ito.assignment.collection.HashSetAssignment;
import ito.assignment.collection.LinkedListAssignment;
import ito.assignment.collection.TreeMapAssignment;
import ito.assignment.collection.TreeSetAssignment;
import ito.assignment.data_type_conversion.DataTypeAssignment;
import ito.assignment.string.StringAssignment;


@SpringBootApplication
public class JavaAssignmentApplication implements CommandLineRunner {

	@Autowired
	ArrayAssignment array;

	@Autowired
	StringAssignment javaString;

	@Autowired
	ArrayListAssignment arrayList;

	@Autowired
	LinkedListAssignment linkList;

	@Autowired
	TreeSetAssignment treeSet;

	@Autowired
	HashSetAssignment hashSet;

	@Autowired
	HashMapAssignment hashMap;

	@Autowired
	TreeMapAssignment treeMap;

	@Autowired
	DataTypeAssignment dataType;


	public static void main(String[] args) throws Exception {
		JavaAssignmentApplication obj=new JavaAssignmentApplication();
		obj.run();	
	}

	@Override
	public void run(String... args) throws Exception {
		int[] arr= {1,2,3,4,5};
		int[] arr1= {100,45,78,90,12,4,34,55};
		int[] copy1= {1,2,3,4,5,6,7,8};
		int[] copy2=new int[arr1.length];

		System.out.println("ARRAY");
		ArrayAssignment.findSum(arr1);
		ArrayAssignment.ascendingOrder(arr1);
		System.out.println();
		ArrayAssignment.copyArray(copy1, copy2);
		ArrayAssignment.descendingOrder(arr1);
		ArrayAssignment.printOddEven(arr1);
		ArrayAssignment.printArray();
		ArrayAssignment.printReverse(arr);
		ArrayAssignment.findSmallestElement(arr1);
		ArrayAssignment.totalElements(arr1);
		ArrayAssignment.secondLargest(arr1);
		ArrayAssignment.elementAtEvenPosition(arr1);
		ArrayAssignment.elementAtOddPosition(arr1);
		ArrayAssignment.thirdLargest(arr1);
		ArrayAssignment.rotateRight(arr);
		ArrayAssignment.rotateLeft(arr);
		ArrayAssignment.secondSmallest(arr);
		ArrayAssignment.largestNumber(arr1);

		String s1="hello";
		String s2="world";
		String s3="HelloWorld";
		String s4="noon";
		TreeMap<String,Integer> vowelcons=new TreeMap<String,Integer>();
		System.out.println("STRING");
		StringAssignment.joinString(s1, s2);
		StringAssignment.findTotalChar(s3);
		StringAssignment.checkPalindrome(s4);
		StringAssignment.reverseString("Programming");
		StringAssignment.anagramCheck("binary", "brainy");
		StringAssignment.replaceSpace("hello world");
		StringAssignment.duplicateWords("hello world world");
		StringAssignment.findCharFrequency(s3);
		StringAssignment.swapString(s1,s2);
		StringAssignment.toOppositeCase(s3);
		StringAssignment.findTotalWords("hello world welcome to java programming");
		StringAssignment.removeSpace("hello welcome to Java Programming");
		StringAssignment.findVowelAndConsonant(s3, vowelcons);



		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		arrlist.add(98);
		arrlist.add(24);
		arrlist.add(37);
		arrlist.add(66);
		arrlist.add(55);
		arrlist.add(32);
		ArrayList<Integer> earrlist=new ArrayList<Integer>();
		ArrayList<String> places = new ArrayList<>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));
		System.out.println("ArrayList");
		ArrayListAssignment.emptyListCheck(arrlist);
		ArrayListAssignment.insertAtFirst(arrlist,99);
		ArrayListAssignment.removeThirdElement(arrlist);
		ArrayListAssignment.reverseArrayList(arrlist);
		ArrayListAssignment.iterateArrayList(arrlist);
		ArrayListAssignment.joinTwoArrayList(arrlist);
		ArrayListAssignment.cloneArrayList(earrlist);
		ArrayListAssignment.searchElement(arrlist, 66);
		ArrayListAssignment.sortArrayList(arrlist);
		ArrayListAssignment.updateElement(arrlist, 2, 25);
		ArrayListAssignment.retrieveElement(arrlist, 2);
		ArrayListAssignment.emptyArrayList(arrlist);
		ArrayListAssignment.studentList();

		LinkedList<String> ll=new LinkedList<String>();
		LinkedList<Integer> ll1=new LinkedList<Integer>(Arrays.asList(10,20,30,40,50));
		LinkedList<Integer> linklist = new LinkedList<Integer>(Arrays.asList(22,33,44,55));
		LinkedList<String> list1 = new LinkedList<String>(Arrays.asList("Ajith","Veeresh","Nitin","Sam"));
		ll.add("hello");
		ll.add("world");
		String s5="java";
		System.out.println("LinkedList");
		LinkedListAssignment.appendAtEnd(ll, s5);
		LinkedListAssignment.removeReturnFirst(ll);
		LinkedListAssignment.searchElement(ll1, 55);
		LinkedListAssignment.getFirstElement(ll1);
		LinkedListAssignment.insertAtFirst(linklist, 11);
		LinkedListAssignment.joinTwoList(linklist);
		LinkedListAssignment.insertAtLast(linklist, 66);
		LinkedListAssignment.removeFirstAndLast(ll1);
		LinkedListAssignment.convertLinkedListToAL(ll1);
		LinkedListAssignment.iterateLinkedList(list1);
		LinkedListAssignment.iterateReverse(list1);
		LinkedListAssignment.displayElementAndPosition(list1);
		LinkedListAssignment.iterateFromPosition(list1,2);
		LinkedListAssignment.insertElementAtPosition(linklist, 2, 68);
		LinkedListAssignment.removeAllElements(list1);


		TreeSet<Integer> ts=new TreeSet<Integer>(Arrays.asList(20,10,30,50,40));
		System.out.println("TreeSet");
		TreeSetAssignment.createTreeSet();
		TreeSetAssignment.getFirstAndLast(ts);
		TreeSetAssignment.getTotalElements(ts);
		TreeSetAssignment.removeElement(ts, 30);
		TreeSetAssignment.iterateTreeSet(ts);
		TreeSetAssignment.retrieveRemoveFirstElement(ts);
		TreeSetAssignment.retrieveRemoveLastElement(ts);
		TreeSetAssignment.addTwoTreeSet(ts);
		TreeSetAssignment.reverseOrderView(ts);
		
		HashSet<String> hs=new HashSet<String>(Arrays.asList("Ajith", "Nitin", "Vaibhav", "Ramesh"));
		HashSet<Integer> hsn=new HashSet<Integer>(Arrays.asList(20,10,30,50,40));
		HashSet<String> hs1=new HashSet<String>(Arrays.asList("Veeresh", "Nitin", "Vaibhav", "Ramesh"));
		System.out.println("HashSetAssignment");
		HashSetAssignment.addStudent();
		HashSetAssignment.numberOfElements(hs);
		HashSetAssignment.compareHashSet(hs, hs1);
		HashSetAssignment.iterateHashSet(hs);
		HashSetAssignment.hashSetToArray(hsn);
		HashSetAssignment.removeAllElements(hs1);
		HashSetAssignment.emptyHashSet(hs1);
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1,"Vaibhav");
		hm.put(2,"Ajith");
		hm.put(3,"Ramesh");
		hm.put(4,"Nitin");
		System.out.println("HashMapAssignment");
		HashMapAssignment.createHashMap();
		HashMapAssignment.countSize(hm);
		HashMapAssignment.getValue(hm,3);
		HashMapAssignment.setView(hm);
		HashMapAssignment.testIfContainsKey(hm, 2);
		HashMapAssignment.testIfContainsValue(hm, "Nitin");
		HashMapAssignment.getCollectionView(hm);
		HashMapAssignment.iterateHashMap(hm);
		HashMapAssignment.removeAllMappings(hm);

		TreeMap<Integer, String> treemap=new TreeMap<Integer, String>(){{
			put(2,"Ajith");
			put(1,"Vaibhav");
			put(4,"Nitin");
			put(3,"Ramesh");
		}};
		System.out.println("TreeMapAssignment");
		TreeMapAssignment.createTreeMap();
		TreeMapAssignment.getAllKey(treemap);
		TreeMapAssignment.sortWithComparator(treemap);
		TreeMapAssignment.getFirstAndLastKey(treemap);
		TreeMapAssignment.getReverseKey(treemap);
		TreeMapAssignment.deleteAllElements(treemap);

		System.out.println("DataTypeAssignment");
		DataTypeAssignment.stringToInt("85");
		DataTypeAssignment.intToString(44);
		DataTypeAssignment.stringToLong("4567");
		DataTypeAssignment.longToString(1237689890l);
		DataTypeAssignment.floatToString(1.14f);
		DataTypeAssignment.stringToFloat("33.44");
		DataTypeAssignment.stringToDouble("3456.5678");
		DataTypeAssignment.doubleToString(3456.5678d);
		DataTypeAssignment.dateToString();
		DataTypeAssignment.stringToDate("14/03/21");
		DataTypeAssignment.stringToChar("hello");
		DataTypeAssignment.charToString('a');
		DataTypeAssignment.intTolong(44);
		DataTypeAssignment.longToint(4322);
		DataTypeAssignment.intTodouble(3456);
		DataTypeAssignment.doubleToint(2324.44d);
		DataTypeAssignment.charToint('a');
		DataTypeAssignment.dateToTimestamp();
		DataTypeAssignment.timeStampToDate();
		DataTypeAssignment.intTochar(97);
		DataTypeAssignment.stringToBoolean("false");

	}

}


