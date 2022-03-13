import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

public class messagesourcetriangle {
    private messagesourcepoint pointA;
//    @Autowired
//    private MessageSource messageSource;
//
//    public MessageSource getMessageSource() {
//        return messageSource;
//    }
//
//    public void setMessageSource(MessageSource messageSource) {
//        this.messageSource = messageSource;
//    }

    public messagesourcepoint getPointA() {
        return pointA;
    }

    public void setPointA(messagesourcepoint pointA) {
        this.pointA = pointA;
    }

    public void draw(){
        System.out.println(pointA.getX()+","+pointA.getY());
//        System.out.println(this.messageSource.getMessage("greeting",null,"default",null));
    }
}
