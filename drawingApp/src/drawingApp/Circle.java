package drawingApp;
//円描画、円周計測メソッドの定義
public class Circle extends Shape {
	private Point center;
	private int radius;
	
	public Circle() {
		this.center = new Point(0, 0);
		this.radius = 0;
	}
	
	public Circle(int x, int y, int r) {
		this.center = new Point(x, y);
		this.radius = r;
		
	}
	
	@Override
	public void draw() {
		
		System.out.println("[円を描画]中心点(" + this.center.getX() + ", " + this.center.getY() + ")から半径" + radius);
	}
	
	@Override
	public double getPerimeter() {
		double perimeter = radius * 2 * Math.PI;
		return perimeter;
	}
	

}
