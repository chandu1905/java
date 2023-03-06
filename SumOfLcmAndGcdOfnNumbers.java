package programming;

import java.util.Scanner;

public class SumOfLcmAndGcdOfnNumbers {

	public static int lcm(int a[]){
		int max=a[0],lcm=max,k=2;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		int flag=0;
		while(true)
		{
			for(int i=0;i<a.length;i++)
			{
				if(lcm%a[i]==0) {
					flag=1;
				}
				else {
					flag=0;
				break;
				}
			}
			if(flag==1)
			{
				System.out.println(lcm);
				break;
			}
			else {
				lcm=max*k++;
			}
		}
		return lcm;
		
	}
	public static int gcd(int a[]) {
		int gcd=a[0];
		for(int i=1;i<a.length;i++)
		{
			gcd=gcd(gcd,a[i]);
		}
		return gcd;
	}
	public static int gcd(int a,int b)
	{
		int min=(a>b)?b:a;
		for(int i=min;i>=1;i--) {
			if(a%i==0&&b%i==0)
			{
				return i;
			}
		}
		return 1;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int sum=0;
		System.out.println("enter "+size+" values");
		int[] a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("gcd is "+gcd(a));
		 sum = lcm(a)+gcd(a);
		System.out.println(sum);
	}

}
