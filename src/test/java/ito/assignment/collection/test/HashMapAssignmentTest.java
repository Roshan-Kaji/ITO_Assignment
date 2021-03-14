package ito.assignment.collection.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

import ito.assignment.collection.HashMapAssignment;

class HashMapAssignmentTest {
	HashMap< Integer,String> hashMap = new HashMap< Integer,String>()
	{{
		put(1,"One");
		put(2,"Two");
		put(3,"Three");
	}};
	
	HashMap<Integer, String> actual=new HashMap<Integer, String>(){{
		put(1,"Vaibhav");
		put(2,"Ajith");
		put(3,"Ramesh");
		put(4,"Nitin");
	}};

	@Test
	void testCreateHashMap() {
		HashMap<Integer, String> expected=new HashMap<Integer, String>();
		expected.put(1,"Vaibhav");
		expected.put(2,"Ajith");
		expected.put(3,"Ramesh");
		expected.put(4,"Nitin");
		assertEquals(expected, HashMapAssignment.createHashMap());
	}

	@Test
	void testCountSize() {
		int expected=3;
		assertEquals(expected, HashMapAssignment.countSize(hashMap));

	}

	@Test
	void testGetValue() {
		String expected="Two";
		assertEquals(expected, HashMapAssignment.getValue(hashMap, 2));
	}

	@Test
	void testSetView() {
		HashSet<Integer> expected=new HashSet<Integer>(Arrays.asList(1,2,3));
		assertEquals(expected, HashMapAssignment.setView(hashMap));
	}

	@Test
	void testTestIfContainsKey() {
		boolean expected=true;
		assertEquals(expected, HashMapAssignment.testIfContainsKey(hashMap, 2));
	}

	@Test
	void testTestIfContainsValue() {
		boolean expected=true;
		assertEquals(expected, HashMapAssignment.testIfContainsValue(hashMap, "Three"));
	}


	@Test
	void testRemoveAllMappings() {
		HashMap<Integer,String> expected=new HashMap<Integer,String>();
		assertEquals(expected, HashMapAssignment.removeAllMappings(hashMap));
	}

}
