class Printstr{
public static void main(String [] args){
int star=0,space=5;
int i,j,k;
for(i=1;i<=5;i++){
space--;
star++;
for(j=1;j<=space;j++){
System.out.print(" ");
}
for(k=1;k<=star;k++){
System.out.print("*");
}
System.out.println();
}
}
}