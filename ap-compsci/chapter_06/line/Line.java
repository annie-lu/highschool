package line;

	import java.awt.geom.Point2D;
	public class Line 
	{
		
		private double  lineSlope, lineYInt;
		private boolean verticalLine;
		
		public Line(Point2D.Double one, double slope){
			lineSlope = slope;
			lineYInt = one.getY() - (lineSlope*one.getX()); 
			
			round();
		}
		
		public Line(Point2D.Double one, Point2D.Double two){
			lineSlope = (two.getY() - one.getY())/(two.getX() - one.getX()); 
			lineYInt = one.getY() - (lineSlope*one.getX());
			
			round();
		}
		
		public Line(String equation) {
		equation = equation.replaceAll("\\s", "");
		String slope = equation.substring(2, equation.indexOf("x")); 
		String yInt = equation.substring(equation.indexOf("x") + 1);

		if (slope.substring(0, 1).equals("-"))
			lineSlope = -Double.parseDouble(slope.substring(1));
		else
			lineSlope = Double.parseDouble(slope.substring(0));

		if (yInt.substring(0, 1).equals("+"))
			lineYInt = Double.parseDouble(yInt.substring(1));
		else
			lineYInt = -Double.parseDouble(yInt.substring(1));
		
		round();
		}
		
		public Line(String equation, boolean vertical){
			
			equation = equation.replaceAll("\\s", "");
			if(vertical){
				
				String yInt = equation.substring(equation.indexOf("x") + 2);
				
				if (yInt.substring(0, 1).equals("-"))
					lineYInt = -Double.parseDouble(yInt.substring(1));
				else
					lineYInt = Double.parseDouble(yInt.substring(0));
				
				verticalLine=true;
				}
			
			else{
				
				String slope = equation.substring(2, equation.indexOf("x")); 
				String yInt = equation.substring(equation.indexOf("x") + 1);
			
				if (slope.substring(0, 1).equals("-"))
					lineSlope = -Double.parseDouble(slope.substring(1));
				else
					lineSlope = Double.parseDouble(slope.substring(0));

				if (yInt.substring(0, 1).equals("+"))
					lineYInt = Double.parseDouble(yInt.substring(1));
				else
					lineYInt = -Double.parseDouble(yInt.substring(0));
				}
			
			round();
		}
		
		public double getSlope(){
			return lineSlope;
		}
		
		public double getYIntercept(){
			return lineYInt;
		}
		
		public boolean intersects(Line other){
			if (lineSlope != other.getSlope())
				return true;
			else
				return false;
		}
		
		public boolean equals(Line other){
			if ((lineSlope == other.getSlope()) && (lineYInt == other.getYIntercept()))
				return true;
			else
				return false;
		}
		
		public boolean isParallel(Line other){
			if ((lineSlope == other.getSlope()) && (lineYInt != other.getYIntercept()))
				return true;
			else
				return false;
		}
		
		public String toString(){
			
			if(verticalLine)
					return "x= "+lineYInt;
			
			else{
				if(lineYInt>0)
					return "y= "+lineSlope+"x+"+lineYInt;
				else
					return "y= "+lineSlope+"x"+lineYInt;
				}
		}	
		private void round(){
			lineYInt= Math.round(lineYInt * 100.0) / 100.0;
		}
		
	}