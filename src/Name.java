
public class Name {

	//fields
	private String firstName;
	private String lastName;
	
	
	//constructors
	public Name(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}
	
	
	//toString override
	public String toString() {
		return "Name: " + this.firstName + " " + this.lastName;
	}
	
	//getters
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	
	//setters
	public void setFirstName(String newFirst) {
		this.firstName = newFirst;
	}
	
	public void setLastName(String newLast) {
		this.lastName = newLast;
	}
	
}
