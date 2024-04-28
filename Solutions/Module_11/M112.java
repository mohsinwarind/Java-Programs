abstract class Shape{
    public abstract double area();

    public abstract double perimeter();

}
class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius   = radius;
    }
    @Override
    public  double area(){
        return Math.PI*radius;
    }
    @Override
    public double perimeter(){
        return Math.PI*Math.PI*radius;
    }
}
/**
 * M112
 */
public class M112 {

    public static void main(String[] args) {
        Circle c1 = new Circle(32);
        System.out.println("Your Area is : "+c1.area());
        System.out.println("Your Perimeter is : "+c1.perimeter());
    }
}