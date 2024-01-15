
public class Main {
    public static void main(String[] args) {

      Canvas canvas=new Canvas();

      Shape circle= new Circle(5);

      //Drawing a circle on canvas
      canvas.drawShape(circle);

      // circle.calculateArea();
      Shape rectangle =new Rectangle();
      canvas.drawShape(rectangle);

    }
}