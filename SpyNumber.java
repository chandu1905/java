package programming;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner =new Scanner(System.in);
System.out.println("enter the number");
int n=scanner.nextInt();
int temp=n,sum=0,product=1;
while(n!=0) {
	int d=n%10;
	sum=sum+d;
	product=product*d;
	n=n/10;
}
if (sum==product) {
	System.out.println("spy");
}
else
	System.out.println("not spy");
	}

}
