public class Triangle2 {
   private point pointA;
   private point pointB;
   private point pointC;

    public point getPointA() {
        return pointA;
    }

    public void setPointA(point pointA) {
        this.pointA = pointA;
    }

    public point getPointB() {
        return pointB;
    }

    public void setPointB(point pointB) {
        this.pointB = pointB;
    }

    public point getPointC() {
        return pointC;
    }

    public void setPointC(point pointC) {
        this.pointC = pointC;
    }
    public void poin(){
        System.out.println("PointA=("+getPointA().getX()+","+getPointA().getY()+")");
        System.out.println("PointB=("+getPointB().getX()+","+getPointB().getY()+")");
        System.out.println("PointC=("+getPointC().getX()+","+getPointC().getY()+")");
    }
}
