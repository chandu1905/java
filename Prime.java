class Prime{
	public static void main(String[] args){
		int num=18,count=0;
			for(int i=2;i<=num/2;i++){
				if(num%i==0){
				count++;
				}
			}
			if (count==0)
			System.out.println(num +"is a prime number");
			else
			System.out.println(num +"is not a prime number");
	}
}
