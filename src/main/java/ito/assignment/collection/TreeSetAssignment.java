package ito.assignment.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

import org.springframework.stereotype.Component;

@Component
public class TreeSetAssignment {

	//to create a new tree set, add some random numbers (Integer) and print out the tree set.
	public static TreeSet<Integer> createTreeSet(){
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(24);
		ts.add(78);
		ts.add(12);
		ts.add(5);
		ts.add(98);
		ts.add(2);
		System.out.println(ts);
		return ts;
	}
	
	// to get the first and last elements in a tree set.
	public static int[] getFirstAndLast(TreeSet<Integer> ts){
		int fl[]=new int[2];
		fl[0]=ts.first();
		fl[1]=ts.last();
		return fl;
	}
	
	//  to get the number of elements in a tree set.
	public static int getTotalElements(TreeSet<Integer> ts) {
		System.out.println("No. of elements in treeset is:"+ts.size());
		return ts.size();
	}
	
	//  to remove a given element from a tree set.
	public static TreeSet<Integer> removeElement(TreeSet<Integer> ts,int value){
		ts.remove(value);
		System.out.println(ts);
		return ts;
	}
	
	//to retrieve and remove the first element of a tree set.
	public static Integer retrieveRemoveFirstElement(TreeSet<Integer> ts){
		return ts.pollFirst();
	}
	
	//to retrieve and remove the last element of a tree set.
	public static Integer retrieveRemoveLastElement(TreeSet<Integer> ts){
		return ts.pollLast();
	}
	
	// to create a reverse order view of the elements contained in a given tree set.
	public static NavigableSet<Integer> reverseOrderView(TreeSet<Integer> ts){
		return ts.descendingSet();
	}
	
	// to iterate through all elements in a tree set.
	public static void iterateTreeSet(TreeSet<Integer> ts) {
		Iterator<Integer> itr=ts.iterator();
		int i=1;
		while(itr.hasNext()) {
			System.out.println(i+"."+itr.next());
			i++;
		}
	}
	
	public static TreeSet<Integer> addTwoTreeSet(TreeSet<Integer> treeset){
		TreeSet<Integer> ts2=new TreeSet<Integer>();
		ts2.addAll(treeset);//adding elements of first tree set into second tree set
		return ts2;
	}
}
