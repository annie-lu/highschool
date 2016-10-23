package p7_2;

public class DrunkDude {
	private int xLocation;
	private int yLocation;

	public DrunkDude(){
		xLocation=0;
		yLocation=0;
	}
	public void walk(){
		do{
		int xChoice= (int) (Math.random() * 3 + 1); //3 options: stay left right
		
		if(xChoice==1)
			xLocation++;
		else if (xChoice==2)
			xLocation--;
		
		int yChoice= (int) (Math.random() * 3 + 1);
		if(yChoice==1)
			yLocation++;
		else if (yChoice==2)
			yLocation--;} while(!bounds(5)); //figure out how to avoid do while if have time
		
		
	}
	private boolean bounds(int boundary){
		if (yLocation>boundary)
			yLocation--;
		else if (yLocation<-boundary)
			yLocation++;
			
		if(xLocation>boundary)
			yLocation--;
		else if(yLocation<-boundary)
			yLocation++;
		
		if(yLocation>boundary||yLocation<-boundary||xLocation>boundary||yLocation<-boundary)
			return false;
		else
			return true;
		
	}
	public String printPoint(){
		return xLocation+","+yLocation;
		
	}
	public double getDistance(){
		return Math.sqrt((0-xLocation)*(0-xLocation) + (0-yLocation)*(0-yLocation));
		
	}
}
