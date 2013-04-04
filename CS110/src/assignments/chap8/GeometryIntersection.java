package assignments.chap8;

public class GeometryIntersection {
	public double x1 = 0;
	public double x2 = 0;
	public double x3 = 0;
	public double x4 = 0;
	public double y1 = 0;
	public double y2 = 0;
	public double y3 = 0;
	public double y4 = 0;
	
	public GeometryIntersection(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.x4 = x4;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		this.y4 = y4;

	}
	
	public double getx1() {
		return x1;
	}
	
	public void setx1(double x1) {
		this.x1 = (x1 >= 0) ? x1 : 0;
	}
	
	public double getx2() {
		return x2;
	}
	
	public void setx2(double x2) {
		this.x2 = (x2 >= 0) ? x2 : 0;
	}
	
	public double getx3() {
		return x3;
	}
	
	public void setx3(double x3) {
		this.x3 = (x3 >= 0) ? x3 : 0;
	}
	
	public double getx4() {
		return x4;
	}
	
	public void setx4(double x4) {
		this.x4 = (x4 >= 0) ? x4 : 0;
	}
	
	public double gety1() {
		return y1;
	}
	
	public void sety1(double y1) {
		this.y1 = (y1 >= 0) ? y1 : 0;
	}
	
	public double gety2() {
		return y2;
	}
	
	public void sety2(double y2) {
		this.y2 = (y2 >= 0) ? y2 : 0;
	}
	
	public double gety3() {
		return y3;
	}
	
	public void sety3(double y3) {
		this.y3 = (y3 >= 0) ? y3 : 0;
	}
	
	public double gety4() {
		return y4;
	}
	
	public void sety4(double y4) {
		this.y4 = (y4 >= 0) ? y4 : 0;
	}
	
	public boolean isSolvable() {
		boolean solvable = true;
		if (((y2 - y1)/(x2 - x1)) == ((y4 - y3)/(x4 - x3))) {
			solvable = false;
		}
		return solvable;
	}
	
	public void findPoint() {
		if (isSolvable() == true) {
			double m1 = (y2 - y1)/(x2 - x1);
			double m2 = (y4 - y3)/(x4 - x3);
			double b1 = y1 - (x1*m1);
			double b2 = y3 - (x3*m2);
			double xi = ((b2 - b1)/(m1 - m2));
			double yi = m1 * xi + b1;
			System.out.println("The intersection point is (" + xi + "," + yi + ")");
		}
	}
}
