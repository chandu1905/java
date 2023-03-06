class Mo
{
	public static void add(byte a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void add(int a,int b)//(formal arguement)
	{
		System.out.println(a+b);
	}
	public static void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void add(int a,double b)
	{
		System.out.println(a+b);
	}
	public static void add(double a,double b)
	{
		System.out.println(a+b);
	}
	
public static void main(String[] args)
	{
		add(10.0,10); //(actual arguement)
	}
}
