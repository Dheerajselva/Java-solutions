package array_level_2;
import java.util.*;
public class LowerAndUpperTriangular {
	static void Lower (int[][] arr1) {
		int i,j;
		for(i=0;i<arr1.length;i++) {
			for(j=0;j<arr1.length;j++) {
				if(j>i) {      //i and j loop =1,1||1,2||1,3||2,1||2,2||2,3||3,1||3,2||3,3 -> ethula j persulam "0"
					System.out.print("0 ");
				}
				else {
					System.out.print(arr1[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
	static void Upper(int[][]arr2) {
		int i,j;
		for(i=0;i<arr2.length;i++) {
			for(j=0;j<arr2.length;j++) {
				if(j<i) {
					System.out.print("0 ");
				}
				else {
					System.out.print(arr2[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("*Please Enter the same ORDER for Rows And Columns*\n");
	System.out.println("Enter the no of Rows");
	int rows=sc.nextInt();
	System.out.println("Enter the no of Columns");
	int cols=sc.nextInt();
	int arr[][]=new int [rows][cols];
	int i,j;
	for(i=0;i<arr.length;i++) {
		for(j=0;j<arr.length;j++) {
			System.out.println("Enter the Value for:"+i+","+j);
			arr[i][j]=sc.nextInt();
		}
	}
   System.out.println("Press cap's 'L' for LowerTriangular\nPress cap's 'U' for UpperTriangular");
   char cd=sc.next().charAt(0);
   switch (cd) {
   case 'L':
	   LowerAndUpperTriangular.Lower(arr);
	   break;
   case 'U':
	   LowerAndUpperTriangular.Upper(arr);
	   break;
   default:
	   System.out.println("\nInvaild");
   }
	}

}
