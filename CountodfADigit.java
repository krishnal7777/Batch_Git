package numbers;

public class CountodfADigit {
	public static void main(String[] args) {
		int n=123444556;
	int count=0;
	int check=4;
	while(n>0) {
		int rem=n%10;
		n=n/10;
		if(rem==check) {
			count++;
		
		
	}
	}
		System.out.println(count);
		
		
		
		
		
	}

}
