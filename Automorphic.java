//A number is containing in the last digit of the square of its is called automorphic
class Automorphic 
{
	public static void main(String[] args) 
	{
		int num=10,square,k=0,temp=num;
			square=num*num;
			while(num!=0)
		{
			if(num%10==square%10)
			{
				k=1;
			}
			else
			{
				k=0;
			}
			num=num/10;
			square=square/10;
		}
		if(k==1)
	
		System.out.println("Automorphic");
		else
			System.out.println("not automorphic");
	}
}
