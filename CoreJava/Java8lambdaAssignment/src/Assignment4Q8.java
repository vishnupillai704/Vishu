import java.util.ArrayList;
import java.util.Arrays;

public class Assignment4Q8 {
    public static void main(String[] args) {
        ArrayList<Integer>m=new ArrayList<>(Arrays.asList(93,53,87,87,98,55));
        new Thread(()-> System.out.println(m)).start();
    }
}
