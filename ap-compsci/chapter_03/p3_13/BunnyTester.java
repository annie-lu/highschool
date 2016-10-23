package p3_13;

public class BunnyTester {

	public static void main(String[] args) {
		
		RabbitPopulation bunny = new RabbitPopulation();
		
		for (int x = 0; x < 11; x++) {
			System.out.println("Month " + x + " sees " + bunny.getPairs()+ " pairs");
			bunny.waitAMonth();
		}
	
	}

}
