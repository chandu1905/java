class Star{
	public static void main(String[] args){


		//5 by 5 star pattern
System.out.println("5 by 5 star pattern");
		for (int x=1;x<=5;x++)
		{ 
			for (int y=1;y<=5;y++)
			{ 
				System.out.print(" * ");//y=1* y=2* y=3* y=4* y=5*
			}
			System.out.println();
		}



 //3 by 3 star pattern
System.out.println("3 by 3 star pattern");
		for (int a=1;a<=3;a++){
			for (int b=1;b<=3;b++){
				System.out.print("*");
				}
			System.out.println();
		}


//3 by  5 star pattern with symbol
System.out.println("3 by 5 star pattern with symbols");
 
		for (int c=1;c<=3;c++){
			for (int d=1;d<=5;d++){
				if((c==2)&&(d==1))
					System.out.print("@");
						else if((c==3)&&(d==5))
						System.out.print("$");
						else if((c==1)&&(d==5))
						System.out.print(">");

				else				
				System.out.print("*");
				}
			System.out.println();
		}




  //diagonal star pattern
System.out.println("diagonal pattern");
		for (int e=1;e<=5;e++){
			for (int f=1;f<=5;f++){
				if(e!=f)
				System.out.print(" ");
				else
				System.out.print("*");
				}
			System.out.println();
		}



  //X star pattern
System.out.println("X pattern");
		for (int g=1;g<=5;g++){
			for (int h=1;h<=5;h++){
				if(g==h||g+h==6)
				System.out.print("*");
				else 
				System.out.print(" ");
			

				}
			System.out.println();

}



//to print star pattern box	
	System.out.println("box pattern");

for(int i=1;i<=5;i++){
		for(int j=1;j<=5;j++){
			if((i==1)||(i==5)||(j==1)||(j==5))
				System.out.print("*");
else
System.out.print(" ");			
}
			System.out.println();
}


// to print star pattern A
System.out.println("A pattern");
		for (int k=1;k<=5;k++){
			for(int l=1;l<=4;l++){
				if((l==1)||(l==4)||(k==1)||(k==3))
				System.out.print("* ");
				
				else
				System.out.print("  ");
			}
		System.out.println();
		}




//to print star pattern Z
System.out.println("Z pattern");
			for(int m=1;m<=4;m++){
				for(int n=1;n<=4;n++){
					if((m==1)||(m==4))
					System.out.print("*");
					else if(((m==2)&&(n==3))||((m==3)&&(n==2)))
					System.out.print("*");
					else 
					System.out.print(" ");
				}
			System.out.println();
			}


//to print reverse diagonal
		for(int r=1;r<=5;r++){
			for(int s=1;s<=5;s++){
			if((r+s)==6)
			System.out.print("*");
			else 
			System.out.print(" ");
			}
		System.out.println();	
		}
		
	

}
}
