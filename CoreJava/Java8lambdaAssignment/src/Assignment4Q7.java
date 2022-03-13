import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class Assignment4Q7 {

    public static String convertKeyValueToString(HashMap<String, Integer> map) {
        StringBuilder m=new StringBuilder();
        Consumer<Map.Entry>a=(i)->m.append(i.getKey()).append(i.getValue());
        Set<Map.Entry<String,Integer>>s=map.entrySet();
        s.forEach(a);
        return m.toString();

    }

    public static void main(String[] args) {
        HashMap<String,Integer>m=new HashMap<>();
        m.put("hi",45);
        m.put("ff",87);
        m.put("dd",97);
        Consumer k=(i)-> System.out.println(convertKeyValueToString(m));
        k.accept(m);
    }







}

