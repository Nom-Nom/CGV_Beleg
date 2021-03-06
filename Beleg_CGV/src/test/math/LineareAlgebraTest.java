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
	public void testAdd2DMitÜberlauf() throws Exception
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
	public void testAdd3DMitÜberlauf() throws Exception
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
		public void testSub2DMitÜberlauf() throws Exception
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
		public void testSub3DMitÜberlauf() throws Exception
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
		public void testMult2DMitÜberlauf() throws Exception
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
		public void testMult3DMitÜberlauf() throws Exception
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
		public void testDiv2DMitÜberlauf() throws Exception
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
		public void testDiv3DMitÜberlauf() throws Exception
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
		public void test2DLengthMitÜberlauf() throws Exception
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
		public void test3DLengthMitÜberlauf() throws Exception
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
		public void testeukldistance2DMitÜberlauf() throws Exception
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
		public void testeukldistance3DMitÜberlauf() throws Exception
		{
			Vektor3D a = new Vektor3D(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
			Vektor3D b = new Vektor3D(10.0, 10.0, 10.0);
			
			double laenge=LineareAlgebra.euklDistance(a, b);
		}
		//-----------------EUKLDISTANCE Test End-----------------
		
		
		//-----------------MANHATTANDISTANCE Test Start-----------------
		@Test
		public void testmanhattandistance2D() throws Exception
		{
			Vektor2D a = new Vektor2D(5.0, 5.0);
			Vektor2D b = new Vektor2D(10.0, 10.0);
			double laenge = Math.abs(10-5)+ Math.abs(10-5);
			
			assertEquals(LineareAlgebra.manhattanDistance(a, b), laenge,0);
		}
		
		@Test(expected=Exception.class)
		public void testmanhattandistance2DMitÜberlauf() throws Exception
		{
			Vektor2D a = new Vektor2D(Double.MAX_VALUE, 5.0);
			Vektor2D b = new Vektor2D(10.0, 10.0);
			double laenge = LineareAlgebra.manhattanDistance(a, b);
		}
		
		@Test
		public void testmanhattandistance3D() throws Exception
		{
			Vektor3D a = new Vektor3D(5.0, 5.0, 5.0);
			Vektor3D b = new Vektor3D(10.0, 10.0, 10.0);
			double laenge = Math.abs(10-5) + Math.abs(10-5) + Math.abs(10-5);
			
			assertEquals(LineareAlgebra.manhattanDistance(a, b), laenge,0);
		}
		
		@Test(expected=Exception.class)
		public void testmanhattandistance3DMitÜberlauf() throws Exception
		{
			Vektor3D a = new Vektor3D(Double.MAX_VALUE, 5.0, 5.0);
			Vektor3D b = new Vektor3D(10.0, 10.0, 5.0);
			double laenge = LineareAlgebra.manhattanDistance(a, b);
		}
		//-----------------MANHATTANDISTANCE Test End-----------------
		
		
		//-----------------CROSSPRODUCT Test Start-----------------
		@Test
		public void testCrossProduct2D() throws Exception
		{
			Vektor2D a = new Vektor2D(5.0, 5.0);
			Vektor2D b = new Vektor2D(10.0, 10.0);
			
			double cross=(5*10)-(10*5);
			assertEquals(LineareAlgebra.crossProduct(a, b), cross,0);
		}
		
		@Test(expected=Exception.class)
		public void testCrossProduct2DMitÜberlauf() throws Exception
		{
			Vektor2D a = new Vektor2D(Double.MAX_VALUE, 5.0);
			Vektor2D b = new Vektor2D(10.0, 10.0);
			double cross = LineareAlgebra.crossProduct(a, b);
		}
		
		@Test
		public void testCrossProduct3D() throws Exception
		{
			Vektor3D a = new Vektor3D(5.0, 5.0, 5.0);
			Vektor3D b = new Vektor3D(10.0, 10.0, 10.0);
			Vektor3D c = new Vektor3D(0.0,0.0,0.0);
			Vektor3D d = new Vektor3D(0.0,0.0,0.0);
			
			c.x=((a.y*b.z)-(a.z*b.y));
			c.y=((a.z*b.x)-(a.x*b.z));
			c.z=((a.x*b.y)-(a.y*b.x));
			
			d=LineareAlgebra.crossProduct(a, b);
			assertEquals(d.x, c.x, 0);
			assertEquals(d.y, c.y, 0);
			assertEquals(d.z, c.z, 0);
		}
		
		@Test(expected=Exception.class)
		public void testCrossProduct3DMitÜberlauf() throws Exception
		{
			Vektor3D a = new Vektor3D(Double.MAX_VALUE, 5.0, 1.0);
			Vektor3D b = new Vektor3D(10.0, 10.0, 10.0);
			Vektor3D c = new Vektor3D(0.0,0.0,0.0);
			c=LineareAlgebra.crossProduct(a, b);
		}
		//-----------------CROSSPRODUCT Test End-----------------
		
		
		//-----------------DOTPRODUCT Test Start-----------------
		@Test
		public void testDotProduct2D() throws Exception
		{
			Vektor2D a = new Vektor2D(5.0, 5.0);
			Vektor2D b = new Vektor2D(10.0, 10.0);
			
			double dot=(a.x*b.x)+(a.y*b.y);
			assertEquals(LineareAlgebra.dotProduct(a, b), dot,0);
		}
		
		@Test(expected=Exception.class)
		public void testDotProduct2DMitÜberlauf() throws Exception
		{
			Vektor2D a = new Vektor2D(Double.MAX_VALUE, 5.0);
			Vektor2D b = new Vektor2D(10.0, 10.0);
			double dot = LineareAlgebra.dotProduct(a, b);
		}
		
		@Test
		public void testdotProduct3D() throws Exception
		{
			Vektor3D a = new Vektor3D(5.0, 5.0, 5.0);
			Vektor3D b = new Vektor3D(10.0, 10.0, 10.0);
			
			double dot = (a.x*b.x)+(a.y*b.y)+(a.z*b.z);
			assertEquals(LineareAlgebra.dotProduct(a, b), dot,0);
		}
		
		@Test(expected=Exception.class)
		public void testdotProduct3DMitÜberlauf() throws Exception
		{
			Vektor3D a = new Vektor3D(Double.MAX_VALUE, 5.0, 1.0);
			Vektor3D b = new Vektor3D(10.0, 10.0, 10.0);
			double c=LineareAlgebra.dotProduct(a, b);
		}
		//-----------------DOTPRODUCT Test End-----------------
		
		
		//-----------------COSEQUATION Test End-----------------
		@Test
		public void testCosEquation2D() throws Exception
		{
			Vektor2D a = new Vektor2D(5.0, 5.0);
			Vektor2D b = new Vektor2D(10.0, 10.0);
			
			double cos = LineareAlgebra.cosEquation(a, b);
			
			double coscheck = LineareAlgebra.dotProduct(a,b);
			coscheck/=(LineareAlgebra.length(a)*LineareAlgebra.length(b));
			
			assertEquals(cos,coscheck,0);
		}
		
		@Test(expected=Exception.class)
		public void testCosEquation2DMitÜberlauf() throws Exception
		{
			Vektor2D a = new Vektor2D(Double.MAX_VALUE, 5.0);
			Vektor2D b = new Vektor2D(10.0, 10.0);
			double cos = LineareAlgebra.cosEquation(a, b);
		}
		
		@Test
		public void testCosEquation3D() throws Exception
		{
			Vektor3D a = new Vektor3D(5.0, 5.0, 5.0);
			Vektor3D b = new Vektor3D(10.0, 10.0, 10.0);
			
			double cos = LineareAlgebra.cosEquation(a, b);
			
			double coscheck = LineareAlgebra.dotProduct(a,b);
			coscheck/=(LineareAlgebra.length(a)*LineareAlgebra.length(b));
			
			assertEquals(cos,coscheck,0);
		}
		
		@Test(expected=Exception.class)
		public void testCosEquation3DMitÜberlauf() throws Exception
		{
			Vektor3D a = new Vektor3D(Double.MAX_VALUE, 5.0, 1.0);
			Vektor3D b = new Vektor3D(10.0, 10.0, 10.0);
			double c=LineareAlgebra.cosEquation(a, b);
		}
		//-----------------COSEQUATION Test End-----------------
		
		
		//-----------------SINEQUATION Test Start-----------------
		@Test
		public void testSinEquation2D() throws Exception
		{
			Vektor2D a = new Vektor2D(5.0, 5.0);
			Vektor2D b = new Vektor2D(10.0, 10.0);
			
			double cos = LineareAlgebra.sinEquation(a, b);
			
			double coscheck = LineareAlgebra.crossProduct(a,b);
			coscheck/=(LineareAlgebra.length(a)*LineareAlgebra.length(b));
			
			assertEquals(cos,coscheck,0);
		}
		
		@Test(expected=Exception.class)
		public void testSinEquation2DMitÜberlauf() throws Exception
		{
			Vektor2D a = new Vektor2D(Double.MAX_VALUE, 5.0);
			Vektor2D b = new Vektor2D(10.0, 10.0);
			double cos = LineareAlgebra.sinEquation(a, b);
		}
		
		@Test
		public void testSinEquation3D() throws Exception
		{
			Vektor3D a = new Vektor3D(5.0, 5.0, 5.0);
			Vektor3D b = new Vektor3D(10.0, 10.0, 10.0);
			
			double cos = LineareAlgebra.sinEquation(a, b);
			
			double coscheck = LineareAlgebra.length(LineareAlgebra.crossProduct(a,b));
			coscheck/=(LineareAlgebra.length(a)*LineareAlgebra.length(b));
			
			assertEquals(cos,coscheck,0);
		}
		
		@Test(expected=Exception.class)
		public void testSinEquation3DMitÜberlauf() throws Exception
		{
			Vektor3D a = new Vektor3D(Double.MAX_VALUE, 5.0, 1.0);
			Vektor3D b = new Vektor3D(10.0, 10.0, 10.0);
			double c=LineareAlgebra.sinEquation(a, b);
		}
		//-----------------SINEQUATION Test End-----------------
		
		
		//-----------------ANGLERAD Test Start-----------------
		@Test
		public void testAngleRad2D()throws Exception
		{
			Vektor2D a = new Vektor2D(10.0, 2.5);
			Vektor2D b = new Vektor2D(10.0, 2.5);
			double 	anglerad = LineareAlgebra.dotProduct(a, b);
					anglerad /= LineareAlgebra.length(a)*LineareAlgebra.length(b);
			double 	angleradtest = Math.acos(anglerad);
			
			assertEquals(LineareAlgebra.angleRad(a, b), angleradtest, 0);
			
		}
		
		@Test(expected=Exception.class)
		public void testAngleRad2DMitÜberlauf() throws Exception
		{
			Vektor2D a = new Vektor2D(Double.MAX_VALUE, 2.5);
			Vektor2D b = new Vektor2D(2, 2.5);
			
			LineareAlgebra.angleRad(a, b);
		}
		
		@Test
		public void testAngleRad3D() throws Exception
		{
			Vektor3D a = new Vektor3D(10.0, 2.5, 7.4);
			Vektor3D b = new Vektor3D(10.0, 2.5, 7.4);
			double 	anglerad = LineareAlgebra.dotProduct(a, b);
					anglerad /= LineareAlgebra.length(a)*LineareAlgebra.length(b);
			double 	angleradtest = Math.acos(anglerad);
			
			assertEquals(LineareAlgebra.angleRad(a, b), angleradtest, 0);
		}
		
		@Test(expected=Exception.class)
		public void testAngleRad3DMitÜberlauf() throws Exception
		{
			Vektor3D a = new Vektor3D(Double.MAX_VALUE, 2.5, 1.0);
			Vektor3D b = new Vektor3D(2, 2.5, 1.0);
			
			LineareAlgebra.angleRad(a, b);
		}
		//-----------------ANGLERAD Test End-----------------
		
		
		//-----------------ANGLEDEGREE Test Start-----------------
		@Test
		public void testAngleDegree2D() throws Exception
		{
			Vektor2D a = new Vektor2D(10.0, 2.5);
			Vektor2D b = new Vektor2D(10.0, 2.5);
			double 	anglerad = LineareAlgebra.dotProduct(a, b);
					anglerad /= LineareAlgebra.length(a)*LineareAlgebra.length(b);
			double 	angleradtest = (360 / (2 * Math.PI)) *Math.acos(anglerad);
			double testandgledegree = LineareAlgebra.angleDegree(a, b);
			
			assertEquals(angleradtest, testandgledegree, 0);
		}
		
		@Test(expected=Exception.class)
		public void testAngleDegree2DMitÜberlauf() throws Exception
		{
			Vektor3D a = new Vektor3D(Double.MAX_VALUE, 5.0, 1.0);
			Vektor3D b = new Vektor3D(10.0, 10.0, 10.0);
			
			LineareAlgebra.angleDegree(a, b);
		}
		
		@Test
		public void testAngleDegree3D() throws Exception
		{
			Vektor3D a = new Vektor3D(10.0, 2.5, 1.0);
			Vektor3D b = new Vektor3D(10.0, 2.5, 7.0);
			double 	anglerad = LineareAlgebra.dotProduct(a, b);
					anglerad /= LineareAlgebra.length(a)*LineareAlgebra.length(b);
			double 	angleradtest = (360 / (2 * Math.PI)) *Math.acos(anglerad);
			double testandgledegree = LineareAlgebra.angleDegree(a, b);
			
			assertEquals(angleradtest, testandgledegree, 0);
		}
		
		@Test(expected=Exception.class)
		public void testAngleDegree3DMitÜberlauf() throws Exception
		{
			Vektor3D a = new Vektor3D(Double.MAX_VALUE, 2.5, 1.0);
			Vektor3D b = new Vektor3D(2, 2.5, 1.0);
			
			LineareAlgebra.angleDegree(a, b);
		}
		//-----------------ANGLEDEGREE Test End-----------------
		
		
		//-----------------RADTODEGREE Test Start-----------------
		@Test
		public void testradToDegree() throws Exception
		{
			double a = (360 / (2 * Math.PI)) * 7;
			double b = LineareAlgebra.radToDegree(7);
			
			assertEquals(a, b, 0);
		}
		
		@Test(expected=Exception.class)
		public void testradToDegreeMitÜberlauf() throws Exception
		{
			double a = LineareAlgebra.radToDegree(Double.MAX_VALUE);
		}
		
		//-----------------RADTODEGREE Test End-----------------
		
		
		//-----------------DEGREETORAD Test Start-----------------
		@Test
		public void testdegreeToRad() throws Exception
		{
			double a = (((2 * Math.PI) / 360) * 7);
			double b = LineareAlgebra.degreeToRad(7);
			
			assertEquals(a, b, 0);
		}
		
		@Test(expected=Exception.class)
		public void testdegreeToRadMitÜberlauf() throws Exception
		{
			double b = LineareAlgebra.degreeToRad(Double.MAX_VALUE+1);
		}
		//-----------------DEGREETORAD Test End-----------------
		
		
		//-----------------DETERMINANTE Test Start-----------------
		@Test
		public void testDeterminate2D() throws Exception
		{
			Vektor2D a = new Vektor2D(10.0, 2.5);
			Vektor2D b = new Vektor2D(10.0, 2.5);
			double c = LineareAlgebra.determinante(a, b);
		}
		
		@Test(expected=Exception.class)
		public void testDeterminate2DMitÜberlauf() throws Exception
		{
			Vektor2D a = new Vektor2D(10.0, 2.5);
			Vektor2D b = new Vektor2D(10.0, Double.MAX_VALUE);
			double c = LineareAlgebra.determinante(a, b);
		}
		
		@Test
		public void testDeterminate3D() throws Exception
		{
			Vektor3D a = new Vektor3D(10.0, 2.5, 2.0);
			Vektor3D b = new Vektor3D(10.0, 3.0, 12.0);
			Vektor3D c = new Vektor3D(10.0, 7.3, 9.0);
			double d = LineareAlgebra.determinante(a, b, c);
			double e = a.x*b.y*c.z + b.x*c.y*a.z + c.x*a.y*b.z - c.x*b.y*a.z - a.x*c.y*b.z - b.x*a.y*c.z;
			
			assertEquals(d, e, 0);
		}
		
		@Test(expected=Exception.class)
		public void testDeterminate3DMitÜberlauf() throws Exception
		{
			Vektor3D a = new Vektor3D(10.0, 2.5, 2.0);
			Vektor3D b = new Vektor3D(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
			Vektor3D c = new Vektor3D(10.0, 7.3, 9.0);
			double d = LineareAlgebra.determinante(a, b, c);
		}
		//-----------------DETERMINANTE Test End-----------------
		
		
		//----------------ABS Test Start-----------------
		@Test
		public void testAbs2D() throws Exception
		{
			Vektor2D a = new Vektor2D(-2.0,-3.0);
			Vektor2D b = LineareAlgebra.abs(a);
			
			assertEquals(b.x, 2, 0);
			assertEquals(b.y, 3, 0);
		}
		
		@Test(expected=Exception.class)
		public void testAbs2DMitÜberlauf() throws Exception
		{
			Vektor2D a = new Vektor2D(-Double.MAX_VALUE,-3.0);
			Vektor2D b = LineareAlgebra.abs(a);
		}
		
		@Test
		public void testAbs3D() throws Exception
		{
			Vektor3D a = new Vektor3D(-2.0,-3.0,-20);
			Vektor3D b = LineareAlgebra.abs(a);
			
			assertEquals(b.x, 2, 0);
			assertEquals(b.y, 3, 0);
			assertEquals(b.z, 20, 0);
		}
		
		@Test(expected=Exception.class)
		public void testAbs3DMitÜberlauf() throws Exception
		{
			Vektor3D a = new Vektor3D(-Double.MAX_VALUE,-3.0, 2.0);
			Vektor3D b = LineareAlgebra.abs(a);
		}
		//----------------ABS Test End-----------------
		
		
		//----------------SHOW Test Start-----------------
		@Test
		public void testShow2D() throws Exception
		{
			Vektor2D a = new Vektor2D(10.0,12.0);
			LineareAlgebra.show(a);
		}
		
		@Test(expected=Exception.class)
		public void testShow2DMitÜberlauf() throws Exception
		{
			Vektor2D a = new Vektor2D(Double.MAX_VALUE,12.0);
			LineareAlgebra.show(a);
		}
		
		@Test
		public void testShow3D() throws Exception
		{
			Vektor3D a = new Vektor3D(2.0,12.0,5.0);
			LineareAlgebra.show(a);
		}
		
		@Test(expected=Exception.class)
		public void testShow3DMitÜberlauf() throws Exception
		{
			Vektor3D a = new Vektor3D(Double.MAX_VALUE,12.0,5.0);
			LineareAlgebra.show(a);
		}
		//----------------SHOW Test End-----------------
}
