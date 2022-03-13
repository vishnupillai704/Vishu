import java.util.HashSet;

public class CollectionQ2 {
    public static void main(String[] args) {
        HashSet vish=new HashSet<>();
        vish.add("suraj");
        vish.add("divyansh");
        vish.add("sanyam");
        vish.add("prateek");
        vish.add("shubham");
        vish.add("piyush");
        vish.add("shivam");
        vish.add("vishnu");

        System.out.println(vish);
        System.out.println(vish.add("vishnu"));
        System.out.println(vish);
    }
}
