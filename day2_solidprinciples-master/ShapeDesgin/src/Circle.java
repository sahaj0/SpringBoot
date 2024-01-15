//Follows the Dependency Principle
public class Circle implements Shape{
    private  double radius;
    public  Circle(double radius){
//        System.out.println(radius);
        this.radius=radius;
    }
    @Override
    public double calculateArea() {
//        System.out.println(radius*radius);
         return Math.PI*radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Inside a Circle");
    }
}
