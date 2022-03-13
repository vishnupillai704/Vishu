import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mai {
    public static void main(String[] args) {
       ApplicationContext context=new ClassPathXmlApplicationContext("hello.xml");
       hello obj=(hello) context.getBean("HELLO");
       obj.dra();
    }

}
