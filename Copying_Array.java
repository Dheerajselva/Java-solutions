package level2;


import java.util.Scanner;

class CopyingArray

{
	public static void main (String []args) {
		{
	Scanner scan = new Scanner (System.in);
	
	System.out.println ("Enter");
	int n= scan.nextInt () ;

	int[] arr1 = new int[n];
	int[] arr2 = new int[arr1.length];
	
	
	System.out.println("Enter the original array");
	for (int i = 0;i<arr1.length; i++)
	{
	arr1[i] = scan.nextInt ();
	arr2[i] = arr1[i];
	}
	System.out.println("the new array");
	for(int i = 0; i <arr1.length; i++) 
	{
	System.out.print(arr2[i]+" ");
	}
		}
	}
}
