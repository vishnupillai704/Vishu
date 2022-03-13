import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class messagesourcemain {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("messagesource.xml");
         messagesourcetriangle obj=(messagesourcetriangle)context.getBean("triangle");
         obj.draw();

        System.out.println(context.getMessage("greeting",null,"default",null));
    }
}
