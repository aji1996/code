public class Greatest {
public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int c=Integer.parseInt(args[2]);
	if(a>b&&a>c)
	{
		System.out.println(" A is big ");
	}
	else if(b>c)
	{
		System.out.println(" B is big ");
	}
	else
	{
		System.out.println(" C is big ");
	}

}
}
