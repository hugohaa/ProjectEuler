
public class Problem004 {

	
	public static boolean isPalindrome(long input){
		String s = String.valueOf(input);
	    for (int i = 0, j = s.length() -1; i < j;i++, j--) {
	        if (s.charAt(i) != s.charAt(j)) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		
		long max = 0;
		
		for(int i = 999; i > 0; i--){
			for(int j = i; j > 0; j--){
				if(Problem004.isPalindrome(i*j) && i * j  > max){
					max = i * j;
					break;
				}
			}
		}
		
		System.out.println(max);
	}

}
