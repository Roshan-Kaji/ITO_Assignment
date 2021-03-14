package ito.assignment.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import org.springframework.stereotype.Component;

@Component
public class LinkedListAssignment {

	//to append the specified element to the end of a linked list.
	public static LinkedList<String> appendAtEnd(LinkedList<String> ll,String value) {
		ll.addLast(value);
		System.out.println(ll);
		return ll;
	}
	
	//to remove and return the first element of a linked list.
	public static String removeReturnFirst(LinkedList<String> ll) {
		String first = ll.pollFirst();
		System.out.println(first);
		return first;
	}
	
	//to check if a particular element exists in a linked list.
	public static boolean searchElement(LinkedList<Integer> list,int value) {
		if(list.contains(value)) {
			return true;
		}else {
			return false;
		}
	}
	
	// to retrieve but does not remove, the first element of a linked list.
	public static int getFirstElement(LinkedList<Integer> list) {
		System.out.println(list.peek());
		return list.peek();
	}

	//to insert the specified element at the front of a linked list.
	public static LinkedList<Integer> insertAtFirst(LinkedList<Integer> list,int value){
		 list.addFirst(value);
		 System.out.println(list);
		 return list;
	}
	
	// to insert the specified element at the end of a linked list.
	public static LinkedList<Integer> insertAtLast(LinkedList<Integer> list,int value){
		list.addLast(value);
		System.out.println(list);
		return list;
	}
	
	// to remove first and last element from a linked list.
	public static LinkedList<Integer> removeFirstAndLast(LinkedList<Integer> list){
		list.removeFirst(); //remove first element from linked list
		list.removeLast();  //remove last element from linked list
		System.out.println(list);
		return list;
	}
	
	
	public static ArrayList<Integer> convertLinkedListToAL(LinkedList<Integer> list){
		ArrayList<Integer> al=new ArrayList<Integer>(list);
		return al;
	}
	
	//to clone an linked list to another linked list.
		public static LinkedList<Integer> cloneLinkedList(LinkedList<Integer> list){
			LinkedList<Integer> ll2=(LinkedList<Integer>) list.clone();
			System.out.println(ll2);
			return ll2;
		}
	
		
	// to iterate through all elements in a linked list.
	public static void iterateLinkedList(LinkedList<String> list) {
		Iterator<String> itr=list.iterator();
		int i=1;
		while(itr.hasNext()) {
			System.out.println(i+"."+itr.next());
			i++;
			
		}
	}
	
	// to iterate a linked list in reverse order.
	public static void iterateReverse(LinkedList<String> list) {
		Iterator<String> itr=list.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	// to display the elements and their positions in a linked list.
	public static void displayElementAndPosition(LinkedList<String> list) {
		Iterator<String> itr=list.iterator();
		int i=1;
		while(itr.hasNext()) {
			System.out.println(i+":"+itr.next());
			i++;
		}
	}
	
	// to iterate through all elements in a linked list starting at the specified position.
	public static void iterateFromPosition(LinkedList<String> list,int value) {
		ListIterator<String> itr=list.listIterator(value);//iterates linked list from index 2
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	//to remove all the elements from a linked list.
	public static void removeAllElements(LinkedList<String> list) {
		list.clear();
	}
	
	//to insert the specified element at the specified position in the linked list.
	public static LinkedList<Integer> insertElementAtPosition(LinkedList<Integer> list,int index,int value){
		list.add(index, value);
		System.out.println(list);
		return list;
	}
	
	//to join two linked lists.
	public static LinkedList<Integer> joinTwoList(LinkedList<Integer> list1){
		LinkedList<Integer> list2=new LinkedList<Integer>();
		list2.addAll(list1);
		return list2;
		
	}
	
	
}
