package programowanieobiektowe.banking;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Bank {
	private Set<Customer> zbior = new HashSet<>();
	public Bank() {		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Proszê podac:");
		System.out.print("Imie: ");
		String firstName = scan.nextLine();
		System.out.print("Nazwisko: ");
		String lastName = scan.nextLine();
		addCustomer(firstName, lastName);
			
	}
	
	public Customer getCustomer(String f, String l) {
		ArrayList<Customer> lista = new ArrayList<>();
		lista.addAll(zbior);
		int rozmiar = zbior.size();
		int numer = 0;
		for(int i=0; i<rozmiar; i++) {
			if(lista.get(i).getFirstName().equals(f) == true && lista.get(i).getLastName().equals(l) == true) {
			numer +=i;
			break;
			}
			
		}
		return lista.get(numer);
			
	}
	public void addCustomer(String f, String l) {
		zbior.add(new Customer(f, l));
		}
	public void wyswietl_wszystkich() {
		ArrayList<Customer> lista = new ArrayList<>();
		lista.addAll(zbior);
		int rozmiar = zbior.size();
		for(int i=0; i<rozmiar; i++) {
			 System.out.println("Klient: "+lista.get(i).getLastName()+", "+lista.get(i).getFirstName()+" Liczba kont: "+lista.get(i).getNumOfAccounts());
			 for(int j=0, g=1; j<lista.get(i).getNumOfAccounts();j++, g++) {
				 
				 System.out.println("Konto "+g+": stan konta wynosi: "+lista.get(i).getAccount(j).getBalance());
			 	}
			}
		}
		
	
}
