package math;

public class LineareAlgebra {
	
	private LineareAlgebra(){}
	
	public static Vektor2D add(Vektor2D a, Vektor2D b) throws Exception
	{
		if((a.x<0 && b.x<0) || (a.x>0 && b.x>0) || (a.y<0 && b.y<0) || (a.y>0 && b.y>0)) //beide kleiner oder größer als 0
			if((Math.abs(a.x)+Math.abs(b.x) >= Double.MAX_VALUE) || (Math.abs(a.y)+Math.abs(b.y) >= Double.MAX_VALUE))
				throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		if((a.x>0 && b.x<0) || (a.x<0 && b.x>0) || (a.y>0 && b.y<0) || (a.y<0 && b.y>0)) //beide unterschiedlich
			if((Math.abs(a.x)-Math.abs(b.x) >= Double.MAX_VALUE) || (Math.abs(a.y)-Math.abs(b.y) >= Double.MAX_VALUE))
				throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		Vektor2D c = new Vektor2D(a.x+b.x,a.y+b.y);
		return c;
	}
	
	public static Vektor3D add(Vektor3D a, Vektor3D b) throws Exception
	{
		if((a.x<0 && b.x<0) || (a.x>0 && b.x>0) || (a.y<0 && b.y<0) || (a.y>0 && b.y>0) || (a.z<0 && b.z<0) || (a.z>0 && b.z>0)) //beide kleiner oder größer als 0
			if((Math.abs(a.x)+Math.abs(b.x) >= Double.MAX_VALUE) || (Math.abs(a.y)+Math.abs(b.y) >= Double.MAX_VALUE) || (Math.abs(a.z)+Math.abs(b.z) >= Double.MAX_VALUE))
				throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		if((a.x>0 && b.x<0) || (a.x<0 && b.x>0) || (a.y>0 && b.y<0) || (a.y<0 && b.y>0) || (a.z>0 && b.z<0) || (a.z<0 && b.z>0)) //beide unterschiedlich
			if((Math.abs(a.x)-Math.abs(b.x) >= Double.MAX_VALUE) || (Math.abs(a.y)-Math.abs(b.y) >= Double.MAX_VALUE) || (Math.abs(a.z)-Math.abs(b.z) >= Double.MAX_VALUE))
				throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		Vektor3D c= new Vektor3D(a.x+b.x,a.y+b.y,a.z+b.z);
		return c;
	}
	
	public static Vektor2D sub(Vektor2D a, Vektor2D b) throws Exception
	{
		if((a.x<0 && b.x<0) || (a.x>0 && b.x>0) || (a.y<0 && b.y<0) || (a.y>0 && b.y>0)) //beide kleiner oder größer als 0
			if((Math.abs(a.x)-Math.abs(b.x) >= Double.MAX_VALUE) || (Math.abs(a.y)-Math.abs(b.y) >= Double.MAX_VALUE))
				throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		if((a.x>0 && b.x<0) || (a.x<0 && b.x>0) || (a.y>0 && b.y<0) || (a.y<0 && b.y>0)) //beide unterschiedlich
			if((Math.abs(a.x)+Math.abs(b.x) >= Double.MAX_VALUE) || (Math.abs(a.y)+Math.abs(b.y) >= Double.MAX_VALUE))
				throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		Vektor2D c= new Vektor2D(a.x-b.x,a.y-b.y);
		return c;
	}
	
	public static Vektor3D sub(Vektor3D a, Vektor3D b) throws Exception
	{
		if((a.x<0 && b.x<0) || (a.x>0 && b.x>0) || (a.y<0 && b.y<0) || (a.y>0 && b.y>0) || (a.z<0 && b.z<0) || (a.z>0 && b.z>0)) //beide kleiner oder größer als 0
			if((Math.abs(a.x)-Math.abs(b.x) >= Double.MAX_VALUE) || (Math.abs(a.y)-Math.abs(b.y) >= Double.MAX_VALUE) || (Math.abs(a.z)+Math.abs(b.z) >= Double.MAX_VALUE))
				throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		if((a.x>0 && b.x<0) || (a.x<0 && b.x>0) || (a.y>0 && b.y<0) || (a.y<0 && b.y>0) || (a.z>0 && b.z<0) || (a.z<0 && b.z>0)) //beide unterschiedlich
			if((Math.abs(a.x)+Math.abs(b.x) >= Double.MAX_VALUE) || (Math.abs(a.y)+Math.abs(b.y) >= Double.MAX_VALUE) || (Math.abs(a.z)-Math.abs(b.z) >= Double.MAX_VALUE))
				throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		Vektor3D c= new Vektor3D(a.x-b.x,a.y-b.y,a.z-b.z);
		return c;
	}
	
