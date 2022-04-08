//Linear Search

import java.util.*;

class p8a{
     public static void main(String args[])
{
            Scanner s=new Scanner(System.in);
            int i,k=0;

            System.out.print("\nEnter Number of elements: ");
             int n=s.nextInt();
            int arr[]=new int[n]; //declaring array
             System.out.print("Enter the elements: ");
            for( i=0;i<n;i++)
            {
              arr[i]=s.nextInt(); //reading values
             }
             System.out.print("Enter the element to search: ");
             int a=s.nextInt();          

              for( i=0;i<n;i++)
                {
                  if(a==arr[i]) //comparing
                  {
                   System.out.print("\nITEM FOUND AT INDEX "+i);
                   k=1;//setting flag
                    break;
                   }
          
                }
 		if(k==0)
             {
               System.out.print("\nELEMENT NOT FOUND! ");
              }
             
}
}

	/*
	OUTPUT
	______
	Enter Number of elements: 4
	Enter the elements: 2 4 6 8
	Enter the element to search: 2
	ITEM FOUND AT INDEX 0


	Enter Number of elements: 5
	Enter the elements: 1 2 3 4 5
	Enter the element to search: 10
	ELEMENT NOT FOUND!
	*/
