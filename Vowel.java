import java.util.Scanner;
class Vowel
{
	public static void main(String[] args)
	{
	char ch;//declaration
	Scanner sc=new Scanner(System.in);//scanner object creation
	System.out.println("enter an alphabet");

		
	ch=sc.next().charAt(0);//initialization
	



	if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'||ch =='A'||ch =='E'||ch =='I'||ch =='O'||ch =='U')
	 System.out.println(ch+ " is a vowel");	
	else
	  System.out.println(ch+ " is not a vowel");
	}
}