package ito.assignment.string.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeMap;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import ito.assignment.string.StringAssignment;

class StringTest {

	String s1="hello";
	String s2="world";
	String s="helloworld";
	
	@Test
	void testJoinString() {
		assertEquals("helloworld", StringAssignment.joinString(s1, s2));
	}
	
	@Test
	void testTotalChar() {
		assertEquals(10, StringAssignment.findTotalChar(s));
	}
	
	@Test
	void testReplaceSpace() {
		String s="hello world";
		assertEquals("hello*world",StringAssignment.replaceSpace(s));
	}
	
	@Nested
	class testCheckPalindrome{
	@Test
	void testPalindrome() {
		String s="noon";
		assertEquals(true, StringAssignment.checkPalindrome(s));
	}
	
	@Test
	void testPalindrome1() {
	String s="hello";
	assertEquals(false, StringAssignment.checkPalindrome(s));
	}
	}
	
	@Test
	void testReverseString() {
		String s="Programming";
		assertEquals("gnimmargorP", StringAssignment.reverseString(s));
	}
	
	@Test
	void testRemoveWhiteSpace() {
//		String s="hellowelcometoJavaProgramming";
		assertEquals("hellowelcometoJavaProgramming", StringAssignment.removeSpace("hello welcome to Java Programming"));
	}
	
	@Test
	void testCharFrequency() {
		TreeMap<Character, Integer> expected=new TreeMap<Character, Integer>(){{
			put('d',1);
			put('e',1);
			put('h',1);
			put('l',3);
			put('l',3);
			put('o',2);
			put('r',1);
			put('w',1);
		}};
		assertEquals(expected, StringAssignment.findCharFrequency(s));
	}
	
	@Test
	void testAnagram() {
		String s1="binary";
		String s2="brainy";
		assertEquals(true, StringAssignment.anagramCheck(s1, s2));
	}
	
	
	@Test
	void testVowelAndConsonants() {
		TreeMap<String, Integer> expected=new TreeMap<String, Integer>(){{
			put("vowel",3);
			put("consonant",7);
			}};
		TreeMap<String, Integer> actual=new TreeMap<String, Integer>();
	assertEquals(expected, StringAssignment.findVowelAndConsonant(s, actual));
	}
	
	

}
