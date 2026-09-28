package aarayy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[]args) {
		
		int []arr= new int[]{10,20,30,40,50,60,70,80};
		System.out.println(Arrays.toString(arr));
		
		Arrays.fill(arr, 5);
		System.out.println("After Arrays fill " + Arrays.toString(arr));
		
		arr=new int[] {10,20,30,40,50,60,70,80};
		int[] arr1 = new int[] {10,20,30,88,98,67,89,90};
		System.out.println("Array is equal :"+Arrays.equals(arr, arr1));
		
		Arrays.fill(arr, 2, 5,10);
		System.out.println("After Arrays fill " + Arrays.toString(arr));
		
		int[]clonedArr=arr.clone();
		System.out.println("CloneD Array :"+Arrays.toString(clonedArr));
		
		
		Arrays.sort(arr,1,5);
		System.out.println("after partial sort : "+Arrays.toString(arr));
		
	}
}
