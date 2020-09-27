package no.hvl.dat100.lab6.matriser;

public class Matriser {
	
	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] rad : matrise) {
			for (int v : rad) {
			System.out.print(v + " ");
			}
			System.out.println();
			}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String s = "";
		
		for (int j = 0; j<matrise.length; j++) {
			for (int i = 0; i<matrise.length; i ++) {
				
				
				if (i<2) {
					
						s += (matrise[j][i] + " ");
						
				} 	else {
					s += (matrise[j][i] + " " + "\n");
					
				}
				
				
			}

			
		}
		return s;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int [][] nyMatrise = new int[matrise.length][matrise[0].length];
		for (int j = 0; j<matrise.length; j++) {
			for (int i = 0; i<matrise.length; i ++) {
				
				nyMatrise[i][j] = matrise[i][j] * tall;
				
				
			}
		}
		
		
		
		return nyMatrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean lik = true;
		
		for (int j = 0; j<a.length; j++) {
			for (int i = 0; i<a.length; i ++) {
		
				if (a[j][i] != b[j][i]) {
					lik = false;
				}
				
				
			}
		}
		return lik;
		
		
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int [][] nyMatrise = new int [matrise.length][matrise[0].length];
	
		for (int j = 0; j<matrise.length; j++) {
			for (int i = 0; i<matrise.length; i ++) {
				
				nyMatrise[j][i] = matrise[i][j];
				
			}
		
		}
		
		return nyMatrise;
		
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		
            int [][] nyMatrise = new int[a[0].length][b.length];
            for (int radNy = 0; radNy < nyMatrise.length ; radNy ++) {
                for (int kolonneNy = 0; kolonneNy < nyMatrise[radNy].length ; kolonneNy ++) {
                    for (int i = 0; i < a.length; i++) {
                        nyMatrise[radNy][kolonneNy] += a[radNy][i] * b[i][kolonneNy];
                    }
                }
            }
            return nyMatrise;
	
	}
}
