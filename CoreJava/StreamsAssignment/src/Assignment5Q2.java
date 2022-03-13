import java.util.ArrayList;

class News{
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;

    public int getNewsId() {

        return newsId;
    }

    public void setNewsId(int newsId) {

        this.newsId = newsId;
    }

    public String getPostedByUser() {
        return postedByUser;
    }

    public void setPostedByUser(String postedByUser) {
        this.postedByUser = postedByUser;
    }

    public String getCommentByUser() {
        return commentByUser;
    }

    public void setCommentByUser(String commentByUser) {
        this.commentByUser = commentByUser;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    public  News(int newsId,  String postedByUser,String commentByUser,String comment) {
        this.comment=comment;
        this.newsId=newsId;
        this.commentByUser=commentByUser;
        this.postedByUser=postedByUser;

    }
    public String toString(){
        return "News[newsId="+newsId+",postedByUser="+postedByUser+",commentByUser="+commentByUser+",comment="+comment+"]";
    }

}
public class Assignment5Q2 {
    public static void main(String[] args) {
        News obj=new News(1, "Suraj", "krishna" ,"comment");
        News obj1=new News(3, "shivam", "krishna", " budget");
        News obj2=new News(1, "piyush", "krishna", "comment");
        News obj3=new News(3, "bhargav", "krishna", " budget");
        News obj4=new News(1, "vishnu", "krishna", "comment");

        ArrayList<News>ma=new ArrayList<>();
        ma.add(obj);
        ma.add(obj1);
        ma.add(obj2);
        ma.add(obj3);
        ma.add(obj4);
        ma.stream().filter(t->t.getComment().equals("comment")).forEach(t-> System.out.println(t.getNewsId()));//Q1
        Long buf=ma.stream().filter(t->t.getComment().contains("budget")).count();//Q2
        System.out.println(buf);
        ma.stream().filter(t->t.getComment().equals("comment")).forEach(t-> System.out.println(t.getPostedByUser()));
        ma.stream().forEach(t-> System.out.println(t.getCommentByUser() + t.getComment()));
    }
}
