package programowanieobiektowe.banking;

import java.util.ArrayList;

public class Customer {

	private String firstName;
	private String lastName;
	private String Name = firstName+" "+lastName;
	private ArrayList<Account> acc_lista = new ArrayList<>();
	private int numOfAccounts;
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
	public String getName() {
		return Name;
	}
	public void addAccount(Account acc) {
		acc_lista.add(acc);
		numOfAccounts +=1;
	}
	public Account getAccount(int i) {
		return acc_lista.get(i);
	}
	public int getNumOfAccounts() {
		return numOfAccounts;
	}
	
}

