public class SingletonInheritanceCheck {
    private String size;
    private static SingletonInheritanceCheck UniqueInstance;
    private SingletonInheritanceCheck(){
        size="big";
    }
    public static synchronized SingletonInheritanceCheck getUniqueInstance(){
        if(UniqueInstance==null){
            UniqueInstance=new SingletonInheritanceCheck();
        }
        return UniqueInstance;
    }
}
