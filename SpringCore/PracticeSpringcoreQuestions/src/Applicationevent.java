import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class Applicationevent implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(event.toString());
    }
}
