abstract class Shape{
    protected String Color;
    protected Boolean Filled;

    public Shape() {
        this.Color = "red";
        this.Filled = true;
    }
    public Shape(String Color , Boolean Filled){
        this.Color = Color;
        this.Filled = Filled;
    }
   
    String getColor(){
        return Color;
    }
    void setColor(String Color){
        this.Color  = Color;
    }
    Boolean isFilled(){
        return Filled;
    }
    void setFilled(Boolean Filled){
        this.Filled = Filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape[color=" + Color + ", filled=" + Filled + "]";
    }
}
class Circle extends Shape{
    private double radius;
    public Circle(){
        super();
        this.radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(String Color , Boolean Filled , double radius ){
        super(Color , Filled);
        this.radius = radius;
    }

    public double getradius(){
        return radius;
    }
    public void setradius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius *radius;
    }
    @Override
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString(){
        return "Circle["+super.toString()+", Radius  = "+radius+" ]";
    }
}
class Rectangle extends Shape{
    private double side ;
    public Rectangle(){
        super();
        this.side = 1.0;
    }
    public Rectangle(double side){
        super();
        this.side = side;
    }
    public Rectangle(String Color , Boolean Filled  , double side){
        super(Color, Filled);
        this.side = side;
    }
    public double getside(){
        return side;
    }
    public void setside(double side){
        this.side = side;
    }
    @Override
    public double getArea(){
        return side*side;
    }
    @Override
    public double getPerimeter(){
        return 4*side;
    }
    @Override
    public String toString(){
        return "Rectangle[ "+super.toString()+" , Side "+side +" ]";
    }

}
/**
 * M111
 */
public class M111 {

    public static void main(String[] args) {
       Circle circle = new Circle("Blue" , true ,24 );
       Rectangle rectangle = new Rectangle("Red"  , false , 32);

        System.out.println(circle.toString());
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Perimeter of Circle: " + circle.getPerimeter());

        System.out.println(rectangle.toString());
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.getPerimeter());
    }
}

