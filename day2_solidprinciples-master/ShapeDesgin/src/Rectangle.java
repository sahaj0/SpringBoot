public class Rectangle implements Shape{

    private double width;
    private  double length;

//    public  Rectangle(double width, double length){
//        this.length=length;
//        this.width=width;
//    }
//
    public double calculateArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("inside rectangle");
    }
}
