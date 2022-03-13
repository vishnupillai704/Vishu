import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainListinheritance {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Listinheritance.xml");
        TriangleListinheritance obj=(TriangleListinheritance) context.getBean("Triangle1");
        obj.draw();

    }
}
