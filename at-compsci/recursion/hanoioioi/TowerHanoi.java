package hanoioioi;

public class TowerHanoi {
	static int count = 0; 
	
	public static void moves(int disc, int target, int initial){
		if(disc==1)
		{
			count++;
			System.out.println("move disc from " + initial + " to "+target);
		}
		else{
		moves(disc-1, 6-target-initial, initial );
		moves(1, target, initial);
		moves(disc-1,target,6-target-initial);
		}		
	}
}
