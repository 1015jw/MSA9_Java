package Day07.Ex01_Shape;

// * 추상 클래스의 추상 메소드는 구현 클래스에서 반드시 오버라이딩 해야 한다.
public class Rectangle extends Shape {

	double width, height;

	
	public Rectangle() {
		this(0.0, 0.0);
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		return width * height;
	}

	@Override
	double round() {
		return (width + height) * 2;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}



}
