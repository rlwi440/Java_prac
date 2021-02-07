package shape;

public class Rectangle extends Shape implements Resize {

	public Rectangle() {
		super();
	}

	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);
	}

	@Override
	public double getArea() {
		return (getWidth()*getHeight());
	}

	@Override
	public void setResize(int size) {
			super.setWidth(getWidth()+width);
		
	}

}
