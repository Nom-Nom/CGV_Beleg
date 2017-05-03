package test.math;
import static org.junit.Assert.*;

import org.junit.Test;

import math.Vektor2D;

public class Vektor2DTest {

	public double x, y;

	@Test
	public void testAddKomponentenweise(){
		Vektor2D b =new Vektor2D(1.0,3.5);
		Vektor2D a =new Vektor2D(1.0,3.5);
		Vektor2D c =new Vektor2D(0,0);
		c.x=a.x+b.x;
		c.y=a.y+b.y;
		a.add(b);
		assertEquals(a.x,c.x,0);
		assertEquals(a.y,c.y,0);
		
		//Rücksetzen von a
		a.x =1.0;
		a.y =3.5;
		
		b.add(a);
		assertEquals(b.x,c.x,0);
		assertEquals(b.y,c.y,0);
	}
	
	@Test(expected=Exception.class)
	public void testAddKomponentenweiseMitÜberlauf(){
		Vektor2D b =new Vektor2D(Double.MAX_VALUE,Double.MAX_VALUE);
		Vektor2D a =new Vektor2D(1.0,1.0);
		Vektor2D c =new Vektor2D(0,0);
		c.x=a.x+b.x;
		c.y=a.y+b.y;
		a.add(b);
		assertEquals(a.x,c.x,0);
		assertEquals(a.y,c.y,0);
		b.add(a);
		assertEquals(b.x,c.x,0);
		assertEquals(b.y,c.y,0);
	}
}
