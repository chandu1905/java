import java.util.Scanner;
class  ReverseOrder_Words
{
	public static String reverse(String s)
	{
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
		return rev;
	}


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String a=sc.nextLine();
		String[] s1=a.split(" ");
		String rev="";
		for(int i=0;i<a.length();i++)
		{
			rev=reverse(s1[i])+""+rev;
		}
		System.out.println(rev.trim());

	}
}
