import java.util.Scanner;
class Radius 
{
	Scanner sc=new Scanner(System.in);
	public  void m1(int d)
	{
		System.out.println("enter diameter");
		d=sc.nextInt();
		int r=d/2;
		System.out.println(r);
	}
	public static void main(String[] args) 
	{
		new Radius().m1(10);
		System.out.println("Hello World!");
	}
}
