package invalid_email;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Invalid_Email {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
//		To take input as a email of user
		System.out.println("Enter Email plz...");
		String mail=sc.next();
//		In "mail" all the special character input is taken by user
		String regPattern="^[a-zA-Z0-9_+&*-]+(?:\\."+
		"[a-zA-Z0-9_+&*-]+)*@"+
		"(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

		try {
//			If pattern not matches it will throw error message
			if(!Pattern.matches(regPattern, mail)) {
				throw new InvalidEmailException("Invalid Email...");
			}
		}
		catch(InvalidEmailException ex) {
			System.out.println(ex.getMessage());
		}


	}

}
