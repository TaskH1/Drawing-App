package drawingApp;
import java.lang.Math;

//2地点間を結ぶライン
public class Line implements Figure {
	private Point p1;
	private	Point p2;
	
	public Line() {
		this.p1 = new Point(0, 0);
		this.p2 = new Point(0, 0);
	}
	
	//引数で受け取ったデータで、２つのPointオブジェクトを生成
	public Line(int x1, int y1, int x2, int y2) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
	}
	
	//始点をp1,終点をp2としメッセージ表示
	@Override
	public void draw() {
		System.out.println("[線を描画]始点 (" + p1.getX() + ", " + p1.getY() + ")から終点(" + p2.getX() + "," +  p2.getY() + ")まで");
	}
	
	//2点間の直線距離を計算し値を返す
	public double getPerimeter() {
		int x1 = p1.getX();
		int y1 = p1.getY();
		int x2 = p2.getX();
		int y2 = p2.getY();
		
		double perimeter = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return perimeter;
	}
	

}
