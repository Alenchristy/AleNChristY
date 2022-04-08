//Sum of Complex Numbers

import java.util.*;
class p10
{
int r;
int i;

p10(int a,int b) //to initialise
{
r=a;
i=b;
}
public static void main(String arg[])
{
int c;
int d;
Scanner s=new Scanner(System.in); //Creating Scanner Class Object


System.out.println("Enter Real and Imaginary Part of First Complex Number: ");

//reading first
int x=s.nextInt();
int y=s.nextInt();

p10 obj1=new p10(x,y); //passing
System.out.println("\nEnter Real and Imaginary Part of Second Complex Number: ");
//reading second
int p=s.nextInt();
int q=s.nextInt();

p10 obj2=new p10(p,q); //passing
c=obj1.r+obj2.r; //adding real part
d=obj1.i+obj2.i; //adding imaginary part

System.out.println("\nSUM OF COMPLEX NUMBERS: "+c+"+i"+d);

}
}

	/*
	OUTPUT
	______
	Enter Real and Imaginary Part of First Complex Number:
	4 5
	Enter Real and Imaginary Part of Second Complex Number:
	6 7
	SUM OF COMPLEX NUMBERS: 10+i12
	*/
