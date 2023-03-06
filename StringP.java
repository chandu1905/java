import java.util.Scanner;
class StringP  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
		char ch=s.charAt(i);
		
		if(ch>='a'&&ch<'z')
			System.out.print(s.charAt(i));
		}
		for(int i=0;i<s.length();i++)
		{
		char ch=s.charAt(i);
		
		if(ch>='A'&&ch<'Z')
			System.out.print(s.charAt(i));
		}
	}
}
