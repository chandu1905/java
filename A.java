class B
{
	public  void m1()
	{
		System.out.println("csr");
	}
	public  void m2()
		{
		System.out.println("csr2");
		}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		B a=new B();
		B b=new B();

		a.m1();
		b.m2();
	}
}
