import java.util.ArrayList;

public class MainApplication {
	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(ShapeFactory.createShape("Circle"));
		shapes.add(ShapeFactory.createShape("Square"));
		shapes.add(ShapeFactory.createShape("triangle"));
		
		for(Shape s:shapes){
			s.draw();
		}

	}
}
