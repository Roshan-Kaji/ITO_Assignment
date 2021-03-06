package ito.assignment.data_type_conversion;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataTypeAssignmentTest {

	@Test
	void testStringToInt() {
		int expected=34;
		assertEquals(expected, DataTypeAssignment.stringToInt("34"));
	}

	@Test
	void testIntToString() {
		String expected="56";
		assertEquals(expected, DataTypeAssignment.intToString(56));
	}

	@Test
	void testStringToLong() {
		Long expected=1237689890l;
		assertEquals(expected, DataTypeAssignment.stringToLong("1237689890"));
	}

	@Test
	void testLongToString() {
		String expected="1237689890";
		assertEquals(expected, DataTypeAssignment.longToString(1237689890l));
	}

	@Test
	void testStringToFloat() {
		Float expected=33.44f;
		assertEquals(expected, DataTypeAssignment.stringToFloat("33.44"));
	}

	@Test
	void testFloatToString() {
		String expected="33.44";
		assertEquals(expected, DataTypeAssignment.floatToString(33.44f));
	}

	@Test
	void testStringToDouble() {
		Double expected=3456.5678d;
		assertEquals(expected, DataTypeAssignment.stringToDouble("3456.5678"));
	}

	@Test
	void testDoubleToString() {
		String expected="3456.5678";
		assertEquals(expected, DataTypeAssignment.doubleToString(3456.5678d));
	}

	@Test
	void testStringToChar() {
		char[] expected= {'a'};
		assertThat(expected).isEqualTo(DataTypeAssignment.stringToChar("a"));
	}

	@Test
	void testCharToString() {
		String expected="a";
		assertEquals(expected, DataTypeAssignment.charToString('a'));
	}

	@Test
	void testIntTolong() {
		long expected=5678;
		assertEquals(expected, DataTypeAssignment.intTolong(5678));
	}

	@Test
	void testLongToint() {
		int expected=34;
		assertEquals(expected, DataTypeAssignment.longToint(34l));
	}

	@Test
	void testIntTodouble() {
		double expected=3456d;
		assertEquals(expected, DataTypeAssignment.intTodouble(3456));
	}

	@Test
	void testDoubleToint() {
		int expected=3456;
		assertEquals(expected, DataTypeAssignment.doubleToint(3456.5678d));
	}

	@Test
	void testCharToint() {
		int expected=97;
		assertEquals(expected, DataTypeAssignment.charToint('a'));
	}

	@Test
	void testIntTochar() {
	char expected='a';
	assertEquals(expected, DataTypeAssignment.intTochar(97));
	}

	@Test
	void testStringToBoolean() {
		Boolean expected=true;
		assertEquals(expected, DataTypeAssignment.stringToBoolean("true"));
	}

	@Test
	void testBooleanToString() {
		String expected="false";
		assertEquals(expected, DataTypeAssignment.booleanToString(false));
	}

}
