package programming;

import java.util.Scanner;

public class XylemPhloem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scanner.nextInt();
		int temp=n,mean=0,extreme=0;	
		
		while(temp!=0) {
		if(temp==n||temp<10) {
		extreme=extreme+(temp%10);
		}
		else {
			mean=mean+(temp%10);	
		}
		temp=temp/10;
		}
		if(mean==extreme)
			System.out.println("Xylem");
		else
			System.out.println("Phloem");
	}

}
/* tracing of program
 * temp 1234
n 1234
ed=0				1+4
md=0				2+3
1. ed=ed+4.....temp=123
2. md=md+3.....temp=12
3.md=md+2......temp=1
4. ed=ed+1.....temp=0*/
