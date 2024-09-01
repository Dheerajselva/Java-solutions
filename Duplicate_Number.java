package level2;
import java.util.*;
public class DuplicateNumber {
	
	void Duplicate(int nums[])
	{
		Scanner nd=new Scanner(System.in);
		
		System.out.println("The Repeated are:");

		for(int i=0;i<nums.length;i++)
			{
			
				for(int j=i+1;j<nums.length;j++)
				{
					
					if(nums[i] == nums[j])
	
						System.out.println(nums[i]+" ");
					
				}
			}
	}
public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
	//System.out.println("Enter Values");
	//int nums=sc.nextInt();
	//int[] arr=new int[nums];
	int[] arr=new int[] {2,3,2,4,5,3};
	DuplicateNumber obj=new DuplicateNumber();
	obj.Duplicate(arr);
}
}
