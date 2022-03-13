import java.lang.annotation.*;


public class AnnotationQ2{
   @Inherited
   @Target({ElementType.TYPE_USE, ElementType.TYPE})
   @Retention(RetentionPolicy.RUNTIME)
   @interface info
    {
        String AuthorId() default "none";
        String Date()  default "none";
        String Time() default "none";
        float Version();

    }

    @info(AuthorId = "1.1",Date = "12-02-2022",Time = "9.53",Version = 221)

    static class developer {
        int AuthorID;
        String Author ;
        String Supervisor ;
        String Date;
        String Time;
        float Version;
        String Description;
        public developer(int AuthorID, String Date, String Time, float Version) {
            this.AuthorID = AuthorID;
            this.Date = Date;
            this.Time = Time;
            this.Version = Version;
        }




    }

    public static void main(String[] args) {
        developer obj=new developer(20,"21-02-2022","2.30",20);
        Class c=obj.getClass();
        Annotation an=c.getAnnotation(info.class);
        info s=(info) an;
        System.out.println(s.AuthorId());
        System.out.println(s.Version());
        System.out.println(s.Time());
        System.out.println(s.Date());
    }

}

