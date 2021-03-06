package ExcerciseArraylist;

import java.util.List;
import java.util.ArrayList;

public class PolyLine {

    private List<Point> points;

    // Constructors
    public PolyLine() {  // default constructor
        points = new ArrayList<Point>();  // implement with ArrayList
    }
    public PolyLine(List<Point> points) {
        this.points = points;
    }

    // Append a point (x, y) to the end of this polyline
    public void appendPoint(int x, int y) {
        Point newPoint = new Point(x, y);
        points.add(newPoint);
    }

    // Append a point instance to the end of this polyline
    public void appendPoint(Point point) {
        points.add(point);
    }

    // Return {(x1,y1)(x2,y2)(x3,y3)....}
    public String toString() {
        // Use a StringBuilder to efficiently build the return String
        StringBuilder sb = new StringBuilder("{");
        for (Point aPoint : points) {
            sb.append(aPoint.toString());
        }
        sb.append("}");
        return sb.toString();
    }

    // Return the total length of this polyline
    public double getLength() {
        return points.size();
    }
}

