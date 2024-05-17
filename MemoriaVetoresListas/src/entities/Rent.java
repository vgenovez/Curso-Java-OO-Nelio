package entities;

public class Rent {

	private String Name;
	private String Email;
	
	public Rent(String name, String email) {
		Name = name;
		Email = email;
	}

	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return Name + ", " + Email;
	}

}