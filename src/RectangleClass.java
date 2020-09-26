
public class RectangleClass {
	private double lenght;
	private double width;
	
	public RectangleClass(double lenght, double width) {
		setLenght(lenght);
		setWidth(width);
	}
	
	public double getLenght() {
		return lenght;
	}
	public void setLenght(double lenght) {
		if (lenght > 0.0 && lenght < 20.0) {
			this.lenght = lenght;
		}else this.lenght = 1.0;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if (width > 0.0 && width < 20.0) {
			this.width = width;
		}else this.width = 1.0;
	}

}
