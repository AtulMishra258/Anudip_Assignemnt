package lab_test_5;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElement {

	public static void main(String[] args) {
		ArrayList<String> ArrList = new ArrayList<String>();
		 
       
        ArrList.add("Item 1");
        ArrList.add("Item 2");
        ArrList.add("Item 3");
        ArrList.add("Item 4");
        ArrList.add("Item 5");
 

        System.out.println("Before Swap the ArrayList ");
        System.out.println(ArrList);
 
  
        Collections.swap(ArrList, 1, 2);
 
 
        System.out.println("After Swap the ArrayList");
        System.out.println(ArrList);

	}

}
