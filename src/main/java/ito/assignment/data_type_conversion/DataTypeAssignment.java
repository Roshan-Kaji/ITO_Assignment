package ito.assignment.data_type_conversion;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class DataTypeAssignment {

	//convert String to int 
	public static int stringToInt(String string) {
		Integer int1=Integer.parseInt(string);
		return int1;
	}
	
	//convert int to String 
	public static String intToString(Integer i) {
		String s1=i.toString();
		return s1;
	}
	
	//convert String to long 
	public static Long stringToLong(String string) {
		Long l1=Long.parseLong(string);
		return l1;
	}
	
	//convert long to String
	public static String longToString(Long l) {
		String string=l.toString();
		return string;
	}
	
	//convert String to float 
	public static Float stringToFloat(String string) {
		Float f1=Float.parseFloat(string);
		return f1;
	}
	
	//convert float to String 
	public static String floatToString(Float f1) {
		String string=f1.toString();
		return string;
	}
	
	
	//convert String to double 
	public static Double stringToDouble(String string) {
		Double d1=Double.parseDouble(string);
		return d1;
		}
	
	//convert double to String 
	public static String doubleToString(Double d1) {
		String string=d1.toString();
		return string;
	}
	
	//convert String to Date 
	public static Date stringToDate(String string) {
		Date date=new Date(string);
		return date;
	}
	
	//convert Date to String 
	public static String dateToString() {
		DateFormat date1=new SimpleDateFormat("dd/MM/YY");
		Date date2=Calendar.getInstance().getTime();
		String dateAsString=date1.format(date2);
		return dateAsString;
	}
	
	//convert String to char 
	public static char[] stringToChar(String string) {
		char[] ch=string.toCharArray();
		for(char c:ch) {
			System.out.println(c);
		}
		return ch;
	}
	
	//convert char to String
	public static String charToString(char c) {
		String string =Character.toString(c);
		return string;
	}
	
	//convert int to long in Java
	public static long intTolong(int i) {
		long l1=i;
		return l1;
	}
	
	//convert long to int in Java
	public static int longToint(long l1) {
		int i=(int)l1;
		return i;
	}
	
	//convert int to double in Java
	public static double intTodouble(int i) {
		double d1=i;
		return d1;
	}
	
	//convert double to int in Java
	public static int doubleToint(double d1) {
		int i=(int)d1;
		return i;
	}
	
	//convert char to int in Java
	public static int charToint(char ch) {
		int i=ch;
		return i;
	}
	
	//convert int to char in Java
	public static char intTochar(int i) {
		char ch=(char)i;
		return ch;
	}
	//How to convert Date to Timestamp in Java
	public static Timestamp dateToTimestamp() { 
        Timestamp ts=new Timestamp(new Date().getTime());  
        System.out.println(ts);  
        return ts;
	}
	
	//How to convertTimestamp to Date in Java
	public static Date timeStampToDate() {
		Timestamp stamp = new Timestamp(System.currentTimeMillis());
		Date date = new Date(stamp.getTime());
		System.out.println(date);
		return date;
	}
	
	//How to convert String to boolean in Java
	public static boolean stringToBoolean(String string) {
		boolean bool=Boolean.parseBoolean(string);
		return bool;
	}
	
	//How to convert boolean to String in Java
	public static String booleanToString(Boolean bool) {
		String string=bool.toString();
		return string;
	}
	

}
