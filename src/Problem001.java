
public class Problem001 {

	public static void main(String[] args) {
		
		int soma = 0;
		for(int i = 1; i < 1000; i++){
			
			if(i % 3 == 0 && i % 5 == 0)
				soma += i;
			
			else if(i % 3 == 0)
				soma += i;
			else if( i % 5 == 0)
				soma += i;
		}
		
		System.out.println(soma);

	}

}
