//Find area by Method overloading

import java.util.*;
class p11
{

//overloading area method
void area(int a,int b)
{
System.out.println("AREA OF RECTANGLE: "+(a*b));
}
void area(int x)
{
System.out.println("AREA OF SQUARE: "+(x*x));
}

void area(float r,int i,int j)
{
System.out.println("AREA OF CIRCLE: "+(3.14*r*r));
}
 public static void main(String args[]){
            Scanner s=new Scanner(System.in); //Creating Scanner Class Object
            
            p11 obj=new p11(); //creating object
           System.out.println("1.RECTANGLE\n2.SQUARE\n3.CIRCLE\n\nEnter your Choice:  ");
           int ch=s.nextInt();
           int a,b,c,d,rad;
           float ar;

        //for menu driven
          switch(ch)
          {
           case 1:System.out.println("Enter length and breadth: ");
                  a=s.nextInt();
                   b=s.nextInt();
                   obj.area(a,b);//invoking area
                   break;

            case 2:System.out.println("Enter length : ");
                  c=s.nextInt();
                   
                   obj.area(c);//invoking area
                    break;

            case 3:System.out.println("Enter Radius : ");
                  rad=s.nextInt();
                   
                   obj.area(rad,0,0);//invoking area
                    
                   break;
           default:System.out.println("INVALID INPUT! ");
                     break;
           }


}
}

	/*
	OUTPUT
	_____
	1.RECTANGLE
	2.SQUARE
	3.CIRCLE
	Enter your Choice:
	2
	Enter length :
	5
	AREA OF SQUARE: 25


	1.RECTANGLE
	2.SQUARE
	3.CIRCLE
	Enter your Choice:
	3
	Enter Radius :
	3
	AREA OF CIRCLE: 28.259999999999998


	1.RECTANGLE
	2.SQUARE
	3.CIRCLE
	Enter your Choice:
	1
	Enter length and breadth:
	4 5
	AREA OF RECTANGLE: 20
	*/
