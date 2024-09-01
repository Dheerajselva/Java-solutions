package array_level_2;
import java.util.*;
public class AcsendingAndDescendingArray {
	int temp=0;
	void Acsending(int[] nums) {
		System.out.println("Orginal");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println("\nAscending");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	
	}
	void Decsending(int[] nums) {
		System.out.println("Orginal");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]<nums[j]) {
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println("\nDecsending"); 
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Total no of numbers");
		int nums=sc.nextInt();
		int arr[]=new int [nums];
		System.out.println("Now enter the total values");
		for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
				}
		System.out.println("1:For Acesending\n2:For Decsending");
		int cd=sc.nextInt();
		switch(cd) {
		case 1:
			AcsendingAndDescendingArray obj=new AcsendingAndDescendingArray();
			obj.Acsending(arr);
			break;
		case 2:
			AcsendingAndDescendingArray obj1=new AcsendingAndDescendingArray();
			obj1.Decsending(arr);
			break;
		default:
			System.out.println("Invalid");
		}
}
}
