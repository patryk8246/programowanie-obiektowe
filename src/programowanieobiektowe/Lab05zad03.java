package programowanieobiektowe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lab05zad03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> m = new ArrayList();
		Random generator = new Random();
				
		for(int i=0; i<150; i++) {
		   int liczba = generator.nextInt(50);
		   m.add(liczba);
		   if(liczba == 0 && i == 0) {
			   niepowodzenie();
			   break;
		   }
		   if(liczba == 0) {			   
			   break;
		   }
		}
		System.out.println("Wszystkie wylosowane liczby: \n"+m+"\n");
		System.out.println("Ilosc wylosowanych liczb: \n"+m.size()+"\n");
		if(m.size() < 5) {
			System.out.println("Pierwsze liczby: \n"+m+"\n");
			Collections.reverse(m);
			System.out.println("Pierwsze liczby od koñca: \n"+m+"\n");
		}
		else {
		System.out.println("Pierwsze liczby: \n"+m.subList(0, 5)+"\n");		
		Collections.reverse(m);
		System.out.println("Pierwsze liczby od koñca: \n"+m.subList(0, 5)+"\n");
		m.sort(null);
		System.out.println("Wszystkie wylosowane i posortowane liczby: \n"+m+"\n");
		Set<Integer> zbior = new TreeSet<>();
		zbior.addAll(m);
		System.out.println("Wszystkie wylosowane i posortowane liczby bez powtórzeñ: \n"+zbior);
		
		}
		
	}

	static void niepowodzenie() {
		System.out.println("Losowanie zakoñczone niepowodzeniem, pierwsza wylosowana lioczba wynosi 0");
		System.exit(0);
	}
}
