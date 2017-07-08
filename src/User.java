
public class User {

	//fields
	private Name userName;
	
	//constructors
	public User(Name personName) {
		this.userName = personName;
	}
	
	public User(String first, String last) {
		this.userName = new Name(first, last);
	}
	
	//toString override
	public String toString() {
		return "User:\n\t" + this.userName;
	}
	
	//getters
	public Name getUserName() {
		return this.userName;
	}
	
	//setters
	public void setUserName(Name newUserName) {
		this.userName = newUserName;
	}
	
}
