import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class collectionQ1 {
    public static void main(String[] args) {
        Phonenumber e1=new Phonenumber(931353L);
        Phonenumber e2=new Phonenumber(981824L);
        Phonenumber e3=new Phonenumber(981823L);

        contac d1=new contac("suraj","suraj@gamil","male");
        contac d2=new contac("shivam","vish@gmail","male");
        contac d3=new contac("piyus","vishb@gmail","male");

        Map<Phonenumber,contac>mape=new TreeMap<>();
        mape.put(e1,d1);
        mape.put(e2,d2);
        mape.put(e3,d3);

        Set<Map.Entry<Phonenumber,contac>> list=mape.entrySet();
        for(Map.Entry<Phonenumber,contac> list2:list){
            System.out.println(list2.getKey());
            System.out.println(list2.getValue());
            System.out.println("key"+ list2.getKey()+"value"+list2.getValue());


        }

    }

}
