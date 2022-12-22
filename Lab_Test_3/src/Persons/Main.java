package Persons;

public class Main {

	public static void main(String[] args) {
		String[] str= {"math","eng"};
		Student st= new Student("Atul",22,7270029,30,str);
		System.out.println(st);

		String[] str1= {"sci","phy"};
		Student st1= new Student("aman",29,72742479,31,str1);
		System.out.println(st1);

	}

}
