package test.math;

import static org.junit.Assert.*;
import org.junit.Test;

import math.Vektor2D;
import math.Vektor3D;
import math.LineareAlgebra;

public class LineareAlgebraTest {
	//-----------------ADD Test Start-----------------
	@Test
	public void testAdd2D() throws Exception
	{
		Vektor2D a = new Vektor2D(1.0,3.5);
		Vektor2D b = new Vektor2D(1.0,3.5);
		Vektor2D c = new Vektor2D(0.0,0.0);
		Vektor2D d = new Vektor2D(2.0,7.0);
		
		c=LineareAlgebra.add(a,b);
		assertEquals(c.x, d.x,0);
		assertEquals(c.y, d.y,0);
		
		c=LineareAlgebra.add(b,a);
		assertEquals(c.x, d.x,0);
		assertEquals(c.y, d.y,0);
	}
	
	@Test(expected=Exception.class)
	public void testAdd2DMit‹berlauf() throws Exception
	{
		Vektor2D b = new Vektor2D(Double.MAX_VALUE,Double.MAX_VALUE);
		Vektor2D a = new Vektor2D(-1.0,1.0);
		Vektor2D c = new Vektor2D(0.0,0.0);
		
		c=LineareAlgebra.add(a,b);
	}
	
	@Test
	public void testAdd3D() throws Exception
	{
		Vektor3D a = new Vektor3D(1.0,3.5,5.0);
		Vektor3D b = new Vektor3D(1.0,3.5,5.0);
		Vektor3D c = new Vektor3D(0.0,0.0,0.0);
		Vektor3D d = new Vektor3D(2.0,7.0,10.0);
		
		c=LineareAlgebra.add(a,b);
		assertEquals(c.x, d.x,0);
		assertEquals(c.y, d.y,0);
		assertEquals(c.z, d.z,0);

		c=LineareAlgebra.add(b,a);
		assertEquals(c.x, d.x,0);
		assertEquals(c.y, d.y,0);
		assertEquals(c.z, d.z,0);
	}
	
	@Test(expected=Exception.class)
	public void testAdd3DMit‹berlauf() throws Exception
	{
		Vektor3D b = new Vektor3D(Double.MAX_VALUE,Double.MAX_VALUE, Double.MAX_VALUE);
		Vektor3D a = new Vektor3D(-1.0,1.0, 1.0);
		Vektor3D c = new Vektor3D(0.0,0.0, 1.0);
		
		c=LineareAlgebra.add(a,b);
	}
	
	//-----------------ADD Test End-----------------
	
	
	//-----------------SUB Test Start-----------------
		@Test
		public void testSub2D() throws Exception
		{
			Vektor2D a = new Vektor2D(1.0,3.5);
			Vektor2D b = new Vektor2D(1.0,3.5);
			Vektor2D c = new Vektor2D(1.0,1.0);
			Vektor2D d = new Vektor2D(0.0,0.0);
			
			c=LineareAlgebra.sub(a,b);
			assertEquals(c.x, d.x,0);
			assertEquals(c.y, d.y,0);
			
			c=LineareAlgebra.sub(b,a);
			assertEquals(c.x, d.x,0);
			assertEquals(c.y, d.y,0);
		}
		
		@Test(expected=Exception.class)
		public void testSub2DMit‹berlauf() throws Exception
		{
			Vektor2D b = new Vektor2D(-Double.MAX_VALUE,-Double.MAX_VALUE);
			Vektor2D a = new Vektor2D(-1.0,1.0);
			Vektor2D c = new Vektor2D(0.0,0.0);
			
			c=LineareAlgebra.sub(a,b);
		}
		
		@Test
		public void testSub3D() throws Exception
		{
			Vektor3D a = new Vektor3D(1.0,3.5,5.0);
			Vektor3D b = new Vektor3D(1.0,3.5,5.0);
			Vektor3D c = new Vektor3D(1.0,1.0,1.0);
			Vektor3D d = new Vektor3D(0.0,0.0,0.0);
			
			c=LineareAlgebra.sub(a,b);
			assertEquals(c.x, d.x,0);
			assertEquals(c.y, d.y,0);
			assertEquals(c.z, d.z,0);

			c=LineareAlgebra.sub(b,a);
			assertEquals(c.x, d.x,0);
			assertEquals(c.y, d.y,0);
			assertEquals(c.z, d.z,0);
		}
		
