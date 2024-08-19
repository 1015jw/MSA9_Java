package Day07.Ex01_Shape;

public class Circle extends Shape {

	double radius;		// 반지름
	
	
	public Circle() {
		this(0);
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	double round() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}

	public double getRaidus() {
		return radius;
	}

	public void setRaidus(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
