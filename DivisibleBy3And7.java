import java.util.Scanner;
class DivisibleBy3And7 
{
	public static void main(String[] args) 
	{
		int m,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER  STARTING RANGE : ");
		m=sc.nextInt();
		System.out.println("ENTER  ENDING RANGE : ");
		n=sc.nextInt();
		if((m>=21&&m<n)&&(n-m)>20)
		{
			for(int i=m+1;i<n;i++)
			{
				if((i%3==0)&&(i%7==0))
					System.out.println("DIVISIBLE BY 3 AD 7 "+i );
			}
		}
		else
		
		{
			System.out.println("TRY AGAIN ");
	
		}

	}
}
