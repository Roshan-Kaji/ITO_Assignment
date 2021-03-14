package ito.assignment.array.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ito.assignment.array.ArrayAssignment;


class ArrayTest {

	@Test
	void testFindSum() {
		int[] arr= {1,2,3,4,5};
		assertEquals(15, ArrayAssignment.findSum(arr));

	}

	@Test
	void testAscendingOrder() {
		int[] arr= {4,12,34,45,55,78,90,100};
		int[] arr2={100,45,78,90,12,4,34,55};
		assertArrayEquals(arr, ArrayAssignment.ascendingOrder(arr2));
	}

	@Test
	void testCopyArray() {
		int[] arr1= {1,2,3,4,5,6,7,8};
		int[] arr2=new int[arr1.length];
		assertArrayEquals(arr1, ArrayAssignment.copyArray(arr1, arr2));	
	}

	@Test
	void testDescendingOrder() {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int[] arr1= {9,8,7,6,5,4,3,2,1};
		assertArrayEquals(arr1, ArrayAssignment.descendingOrder(arr));
	}

	@Test
	void testLeftRotate() {
		int arr[]= {2,3,4,5,6,7,8,9,1};
		int arr1[]= {1,2,3,4,5,6,7,8,9};
		assertArrayEquals(arr, ArrayAssignment.rotateLeft(arr1));
	}
	

	@Test
	void testPrintArray() {
		int arr[]= {11,22,33,44,55,66};
		assertArrayEquals(arr,ArrayAssignment.printArray());
	}
	
	@Test
	void testPrintReverse() {
		int[] arr= {1,2,3,4,5};
		int revarr[]= {5,4,3,2,1};
		assertArrayEquals(revarr, ArrayAssignment.printReverse(arr));
	}
	
	@Test
	void testSmallestElement() {
		int[] arr1= {100,45,78,90,12,4,34,55};
		int min=4;
		assertEquals(min, ArrayAssignment.findSmallestElement(arr1));
	}
	
	@Test
	void testTotalElements() {
		int[] arr1= {100,45,78,90,12,4,34,55};
		assertEquals(arr1.length, ArrayAssignment.totalElements(arr1));
	}
	
	@Test
	void testsecondLargest() {
		int[] arr1= {100,45,78,90,12,4,34,55};
		int secondL=90;
		assertEquals(secondL, ArrayAssignment.secondLargest(arr1));
	}
}
