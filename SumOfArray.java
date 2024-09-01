package array_level_1;
import java.util.*;

public class SumOfArray {
	void AddingTheArray(int[] n) {
		int sum=n[0];
		for(int i=1;i<n.length;i++) {
			sum=sum+n[i];
		}
		System.out.println("TOTAL ARE :"+sum);
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length no of values");
		int no=sc.nextInt();
		int [] arr=new int[no];
		System.out.println("Now Enter Values");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		SumOfArray obj=new SumOfArray();
		obj.AddingTheArray(arr);

	}

}
