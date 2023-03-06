class Immutable_String
{
	public static void main(String[] args) 
	{
		String str=new String("csr");
		System.out.println("before changes");
		System.out.println(str);
		System.out.println("after changes");
		System.out.println(str.concat("c")); /* str.concat("c") is a dereferred string object and 
		finalize method from object class will come and remove from memory */
	}
}
