package liver;

public class Patient {
	
	String lastName;
	int priority;

	public Patient(String lastName, int priority) {
		super();
		this.lastName = lastName;
		this.priority = priority;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public String toString(){
		return lastName;
	}

}
