package math;

public class Vektor2D {
	public double x=0,y=0;
	
	public Vektor2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Vektor2D() {
		this(0, 0);
	}

	public Vektor2D(Vektor2D a) {
		this(a.x, a.y);
	}
	
	public void add(Vektor2D b) throws Exception
	{
		if((x<0 && b.x<0) || (x>0 && b.x>0) || (y<0 && b.y<0) || (y>0 && b.y>0)) //beide kleiner oder größer als 0
			if((Math.abs(x)+Math.abs(b.x) >= Double.MAX_VALUE) || (Math.abs(y)+Math.abs(b.y) >= Double.MAX_VALUE))
				throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		if((x>0 && b.x<0) || (x<0 && b.x>0) || (y>0 && b.y<0) || (y<0 && b.y>0)) //beide unterschiedlich
			if((Math.abs(x)-Math.abs(b.x) >= Double.MAX_VALUE) || (Math.abs(y)-Math.abs(b.y) >= Double.MAX_VALUE))
				throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		x+=b.x;
		y+=b.y;
	}
	
	public void sub(Vektor2D b) throws Exception
	{
		if((x<0 && b.x<0) || (x>0 && b.x>0) || (y<0 && b.y<0) || (y>0 && b.y>0)) //beide kleiner oder größer als 0
			if((Math.abs(x)-Math.abs(b.x) >= Double.MAX_VALUE) || (Math.abs(y)-Math.abs(b.y) >= Double.MAX_VALUE))
				throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		if((x>0 && b.x<0) || (x<0 && b.x>0) || (y>0 && b.y<0) || (y<0 && b.y>0)) //beide unterschiedlich
			if((Math.abs(x)+Math.abs(b.x) >= Double.MAX_VALUE) || (Math.abs(y)+Math.abs(b.y) >= Double.MAX_VALUE))
				throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		x-=b.x;
		y-=b.y;
	}
	
	public void setPosition(double x1, double y1) throws Exception
	{
		if((Math.abs(x1)>=Double.MAX_VALUE) || (Math.abs(y1)>=Double.MAX_VALUE))
			throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		x=x1;
		y=y1;
	}
	
	public void mult(double b) throws Exception
	{
		if((Math.abs(x)*Math.abs(b) >= Double.MAX_VALUE) || (Math.abs(y)+Math.abs(b) >= Double.MAX_VALUE))
			throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		x*=b;
		y*=b;
	}
	
	public void div(double b) throws Exception
	{
		if(b==0)
			throw new Exception("Division durch 0 ist nicht zulässig!");
		
		if((b<1 && b > 0) || b==1)
			if((Math.abs(x)/Math.abs(b) >= Double.MAX_VALUE) || (Math.abs(y)/Math.abs(b) >= Double.MAX_VALUE))
				throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		x/=b;
		y/=b;
	}
	
	public boolean isEqual(Vektor2D b){
		if ((x==b.x) && (y==b.y))
			return true;
		else 
			return false;
	}
	
	public boolean isNotEqual(Vektor2D b){
		if ((x!=b.x) || (y!=b.y))
			return true;
		else 
			return false;
	}
	
	public double length() throws Exception
	{
		if(((x*x) >= Double.MAX_VALUE) || ((y*y) >= Double.MAX_VALUE))
		{
			throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		}
		return (Math.sqrt((x*x)+(y*y)));
	}
	
	public void normalize() throws Exception
	{
		if(((x*x) >= Double.MAX_VALUE) || ((y*y) >= Double.MAX_VALUE))
		{
			throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		}
		mult(1/length());
		// double tmplaenge=Math.sqrt((x*x)+(y*y)); 		
		// div(tmplaenge);
	}
	
	public boolean isNullVector()
	{
		if ((x==0) && (y==0))
			return true;
		else 
			return false;
	}
}
