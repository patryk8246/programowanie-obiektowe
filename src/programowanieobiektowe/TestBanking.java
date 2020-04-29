package programowanieobiektowe;


import java.util.*;
import programowanieobiektowe.banking.Account;
import programowanieobiektowe.banking.Bank;
import programowanieobiektowe.banking.Customer;



public class TestBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Witamy w WsbBank");	
		Bank wsb = new Bank();
		for(;;) {
		System.out.println("System zarzadzania: \n");
		System.out.println("Dodaj nowego klienta - 1");	
		System.out.println("Dodaj nowy rachunek do swojego konta - 2");	
		System.out.println("Lista klientów naszego banku - 3");	
		System.out.println("Wyloguj sie z konta - 4\n");	
		int wybor = scan.nextInt();
		
		switch(wybor) {
			case 1: {
				System.out.println("Proszê podac:");
				System.out.print("Imie: ");
				String firstName = scan2.nextLine();
				System.out.print("Nazwisko: ");
				String lastName = scan2.nextLine();			
				wsb.addCustomer(firstName, lastName);
			}
			break;
			case 2: {
				
				System.out.println("Weryfikacja to¿samoœci.");
				System.out.println("Proszê podaæ swoje dane: ");
				System.out.print("Imie: ");
				String firstName = scan2.nextLine();
				System.out.print("Nazwisko: ");
				String lastName = scan2.nextLine();	
				String nick = firstName+" "+lastName;
				System.out.println("Proszê wprowadziæ kwote poczatkow¹ nowego rachunku: ");	
				double balance = scan.nextDouble();
				Account konto = new Account(balance);
			
				wsb.getCustomer(nick).addAccount(konto);
			}
			break;
			case 3: {
				wsb.wyswietl_wszystkich();
			}
			break;
			case 4: {
				System.out.println("Wylogowales sie ze swojego konta w WsbBank, dziêkujemy za skorzystanie z naszych uslug. \n");	
				System.exit(0);
				
			}
			break;
			default: {
				System.out.println("Nie wybrales zadnej z mozliwych opcji.");
				
			}
			break;
		}
		}
		
		
		/*
		for(int i=1; i<wsb.getNumberOfCustomers(); i++) {
			System.out.println("Klientem ["+i+"] jest "+wsb.getCustomer(i).getLastName()+", "+wsb.getCustomer(i).getFirstName());
		}
		*/
		/*
		System.out.println("Dzien dobry, dziêkujemy za skorzystanie z uslug naszego banku. \n");
		System.out.println("Proszê podac:");
		System.out.print("Imie: ");
		String firstName = scan.nextLine();
		System.out.print("Nazwisko: ");
		String lastName = scan.nextLine();
		
		System.out.println("Proszê wprowadziæ kwote poczatkow¹: ");	
		double balance = scan.nextDouble();
		Account konto = new Account(balance);
		System.out.println("Konto zosta³o za³o¿one z kwot¹ pocz¹tkowa: "+balance+"\n");	
		klient.setAccount(konto);
		boolean test;
		for(;;) {			
			System.out.println("System zarzadzania kontem: \n");
			System.out.println("Wyswietl stan konta - 1");	
			System.out.println("Wplac pieniadze - 2");	
			System.out.println("Wyplac pieniadze - 3");	
			System.out.println("Wyloguj sie z konta - 4\n");	
			int wybor = scan.nextInt();
			switch(wybor) {
				case 1: {
					System.out.println("Stan konta ["+klient.getFirstName()+" "+klient.getLastName()+"] "+klient.getAccount().getBalance()+"\n");
					break;
				}
				case 2: {
					System.out.println("Proszê wprowadziæ kwote do wplaty: ");					
					double kwota_wplata = scan.nextDouble();
					if(kwota_wplata > 0) {
						klient.getAccount().deposit(kwota_wplata);
						test = true;
					}
					else {
						test = false;
					}
					System.out.println("Kwota: "+kwota_wplata+" zosta³a wplacona na Twoje konto. "+test+"\n");
					break;
				}
				case 3: {
					System.out.println("Proszê wprowadziæ kwote do wyplaty: ");		
					double kwota_wyplata = scan.nextDouble();
					if(kwota_wyplata < klient.getAccount().getBalance()) {
					klient.getAccount().withdraw(kwota_wyplata);
					test = true;
					}
					else {
						test = false;
					}
					System.out.println("Kwota: "+kwota_wyplata+" zosta³a wyplacona z Twojego konto."+test+"\n");
					break;
				}
				case 4: {
					System.out.println("Wylogowales sie ze swojego konta w WsbBank, dziêkujemy za skorzystanie z naszych uslug. \n");	
					System.exit(0);
					break;
				}
				default: {
					System.out.println("Nie wybrales zadnej z mozliwych opcji.");
					break;
				}
			}
		
		}
		*/
	}

}
