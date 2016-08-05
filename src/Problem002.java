import java.util.HashMap;

public class Problem002 {

	public static HashMap<Integer,Long> hash = new HashMap<Integer,Long>();
	
	public static long doFib(int input){
		
		if(input == 0 || input == 1) return 1L;
		if(hash.containsKey(input)) return hash.get(input);
		long fib = doFib(input - 1) + doFib(input - 2);
		hash.put(input, fib);
		return fib;

	}
	
	
	
	public static void main(String[] args) {
		long sum = 0;
		long result = 0;
		for(int i = 0; result < 4000000; i++){
			result = Problem002.doFib(i);
			if(result % 2 == 0)
				sum += result;
		}
		
		System.out.println(sum);
	}

}
