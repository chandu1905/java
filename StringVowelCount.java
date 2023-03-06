import java.util.Scanner;
class StringVowelCount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		int vcount=0,ccount=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				{
					vcount++;
				}
			else
			{
				ccount++;
			}
		}
		System.out.println("no. of vowels = "+vcount);
		System.out.println("no. of consonants = "+ccount);
	}
}
