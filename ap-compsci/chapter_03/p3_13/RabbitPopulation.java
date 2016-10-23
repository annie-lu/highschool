package p3_13;

public class RabbitPopulation {
	private int babyRabbits;
	private int notsobabyRabbits;
	private int adultRabbits;

		public RabbitPopulation() {
		babyRabbits=1;
		notsobabyRabbits=0;
		adultRabbits=0;
	}
		
		public void waitAMonth(){
			adultRabbits=notsobabyRabbits+adultRabbits;
			notsobabyRabbits=babyRabbits;
			babyRabbits=adultRabbits;
			
		}
		
		public int getPairs(){
			return babyRabbits+adultRabbits+notsobabyRabbits;
		}
		
	
}
