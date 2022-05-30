package ExcerciseComplex2;

public class ResizableCircle extends Circle implements Resizable{


    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {

    }

    @Override
    public String toString() {
        return "ResizableCircle{" +
                "radius=" + radius +
                '}';
    }
}