		@Test(expected=Exception.class)
		public void testSub3DMit‹berlauf() throws Exception
		{
			Vektor3D b = new Vektor3D(-Double.MAX_VALUE,-Double.MAX_VALUE, -Double.MAX_VALUE);
			Vektor3D a = new Vektor3D(-1.0,1.0, 1.0);
			Vektor3D c = new Vektor3D(0.0,0.0,0.0);
			
			c=LineareAlgebra.add(a,b);
		}
		//-----------------ADD Test End-----------------
		
		
		//-----------------MULT Test Start-----------------
		@Test
		public void testMult2D() throws Exception
		{
			Vektor2D a = new Vektor2D(5.0, 7.0);
			Vektor2D b = new Vektor2D(50.0, 70.0);
			Vektor2D c = new Vektor2D(0.0, 0.0);
			
			c=LineareAlgebra.mult(a, 10);
			assertEquals(c.x, b.x,0);
			assertEquals(c.y, b.y,0);
		}
		
		@Test(expected=Exception.class)
		public void testMult2DMit‹berlauf() throws Exception
		{
			Vektor2D a = new Vektor2D(-Double.MAX_VALUE, -Double.MAX_VALUE);
			Vektor2D b = new Vektor2D(0.0,0.0);
			b=LineareAlgebra.mult(a, 5);
		}
		
		@Test
		public void testMult3D() throws Exception
		{
			Vektor3D a = new Vektor3D(5.0, 7.0, 12.0);
			Vektor3D b = new Vektor3D(50.0, 70.0, 120.0);
			Vektor3D c = new Vektor3D(0.0, 0.0, 0.0);
			
			c=LineareAlgebra.mult(a, 10);
			assertEquals(c.x, b.x,0);
			assertEquals(c.y, b.y,0);
			assertEquals(c.z, b.z,0);
		}
		
		@Test(expected=Exception.class)
		public void testMult3DMit‹berlauf() throws Exception
		{
			Vektor3D a = new Vektor3D(-Double.MAX_VALUE, -Double.MAX_VALUE, Double.MAX_VALUE);
			Vektor3D b = new Vektor3D(0.0,0.0, 0.0);
			b=LineareAlgebra.mult(a, 5);
		}
		//-----------------MULT Test End-----------------
		
		
		//-----------------DIV Test Start-----------------
		@Test
		public void testDiv2D() throws Exception
		{
			Vektor2D a = new Vektor2D(55.0, 9.0);
			Vektor2D b = new Vektor2D(110.0, 18.0);
			Vektor2D c = new Vektor2D(0.0, 0.0);
			
			c=LineareAlgebra.div(a,0.5);
			assertEquals(c.x, b.x,0);
			assertEquals(c.y, b.y,0);
		}
		
		@Test(expected=Exception.class)
		public void testDiv2DMit‹berlauf() throws Exception
		{
			Vektor2D a = new Vektor2D(Double.MAX_VALUE, Double.MAX_VALUE);
			Vektor2D b = new Vektor2D(0.0,0.0);
			
			b=LineareAlgebra.div(a, 0.5);
		}
		
		@Test(expected=Exception.class)
		public void testDiv2DDurchNull() throws Exception
		{
			Vektor2D a = new Vektor2D(20.2, 5.3);
			Vektor2D b = new Vektor2D(0.0,0.0);
			
			b=LineareAlgebra.div(a, 0.0);
		}
		
		@Test
		public void testDiv3D() throws Exception
		{
			Vektor3D a = new Vektor3D(55.0, 9.0, 12.0);
			Vektor3D b = new Vektor3D(110.0, 18.0, 24.0);
			Vektor3D c = new Vektor3D(0.0, 0.0, 0.0);
			
			c=LineareAlgebra.div(a,0.5);
			assertEquals(c.x, b.x,0);
			assertEquals(c.y, b.y,0);
			assertEquals(c.z, b.z,0);
		}
		
