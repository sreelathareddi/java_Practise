
public class Encapsulation {
    private int roll_num;
    private String name;
    private String course;
    public String getName(){
        return name;
    }
    public int getRoll_num(){
        return roll_num;
    }
    public String getCourse(){
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public void setRoll_num(int roll_num){
        this.roll_num=roll_num;
    }
}
class TestEncapsulation{
    public static void main(String [] args){
        Encapsulation e=new Encapsulation();
        e.setName("Vishnu");
        e.setCourse("cse");
        e.setRoll_num(115);
        System.out.println(e.getRoll_num()+" "+e.getName()+" "+e.getCourse());
    }
}
