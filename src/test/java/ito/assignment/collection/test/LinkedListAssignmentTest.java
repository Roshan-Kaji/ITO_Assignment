package ito.assignment.collection.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import ito.assignment.collection.LinkedListAssignment;

class LinkedListAssignmentTest {

	@Test
	void testAppendAtEnd() {
		LinkedList<String> Student = new LinkedList<>(Arrays.asList("Roshan", "Ajith", "Ramesh", "Nitin"));
		LinkedList<String> Student1 = new LinkedList<>(Arrays.asList("Roshan", "Ajith", "Ramesh", "Nitin","veeru"));
		assertEquals(Student1, LinkedListAssignment.appendAtEnd(Student,"veeru"));
	}

	@Test
	void testRemoveReturnFirst() {
		LinkedList<String> Student = new LinkedList<>(Arrays.asList("Ajith", "Ramesh", "Nitin","veeru"));
		assertEquals("Ajith", LinkedListAssignment.removeReturnFirst(Student));
	}
	
	@Test
	void testSearchElement() {
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(11,22,33,44,55));
		assertEquals(true, LinkedListAssignment.searchElement(list, 33));
		assertEquals(false, LinkedListAssignment.searchElement(list, 88));
	}
	
	@Test
	void testInsertAtFirst() {
		LinkedList<Integer> linklist = new LinkedList<Integer>(Arrays.asList(11,22,33,44,55));
		LinkedList<Integer> newlist = new LinkedList<Integer>(Arrays.asList(22,33,44,55));
		assertEquals(linklist, LinkedListAssignment.insertAtFirst(newlist,11));
	}
	
	@Test
	void testInsertAtLast() {
		LinkedList<Integer> linklist = new LinkedList<Integer>(Arrays.asList(22,33,44,55,66));
		LinkedList<Integer> newlist = new LinkedList<Integer>(Arrays.asList(22,33,44,55));
		assertEquals(linklist, LinkedListAssignment.insertAtLast(newlist, 66));
	}
	
	@Test
	void testRemoveFirstAndLast() {
		LinkedList<Integer> linklist = new LinkedList<Integer>(Arrays.asList(2,3,4,5));
		LinkedList<Integer> newlist = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6));
		assertEquals(linklist, LinkedListAssignment.removeFirstAndLast(newlist));
	}
	
	

}
