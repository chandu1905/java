class Fibo{
	public static void main(String[] args){
		int i=0,j=1,fi; 
		System.out.println(i);
		System.out.println(j);
		for(int k=2;k<10;k++){
			fi=i+j;
			i=j;
			j=fi;
			System.out.println(fi);
			}
	}
}