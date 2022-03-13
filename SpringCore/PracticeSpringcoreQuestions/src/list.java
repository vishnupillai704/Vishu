import java.util.List;

public class list {
    private List<point2list>points;

    public List<point2list> getPoints() {
        return points;
    }

    public void setPoints(List<point2list> points) {
        this.points = points;
    }
    public void draw(){
        for(point2list vis:points ){
            System.out.println(vis.getX()+","+vis.getY()+"");
        }
    }
}
