public class Fibo {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int c=0;
	int n=5;
	for(int i=2;i<n;i++){
		c=a+b;
		a=b;
		b=c;
}
	System.out.println("The fibonaci series is "+c);
}
}
