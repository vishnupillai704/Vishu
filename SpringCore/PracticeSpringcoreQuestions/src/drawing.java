import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.io.FileSystemResource;

public class drawing {
    public static void main(String[] args) {
     // BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
     ApplicationContext context=new ClassPathXmlApplicationContext("constructor.xml");

        Triangle triangle=(Triangle) context.getBean("triangle");
        triangle.draw();
    }
}
