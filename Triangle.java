package homework2;

public class Triangle extends Shape{
	double firstSideLength;
	double secondSideLength;
	double thirdSideLength;
	
	public Triangle(int firstSideLength, int secondSideLength, int thirdSideLength) {
		this.firstSideLength = firstSideLength;
		this.secondSideLength = secondSideLength;
		this.thirdSideLength = thirdSideLength;
	}

	public double getArea() {
		double s = (firstSideLength + secondSideLength + thirdSideLength)/2;
		return Math.sqrt((s * (s - firstSideLength) * (s - secondSideLength) * (s - thirdSideLength)));
	}
	
	public double getPerimeter() {
		return firstSideLength + secondSideLength + thirdSideLength;
	}
}

