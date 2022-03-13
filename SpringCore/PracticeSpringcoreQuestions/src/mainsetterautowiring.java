import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainsetterautowiring {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("setterautowiring.xml");
        trainglesetterautowiring obj=(trainglesetterautowiring) context.getBean("triangle");
        obj.draw();
    }
}
