package drawingApp;
//図形描画、長さ測定機能の定義
public abstract  class Shape implements Figure{
	@Override
	public abstract void draw();
	
	@Override
	public abstract double getPerimeter();
}
