class LArrow{
	public static void main(String[] args){
		int star=0,space=4;
		for(int i=1;i<=7;i++){
		if(i<=4){
			space--;
			star++;
		}
			else{
				star--;
				space++;
			}
for(int j=1;j<=space;j++){
System.out.print(" ");
}
for(int j=1;j<=star;j++){
System.out.print("*");
}
for(int j=1;j<=4;j++){
if(i>=3&&i<=5)
System.out.print("*");
}
System.out.println();


		}


	}
}

*/ output
   *
  **
 *******
********
 *******
  **
   *
*/