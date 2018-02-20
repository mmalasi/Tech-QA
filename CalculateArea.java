package day3.Assignment;

public class CalculateArea {
	

	public static void main(String[] args) {
		RectArea r1=new RectArea();
		double result=r1.area(10.25, 20.11);
		
		System.out.println("Area of Rectangle is: "+result);
		
		double result1=r1.area(5, 10);
		System.out.println("Area of Triangle is:"+ result1);
		
	}

}
