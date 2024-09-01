package array_level_1;
import java.util.*;

public class LargeAndSmallElement {
	void Large(int[] n) {
		int max=n[0];//first number la erunthu compare pannanum      arr la first 0 tha
		for(int i=1;i<n.length;i++) {//  0 vaa mela assing pannitan athan 1 la eruthu start pannuthan
			if(n[i]>max) {//first number ooda  perusaa eruntha
				max=n[i];//mela ulla int max= laa store aagum
			}
		}
			System.out.println("Maximum is:"+max);
		
	}
	void Small(int[] n) {
		int small=n[0];
		for(int i=1;i<n.length;i++) {
			if(n[i]<small) {
				small=n[i];
			}
		}
			System.out.println("Smallest is:"+small);
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length of Values..");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Now Enter the values");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("1:For Large Number: \n2:For Small Number");
		int no=sc.nextInt();
		switch(no) {
		case 1:
			LargeAndSmallElement obj1=new LargeAndSmallElement();
			obj1.Large(arr);
			break;
		case 2:
			LargeAndSmallElement obj2=new LargeAndSmallElement();
			obj2.Small(arr);
			break;
		default :
			System.out.println("Invalid");
		}

	}

}
