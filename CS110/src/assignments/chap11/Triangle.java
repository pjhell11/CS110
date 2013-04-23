package assignments.chap11;

public class Triangle extends GeometricObject {
	double side1;
	double side2;
	double side3;
	
	public Triangle() {
		this.side1 = 1;
		this.side2 = 1;
		this.side3 = 1;
	}
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1() {
		return this.side1;
	}
	
	public double getSide2() {
		return this.side2;
	}
	
	public double getSide3() {
		return this.side3;
	}
	 
	public double getArea() {
		double p = ((this.side1 + this.side2 + this.side3) * .5);
		double areaSquared = (p * (p - this.side1) * (p - this.side2) * (p - this.side3));
		double area = Math.sqrt(areaSquared);
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = this.side1 + this.side2 + this.side3;
		return perimeter;
	}
	
	public String toString() {
		return "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3;
	}
	
}