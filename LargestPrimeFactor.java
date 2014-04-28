package melisProjectEuler;

import java.util.ArrayList;
import java.util.List;

/*
 * Question 3:
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class LargestPrimeFactor {

	private static long NUMBER = 600851475143L;
	private static List<Integer> primes = new ArrayList<Integer>();

	private static void findPrimes() {

		for (int div = 2; div <= NUMBER; div++) {
			if (NUMBER % div == 0) {
				primes.add(div);
				NUMBER = NUMBER / div;
			}
		}
	}
	
	public static void result (){
		findPrimes();
		System.out.println("Max prime: "+primes.get(primes.size()-1));
		System.out.println("total number of primes: "+primes.size());
	}
}
