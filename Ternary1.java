//largets of 3 numbers
class Ternary1 {
	public static void main(String[] args) {
	int i=10;
	int j=20;
	int k=5;
int l = (i>j) ? i : j;
int m =(l>k) ? l:k;
int n=(i>j)?((i>k)?i:k):((j>k)?j:k);
 	System.out.println(m);
System.out.println(n);	
}
}