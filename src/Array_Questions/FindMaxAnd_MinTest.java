package Array_Questions;

import java.util.Scanner;

//public class FindMaxAnd_MinTest {
//
//	public static void main(String[] args) {
//		
//		int[] arr = {10,85,12,16,89,86,102,1045};
//		int max = arr[0];
//		for(int i= 0; i<arr.length; i++) {
//			if(arr[i]>max) {
//				max = arr[i];
//			}
//		}
//		System.out.println("Maximum Number of the array: " + max);
//	}
//}

//public class FindMaxAnd_MinTest {
//
//	public static void main(String[] args) {
//		
//		int[] arr = {10,85,12,16,89,86,102,1045};
//		int min = arr[0];
//		for(int i= 0; i<arr.length; i++) {
//			if(arr[i]<min) {
//				min = arr[i];
//			}
//		}
//		System.out.println("Maximum Number of the array: " + min);
//	}
//}

//public class FindMaxAnd_MinTest {
//
//	static int findFirstMax(int[] arr) {
//		int mx = Integer.MIN_VALUE;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] > mx) {
//				mx = arr[i];
//			}
//		}
//		return mx;
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Array of size");
//		int n = sc.nextInt();
//
//		int[] arr = new int[n];
//		System.out.println("Enter " + n + "elements");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		System.out.println("First maximun elements is: "+ findFirstMax(arr));
//	}
//}



public class FindMaxAnd_MinTest {

	static int findFirstMin(int[] arr) {
		int mx = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]< mx) {
				mx = arr[i];
			}
		}
		return mx;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array of size");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter " + n + "elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("First maximun elements is: "+ findFirstMin(arr));
	}
}
