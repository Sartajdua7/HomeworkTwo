package homework2;

public class Square extends Shape{
	double sideLength;
	public Square(double sideLength) {
		this.sideLength = sideLength;
	}
	
	public double getArea() {
		return sideLength * sideLength;
	}
	
	public double getPerimeter() {
		return sideLength * 4;
	}
}
