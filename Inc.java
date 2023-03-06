// increment operator
class Inc {
	public static void main(String[] args) {
	int a=10;
	int b=a++ + a++ + ++a + 2 + a++;
	int c=b++ + ++b + a++ + 1;
 	System.out.println(b++);
	System.out.println(b);
System.out.println(c);
	}
}