package array_level_2;
import java.util.*;

public class PrintPattern {
	static void LeftPattern(int[] nums) {
		int i,j;
		for(i=0;i<nums.length;i++) {
			for(j=0;j<=i;j++) {
 		System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total no.of.Values");
		int n=sc.nextInt();
		int arr[]=new int[n];
		PrintPattern.LeftPattern(arr);
	}

}
