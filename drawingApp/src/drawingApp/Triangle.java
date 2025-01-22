package drawingApp;
//3地点を指定し、三角形を描画
public class Triangle extends Polygon {
	private Point p1, p2, p3;
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		super(3);
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
		this.p3 = new Point(x3, y3);                                  
	}
	
	public void draw() {
		System.out.println("[三角形を描画]点1(" + p1.getX() + "," + p1.getY() + ")から点2("
				+ p2.getX() + "," + p2.getY() + "," + "点3(" + p3.getX() + "," + p3.getY() + ")の三角形");
	}
	
	public double getPerimeter() {
		int x1 = p1.getX();
		int y1 = p1.getY();
		int x2 = p2.getX();
		int y2 = p2.getY();
		int x3 = p3.getX();
		int y3 = p3.getY();
		double perimeter_1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double perimeter_2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		double perimeter_3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		double perimeter_total = perimeter_1 + perimeter_2 + perimeter_3;
		return perimeter_total;
		
		
		
	}

}
