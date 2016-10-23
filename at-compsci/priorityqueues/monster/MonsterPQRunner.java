package monster;


import java.util.Scanner;
public class MonsterPQRunner
{
	public static void main ( String[] args )
	{
		MonsterPQ x= new MonsterPQ();
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
		
		x.add(new Monster(height,weight,age));
		}
		
		System.out.println(x);
		System.out.println(x.getNaturalOrder());
		System.out.println(x);
	
	}
}