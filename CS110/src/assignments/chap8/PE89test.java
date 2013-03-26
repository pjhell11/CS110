package assignments.chap8;

public class PE89test {
	
	public static void main(String[] args) {
		 RegularPolygon defaultPolygon = new RegularPolygon();
		 System.out.println("The perimeter of the default polygon is " + defaultPolygon.getPerimeter());
		 System.out.println("and the area is " + defaultPolygon.getArea());
		 System.out.println();
		 
		 RegularPolygon sidesAndLength = new RegularPolygon(6, 4);
		 System.out.println("The perimeter of the second polygon is " + sidesAndLength.getPerimeter());
		 System.out.println("and the area is " + sidesAndLength.getArea());
		 System.out.println();
		 
		 RegularPolygon changeAllValues = new RegularPolygon(10, 4, 5.6, 7.8);
		 System.out.println("The perimeter of the third polygon is " + changeAllValues.getPerimeter());
		 System.out.println("and the area is " + changeAllValues.getArea());
		 
	}

}
