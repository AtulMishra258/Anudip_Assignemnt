package my_project;

import java.util.Arrays;

public class HelloWorld {

	public static void main(String[] args) {
//		System.out.println("Hello");
//		
//		int[] arr = {1,2,3,4,5};
//		int sum = 0;
//        for(int i = 0;i<arr.length;i++) {
//        	sum+=arr[i];
//        }
//        sum = sum/arr.length;
//        System.out.println(sum);
        
        
        String[] first = {"Tushar","Ujjwal","Yash"};
        String[] second = {"Sharma","Pandey","shukla"};
        
        
        for (int i = 0; i < first.length && i<second.length; i++) {
            System.out.println(first[i] +" "+ second[i]);
       }
        int[] arr = {1,2,3,4,5};
        System.out.println(sum(arr));

	}

	 static int sum(int[] arr) {
	    int sum = 0;
	    for(int i = 0;i<arr.length;i++) {
	    	sum+=arr[i];
	    }
	    return sum;
	}
	

}
