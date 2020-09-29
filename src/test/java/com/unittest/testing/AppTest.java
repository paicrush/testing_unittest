package com.unittest.testing;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
public class AppTest 
{
	Fahrenheit object;
	@Before

	
	public void newClassFahrenheit() {
		object = new Fahrenheit();
	}
	@Test
	public void testResult0Input0() {
		double input = 0 ;
		double expected = 0;
		object.input(input);
		double actual = object.getCelsius();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResult1000Input1000() {
		double input = 1000 ;
		double expected = 1000;
		object.input(input);
		double actual = object.getCelsius();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResultmin1000Input1000() {
		double input = -1000 ;
		double expected = -1000;
		object.input(input);
		double actual = object.getCelsius();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResulTrueInput0() {
		double input = 0 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResulTrueInput1000() {
		double input = 1000 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResulTrueInputmin1000() {
		double input = -1000 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResulTrueInput2000() {
		double input = 2000 ;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResulTrueInputmin2000() {
		double input = -2000 ;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResulTrueInputmin1010() {
		double input = -1010 ;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResulTrueInputmin999() {
		double input = -999 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResulTrueInputmin501() {
		double input = -501 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResulTrueInputmin500() {
		double input = -500 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResulTrueInputmin499() {
		double input = -499 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResulTrueInputmin1() {
		double input = -1 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResulTrueInput1010() {
		double input = 1010 ;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResulTrueInput999() {
		double input = 999 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResulTrueInput501() {
		double input = 501 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResulTrueInput500() {
		double input = 500 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResulTrueInput499() {
		double input = 499 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	@Test
	public void testResulTrueInput1() {
		double input = 1 ;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResul32Input0() {
		double input = 0;
		double expected = 32;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResul32Input1() {
		double input = 1;
		double expected = 33.8;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResul32Input499() {
		double input = 499;
		double expected = 930.2;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResul32Input500() {
		double input = 500;
		double expected = 932;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResul32Input501() {
		double input = 501;
		double expected = 933.8;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResul32Input999() {
		double input = 999;
		double expected = 1830.2;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResul1832Input1000() {
		double input = 1000 ;
		double expected = 1832;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResul32Inputmines1() {
		double input = -1;
		double expected = 30.2;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResul32Inputmines499() {
		double input = -499;
		double expected = -866.2;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResul32Inputmines500() {
		double input = -500;
		double expected = -868;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResul32Inputmines501() {
		double input = -501;
		double expected = -869.8;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResul32Inputminess999() {
		double input = -999;
		double expected = -1766.2;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResul1832InputMin1000() {
		double input = -1000 ;
		double expected = -1768;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected, actual,2);
	}
	@Test
	public void testResulMessageOutputInput0() {
		double input = 0 ;
		String expected = "0 celcius = 32.00 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResulMessageOutputInput1() {
		double input = 1 ;
		String expected = "1 celcius = 33.80 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResulMessageOutputInput499() {
		double input = 499 ;
		String expected = "499 celcius = 930.20 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResulMessageOutputInput500() {
		double input = 500 ;
		String expected = "500 celcius = 932.00 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResulMessageOutputInput501() {
		double input = 501 ;
		String expected = "501 celcius = 933.80 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResulMessageOutputInput999() {
		double input = 999 ;
		String expected = "999 celcius = 1830.20 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResulMessageOutputInput1000() {
		double input = 1000 ;
		String expected = "1000 celcius = 1832.00 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResulMessageOutputInputmines1() {
		double input = -1 ;
		String expected = "-1 celcius = 30.20 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResulMessageOutputInputmines499() {
		double input = -499 ;
		String expected = "-499 celcius = -866.20 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResulMessageOutputInputmines500() {
		double input = -500 ;
		String expected = "-500 celcius = -868.00 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResulMessageOutputInputmines501() {
		double input = -501 ;
		String expected = "-501 celcius = -869.80 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResulMessageOutputInputmines999() {
		double input = -999 ;
		String expected = "-999 celcius = -1766.20 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
	@Test
	public void testResulMessageOutputInputmines1000() {
		double input = -1000 ;
		String expected = "-1000 celcius = -1768.00 fahrenheit";
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected, actual);
	}
}