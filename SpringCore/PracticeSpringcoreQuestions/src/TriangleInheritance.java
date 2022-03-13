public class TriangleInheritance {
    private PointInheritance pointA;
    private PointInheritance pointB;

    public PointInheritance getPointA() {
        return pointA;
    }

    public void setPointA(PointInheritance pointA) {
        this.pointA = pointA;
    }

    public PointInheritance getPointB() {
        return pointB;
    }

    public void setPointB(PointInheritance pointB) {
        this.pointB = pointB;
    }
    public void draw(){
        System.out.println(pointA.getX()+","+pointA.getY());
        System.out.println(pointB.getX()+","+pointB.getY());
    }
}
