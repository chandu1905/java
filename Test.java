interface A
{
	public abstract void m1();
} 
interface B extends A
{
	public abstract void m2();
}

class C implements B
{
 public void m1() 
	{
		System.out.println("m1 of A");
	}
	public void m2() 
	{
		System.out.println("m2 of B");
	}
}
class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		C a=new C();
		a.m1();
		a.m2();
	}
}