	public static Vektor2D mult(Vektor2D a, double b) throws Exception
	{
		if((Math.abs(a.x)*Math.abs(b) >= Double.MAX_VALUE) || (Math.abs(a.y)+Math.abs(b) >= Double.MAX_VALUE))
			throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		Vektor2D c= new Vektor2D();
		c.x=a.x*b;
		c.y=a.y*b;
		return c;
	}
	
	public static Vektor3D mult(Vektor3D a, double b) throws Exception
	{
		if((Math.abs(a.x)*Math.abs(b) >= Double.MAX_VALUE) || (Math.abs(a.y)+Math.abs(b) >= Double.MAX_VALUE) || (Math.abs(a.z)+Math.abs(b) >= Double.MAX_VALUE))
			throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		Vektor3D c= new Vektor3D();
		c.x=a.x*b;
		c.y=a.y*b;
		c.z=a.z*b;
		return c;
	}
	
	public static Vektor2D div(Vektor2D a, double b) throws Exception
	{
		if(b==0)
			throw new Exception("Division durch 0 ist nicht zulässig!");
		
		if((b<1 && b > 0) || b==1)
			if((Math.abs(a.x)/Math.abs(b) >= Double.MAX_VALUE) || (Math.abs(a.y)/Math.abs(b) >= Double.MAX_VALUE))
				throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		return (mult(a, 1/b));
	}
	
	public static Vektor3D div(Vektor3D a, double b) throws Exception
	{
		if(b==0)
			throw new Exception("Division durch 0 ist nicht zulässig!");
		
		if((b<1 && b > 0) || b==1)
			if((Math.abs(a.x)/Math.abs(b) >= Double.MAX_VALUE) || (Math.abs(a.y)/Math.abs(b) >= Double.MAX_VALUE) || (Math.abs(a.z)/Math.abs(b) >= Double.MAX_VALUE))
				throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		return (mult(a,1/b));
	}
	
	public static boolean isEqual(Vektor2D a, Vektor2D b){
		if ((a.x==b.x) && (a.y==b.y))
			return true;
		else return false;
	}
	
	public static boolean isEqual(Vektor3D a, Vektor3D b){
		if ((a.x==b.x) && (a.y==b.y) && (a.z==b.z))
			return true;
		else return false;
	}
	
	public static boolean isNotEqual(Vektor2D a, Vektor2D b){
		if ((a.x!=b.x) || (a.y!=b.y))
			return true;
		else return false;
	}
	
	public static boolean isNotEqual(Vektor3D a, Vektor3D b){
		if ((a.x!=b.x) || (a.y!=b.y) || (a.z!=b.z))
			return true;
		else return false;
	}
	
	public static double length(Vektor2D a) throws Exception
	{
		if(((a.x*a.x) >= Double.MAX_VALUE) || ((a.y*a.y) >= Double.MAX_VALUE))
			throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		return (Math.sqrt((a.x*a.x)+(a.y*a.y)));
	}
	
	public static double length(Vektor3D a) throws Exception
	{
		if(((a.x*a.x) >= Double.MAX_VALUE) || ((a.y*a.y) >= Double.MAX_VALUE) || ((a.z*a.z) >= Double.MAX_VALUE))
			throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		return (Math.sqrt((a.x*a.x)+(a.y*a.y)+(a.z*a.z)));
	}
	
	public static Vektor2D normalize(Vektor2D a) throws Exception
	{
		if(((a.x*a.x) >= Double.MAX_VALUE) || ((a.y*a.y) >= Double.MAX_VALUE))
			throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		 return (mult(a, 1/length(a)));
	}
	
	public static Vektor3D normalize(Vektor3D a) throws Exception
	{
		if(((a.x*a.x) >= Double.MAX_VALUE) || ((a.y*a.y) >= Double.MAX_VALUE) || ((a.z*a.z) >= Double.MAX_VALUE))
			throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		 return (mult(a, 1/length(a)));
	}
	
