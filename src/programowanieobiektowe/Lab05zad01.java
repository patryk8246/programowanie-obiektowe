package programowanieobiektowe;


import java.util.HashMap;
import java.util.Scanner;


public class Lab05zad01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> uzytkownicy = new HashMap<>();
		System.out.println("Podaj nazwê u¿ytkownika");
		String nazwa_uzytkownika = scan.nextLine();
		System.out.println("Podaj has³o");
		String haslo = scan.nextLine();
		uzytkownicy.put(nazwa_uzytkownika, haslo);
		while(nazwa_uzytkownika.equals("q") == false) {
		System.out.println("Podaj nazwê u¿ytkownika");
		nazwa_uzytkownika = scan.nextLine();
		System.out.println("Podaj has³o");
		haslo = scan.nextLine();
		uzytkownicy.put(nazwa_uzytkownika, haslo);
		}
		System.out.println("Iloœæ elementów w mapie: "+ uzytkownicy.size());
		System.out.println(uzytkownicy.keySet());	
		
		System.out.println("Podaj któr¹œ z nazw wprowadzonych wczesniej:");
		nazwa_uzytkownika = scan.nextLine();
	
		String test = uzytkownicy.get(nazwa_uzytkownika);
		while(test == null) {
			System.out.println("Nie oszukuj, nie poda³eœ tej nazwy. \n Spróbuj ponownie");
			System.out.println("Podaj któr¹œ z nazw wprowadzonych wczesniej:");
			nazwa_uzytkownika = scan.nextLine();
			test = uzytkownicy.get(nazwa_uzytkownika);
		}
			System.out.println(test);
			
		
		
	}
	

}
