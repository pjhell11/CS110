package assignments.chap8;

public class RegularPolygon {
	
	private int n = 3;
	
	private double side = 1;
	
	private double x = 0;
	
	private double y = 0;
	
	public RegularPolygon() {
	}
	
	public RegularPolygon(int newN, double newSide) {
		n = newN;
		side = newSide;
	}
	
	public RegularPolygon(int newN, double newSide, double newX, double newY) {
		n = newN;
		side = newSide;
		x = newX;
		y = newY;
	}
	
	public int getN() {
		return n;
	}
	
	public void setN(int newN) {
		n = (newN >= 0) ? newN : 0;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double newSide) {
		side = (newSide >= 0) ? newSide : 0;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double newX) {
		x = (newX >= 0) ? newX : 0;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double newY) {
		y = (newY >= 0) ? newY : 0;
	}
	
	public double getPerimeter() {
		return n * side;
	}
	
	public double getArea() {
		return (n*side*side)/(4*Math.tan(Math.PI/n));
	}

}
