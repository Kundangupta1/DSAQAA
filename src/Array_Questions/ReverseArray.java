package Array_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//public class ReverseArray {
//
//	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
//		System.out.println("Original Arrays is:");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//
//		System.out.println("Reverse Array is:");
//		for (int i = arr.length - 1; i >= 0; i--) {
//			System.out.print(arr[i] + " ");
//		}
//	}
//}


//using array
//public class ReverseArray {
//
//	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 4, 5 };
//		int[] reversedArr = new int[arr.length];
//
//		for (int i = 0; i < arr.length; i++) {
//			reversedArr[i] = arr[arr.length - 1 - i];
//		}
//
//		System.out.println(Arrays.toString(reversedArr)); // Output: [5, 4, 3, 2, 1]
//
//	}
//}

//using collection
//public class ReverseArray {
//
//	public static void main(String[] args) {
//		Integer[] arr = {1, 2, 3, 4, 5};
//		List<Integer> list = Arrays.asList(arr);
//		Collections.reverse(list);
//
//		// Convert the list back to an array
//		Integer[] reversedArr = list.toArray(new Integer[arr.length]);
//
//		// Print the reversed array
//		System.out.println(Arrays.toString(reversedArr)); // Output: [5, 4, 3, 2, 1]
//
//	}
//
//}



//using StringBuilder class
//public class ReverseArray{
//	public static void main(String[] args) {
//
//		int[] arr = {1, 2, 3, 4, 5};
//		StringBuilder sb = new StringBuilder();
//
//		for (int i = arr.length - 1; i >= 0; i--) {
//		    sb.append(arr[i]);
//		}
//
//		String reversedString = sb.toString();
//
//		// Convert the reversed string back to an array
//		int[] reversedArr = new int[arr.length];
//
//		for (int i = 0; i < reversedString.length(); i++) {
//		    reversedArr[i] = Character.getNumericValue(reversedString.charAt(i));
//		}
//
//		// Print the reversed array
//		System.out.println(Arrays.toString(reversedArr)); // Output: [5, 4, 3, 2, 1]
//
//
//	}
//}