		@Test(expected=Exception.class)
		public void testDiv3DMit‹berlauf() throws Exception
		{
			Vektor3D a = new Vektor3D(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
			Vektor3D b = new Vektor3D(0.0,0.0,0.0);
			
			b=LineareAlgebra.div(a, 0.5);
		}
		
		@Test(expected=Exception.class)
		public void testDiv3DDurchNull() throws Exception
		{
			Vektor3D a = new Vektor3D(20.2, 5.3, 23.7);
			Vektor3D b = new Vektor3D(0.0,0.0,0.0);
			
			b=LineareAlgebra.div(a, 0.0);
		}
		//-----------------DIV Test End-----------------
		
		
		//-----------------IS(not)EQUAL Test Start-----------------
		@Test
		public void test2DIsEqual()
		{
			Vektor2D a = new Vektor2D(5.0, 5.0);
			Vektor2D b = new Vektor2D(5.0, 1.0);
			Vektor2D c = new Vektor2D(5.0, 5.0);
			
			assertFalse(a.isEqual(b));
			assertTrue(a.isEqual(c));
		}
		
		@Test
		public void test2DIsNotEqual()
		{
			Vektor2D a = new Vektor2D(5.0, 5.0);
			Vektor2D b = new Vektor2D(5.0, 1.0);
			Vektor2D c = new Vektor2D(5.0, 5.0);
			
			assertFalse(a.isNotEqual(c));
			assertTrue(a.isNotEqual(b));
		}
		
		@Test
		public void test3DIsEqual()
		{
			Vektor3D a = new Vektor3D(5.0, 5.0, 5.0);
			Vektor3D b = new Vektor3D(5.0, 1.0, 5.0);
			Vektor3D c = new Vektor3D(5.0, 5.0, 5.0);
			
			assertFalse(a.isEqual(b));
			assertTrue(a.isEqual(c));
		}
		
		@Test
		public void test3DIsNotEqual()
		{
			Vektor3D a = new Vektor3D(5.0, 5.0, 5.0);
			Vektor3D b = new Vektor3D(5.0, 1.0, 5.0);
			Vektor3D c = new Vektor3D(5.0, 5.0, 5.0);
			
			assertFalse(a.isNotEqual(c));
			assertTrue(a.isNotEqual(b));
		}
		//-----------------IS(not)EQUAL Test End-----------------
		
		
		//-----------------LENGTH Test Start-----------------
		@Test
		public void test2DLength() throws Exception
		{
			Vektor2D a = new Vektor2D(5.0, 5.0);
			double laenge = Math.sqrt((5.0*5.0)+(5.0*5.0));
			
			assertEquals(a.length(), laenge, 0);
		}
		
		@Test(expected=Exception.class)
		public void test2DLengthMit‹berlauf() throws Exception
		{
			Vektor2D a = new Vektor2D(Double.MAX_VALUE-20000, 5);
			
			a.length();
		}
		
		@Test
		public void test3DLength() throws Exception
		{
			Vektor3D a = new Vektor3D(5.0, 5.0, 5.0);
			double laenge = Math.sqrt((5.0*5.0)+(5.0*5.0)+(5.0*5.0));
			
			assertEquals(a.length(), laenge, 0);
		}
		
		@Test(expected=Exception.class)
		public void test3DLengthMit‹berlauf() throws Exception
		{
			Vektor3D a = new Vektor3D(Double.MAX_VALUE-20000, 5, -Double.MAX_VALUE);
			
			a.length();
		}
		//-----------------LENGTH Test End-----------------
		
		
		//-----------------EUKLDISTANCE Test Start-----------------
		@Test
		public void testeukldistance2D() throws Exception
		{
			Vektor2D a = new Vektor2D(5.0, 5.0);
			Vektor2D b = new Vektor2D(10.0, 10.0);
			
			double laenge = Math.sqrt(Math.pow(b.x-a.x,2)+Math.pow(b.y-a.y,2));
			
			assertEquals(LineareAlgebra.euklDistance(a, b), laenge, 0);
		}
		
		@Test(expected=Exception.class)
		public void testeukldistance2DMit‹berlauf() throws Exception
		{
			Vektor2D a = new Vektor2D(Double.MAX_VALUE, Double.MAX_VALUE);
			Vektor2D b = new Vektor2D(10.0, 10.0);
			
			double laenge=LineareAlgebra.euklDistance(a, b);
		}
		
		@Test
		public void testeukldistance3D() throws Exception
		{
			Vektor3D a = new Vektor3D(5.0, 5.0, 5.0);
			Vektor3D b = new Vektor3D(10.0, 10.0, 5.0);
			
			double laenge = Math.sqrt(Math.pow(b.x-a.x,2)+Math.pow(b.y-a.y,2)+Math.pow(b.z-a.z,2));
			
			assertEquals(LineareAlgebra.euklDistance(a, b), laenge, 0);
		}
		
		@Test(expected=Exception.class)
		public void testeukldistance3DMit‹berlauf() throws Exception
		{
			Vektor3D a = new Vektor3D(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
			Vektor3D b = new Vektor3D(10.0, 10.0, 10.0);
			
			double laenge=LineareAlgebra.euklDistance(a, b);
		}
		//-----------------EUKLDISTANCE Test End-----------------
}
