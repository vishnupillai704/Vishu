public class Triangle {
    String type;

    Integer height;

    public Integer getHeight() {
        return height;
    }


    public Triangle(String type,Integer height){
        this.type=type;
        this.height=height;
    }

    public String getType() {
        return type;
    }

//    public void setType(String type) {   //this will use when we use setter injection.
//        this.type = type;
//    }

    public void draw(){
        System.out.println(getType()+"Triangle Height"+getHeight());
    }
}
