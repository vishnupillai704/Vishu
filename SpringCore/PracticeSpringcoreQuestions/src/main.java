import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("list.xml");
        list obj=(list) context.getBean("LIST");
        obj.draw();
    }
}
