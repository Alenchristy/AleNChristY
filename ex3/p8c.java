//Recursive Binary Search

import java.util.*;
class p8c
{
int bisearch(int f,int l,int x,int arr[]) //recursive function
{

if(l>=f)
{
int mid=(f+l)/2;
if(arr[mid]==x) //case of match found
return mid;

if(x>arr[mid])
return bisearch(mid+1,l,x,arr);//case of right side

else
return bisearch(f,mid-1,x,arr);//case of left side
}
return -1;
}
public static void main(String args[])
{
           p8c obj=new p8c();

Scanner s=new Scanner(System.in);
            int i;
 System.out.print("Enter Number of elements: ");
             int n=s.nextInt();
            int arr[]=new int[n];
               
             System.out.print("Enter the elements in sorted order : ");
            for( i=0;i<n;i++)
            {
              arr[i]=s.nextInt();
             }
             System.out.print("Enter the element to search: ");
             int a=s.nextInt();
           
           int k=obj.bisearch(0,n-1,a,arr); //invoking Binary Search

          if(k==-1)
          System.out.print("Element not found! ");
          else
            System.out.print("Element found at Index "+k);
           
           
}

}

	/*
	OUTPUT
	______
	Enter Number of elements: 5
	Enter the elements in sorted order : 1 2 3 4 5 
	Enter the element to search: 2
	Element found at Index 1


	Enter Number of elements: 3
	Enter the elements in sorted order : 1 2 3 
	Enter the element to search: 8
	Element not found!
	*/
