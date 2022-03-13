import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CircleInterface implements shape {
     private PointInterface centre;

    public PointInterface getCentre() {
        return centre;
    }

   // @Required

    @Autowired
    @Qualifier("circleRelated")
    public void setCentre(PointInterface centre) {
        this.centre = centre;
    }


    @Override
    public void draw() {
        System.out.println(centre.getX()+","+centre.getY());
    }
}
