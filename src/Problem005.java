import java.util.ArrayList;

public class Problem005 {

	public static int counter(ArrayList<Integer> list, int val){
		int ret = 0;
		for(Integer i : list){
			if(i.compareTo(val) == 0)
				ret ++;
		}
		return ret;
	}
	
	public static void addXTimes(ArrayList<Integer> list, int val, int qtd){
		for(int i = 0; i < qtd; i++){
			list.add(val);
		}
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> set = new ArrayList<Integer>();
		for(int i = 2; i <= 10; i++){
			ArrayList<Integer> primesFactor = Problem003.getPrimeFactors(i);
			int last = 0;
			for(int j = 0; j < primesFactor.size(); j ++){
				if(last != primesFactor.get(j)){
					last = primesFactor.get(j);
					
					int qtdA = counter(set,last);
					int qtdB = counter(primesFactor,last);
					if(qtdB - qtdA > 0)
						Problem005.addXTimes(set, last, qtdB - qtdA);
				}
			}
		}
		int result = 1;
		for(Integer i : set)
			result *= i;
		System.out.println(result);
	}
}
