import java.util.HashMap;
import java.util.Random;

public class genericQ2  {
    public static void main(String[] args) {

        Random rand=new Random();


        HashMap<Integer, Double>ma=new HashMap<Integer, Double>();
            for(int i=0;i<=10;i++) {
                int rando = rand.nextInt(10);
                Double ran = rand.nextDouble();
                ma.put(rando, ran);

        }
        System.out.println(ma);


    }
}
