import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Maininheritance {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("inheritance.xml");
        TriangleInheritance obj=(TriangleInheritance) context.getBean("triangle1");
        obj.draw();

    }
}
