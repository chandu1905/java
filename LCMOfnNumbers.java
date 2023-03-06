package programming;

import java.util.Scanner;

public class LCMOfnNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		// TODO Auto-generated method stub
		
		int a[]= new int[size];
		System.out.println("enter values of array");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
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
	}

}
