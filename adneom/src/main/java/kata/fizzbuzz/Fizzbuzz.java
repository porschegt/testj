package kata.fizzbuzz;

public class Fizzbuzz {
	
	public static String resultatPour(int nombre) {
		
		if(nombre<=0) {
			throw new IllegalArgumentException("nomber inférieur a 1");
		}
		
		if (estMultipledeQuinze(nombre)) {
			return "fizzbuzz";
		}else if (estMultipledeTrois(nombre)) {
			return "fizz";
		}else if (estMultipledeCinq(nombre)) {
			return "buzz";
		}else {
			return String.valueOf(nombre);	
		}
	}

	private static boolean estMultipledeQuinze(int nombre) {
		return nombre%15==0;
	}

	private static boolean estMultipledeTrois(int nombre) {
		return nombre%3==0;
	}

	private static boolean estMultipledeCinq(int nombre) {
		return nombre%5==0;
	}

}
