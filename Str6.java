//input:aaaBBcdd output:a3B2c12
class Str6 {
public static void main(String[] args)
{
	String s="aaaBBcdd";
	String a="",res="";
	for(int i=0;i<s.length();i++)
	{
		if(s.indexOf(s.charAt(i))==-1)
		{
			a=a+s.charAt(i);
		}
	}
	for(int i=0;i<a.length();i++)
	{
		int c=0;
		for(int j=0;j<s.length();j++)
		{
			if (a.charAt(i)==s.charAt(j))
			{
				c++;
			}
		}
		res=res+a.charAt(i)+c;
	}
	System.out.println("result"+res);
}
}
