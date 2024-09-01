package level2;
import java.util.*;

class ReverseTheArray{
	Scanner nd=new Scanner(System.in);
	void Reverse(int[] nums) {		
		System.out.println("Original");
		for(int i=0;i<nums.length;i++) {
			int n=nd.nextInt();
			//System.out.print(nums[i]+" ");
		}
		System.out.println("Reverse");
		
		for(int i=nums.length-1;i>=0;i--) {
			System.out.print(nums[i]+" ");
		}
		
	}	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Total values..");
	int nums=sc.nextInt();	
	int[] arr=new int[nums];
	ReverseTheArray obj=new ReverseTheArray();
	obj.Reverse(arr);
	
	
}
} 
