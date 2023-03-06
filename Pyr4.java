class Pyr4{
	public static void main(String[] args){
	int star=7,space=-1;
	for(int i=1;i<=3;i++){
	star=star-2;
	space++;
	for(int j=1;j<=space;j++){
		System.out.print(" ");
	}
	for(int j=1;j<=star;j++){
	System.out.print("*");
	}
System.out.println();
	}
	}
}

/* 
output

*****
 ***
  *

*/