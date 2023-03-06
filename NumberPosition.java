package programming;

import java.util.Scanner;
//SUM OF SQUARES OF ODD POSITIONAL DIGITS IN A NUMBER
public class NumberPosition {

	public static int rev(int n){
		int rev=0;
		while(n!=0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		
		return rev;
		
	}
	 
	public static int sum(int rev) {
		int sum=0,c=0;
		while(rev!=0) {
			c++;
			if(c%2!=0) {
				int d=rev%10;
				sum=sum+(d*d);
				
			}
			rev=rev/10;
		}
		return sum;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		System.out.println("reverse of a number is " +rev(n));
		System.out.println("sum of squares of odd position digits is " +sum(rev(n)));

	}

}
