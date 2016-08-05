import java.util.ArrayList;

public class Problem003 {
	
	
	public static ArrayList<Integer> getPrimeFactors(double input){
		ArrayList<Integer> primeFactors = new ArrayList<Integer	>();
		
		while(input % 2 == 0){
			primeFactors.add(2);
			input = input/2; 
		}
		
		for(int i = 3; i <= Math.sqrt(input); i = i + 2){
			while(input % i == 0){
				primeFactors.add(i);
				input = input/i;
			}
		}
		
		if (input > 2)
			primeFactors.add((int)input);
		
		return primeFactors;
	}
	
	public static void main(String[] arg0){
		
		double input = 600851475143d;
		ArrayList<Integer> primeFactors = Problem003.getPrimeFactors(input);
		System.out.print(primeFactors.get(primeFactors.size() - 1));
		
	}
	

}
