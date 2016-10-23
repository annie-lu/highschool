package phone;

public class PhoneEntryTwo implements Comparable {
	private String name;
	private String number;

	public PhoneEntryTwo(String myName, String myNumber) {

		name = myName;
		number = myNumber;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String toString() {

		return "Name: " + name + " Number: " + number+"\n";

	}
	public int compareTo(Object x) {
		// TODO Auto-generated method stub
		return name.compareTo(((PhoneEntryTwo) x).getName());
	}

	
}
