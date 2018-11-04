package homework2;

public class Circle extends Shape{
	public double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return (radius * radius * Math.PI);
	}
	
	public double getPerimeter() {
		return (radius * 2 * Math.PI);
	}
}
