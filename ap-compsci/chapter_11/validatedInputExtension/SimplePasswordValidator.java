package validatedInputExtension;

public class SimplePasswordValidator implements Validator<String>{
	
	private String password;
	
	public SimplePasswordValidator(String password){
		this.password=password;
	}

	public String prompt() {
		// TODO Auto-generated method stub
		return "Enter the password";
	}

	public String error() {
		// TODO Auto-generated method stub
		return "Input is not the password";
	}

	public boolean isValid(String value) {
		// TODO Auto-generated method stub
		return value.equals(password);
	}

}
