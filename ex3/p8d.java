//Binary Search using biSearch()

import java.util.*;
class p8d{
     public static void main(String args[])
{
            Scanner s=new Scanner(System.in);
            int i,k=0;

            System.out.print("Enter Number of elements: ");
             int n=s.nextInt();
            int arr[]=new int[n]; //declaring array
             System.out.print("Enter the elements in sorted order: ");
            for( i=0;i<n;i++)
            {
              arr[i]=s.nextInt(); //reading values
             }
             System.out.print("Enter the element to search: ");
             int a=s.nextInt();

           int z=Arrays.binarySearch(arr,a); //invoking binarySearch()

           if(z > -1) //implies element found case
            System.out.println("Element Found at Index:  "+z);
          else//not found case
             System.out.println("Element not found! ");            

}
}

	/*
	OUTPUT
	______
	Enter Number of elements: 5
	Enter the elements in sorted order: 1 2 3 4 5 
	Enter the element to search: 5
	The Element Found at Index:  4


	Enter Number of elements: 5
	Enter the elements in sorted order: 1 2 3 4 5
	Enter the element to search: 6
	Element not found!
	*/
