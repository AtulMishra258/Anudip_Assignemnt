package stringchange;

import java.util.Scanner;

public class ChangeString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String s1=sc.next();
		System.out.println(changeMethod(s1));
	}
	public static String changeMethod(String str) {
		if(str.length()<=4) {
			return str;
		}
		StringBuilder sb=new StringBuilder(str);
		int j=str.length()-4;
		for(int i=0;i<j;i++) {
			sb.setCharAt(i, 'X');
		}
		return sb.toString();
	}

}
