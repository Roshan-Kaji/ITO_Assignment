package ito.assignment.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import org.springframework.stereotype.Component;

@Component
public class ArrayListAssignment{

	// to empty an array list.
	public static ArrayList<Integer> emptyArrayList(ArrayList<Integer> arrlist){
		System.out.println("Original ArrayList:"+arrlist);
		arrlist.clear();
		System.out.println("Empty List:"+arrlist);
		return arrlist;
	}
	//to test an array list is empty or not.
	public static boolean emptyListCheck(ArrayList<Integer> arrlist){
		if(arrlist.isEmpty()) {
			System.out.println("List is Empty");
			return true;
		}else{
			System.out.println("List is not Empty");
			return false;
		}
	}

	// to iterate through all elements in a array list.
	public static void iterateArrayList(ArrayList<Integer> arrlist) {
		int i=1;
		Iterator<Integer> itr=arrlist.iterator();
		while(itr.hasNext()) {
			System.out.println(i+"."+itr.next());
			i++;
		}
	}
	
	//to insert an element into the array list at the first position.
	public static ArrayList<Integer> insertAtFirst(ArrayList<Integer> arrlist,int num){
		System.out.println("before inserting element:"+arrlist);
		arrlist.add(0, num);
		System.out.println("after inserting element "+num+" at first position:"+arrlist);
		return arrlist;
	}
	
	//to clone an array list to another array list.
	public static ArrayList<Integer> cloneArrayList(ArrayList<Integer> arrlist){
		ArrayList<Integer> arr1=(ArrayList) arrlist.clone();
		return arr1;
	}

	//to remove the third element from a array list.
	public static ArrayList<Integer> removeThirdElement(ArrayList<Integer> arrlist){
		System.out.println("before removing third element:"+arrlist);
		arrlist.remove(2);
		System.out.println("after removing third element:"+arrlist);
		return arrlist;

	}

	//to reverse elements in a array list.
	public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> arrlist){
		Collections.reverse(arrlist);
		System.out.println(arrlist);
		return arrlist;
	}

	// to search an element in a array list.
	public static boolean searchElement(ArrayList<Integer> arrlist,int num) {
		if(arrlist.contains(num)) {
			return true;
		}else {
			return false;
		}
	}
	
	//to join two array lists.
		public static ArrayList<Integer> joinTwoArrayList(ArrayList<Integer> list1){
			ArrayList<Integer> list2=new ArrayList<Integer>(list1);
			return list2;
		}


	// to sort a given array list.
	public static ArrayList<Integer> sortArrayList(ArrayList<Integer> arrlist){
		arrlist.sort(null);//sorting elements in ArrayList
		return arrlist;
	}

	// to create a new array list containing student names, add some student (string) and print out the collection.
	public static ArrayList<String> studentList(){
		ArrayList<String> Student = new ArrayList<>(Arrays.asList("Roshan", "Ajith", "Ramesh", "Nitin"));
		System.out.println(Student);
		return Student;
	}

	//to update specific array element by given element.
	public static ArrayList<Integer> updateElement(ArrayList<Integer> arrlist,int index,int value){
		arrlist.set(index, value);
		return arrlist;

	}
	
	//to retrieve an element (at a specified index) from a given array list.
	public static int retrieveElement(ArrayList<Integer> arrlist,int position) {
		return arrlist.get(position);
	}
	
	

}


