package numbers;

public class FabinacoSeries {
	public static void main(String[] args) {
		
	
int f=0,s=1,t,count=2;
int n=10;
System.out.print(f+","+s+",");
for(int i=1;count<n;i++){
	t=f+s;
	System.out.print(t+",");
	f=s;
	s=t;
	count++;
}

}
}