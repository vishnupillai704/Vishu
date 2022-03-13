import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainconstructorautowiring {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("constructorautowiring.xml");
        triangleconstructorautowiring obj=(triangleconstructorautowiring) context.getBean("triangle1");
        obj.draw();
    }
}
