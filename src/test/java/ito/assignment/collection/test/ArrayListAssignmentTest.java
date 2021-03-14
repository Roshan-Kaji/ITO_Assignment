package ito.assignment.collection.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import ito.assignment.collection.ArrayListAssignment;


class ArrayListAssignmentTest {

	@Test
	void testEmptyArrayList() {
		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		arrlist.add(98);
		arrlist.add(24);
		arrlist.add(37);
		arrlist.add(66);
		arrlist.add(55);
		arrlist.add(32);
		ArrayList<Integer> arrlist1=new ArrayList<Integer>();
//		assertEquals(arrlist1, ArrayListAssignment.emptyArrayList(arrlist));
		assertEquals(0, ArrayListAssignment.emptyArrayList(arrlist).size());
	}

	@Test
	void testEmptyListCheck() {
		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		arrlist.add(98);
		arrlist.add(24);
		arrlist.add(37);
		ArrayList<Integer> arrlist1=new ArrayList<Integer>();
		assertEquals(true, ArrayListAssignment.emptyListCheck(arrlist1));
		assertEquals(false, ArrayListAssignment.emptyListCheck(arrlist));
	}
	
	@Test
	void testInsertAtFirst() {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10,98, 24, 37, 66, 55, 32));
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(98, 24, 37, 66, 55, 32));
		assertEquals(arr, ArrayListAssignment.insertAtFirst(arr1,10));
		
	}
	
	@Test
	void testRemoveThirdElement() {
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(98, 24, 37, 66, 55, 32));
		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(98, 24, 66, 55, 32));
		assertEquals(arr2, ArrayListAssignment.removeThirdElement(arr1));
	}
	
	@Test
	void testReverseArrayList() {
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(98, 24, 37, 66, 55, 32));
		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(32, 55, 66, 37, 24, 98));
		assertEquals(arr2, ArrayListAssignment.reverseArrayList(arr1));
	}
	
	@Test
	void testSearchElement() {
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(98, 24, 37, 66, 55, 32));
		assertEquals(true, ArrayListAssignment.searchElement(arr1, 24));
		assertEquals(false, ArrayListAssignment.searchElement(arr1, 22));
	}
	
	@Test
	void testSortArrayList() {
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(24,32, 37, 55, 66, 98));
		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(98, 24, 37, 66, 55, 32));
		assertEquals(arr1, ArrayListAssignment.sortArrayList(arr2));
	}
	
	@Test
	void testStudentList() {
		ArrayList<String> Student = new ArrayList<>(Arrays.asList("Roshan", "Ajith", "Ramesh", "Nitin"));
		assertEquals(Student, ArrayListAssignment.studentList());
		
	}

}
