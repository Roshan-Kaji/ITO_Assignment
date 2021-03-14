package ito.assignment.collection.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import ito.assignment.collection.TreeSetAssignment;

class TreeSetAssignmentTest {

	@Test
	void testCreateTreeSet() {
		TreeSet<Integer> ts=new TreeSet<Integer>(Arrays.asList(2,5, 12, 24, 78, 98));
		assertEquals(ts,TreeSetAssignment.createTreeSet());
	}

	@Test
	void testGetFirstAndLast() {
		int[] arr= {10,50};
		TreeSet<Integer> ts=new TreeSet<Integer>(Arrays.asList(20,10,30,50,40));
		assertArrayEquals(arr, TreeSetAssignment.getFirstAndLast(ts));
	}

	@Test
	void testNumberOfElements() {
		TreeSet<Integer> ts=new TreeSet<Integer>(Arrays.asList(2,5, 12, 24, 78, 98));
		assertEquals(6, TreeSetAssignment.getTotalElements(ts));
	}
	
	@Test
	void testRemoveElement() {
		TreeSet<Integer> ts=new TreeSet<Integer>(Arrays.asList(20,10,30,50,40));
		TreeSet<Integer> ts1=new TreeSet<Integer>(Arrays.asList(20,10,50,40));
		assertEquals(ts1, TreeSetAssignment.removeElement(ts, 30));
	}
	
	@Test
	void testRetrieveRemoveFirst() {
		TreeSet<Integer> ts=new TreeSet<Integer>(Arrays.asList(20,10,30,50,40));
		assertEquals(10, TreeSetAssignment.retrieveRemoveFirstElement(ts));
	}
	
	@Test
	void testRetrieveRemoveLast() {
		TreeSet<Integer> ts=new TreeSet<Integer>(Arrays.asList(20,10,30,50,40));
		assertEquals(50, TreeSetAssignment.retrieveRemoveLastElement(ts));
	}
	
	@Test
	void testReverseOrderView() {
		TreeSet<Integer> ts=new TreeSet<Integer>(Arrays.asList(2, 5, 12, 24, 78, 98));
		TreeSet<Integer> ts1=new TreeSet<Integer>(Arrays.asList(98, 78, 24, 12, 5, 2));
		assertEquals(ts1, TreeSetAssignment.reverseOrderView(ts));
	}
}
