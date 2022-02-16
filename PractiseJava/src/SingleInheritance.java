
class Grand_Parent{
    void behaviour(){
        System.out.println("experience");
    }
}
class Parent extends Grand_Parent{
    void behaviour(){
        System.out.println("Parents behaviour");
    }
}
public class SingleInheritance {
    public static void main(String[] args){
        Parent p1=new Parent();
        p1.behaviour();
        p1.behaviour();
    }
}
