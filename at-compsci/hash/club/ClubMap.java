package club;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ClubMap {
	HashMap clubList;
	public ClubMap(){
		 clubList = new HashMap<String,TreeSet<Student>>();
	}
	public void addStudent(String club, Student student){
		if(!clubList.containsKey(club)){
			Set x= new TreeSet<Student>();
			x.add(student);
			clubList.put(club,x );
		}
		else{
			TreeSet temp=(TreeSet<Student>) (clubList.get(club));
			temp.add(student);
			clubList.replace(club,temp);
		}
	}
	public String getAllClubStudents(){
		Iterator clubs=clubList.keySet().iterator();
		String output="";
		String club="";
			while(clubs.hasNext()){
				club=(String) clubs.next();
				output+="\n"+club+"\n"+" "+getClubStudents(club);
			}
			return output;
	}
	public String getClubStudents(String club){
		if(!clubList.containsKey(club))
			return "no club";
		else{
			TreeSet<Student> x =(TreeSet<Student>) clubList.get(club);
			Iterator students = x.iterator();
			String output = "";
			while(students.hasNext()){
				output+=students.next()+"\n";
			}
			return output;
		}
	}
}
