//prime numbers from 100 to 200

class PrimeSeries{
	public static void main(String[] args){
	int count;

	for(int num=100;num<=200;num++){
		count=0;
		for(int i=2;i<=num/2;i++){
			if(num%i==0)
			count++;
		}
	if(count==0)
	System.out.println(num+"prime");
	}
	}
}
