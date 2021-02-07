package shape;

public class Triangle extends Shape implements Resize{
	

	public Triangle() {
		super();
		
	}

	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
	
	}

	@Override
	public void setResize(int size) {
		setHeight(size);
		
	}

	@Override
	public double getArea() {
		return (getHeight()*getWidth()/2);
	}

	public void setHeight(int height) {
		super.setHeight(getHeight() + height);
	}

}
