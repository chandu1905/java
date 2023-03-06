import java.util.Scanner;
class  Str3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER STRING s1");
		String s1=sc.nextLine();
		System.out.println("ENTER STRING s2 TO CHECK WHETHER IT IS PRESENT IN s1");
		String s2=sc.nextLine();
		if(s1.contains(s2))
			System.out.println("s2 is present in s1");
		System.out.println(s1.indexOf(s2));


	}
}
