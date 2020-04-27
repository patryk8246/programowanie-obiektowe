package programowanieobiektowe.banking;

import java.util.Scanner;

public class Bank {
	private Customer[] tab_customer = new Customer[20];
	private int numberOfCustomers =1;
	
	public Bank() {
		for(int i=0; i<5; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Proszê podac:");
			System.out.print("Imie: ");
			String firstName = scan.nextLine();
			System.out.print("Nazwisko: ");
			String lastName = scan.nextLine();
			addCustomer(firstName, lastName);
		}			
	}
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	public Customer getCustomer(int index) {
		return tab_customer[index];
	}
	public void addCustomer(String f, String l) {
		tab_customer[numberOfCustomers] = new Customer(f, l);
		numberOfCustomers++;
	}
}
