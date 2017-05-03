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
	
	public void add(Vektor2D b){
		x+=b.x;
		y+=b.y;
	}
	
	public void setPosition(double x1, double y1){
		x=x1;
		y=y1;
	}
	
	public void sub(Vektor2D b){
		x-=b.x;
		y-=b.y;
	}
	
	public void mult(double b){
		x*=b;
		y*=b;
	}
	
	public void div(double b){
		mult(1/b);
	}
	
	public boolean isEqual(Vektor2D b){
		if ((x==b.x) && (y==b.y))
			return true;
		else return false;
	}
	
	public boolean isNotEqual(Vektor2D b){
		if ((x!=b.x) || (y!=b.y))
			return true;
		else return false;
	}
	
	public double length(){
		return (Math.sqrt((x*x)+(y*y)));
	}
	
	public void normalize(){
		 mult(1/length());
	}
	
	public boolean isNullVector(){
		if ((x==0) && (y==0))
			return true;
		else return false;
	}
}
