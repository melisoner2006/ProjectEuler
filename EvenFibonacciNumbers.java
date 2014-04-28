package melisProjectEuler;

import java.util.ArrayList;
import java.util.List;

public class EvenFibonacciNumbers {

	/**
	 * @param args
	 */
	static private int DEFAULT_LIMIT = 4000000;
	static private List<Integer> fibNums = new ArrayList<Integer>();
	static private int j = 2, limit = 0, sum = 0;
	
	private static void evenFibonacci(){
		fibNums.add(0,1);
		fibNums.add(1,1);

		while(limit <= DEFAULT_LIMIT){
			limit = get(j);
			fibNums.add(j, limit);
			if(limit%2 == 0) {
				sum += fibNums.get(j);
				}
			j++;
		}	
	}
	static private int get(int i){
		return (fibNums.get(i-1)+fibNums.get(i-2));
	}
	static private void result(int sum, int j){
		System.out.println("sum of evens: " + sum);
		System.out.println("last fibonacci: (index)" + j + ", "+fibNums.get(j-1));
	}
	public static void result(){
		evenFibonacci();
		result(sum, j);	
	}
}
