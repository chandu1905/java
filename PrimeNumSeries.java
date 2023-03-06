// 11. WAP T0 COUNT PRIME NUMBERS BETWEEN m TO n
import java.util.Scanner;
class PrimeNumSeries
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int m,n,count,pcount=0;
		System.out.println("Enter starting range m ");
		m=sc.nextInt();
		System.out.println("Enter ending range n ");
		n=sc.nextInt();
		if((m>1)&&(m<n))
		{          // m=10 n=5
			System.out.println("The prime numbers from " + m + " to "+ n + " are");
			for(int num=m;num<=n;num++)
			{    
				count=0;
				for(int i=2;i<=num/2;i++)
				{       
				if(num%i==0) 
				count++;	
				}
				if(count==0)
					{
					pcount++;
					System.out.println(num +" is prime number");
					}
			}
			System.out.println("the number of prime numbers bewtween " +m+ " and " +n+ " are : " + pcount);
		}
		else
		{
			System.out.println("Try again ");
		}
	}
}

