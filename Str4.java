import java.util.Scanner;
class Str4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s;
		char ch;
		System.out.println("enter a string");
		s=sc.nextLine();
		System.out.println("enter a character");
		ch=sc.next().charAt(0);
		if(s.contains(ch+""))
			{
			int i=s.indexOf(ch);
				System.out.println(i);
				if(s.length() >=i+5)
					System.out.println(s.substring(i,i+5));
				else
					System.out.println("5 characters are not present");
			}
			else{
				System.out.println("given character is not present in string");
			}


			



	}
}
