package programowanieobiektowe.banking;

public class Customer {

	private String firstName;
	private String lastName;
	private Account acc;

	public Customer(String f, String l) {
		this.firstName = f;
		this.lastName = l;
		System.out.println("Tworzenie klienta: "+firstName+" "+lastName);
	}
		
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setAccount(Account acc) {
		this.acc = acc;
	}
	public Account getAccount() {
		return acc;
	}
	
}

