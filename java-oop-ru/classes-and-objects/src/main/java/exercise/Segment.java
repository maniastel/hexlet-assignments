package exercise;

// BEGIN
public class Segment {
    Point beginPoint;
    Point endPoint;

    Segment (Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Point getBeginPoint() {
        return beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Point getMidPoint() {
       int xBeginPoint = beginPoint.getX();
       int yBeginPoint = beginPoint.getY();
       int xEndPoint = endPoint.getX();
       int yEndPoint = endPoint.getY();

       int xMidPoint = (xBeginPoint + xEndPoint) / 2;
       int yMidPoint = (yBeginPoint + yEndPoint) / 2;

       return new Point(xMidPoint, yMidPoint);
    }

}
// END
