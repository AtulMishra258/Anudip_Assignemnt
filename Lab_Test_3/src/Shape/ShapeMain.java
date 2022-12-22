package Shape;

public class ShapeMain {

	public static void main(String[] args) {
//	  This Line create instance of Square class & next line call area function
		Square sq= new Square(10);
		System.out.println(sq.area());

		Rectangle rec= new Rectangle(10,11);
		System.out.println(rec.area());
	}

}
