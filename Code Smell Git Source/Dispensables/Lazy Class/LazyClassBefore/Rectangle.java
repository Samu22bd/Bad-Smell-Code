package LazyClassBefore;

public class Rectangle extends RectangleAreaCalculator{

	private Integer width;
	private Integer length;
	
	public Rectangle(Integer width, Integer length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Integer getArea() {
		return this.calculateArea(this.width, this.length);
	}
	
	public void printWidLen() {
		System.out.println(this.width + " " + this.length);
	}
	
	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

}
