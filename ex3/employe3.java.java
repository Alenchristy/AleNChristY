//Employee Record and Search with employee id

import java.util.*;
class emp
{
int eno,esal;
String ename;
void setdata(int a,String b,int c) //to initialise variables
{
eno=a;
ename=b;
esal=c;
}
}
class p9{
     public static void main(String args[]){
            Scanner s=new Scanner(System.in);
           
            System.out.print("Enter Number of Employees: ");
             int n=s.nextInt();

            emp obj[]=new emp[n]; //declaring an array of objects
          for(int j=0;j<n;j++) //to allocate memory for each objects
             obj[j]=new emp();
             int a,f=0;
             String b;
             int c,i;
            for(i=0;i<n;i++)
            {
             System.out.println("\nEnter Employee number,Employee name,Salary of person : "+(i+1));
             a=s.nextInt();
             b=s.next();
             c=s.nextInt();
             obj[i].setdata(a,b,c); //calling setdata method to initialise
             
             }
         

             System.out.println("\nEnter person id to search: ");
             int id=s.nextInt();          

              for(i=0;i<n;i++)
                {
                  if(id==obj[i].eno) //comparing id's
                  {
                   System.out.println("\nPERSON EXISTS IN THE LIST ");
                    f=1;
                    break;
                   }
          
                }
            if(f==0)
               System.out.println("\nPERSON NOT FOUND!");
}
}

	/*
	OUTPUT
	______
	Enter Number of Employees: 2
	Enter Employee number,Employee name,Salary of person : 1
	1 Majnu 10000
	Enter Employee number,Employee name,Salary of person : 2
	2 Mahesh 15000
	Enter person id to search:
	2
	PERSON EXISTS IN THE LIST


	Enter Number of Employees: 1
	Enter Employee number,Employee name,Salary of person : 1
	1 Rahul 24000
	Enter person id to search:
	6
	PERSON NOT FOUND!
	*/
