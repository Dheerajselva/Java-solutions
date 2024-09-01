package array_level_2;
import java.util.*;
public class AlternativeArray {
	static void Alter(int[] nums) {
		int i;
		for(i=0;i<nums.length/2;i++) {
			System.out.print(nums[i]+" "+nums[nums.length-1-i]+" ");
		}
		if(nums.length%2 !=0) {
			System.out.println(nums[nums.length/2]);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total Numbers of Length");
		int n=sc.nextInt();
		int [] arr= new int[n];
		System.out.println("Now enter the Values");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		AlternativeArray.Alter(arr);

	}

}
