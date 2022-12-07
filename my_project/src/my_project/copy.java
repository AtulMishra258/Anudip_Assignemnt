package my_project;

import java.util.Arrays;

public class copy {
	public static void main(String[] args) {
	
	
	int[] arr = {1,2,3,4};
	int[] arr2 = new int[arr.length];
	copy(arr,arr2);
	System.out.println(Arrays.toString(arr2));

	}
	static void copy(int[] arr,int[] arr2){
//        for (int i = 0; i < arr.length; i++) {
//        	int x = arr[i];
//            arr2[i] = x;
		
		for(int i : arr) {
			arr2[i] = i;
    }
	
}
}
	
	