	public static double euklDistance(Vektor2D a, Vektor2D b) throws Exception
	{
		if((Math.pow(a.x-b.x,2)>=Double.MAX_VALUE) || (Math.pow(a.y-b.y,2)>=Double.MAX_VALUE) || (Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y-b.y,2))>=Double.MAX_VALUE))
			throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		double diffX=Math.pow(a.x-b.x,2);
		double diffY=Math.pow(a.y-b.y,2);
		double dist=Math.sqrt(diffX+diffY);
		return dist;
	}
	
	public static double euklDistance(Vektor3D a, Vektor3D b) throws Exception
	{
		if((Math.pow(a.x-b.x,2)>=Double.MAX_VALUE) || (Math.pow(a.y-b.y,2)>=Double.MAX_VALUE) || (Math.pow(a.z-b.z,2)>=Double.MAX_VALUE) || (Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y-b.y,2)+Math.pow(b.z-a.z,2))>=Double.MAX_VALUE))
			throw new Exception("Ueberlauf! Bitte den maximalen Wertebereich beachten!");
		
		double diffX=Math.pow(b.x-a.x,2);
		double diffY=Math.pow(b.y-a.y,2);
		double diffZ=Math.pow(b.z-a.z,2);
		double dist=Math.sqrt(diffX+diffY+diffZ);
		return dist;
	}
	
	public static double manhattanDistance(Vektor2D a, Vektor2D b){
		return (Math.abs(b.x-a.x)+ Math.abs(b.y-a.y));
	}
	
	public static double manhattanDistance(Vektor3D a, Vektor3D b){
		return (Math.abs(b.x-a.x) + Math.abs(b.y-a.y) + Math.abs(b.z-a.z));
	}

  //es existiert kein Kreuzprodukt für 2D-Vektoren --> siehe Determinante
	public static double crossProduct(Vektor2D a, Vektor2D b){
		return ((a.x*b.y)-(b.x*a.y));
	}
	public static Vektor3D crossProduct(Vektor3D a, Vektor3D b){
		Vektor3D c= new Vektor3D();
		c.x=((a.y*b.z)-(a.z*b.y));
		c.y=((a.z*b.x)-(a.x*b.z));
		c.z=((a.x*b.y)-(a.y*b.x));
		return c;
	}
	
	public static double dotProduct(Vektor2D a, Vektor2D b){
		return ((a.x*b.x)+(a.y*b.y));
	}
	
	public static double dotProduct(Vektor3D a, Vektor3D b){
		return ((a.x*b.x)+(a.y*b.y)+(a.z*b.z));
	}
	//Aufruf radtodegree
	public static double cosEquation(Vektor2D a, Vektor2D b) throws Exception
	{
		double cos=dotProduct(a,b);
		cos/=(length(a)*length(b));
		return cos;
	}
	//Aufruf radtodegree

	public static double cosEquation(Vektor3D a, Vektor3D b) throws Exception
	{
		double cos=dotProduct(a,b);
		cos/=(length(a)*length(b));
		return (Math.toDegrees(cos));
	}
	//Aufruf radtodegree

	public static double sinEquation(Vektor2D a, Vektor2D b) throws Exception
	{
		double sin=crossProduct(a,b);
		sin/=(length(a)*length(b));
		return sin; 
		
	}
	//Aufruf radtodegree
	public static double sinEquation(Vektor3D a, Vektor3D b) throws Exception
	{
		double sin=length(crossProduct(a,b));
		sin/=(length(a)*length(b));
		return sin;
	}
	
	public static double angleRad(Vektor2D a, Vektor2D b) throws Exception
	{
		return Math.acos(cosEquation(a, b));
	}
	
	public static double angleRad(Vektor3D a, Vektor3D b) throws Exception
	{
		return Math.acos(cosEquation(a, b));
	}
	
	public static double angleDegree(Vektor2D a, Vektor2D b) throws Exception
	{
		return radToDegree(angleRad(a, b));
	}
	
	public static double angleDegree(Vektor3D a, Vektor3D b) throws Exception
	{
		return radToDegree(angleRad(a, b));
	}
	
	public static double radToDegree(double a){
		return ((360 / (2 * Math.PI)) * a);
	}
	
	public static double degreeToRad(double a){
		return (((2 * Math.PI) / 360) * a);
	}
	
	public static double determinante(Vektor2D a, Vektor2D b){
		return (crossProduct(a,b));
	}
	
	public static double determinante(Vektor3D a, Vektor3D b, Vektor3D c){
		return (a.x*b.y*c.z + b.x*c.y*a.z + c.x*a.y*b.z - c.x*b.y*a.z - a.x*c.y*b.z - b.x*a.y*c.z);
	}
	
	public static Vektor2D abs(Vektor2D a){
		Vektor2D c= new Vektor2D(Math.abs(a.x),Math.abs(a.y));
		return c;
	}
	
	public static Vektor3D abs(Vektor3D a){
		Vektor3D c= new Vektor3D(Math.abs(a.x),Math.abs(a.y), Math.abs(a.z));
		return c;
	}

	public static void show(Vektor2D a){
		System.out.println("Die x-Koordinate: " + a.x + "\n" + "Die y-Koordinate: " + a.y);
	}
	
	public static void show(Vektor3D a){
		System.out.println("Die x-Koordinate: " + a.x + "\n" + "Die y-Koordinate: " + a.y + "\n" + "Die z-Koordinate: " + a.z);
	}

}
