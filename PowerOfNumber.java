package numbers;

public class PowerOfNumber {
public static void main(String[] args) {
	int n=10;
	int p=2;
	int res=1;
	
	for(int i=1;i<=p;i++) {
		res=res*n;
	}System.out.println(res);
	System.out.println(Math.sqrt(res));
}
}
