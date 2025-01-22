package drawingApp;

public class Rectangle extends Polygon {
	protected Point p;
	protected int width;
	protected int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(4);
		this.p = new Point(x, y);
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		System.out.println("[長方形を描画]点(" + p.getX()+ "," + p.getY() + ")を基準として幅" + width + "高さ" + height + "の長方形");
	}
	
	public double getPerimeter( ) {
		double perimeter = (width + height) * 2;
		return perimeter;
	}
	
}
