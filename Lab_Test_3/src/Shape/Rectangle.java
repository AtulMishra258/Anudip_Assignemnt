package Shape;

public class Rectangle extends Square{
	int width;
//	Constructor of this class "Rectangle"
	public Rectangle(int length,int width) {
//		This Line call constructor of parent class
		super(length);
		
		this.width = width;
	}
//	Main method is over ride and it will return this function call only
	@Override
	public int area() {
		return length*width;
	}
}
