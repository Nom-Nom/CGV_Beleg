package swarm;

import math.Vektor2D;

public class VerhaltenPerfekterFlummi implements Verhalten {
   private Flummi flummi;
   private ObjektManager flummies;
   
   public VerhaltenPerfekterFlummi(Flummi flummi, ObjektManager flummies) {
      this.flummi = flummi;
      this.flummies = flummies;
   }
   
   @Override
   public void update() throws Exception{
      flummi.position.add(flummi.velocity);

      if (flummi.position.y>480 || flummi.position.y<0)
         flummi.velocity.y *= -1;
   }
   
   public Vektor2D cohesion()
   {
	   Vektor2D steeringForce = new Vektor2D(0,0);
	   
	   int count = 0;
	   for(int i=0; i<flummies.getFlummiSize(); i++)
	   {
		   //if(flummies.getFlummi()==i)
		   
		   BasisObjekt bObj = flummies.getFlummi(i);
		   
		   if(bObj instanceof Flummi)
		   {
			   Flummi bObjF = (Flummi)bObj;
			   steeringForce.add(bObjF.getPosition());
			   count++;
		   }
	   }
	
	   steeringForce.mult(1./count);
	   steeringForce.sub(flummi.getPosition);
	   
	   
	   return steeringForce;
   }
}
