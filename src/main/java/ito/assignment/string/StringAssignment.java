package ito.assignment.string;

import java.util.Arrays;
import java.util.TreeMap;

import org.springframework.stereotype.Component;

@Component
public class StringAssignment {

	//Java Program to join two strings.
	public static String  joinString(String s1, String s2) {
		System.out.println(s1.concat(s2));
		return s1.concat(s2);

	}

	//Java Program to count the total number of characters in a string
	public static  int findTotalChar(String string) {
		char[] c=string.toCharArray();
		System.out.println(c.length);
		return c.length;

	}

	//Java Program to replace the spaces of a string with a specific character
	public static String replaceSpace(String string) {
		String s=string.replaceAll("\s+", "*");
		System.out.println(s);
		return s;
	}

	//Java Program to determine whether a given string is palindrome
	public static  boolean checkPalindrome(String string) {
		String reverse="";
		for(int i=string.length()-1;i>=0;i--) {
			reverse+=string.charAt(i);
		}
		if(string.equals(reverse)) {
			System.out.println("String is Palindrome");
			return true;
		}else {
			System.out.println("String is not Palindrome");
			return false;
		}

	}

	//Java Program to find the frequency of characters
	public static TreeMap<Character,Integer> findCharFrequency(String string){
		TreeMap<Character,Integer> map=new TreeMap<Character,Integer>();
		char[] c=string.toCharArray();

		for(char ch:c) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		return map;
	}
	
	//Java Program to determine whether two strings are the anagram
	public static boolean anagramCheck(String s1,String s2) {
		int count=0;
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		if(s1.length()!=s2.length()) {
			System.out.println("not an anagram");
			return false;
		}
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0;i<ch1.length;i++) {
			
			if(ch1[i]!=ch2[i]) {
				System.out.println("not an anagram");
				count++;
			}
			
		}
		if(count==0) {
			System.out.println("anagram");
			return true;
		}else {
			System.out.println("not an anagram");
			return false;
			
		}
	}

	//Java Program to remove all the white spaces from a string
	public static  String removeSpace(String string) {
		String s=string.replaceAll("\s*", "");
		System.out.println(s);
		return s;
	}

	//Java Program to find Reverse of the string(not using build in method)
	public static String reverseString(String string) {
		String reverse="";
		for(int i=string.length()-1;i>=0;i--) {
			reverse=reverse+string.charAt(i);
		}
		System.out.println(reverse);
		return reverse;

	}

	//Java Program to swap two string variables without using third or temp variable.
	public static void swapString(String s1,String s2 ) {
		System.out.println("before swap: a = " +  s1 + " and b = "+s2); 
		s1 = s1 + s2; 
		s2 = s1.substring(0,s1.length()-s2.length()); 
		s1 = s1.substring(s2.length()); 
		System.out.println("after swap: a = " +   s1 + " and b = " + s2); 

	}
	
	//Java program to find the duplicate words in a string
	public static void duplicateWords(String string) {
		int count;  
        string = string.toLowerCase();  
        String words[] = string.split(" ");  
          
        System.out.println("Duplicate words are:");   
        for(int i = 0; i < words.length; i++) {  
            count = 1;  
            for(int j = i+1; j < words.length; j++) {  
                if(words[i].equals(words[j])) {  
                    count++;  
                    words[j] = "0";  
                }  
            }  
              
            if(count > 1 && words[i] != "0")  
                System.out.println(words[i]);  
        }  
	}

	//Java Program to count the total number of vowels and consonants in a string
	public static TreeMap<String,Integer> findVowelAndConsonant(String string,TreeMap<String,Integer> treemap){
		int vowel=0;
		int consonant=0;	
		char[] ch=string.toCharArray();
		for(char c:ch) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowel++;
			}else {
				consonant++;
			}
		}
		treemap.put("vowel", vowel);
		treemap.put("consonant", consonant);
		System.out.println(treemap);
		return treemap;
	}
	
	//to replace lower-case characters with upper-case and vice-versa
	public static StringBuffer toOppositeCase(String string) {
		StringBuffer sb=new StringBuffer(string);
		
		for (int i = 0; i < sb.length(); i++) {
            Character c = sb.charAt(i);
            if (Character.isLowerCase(c))
            	sb.replace(i, i + 1,
                            Character.toUpperCase(c) + "");
            else
            	sb.replace(i, i + 1,
                            Character.toLowerCase(c) + "");
        }
		System.out.println(sb);
		return sb;
    }
	
	//Java Program to find the number of the words in the given text file
	public static int findTotalWords(String string) {
		 if (string == null || string.isEmpty()) {
		      return 0;
		    }

		    String[] words = string.split("\\s+");
		    System.out.println("total words in string are:");
		    return words.length;
	}




}



