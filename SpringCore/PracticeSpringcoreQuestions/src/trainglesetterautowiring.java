public class trainglesetterautowiring {
    private pointautowiring pointA;
    private pointautowiring pointB;

    public pointautowiring getPointA() {
        return pointA;
    }

    public void setPointA(pointautowiring pointA) {
        this.pointA = pointA;
    }

    public pointautowiring getPointB() {
        return pointB;
    }

    public void setPointB(pointautowiring pointB) {
        this.pointB = pointB;
    }
    public void draw(){
        System.out.println(pointA.getX()+","+pointB.getY());
    }



}
