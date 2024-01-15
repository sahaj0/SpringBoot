
//This class follows Open Principle
public class Canvas{

    public  void drawShape(Shape shape){
        shape.draw();
        System.out.println(shape.calculateArea());
    }
}
