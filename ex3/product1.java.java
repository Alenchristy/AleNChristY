//Returning information of product with lowest price

import java.util.*;
class product
{
int pcode;
String pname;
int price;
     void setdata(int a,int b, String c) //to initialise values
      {
        pcode=a;
        pname=c;
        price=b;
       
      }

public static void main(String args[])
{

             int a1,a2,a3;
            int b1,b2,b3;
            String c1,c2,c3;

		//declaring  objects
            p1 obj1=new p1(); 
            p1 obj2=new p1();
            p1 obj3=new p1();
      

            System.out.print("Enter person 1 "+" pcode,pname,price: ");
              a1=s.nextInt();
              c1=s.next();
              b1=s.nextInt();
             obj1.setdata(a1,b1,c1); //invoking setdata

           
            System.out.print("Enter person 2 "+" pcode,pname,price: ");
              a2=s.nextInt();
              c2=s.next();
              b2=s.nextInt();
              obj2.setdata(a2,b2,c2);

          
            System.out.print("Enter person 3 "+" pcode,pname,price: ");
             a3=s.nextInt();
              c3=s.next();
               b3=s.nextInt();
             obj3.setdata(a3,b3,c3);
            
//comparing and finding the lowest  
if(obj1.price<obj2.price && obj1.price<obj3.price)  
  System.out.println("\n Product code= " +obj1.pcode+" , Product name="+obj1.pname+" , price="+obj1.price); 

if(obj2.price<obj1.price && obj2.price<obj3.price)  
  System.out.println("\n Product code= " +obj2.pcode+" , Product name="+obj2.pname+" , price="+obj2.price);

if(obj3.price<obj1.price && obj3.price<obj2.price)  
  System.out.println("\n Product code= " +obj3.pcode+" , Product name= "+obj3.pname+ " , price="+obj3.price);            
             
}
}

	/*
	OUTPUT
	______
	Enter person 1  pcode,pname,price: 1 soap 50
	Enter person 2  pcode,pname,price: 2 paste 40
	Enter person 3  pcode,pname,price: 3 brush 15
	Product code= 3 , Product name=brush , price=15
	*/
