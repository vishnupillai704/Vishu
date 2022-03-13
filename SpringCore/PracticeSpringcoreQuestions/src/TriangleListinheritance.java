import java.util.List;

public class TriangleListinheritance {
     private List<PointListinheritance>points;

    public List<PointListinheritance> getPoints() {
        return points;
    }

    public void setPoints(List<PointListinheritance> points) {
        this.points = points;
    }
    public void draw(){
        for(PointListinheritance point:points){
            System.out.println(point.getX()+","+point.getY());
        }
    }
}
