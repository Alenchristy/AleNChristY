//Simple Binary Search

import java.util.*;

class p8b{
     public static void main(String args[])
{
            Scanner s=new Scanner(System.in);
            int i;

            System.out.print("\nEnter Number of elements: ");
            int n=s.nextInt();
            int arr[]=new int[n]; //declaring array
            int k=0;

             System.out.print("Enter the elements in sorted order: ");
            for( i=0;i<n;i++)
            {
              arr[i]=s.nextInt();//reading values
             }
             System.out.print("Enter the element to search: ");
             int a=s.nextInt();

           
             int f=0,l=n-1,mid=(f+l)/2;
            while(f<=l)
             {
              if(a>arr[mid]) //if element is in right of middle
               {
                 f=mid+1;
                 mid=(f+l)/2;
                }
               else if(a<arr[mid]) //if element is in left of middle
              {
                 l=mid-1;
                 mid=(f+l)/2;
                 
               }
             else //case if match found
              {
               System.out.print("\nELEMENT FOUND AT INDEX "+mid);
              k=1;
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
	Enter Number of elements: 5
	Enter the elements in sorted order: 1 2 3 4 5
	Enter the element to search: 5
	ITEM FOUND AT INDEX 4


	Enter Number of elements: 5
	Enter the elements in sorted order: 1 2 3 4 5 
	Enter the element to search: 8
	ELEMENT NOT FOUND!
	*/
