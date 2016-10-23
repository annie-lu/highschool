package monster;


import java.util.Scanner;
public class MonsterHeapRunner
{
	public static void main ( String[] args )
	{
		MonsterHeap x= new MonsterHeap();
		int height;
		int weight;
		int age;
		int num;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many monsters did you wish to enter?");
		num = keyboard.nextInt();
		for(int i=0;i<num;i++){
		
		
	
		System.out.println("enter an height");
		height = keyboard.nextInt();
		System.out.println("enter an weight");
		weight = keyboard.nextInt();
		System.out.println("enter an age");
		age = keyboard.nextInt();
		
		x.add(new Monsters(height,weight,age));
		}
		
		x.print();
		System.out.println();
		System.out.println("get min "+x.getMin());
		System.out.println("remove min "+x.removeMin());
		System.out.println();
		x.print();
		System.out.println();
		System.out.println("get min "+x.getMin());
		System.out.println("remove min "+x.removeMin());
		x.print();
	}
}