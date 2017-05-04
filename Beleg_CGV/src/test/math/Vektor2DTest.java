package test.math;
import static org.junit.Assert.*;

import org.junit.Test;

import math.Vektor2D;

public class Vektor2DTest {

	public double x, y;

	//-----------------ADD Test Start-----------------
	@Test
	public void testAdd() throws Exception
	{
		Vektor2D a = new Vektor2D(1.0,3.5);
		Vektor2D b = new Vektor2D(1.0,3.5);
		Vektor2D c = new Vektor2D(0,0);
		c.x=a.x+b.x;
		c.y=a.y+b.y;
		a.add(b);
		assertEquals(a.x,c.x,0);
		assertEquals(a.y,c.y,0);
		
		a.x=1.0;    a.y=3.5; //Zur¸cksetzten von a auf Ausgangswerte

        b.add(a);
        assertEquals(b.x,c.x,0);
        assertEquals(b.y,c.y,0);
	}
	
	@Test(expected=Exception.class)
	public void testAddMit‹berlauf() throws Exception
	{
		Vektor2D b = new Vektor2D(Double.MAX_VALUE,Double.MAX_VALUE);
		Vektor2D a = new Vektor2D(-1.0,1.0);
		
		a.add(b);
	}
	//-----------------ADD Test End-----------------
	
	//-----------------SUB Test Start-----------------
	@Test
	public void testSub() throws Exception
	{
		Vektor2D a = new Vektor2D(10.5,12.5);
		Vektor2D b = new Vektor2D(5.5,2.5);

		Vektor2D c = new Vektor2D(0,0);
		Vektor2D d = new Vektor2D(-5, -10);
		c.x=a.x-b.x;
		c.y=a.y-b.y;
		a.sub(b);
		assertEquals(a.x,c.x,0);
		assertEquals(a.y,c.y,0);
		
		a.x=10.5;    a.y=12.5; //Zur¸cksetzten von a auf Ausgangswerte

        b.sub(a);
        assertEquals(b.x,d.x,0);
        assertEquals(b.y,d.y,0);
	}
	
	@Test(expected=Exception.class)
	public void testSubMit‹berlauf() throws Exception
	{
		Vektor2D b = new Vektor2D(-Double.MAX_VALUE,-Double.MAX_VALUE);
		Vektor2D a = new Vektor2D(1.0,1.0);
		
		a.sub(b);
	}
	//-----------------SUB Test End-----------------
	
	//-----------------SETPOSITION Test Start-----------------
	@Test
	public void testsetposition() throws Exception
	{
		Vektor2D a = new Vektor2D(0,0);
		Vektor2D b = new Vektor2D(100.2, 97.2);
		
		a.setPosition(100.2, 97.2);
		assertEquals(a.x, b.x,0);
		assertEquals(a.y, b.y,0);
	}
	
	@Test(expected=Exception.class)
	public void testSetPositionMit‹berlauf() throws Exception
	{
		Vektor2D a = new Vektor2D(0,0);
		
		a.setPosition(-Double.MAX_VALUE, -Double.MAX_VALUE);
	}
	//-----------------SETPOSITION Test End-----------------
	
	//-----------------MULT Test Start-----------------
	@Test
	public void testMult() throws Exception
	{
		Vektor2D a = new Vektor2D(5.0, 7.0);
		Vektor2D b = new Vektor2D(50.0, 70.0);
		
		a.mult(10);
		assertEquals(a.x, b.x,0);
		assertEquals(a.y, b.y,0);
	}
	
	@Test(expected=Exception.class)
	public void testMultMit‹berlauf() throws Exception
	{
		Vektor2D a = new Vektor2D(-Double.MAX_VALUE, -Double.MAX_VALUE);
		
		a.mult(5);
	}
	//-----------------MULT Test End-----------------
	
	
	//-----------------DIV Test Start-----------------
	@Test
	public void testDiv() throws Exception
	{
		Vektor2D a = new Vektor2D(55.0, 9.0);
		Vektor2D b = new Vektor2D(110, 18);
		
		a.div(0.5);
		assertEquals(a.x, b.x,0);
		assertEquals(a.x, b.x,0);
	}
	
	@Test(expected=Exception.class)
	public void testDivMit‹berlauf() throws Exception
	{
		Vektor2D a = new Vektor2D(Double.MAX_VALUE, Double.MAX_VALUE);
		a.div(0.5);
	}
	
	@Test(expected=Exception.class)
	public void testDivDurchNull() throws Exception
	{
		Vektor2D a = new Vektor2D(20.2, 5.3);
		
		a.div(0);
	}
	//-----------------DIV Test End-----------------
	
	
	//-----------------ISNULLVEKTOR Test Start-----------------
	@Test
	public void testIsNullVektor()
	{
		Vektor2D a = new Vektor2D(0.0, 0.0);
		Vektor2D b = new Vektor2D(2.0, 2.0);
		
		assertTrue(a.isNullVector());
		assertFalse(b.isNullVector());
	}
	//-----------------ISNULLVEKTOR Test End-----------------
	
	
	//-----------------IS(not)EQUAL Test Start-----------------
	@Test
	public void testIsEqual()
	{
		Vektor2D a = new Vektor2D(5.0, 5.0);
		Vektor2D b = new Vektor2D(5.0, 1.0);
		Vektor2D c = new Vektor2D(5.0, 5.0);
		
		assertFalse(a.isEqual(b));
		assertTrue(a.isEqual(c));
	}
	
	@Test
	public void testIsNotEqual()
	{
		Vektor2D a = new Vektor2D(5.0, 5.0);
		Vektor2D b = new Vektor2D(5.0, 1.0);
		Vektor2D c = new Vektor2D(5.0, 5.0);
		
		assertFalse(a.isNotEqual(c));
		assertTrue(a.isNotEqual(b));
	}
	//-----------------IS(not)EQUAL Test End-----------------
	
	
	//-----------------LENGTH Test Start-----------------
	@Test
	public void testLength() throws Exception
	{
		Vektor2D a = new Vektor2D(5.0, 5.0);
		double laenge = Math.sqrt((5.0*5.0)+(5.0*5.0));
		
		assertEquals(a.length(), laenge, 0);
	}
	
	@Test(expected=Exception.class)
	public void testLengthMit‹berlauf() throws Exception
	{
		Vektor2D a = new Vektor2D(Double.MAX_VALUE-20000, 5);
		
		a.length();
	}
	//-----------------LENGTH Test End-----------------
	
	
	//-----------------NORMALIZE Test Start-----------------
	@Test
	public void testNormalize() throws Exception
	{
		Vektor2D a = new Vektor2D(55, 5);
		a.normalize();
		
		assertEquals(a.length(),1,0); //die L‰nge eines Normalisierten Vektors sollte immer 1 ergeben
		//Achtung Messungenauigkeit durch Wurzel aus zwei (usw)!! 0.999(...) anstatt 1!
	}
	
	@Test(expected=Exception.class)
	public void testNormalizeMit‹berlauf() throws Exception
	{
		Vektor2D a = new Vektor2D(Double.MAX_VALUE-2000, 5);
		a.normalize();
	}
	//-----------------NORMALIZE Test End-----------------
}
