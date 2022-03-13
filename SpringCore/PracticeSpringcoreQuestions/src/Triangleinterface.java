public class Triangleinterface implements shape{
    PointInterface pointA;
    PointInterface pointB;

    public PointInterface getPointA() {
        return pointA;
    }

    public void setPointA(PointInterface pointA) {
        this.pointA = pointA;
    }

    public PointInterface getPointB() {
        return pointB;
    }

    public void setPointB(PointInterface pointB) {
        this.pointB = pointB;
    }



    @Override
    public void draw() {
        System.out.println(pointA.getX()+","+pointA.getY());
        System.out.println(pointB.getX()+","+pointB.getY());
    }
}
