package drawingApp;

//図形描画、長さ測定、内角の和測定機能
public abstract class Polygon extends Shape{
	protected int angle;
	public Polygon(int angle) {
		this.angle = angle;
	}
	
	@Override
	public abstract void draw();
	
	@Override
	public abstract double getPerimeter();
	
	public int getInternalAngle() {
		int totalAngle = (angle - 2) * 180;
		return totalAngle;
	}
	

}
