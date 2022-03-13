public class triangleconstructorautowiring {
    private pointconstructorautowiring pointA;
    private pointconstructorautowiring pointB;
    public triangleconstructorautowiring(pointconstructorautowiring pointA,pointconstructorautowiring pointB){
        this.pointA=pointA;
        this.pointB=pointB;
    }
    public void draw(){
        System.out.println(pointA.getX()+","+pointA.getY());
        System.out.println(pointB.getX()+","+pointB.getY());
    }
}
