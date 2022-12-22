package Shape;

public class Square implements Shape{
	int length;
//	Constructor of this class
	Square(int length){
		this.length = length;
	}
//  Area function over ride
	@Override
	public int area() {
		return length*length;
	}

}
