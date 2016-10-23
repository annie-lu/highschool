package club;

public class Student implements Comparable {
	String last,first,id;

	public Student(String last, String first, String id) {
		
		this.last = last;
		this.first = first;
		this.id = id;
	}
	
	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	@Override
	public int compareTo(Object student) {
		return last.compareTo(((Student)student).getLast());
	}
	public String toString(){
		return first+" "+last+" "+id;
		
	}

	
}
