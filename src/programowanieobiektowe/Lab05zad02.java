package programowanieobiektowe;

import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;


public class Lab05zad02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Set<Integer> zbior1 = new TreeSet<>();
		Set<Integer> zbior2 = new TreeSet<>();
		Set<Integer> zbior1copy = new TreeSet<>();
		Set<Integer> zbior_wyniki = new TreeSet<>();
		System.out.println("Podaj 3 cyfry do pierwszego zbioru:");
		int cyfra = scan.nextInt();
		zbior1.add(cyfra);
		while (zbior1.size() < 3) {
			System.out.println("Podaj cyfrê:");
			cyfra = scan.nextInt();
			zbior1.add(cyfra);
			zbior1copy.add(cyfra);
		}
		System.out.println("Iloœæ wprowadzonych elementów do zbioru: "+zbior1.size());
		System.out.println("Zawartoœæ zbioru: "+zbior1);
		System.out.println();
		System.out.println("Podaj 3 cyfry do drugiego zbioru:");
		cyfra = scan.nextInt();
		zbior2.add(cyfra);
		while (zbior2.size() < 3) {
			System.out.println("Podaj cyfrê:");
			cyfra = scan.nextInt();
			zbior2.add(cyfra);
		}
		System.out.println("Iloœæ wprowadzonych elementów do zbioru: "+zbior1.size());
		System.out.println("Zawartoœæ zbioru: "+zbior1);
		System.out.println();
		
		zbior_wyniki.addAll(zbior1);
		zbior_wyniki.addAll(zbior2);
		
		System.out.println("Zbiór pierwszy + zbiór drugi = "+zbior_wyniki);
		
		zbior1.removeAll(zbior2);
		System.out.println("Zbiór pierwszy - zbiór drugi = "+zbior1);
		zbior1copy.removeAll(zbior1);
		System.out.println("Zbiór pierwszy * zbiór drugi = "+zbior1copy);
		
		
	}

}