class E 
{
	public static void main(String[] args) 
	{
		int i=10,j=0,k=0;
		try{
			k=i/j;
		}
		catch(ArithmeticException a){
			System.out.println("csr");
		}
		finally{
			try{
			System.out.println(k=i/j);
			}
			catch(ArithmeticException a){
				System.out.println("csr1");
			}
		}
		System.out.println("Hello World!");
	}
}
