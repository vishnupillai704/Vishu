import java.lang.annotation.*;

public class AnnotationQ1 {
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @ interface Test{

    }
    static class vish{
        @Test
        public void sura(){
            System.out.println("Test-case");
        }
    }

    public static void main(String[] args) {
        vish obj=new vish();
        obj.sura();
    }
}
