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
	
	public void add(Vektor3D b){
		x+=b.x;
		y+=b.y;
		z+=b.z;
	}
	
	public void setPosition(double x1, double y1, double z1){
		x=x1;
		y=y1;
		z=z1;
	}
	
	public void sub(Vektor3D b){
		x-=b.x;
		y-=b.y;
		z-=b.z;
	}
	
	public void mult(double b){
		x*=b;
		y*=b;
		z*=b;
	}
	
	public void div(double b){
		mult(1/b);
	}
	
	public boolean isEqual(Vektor3D b){
		if ((x==b.x) && (y==b.y) && (z==b.z))
			return true;
		else return false;
	}
	
	public boolean isNotEqual(Vektor3D b){
		if ((x!=b.x) || (y!=b.y) || (z!=b.z))
			return true;
		else return false;
	}
	
	public double length(){
		return (Math.sqrt((x*x)+(y*y)+(z*z)));
	}
	
	public void normalize(){
		 mult(1/length());
	}
	
	public boolean isNullVector(){
		if ((x==0) && (y==0) && (z==0))
			return true;
		else return false;
	}
}
