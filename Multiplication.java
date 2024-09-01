package array_level_2;
import java.util.*;

public class Multiplication {
	void Multi(int[][]arr1,int [][]arr2) {
		int c[][]=arr1;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				for(int k=0;k<arr1.length;k++) {
					c[i][j]=c[i][j]+(arr1[i][k]*arr2[k][j]);
				}
				System.out.print(c[i][j]+" ");
				}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of row in First matrix");
		int row1=sc.nextInt();
		System.out.println("Enter the number of column in First matrix");
		int col1=sc.nextInt();
		System.out.println("Enter the number of row in Second matrix");
		int row2=sc.nextInt();
		System.out.println("Enter the number of column in Second matrix");
		int col2=sc.nextInt();
		
		int arr1[][]=new int[row1][col1];
		int[][] arr2=new int[row2][col2];
		int[][] c=new int[row1][col1];
		
		System.out.println("Enter matrix 1 element");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				System.out.println("Element for"+i+","+j+" ");
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter matrix 2 element");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				System.out.println("Element for"+i+","+j+" ");
				arr2[i][j]=sc.nextInt();
			}
		}
		Multiplication obj=new Multiplication();
		obj.Multi(arr1, arr2);
		
		
		

	}

}
