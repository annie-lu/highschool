package p6_17;

public class UnitConverter {
	private String unit;
	private String unitConversion;
	private double number;
	
	public UnitConverter(String unicorn, String unicycle, double num){
		unit=unicorn;
		unitConversion=unicycle;
		number=num;
				
	}
	
	private double ConvertMeters(){
		double meters;
		
		if (unit.equals("in"))
			meters = number * 0.0254;
		else if (unit.equals("ft"))
			meters = number * 0.3048;
		else if (unit.equals("mi"))
			meters = number * 1609.34;
		else if (unit.equals("mm"))
			meters = number * 0.001;
		else if (unit.equals("cm"))
			meters = number * 0.01;
		else if (unit.equals("m"))
			meters = number;
		else if (unit.equals("km"))
			meters = number * 1000;
		else
			meters = 0;
		
		return meters;
					
		
	}
	
	public double Conversion(){
		double conversion;
		double meters=ConvertMeters();
		if (unitConversion.equals("in"))
			conversion = meters * 39.3701;
		else if (unitConversion.equals("ft"))
			conversion = meters * 3.28084;
		else if (unitConversion.equals("mi"))
			conversion = meters * 0.000621371;
		else if (unitConversion.equals("mm"))
			conversion = meters * 1000;
		else if (unitConversion.equals("cm"))
			conversion = meters * 100;
		else if (unitConversion.equals("m"))
			conversion = meters;
		else if (unitConversion.equals("0.001"))
			conversion = meters * 1000;
		else
			conversion = 0;
		
		return conversion;
		
	}
	//:'( creys

}
