package club;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import numbers.HashTable;

public class ClubMapTester {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
	try(BufferedReader br = new BufferedReader(new FileReader("Files/student.txt"))){
			
			String line=br.readLine();
			
			ClubMap clubs=new ClubMap();
			String[] name=line.split("\\s+");
			Student student=new Student(name[0],name[1],name[2]);
			while (line != null) {
				name=line.split("\\s+");
				student=new Student(name[0],name[1],name[2]);
				
				clubs.addStudent(name[3], student);
				
				line = br.readLine();
				
			}
			System.out.println(clubs.getAllClubStudents());
			System.out.println("");
			System.out.println("Math");
			System.out.println(clubs.getClubStudents("Math"));
		}
	}

}
