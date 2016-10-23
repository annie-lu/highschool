package autoparts;

public class Part implements Comparable<Part>
{
	private String make, model, rest;
	private int year;

	public Part(String line) 
	{
		model="";
		rest="";
		int x=0;
		
		String[] list = line.split(" ");
		make = list[0];
		
		while( !list[x].matches(".*\\d+.*")){
			rest += list[x] +" ";
			x++;
		}
		
		rest += list[x];
		x++;
		make = list[x];
		x++;
		
		while(!list[x].matches(".*\\d+.*")){
			model += list[x]+" ";
			x++;

		}
		
		year = Integer.parseInt(list[x]);
		


	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}
	
	private String getRest() {
		return rest;
	}

	public int compareTo( Part rhs )
	{
		if(make.compareTo(rhs.getMake())>0){
			return 1;
		}
		else if(make.compareTo(rhs.getMake())<0){
			return -1;
		}
		else{
			if(model.compareTo(rhs.getModel())>0){
				return 1;
			}
			else if(model.compareTo(rhs.getModel())<0){
				return -1;
			}
			else{
				if(year>rhs.getYear()){
					return 1;
				}
				else if(year<rhs.getYear()){
					return -1;
				}
				else {
					if(rest.compareTo(rhs.getRest())>0){
						return 1;
					}
					else if(rest.compareTo(rhs.getRest())<0){
						return -1;
					}
					else{
						return 0;
					}
				}
			}
		}
	}
	
	public String toString()
	{
		return make+" "+model+" "+year+" "+rest;
	}
}