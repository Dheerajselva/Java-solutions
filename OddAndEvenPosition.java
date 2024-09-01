package level2;
 import java.util.*;
 class EvenPosition {
	void Even(int[] nums) {
		System.out.println("Even Position are:");
		for(int i=1;i<nums.length;i=i+2) {			
			System.out.println(nums[i]+" ");
		}
	}
 }
class OddPosition{
	void Odd(int[] nums) {
		System.out.println("Odd Position are:");
		for(int i=0;i<nums.length;i=i+2) {
			System.out.println(nums[i]);
		}
	}
}
	
public class OddAndEvenPosition{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers..");
		int nums=sc.nextInt();
	    int[] arr=new int[nums];
		//int[] arr=new int[] {1,2,3,4,5};
	    for(int i=1;i<nums;i=i+2) {
			arr[i]=sc.nextInt();
		}
	    for(int i=0;i<nums;i=i+2) {
	    	arr[i]=sc.nextInt();
	    }
		Scanner nd=new Scanner(System.in);
		System.out.println("Select ypou Position Type:\n");
		System.out.println("1:EvenPosition \n2:OddPosition");
		int ele=nd.nextInt();			
		switch(ele) {
	    case 1:
	    	EvenPosition obj1=new EvenPosition();
	    	obj1.Even(arr);
	    	break;
	    case 2:
	    	OddPosition obj2=new OddPosition();
	    	obj2.Odd(arr);	
	    	break;
	    default :
	    	System.out.println("Invalid");
		}

}
 
}
  
