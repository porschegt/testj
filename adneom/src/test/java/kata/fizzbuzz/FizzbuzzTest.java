package kata.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzbuzzTest {
	
	@Test
	public void RetourneNombreSiUN() {
		assertEquals(Fizzbuzz.resultatPour(1), "1");
	}
	
	@Test
	public void RetourneNombreSiDeux() {
		assertEquals(Fizzbuzz.resultatPour(2), "2");
	}
	
	@Test
	public void RetourneFizzSiTrois() {
		assertEquals(Fizzbuzz.resultatPour(3), "fizz");
	}

	@Test
	public void RetourneFizzSiSix() {
		assertEquals(Fizzbuzz.resultatPour(6), "fizz");
	}
	
	@Test
	public void RetourneFizzSiCinq() {
		assertEquals(Fizzbuzz.resultatPour(5), "buzz");
	}
	
	@Test
	public void RetourneFizzSiDix() {
		assertEquals(Fizzbuzz.resultatPour(10), "buzz");
	}
	
	@Test
	public void RetourneFizzBuzzSiQuinze() {
		assertEquals(Fizzbuzz.resultatPour(15), "fizzbuzz");
	}
	
	@Test
	public void RetourneFizzBuzzSiTrente() {
		assertEquals(Fizzbuzz.resultatPour(30), "fizzbuzz");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void RetourneExceptionSiZero() {
		Fizzbuzz.resultatPour(0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void RetourneExceptionSiNegative() {
		Fizzbuzz.resultatPour(-1);
	}
	
	
}
