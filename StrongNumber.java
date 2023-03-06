package programming;

import java.util.Scanner;

public class StrongNumber {

	public static int fact(int n)
	{
		
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
		
	}
	public static boolean strong(int n) {
		int temp=n,s=0;
		while(n!=0) {
			int d=n%10;
			s=fact(d)+s;
			n=n/10;
		}
		return temp==s;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		if(strong(n))
		{
			System.out.println("strong");
			
		}
		else
			System.out.println("not strong");
		
		
	}

}
