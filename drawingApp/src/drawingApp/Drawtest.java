package drawingApp;

public class Drawtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test for Line.java
		Line line = new Line(0, 0, 3, 4);
		line.draw();
		System.out.println("線の長さ: " + line.getPerimeter());
		
		//Test for Circle
		Circle circle = new Circle(2, 3, 10);
		circle.draw();
		System.out.println("円周の長さ: " + circle.getPerimeter());
		
		//Test for Triangle
		Triangle triangle = new Triangle(2, 3, 5, 6, 5, 1);
		triangle.draw();
		System.out.println("三角形の長さ：" + triangle.getPerimeter());
		
		//Test for rectangle
		Rectangle rectangle = new Rectangle(2, 4, 2, 6);
		rectangle.draw();
		System.out.println("長方形のながさ: " + rectangle.getPerimeter());
		
		//Test for Square
		Square square = new Square(3, 3, 5);
		square.draw();
		System.out.println("正方形の長さ: " + square.getPerimeter());
		

	}

}
