class Rhom{
	public static void main(String[] args){
		int space=3,star=-1;
		for(int i=1;i<=5;i++){
		if(i<=3){
star=star+2;
space=space-1;
		}
		else{
star=star-2;
space=space+1;
		}
for(int j=1;j<=space;j++){
System.out.print(" ");
}
for(int k=1;k<=star;k++){
System.out.print("*");
}
System.out.println();
		}
	}
}

/*
  *
 ***
*****
 ***
  *
*/

