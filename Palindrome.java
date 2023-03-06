import java.util.Scanner;
class  Palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTE A STRING");
		String s=sc.nextLine();
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
		System.out.println(rev);
		if(s.equals(rev))
			System.out.println("PALINDROME");

		
		
	}
}
