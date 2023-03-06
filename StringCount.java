import java.util.Scanner;
class  StringCount
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		int vowel=0,consonant=0,digit=0,alpha=0,spl=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if((ch>='a'&&ch<='z')||(ch>'A'&&ch<'Z'))
			{
				alpha++;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				{
					vowel++;
				}
				else
				{
					consonant++;
				}
			}
				else if (ch>='0'&&ch<='9')
				{
					digit++;
				}
			
			else
				spl++;
		}
		System.out.println("alpha" +alpha);
		System.out.println("digit" +digit);
		System.out.println("vowel" +vowel);
		System.out.println("consonant" +consonant);
		System.out.println("spl" +spl);

	}
}
