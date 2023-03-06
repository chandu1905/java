//13,14.WAP TO PRINT SMALLEST,LARGEST OF 2 NUMBERS
import java.util.Scanner;
class SmallestOfTwoNumbers
	{
	public static void main(String[] args) {
	int i,j;
		Scanner sc=new Scanner(System.in);
	System.out.println("enter 1st number");
	i=sc.nextInt();
	System.out.println("enter 2nd number");
	j=sc.nextInt();
String s = (i>j) ? i+" is greater than " +j : i+" is less than "+j;
 	System.out.println(s);
	}
}
