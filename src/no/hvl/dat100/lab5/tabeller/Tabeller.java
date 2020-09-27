package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[ ");
		
		for (int t : tabell) {
		System.out.print(t + " ");
		}
		
		System.out.println("]");
		
		
	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		String streng = "[";
		
		for (int j = 0; j<tabell.length; j++) {
				if (j != tabell.length - 1) {
					
						streng += (tabell[j] + ",");
				}	else {
						streng += (tabell[j]);
			} 				
			
		}
		
		streng += "]";
		return streng;	
	}

	// c)
	public static int summer(int[] tabell) {
		int x = 0;
		for (int i = 0; i<tabell.length; i++) {
			int y = tabell[i];
			x += y;
			
			
		}
		
		return x;
	}
	// med while løkke :
	//int sum = 0;
    //int j = 0;
    //while (j < tabell.length) {
    //    sum += tabell[j];
    //    j++;
    //}
    //return sum;
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		boolean b = false;
		
		for (int i = 0; i<tabell.length; i++) {
			if (tall == tabell[i]) {
				b = true;
			} 
			
		}
		
		
		
		return b;
		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int x = -1;
		for (int i = 0; i<tabell.length; i++) {
			if (tall == tabell[i]) {
			x = i;
			
				}
			}
		
		
		
		return x;
		

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int [] tab = new int[tabell.length];
		
		for (int i = 0; i<tabell.length; i++) {
			
			tab[i] = tabell[tabell.length-1-i];
		}
		
		
		
		return tab;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
		boolean b = true;
		int i = 1;
		while (b && i<tabell.length) {
			if (tabell[i] <= tabell[i-1]) {
				b=false;
			} else {
				b=true;
			}
			
			
			i++;
		}
		
			
			
		return b;
		
		
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int [] tab = new int[tabell1.length+tabell2.length];
		
			for (int i = 0; i<tabell1.length; i++) {
				
			tab[i] = tabell1[i];
			}
			for (int j = 0; j<tabell2.length; j++) {
				tab[j+tabell1.length] = tabell2[j];
			
			}	
			
		
		
		
		
		return tab;
	}
}
