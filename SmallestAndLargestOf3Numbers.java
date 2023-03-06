//15,16 WAP TO PRINT LARGEST,SMALLST OF 3 NUMBERS
import java.util.Scanner;
class SmallestAndLargestOf3Numbers
{
	public static void main(String[] args) 
	{
	int i,j,k;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 1st number");
			i=sc.nextInt();
			System.out.println("enter 2nd number");
			j=sc.nextInt();
			System.out.println("enter 3rd number");
			k=sc.nextInt();
		int l = (i>j) ? i : j;
		int m =(l>k) ? l:k;
		 	System.out.println(m+" is the largest of "+i+","+j+","+k);	
	}
}