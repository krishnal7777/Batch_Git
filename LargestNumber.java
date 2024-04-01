package numbers;

public class LargestNumber {
public static void main(String[] args) {
	int a=44;
	int b=11;
	int c=23;
	int largest=(a>b? a:b)>c? (a>b? a:b):c;
	System.out.println(largest);
}
}
