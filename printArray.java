import java.utill.Scanner;
class Demo
{


	public static void main(String[] args) {
// 		System.out.println("Hello World");
 	
int size,i;
Scanner r=new Scanner(System.in);
System.out.print("enter size of array");

size =r.nextInt();
int a[]=new int [size];

for( i=0;i<size;i++){
    a[i]=r.nextInt();
    
}
System.out.print("printed array element");

for( i=0;i<size;i++){
    System.out.print(a[i]);
}


}
	
	
	
}
