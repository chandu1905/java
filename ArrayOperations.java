package programming;

import java.util.Scanner;

public class ArrayOperations {
	static AOperation a1=new AOperation(); 
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter array size");
	int size=scanner.nextInt();
	int a[]=new int[size];
	for(int i=0;i<size;i++) {
		System.out.println("enter elements"+i+1);
	a[i]=scanner.nextInt();
	}
	while(true) {
	System.out.println("\n1.insert\n2.delete\n3.update\n4.sort\n5.search\n6.reverse\n7.maximum\n8.minimum\n9.display\n10.is empty\n11.exit");
	int option=scanner.nextInt();
	switch(option){
		case 1:{
			System.out.println("enter new element");
			int newelement=scanner.nextInt();
			System.out.println("enter position");
			int pos=scanner.nextInt();
			a=a1.insert(a,newelement,pos);
			a1.display(a);
			break;
		}
		case 2:{
			
		}
		case 11:{
			System.exit(0);
		}	I;
		
	}
	
	}
}
}
