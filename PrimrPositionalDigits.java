package programming;

import java.util.Scanner;

public class PrimrPositionalDigits {

	public static int rev(int n){
		int rev=0;
		while(n!=0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		return rev;
	}
	public static int pDigit(int rev) {
		
		int c=0,num=0,c1=0;
		while(rev!=0) {
			c++;
			for(int i=2;i<=c/2;i++) {
				if(c%i==0) {
					c1++;
					if(c1==0) {
					int d=rev%10;
					num=num*10+d;
					}
				
				}
				rev=rev/10;
			}
		}
		return num;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		System.out.println(rev(n));
		System.out.println(pDigit(rev(n)));

	}

}
