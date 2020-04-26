package programowanieobiektowe;


import java.util.Scanner;
import programowanieobiektowe.banking.Account;
import programowanieobiektowe.banking.Customer;



public class TestBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Dzien dobry, dziêkujemy za skorzystanie z uslug naszego banku. \n");
		System.out.println("Proszê podac:");
		System.out.print("Imie: ");
		String firstName = scan.nextLine();
		System.out.print("Nazwisko: ");
		String lastName = scan.nextLine();
		Customer klient = new Customer(firstName, lastName);
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
	}

}
