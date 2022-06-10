package generics3;

public class Rectangle implements Shape{
	
	private Double width;
	private double height;
	
	public Rectangle(Double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}
	
	
	
	

}
