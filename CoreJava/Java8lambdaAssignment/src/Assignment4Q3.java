import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Assignment4Q3 {
    public static void main(String[] args) {
        //Consumer
        Consumer<Integer>consumer=(t)-> System.out.println("hi your number is"+ t);
        consumer.accept( 12);
        Consumer<String>consumer1=(t)-> System.out.println("hi my name is"+ t);
        consumer1.accept(" vishnu");
        //supplier
        Supplier<String>supplier=()-> "hi this is supplier method";
        System.out.println(supplier.get());
        //predicate
        Predicate<Integer>predicate=(t)->t%2==0;
        System.out.println(predicate.test(8));

    }
}
