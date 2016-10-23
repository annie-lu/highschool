package p7_3;

public class CanonBallAngle {
	
		public static final double DELTAT=0.01;
		public static final double GRAVITY=9.78;

		private double distanceh=0;
		private double distancev=0;
		private double xvelocity=0;
		private double yvelocity=0;
		private double time;

		public CanonBallAngle(double velocity,double angle){
		
		xvelocity=velocity*Math.cos(Math.toRadians(angle)); 
		yvelocity=velocity*Math.sin(angle*Math.PI/180);
		
	}
	public void update(){
		distanceh=distanceh+xvelocity*DELTAT; //it starts off wrong so everything is wrong D:
		distancev=distancev+yvelocity*DELTAT;
		
		yvelocity-=GRAVITY*DELTAT;
		time+=0.01;
		
	}

	public double getxDistance(){
		return distanceh;
		
	}

	public double getyDistance(){
		return distancev;
		
	}
	
	public double getV(){
		return xvelocity;
	}
	public double getTime(){
		return time;
	}
	}
