package math;
public class Vektor3D {
public double x=0,y=0,z=0;
	
	public Vektor3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vektor3D() {
		this(0, 0, 0);
	}

	public Vektor3D(Vektor3D a) {
		this(a.x, a.y, a.z);
	}
	
	public void add(Vektor3D b) throws Exception
	{
		if((x<0 && b.x<0) || (x>0 && b.x>0) || (y<0 && b.y<0) || (y>0 && b.y>0) || (z<0 && b.z<0) || (z>0 && b.z>0)) //beide kleiner oder größer als 0
			if((Math.abs(x)+Math.abs(b.x) >= Double.MAX_VALUE) || (Math.abs(y)+Math.abs(b.y) >= Double.MAX_VALUE) || (Math.abs(z)+Math.abs(b.z) >= Double.MAX_VALUE))
				throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		if((x>0 && b.x<0) || (x<0 && b.x>0) || (y>0 && b.y<0) || (y<0 && b.y>0) || (z>0 && b.z<0) || (z<0 && b.z>0)) //beide unterschiedlich
			if((Math.abs(x)-Math.abs(b.x) >= Double.MAX_VALUE) || (Math.abs(y)-Math.abs(b.y) >= Double.MAX_VALUE) || (Math.abs(z)-Math.abs(b.z) >= Double.MAX_VALUE))
				throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		x+=b.x;
		y+=b.y;
		z+=b.z;
	}
	
	public void sub(Vektor3D b) throws Exception
	{
		if((x<0 && b.x<0) || (x>0 && b.x>0) || (y<0 && b.y<0) || (y>0 && b.y>0) || (z<0 && b.z<0) || (z>0 && b.z>0)) //beide kleiner oder größer als 0
			if((Math.abs(x)-Math.abs(b.x) >= Double.MAX_VALUE) || (Math.abs(y)-Math.abs(b.y) >= Double.MAX_VALUE) || (Math.abs(z)+Math.abs(b.z) >= Double.MAX_VALUE))
				throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		if((x>0 && b.x<0) || (x<0 && b.x>0) || (y>0 && b.y<0) || (y<0 && b.y>0) || (z>0 && b.z<0) || (z<0 && b.z>0)) //beide unterschiedlich
			if((Math.abs(x)+Math.abs(b.x) >= Double.MAX_VALUE) || (Math.abs(y)+Math.abs(b.y) >= Double.MAX_VALUE) || (Math.abs(z)-Math.abs(b.z) >= Double.MAX_VALUE))
				throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		x-=b.x;
		y-=b.y;
		z-=b.z;
	}
	
	public void setPosition(double x1, double y1, double z1) throws Exception
	{
		if((Math.abs(x1)>=Double.MAX_VALUE) || (Math.abs(y1)>=Double.MAX_VALUE) || (Math.abs(z1)>=Double.MAX_VALUE))
			throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		x=x1;
		y=y1;
		z=z1;
	}
	
	
	public void mult(double b) throws Exception
	{
		if((Math.abs(x)*Math.abs(b) >= Double.MAX_VALUE) || (Math.abs(y)+Math.abs(b) >= Double.MAX_VALUE) || (Math.abs(z)+Math.abs(b) >= Double.MAX_VALUE))
			throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		x*=b;
		y*=b;
		z*=b;
	}
	
	public void div(double b) throws Exception
	{
		if(b==0)
			throw new Exception("Division durch 0 ist nicht zulässig!");
		
		if((b<1 && b > 0) || b==1)
			if((Math.abs(x)/Math.abs(b) >= Double.MAX_VALUE) || (Math.abs(y)/Math.abs(b) >= Double.MAX_VALUE) || (Math.abs(z)/Math.abs(b) >= Double.MAX_VALUE))
				throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		x/=b;
		y/=b;
		z/=b;
	}
	
	public boolean isEqual(Vektor3D b){
		if ((x==b.x) && (y==b.y) && (z==b.z))
			return true;
		else 
			return false;
	}
	
	public boolean isNotEqual(Vektor3D b){
		if ((x!=b.x) || (y!=b.y) || (z!=b.z))
			return true;
		else 
			return false;
	}
	
	public double length() throws Exception
	{
		if(((x*x) >= Double.MAX_VALUE) || ((y*y) >= Double.MAX_VALUE) || ((z*z) >= Double.MAX_VALUE))
		{
			throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		}
		return (Math.sqrt((x*x)+(y*y)+(z*z)));
	}
	
	public void normalize() throws Exception
	{
		if(((x*x) >= Double.MAX_VALUE) || ((y*y) >= Double.MAX_VALUE) || ((z*z) >= Double.MAX_VALUE))
		{
			throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		}
		mult(1/length());
		// double tmplaenge=Math.sqrt((x*x)+(y*y)+(z*z));		
		// div(tmplaenge);
	}
	
	public boolean isNullVector(){
		if ((x==0) && (y==0) && (z==0))
			return true;
		else 
			return false;
	}
}
