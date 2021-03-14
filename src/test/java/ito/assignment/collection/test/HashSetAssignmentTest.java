package ito.assignment.collection.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

import ito.assignment.collection.HashSetAssignment;

class HashSetAssignmentTest {

	HashSet<String> hs=new HashSet<String>(Arrays.asList("Ajith", "Nitin", "Vaibhav", "Ramesh"));
	@Test
	void testAddStudent() {
		
		assertEquals(hs, HashSetAssignment.addStudent());
	}
	
	@Test
	void testNumberOfElements() {
		HashSet<String> hs=new HashSet<String>(Arrays.asList("Ajith", "Nitin", "Vaibhav", "Ramesh"));
		assertEquals(4, HashSetAssignment.numberOfElements(hs));
	}
	
	@Test
	void testEmptyHashSet() {
		HashSet<String> expected=new HashSet<String>();
		assertEquals(expected, HashSetAssignment.emptyHashSet(hs));
	}

}
