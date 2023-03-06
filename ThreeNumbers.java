import java.util.Scanner;
class  ThreeNumbers
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF a: ");
		a=sc.nextInt();
		System.out.println("ENTER THE VALUE OF b: ");
		b=sc.nextInt();
		System.out.println("ENTER THE VALUE OF c: ");
		c=sc.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("THE SUM OF 3 NUMBERS IS: "+(a+b+c));
		}
		if(b>a&&b>c)
		{
			System.out.println("THE PRODUC OF 3 NUMBERS IS : "+(a*b*c));
		
		}
		if(c>a&&c>b)
		{
			System.out.println("THE SQUARE OF 1st NUMBER IS "+(a*a));
			System.out.println("THE SQUARE OF 2nd NUMBER IS " +(b*b           bv));
			System.out.println("THE SQUARE OF 3rd NUMBER IS "+(c*c));
			
		}




	}
}
