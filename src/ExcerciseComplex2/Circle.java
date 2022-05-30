package ExcerciseComplex2;

public class Circle implements GeometricObject{

    protected double radius;

    public Circle(double radius){
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
