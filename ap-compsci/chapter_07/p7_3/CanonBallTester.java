package p7_3;

public class CanonBallTester {
	public static void main(String[] args) {
		Canonball candace=new Canonball(50);
		CanonBallAngle can=new CanonBallAngle(150.0,45.0);
	boolean loopagain=true;
	while(loopagain){
			for(int y=1;y<=100;y++)
			candace.update(); //no ._.
			if( candace.getDistance()>0)
				{System.out.println(candace.getDistance());
			System.out.println(candace.getExactDistance());}
			else
				loopagain=false;
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println(can.getV()); //what is wrong with velocity ._.
		
		do{ 
			for(int y=1;y<=100;y++)
				can.update();
			System.out.println("Time: "+can.getTime());
			System.out.println("Horizontal: "+can.getxDistance());
			System.out.println("Vertical: "+can.getyDistance());
		}while(can.getyDistance()>=0);}
}