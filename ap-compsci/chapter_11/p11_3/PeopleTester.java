package p11_3;


public class PeopleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DataSet peopleData= new DataSet();
		
		peopleData.add(new Person("waterbottle",3.2));
		peopleData.add(new Person("computer",5.4));
		peopleData.add(new Person("pencil",4.4));
		peopleData.add(new Person("eraser",4.7));
		System.out.println("tallest dude: "+((Person) (peopleData.getMaximum())).getName());
		System.out.println("average height: "+peopleData.getAverage());
		}

}
