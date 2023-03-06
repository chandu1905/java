import java.util.Scanner;
class  SumOfIntegersInString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				sum=Integer.parseInt(s.charAt(i)+"")+sum;
				
			}

		}
		System.out.println("sum of numbers in given string is : " +sum);
	}
}
