public class Accepting_EmplDetails_Through_Constructor {
    int id;
    String name;
    float salary;
    void insert(int i,String str,float slr){
        id=i;
        name=str;
        salary=slr;
    }
    void display(){
        System.out.println(id+" "+ name +" "+salary);
    }
}
class Passing_Values{
    public static void main(String args[]){
        Accepting_EmplDetails_Through_Constructor e1=new Accepting_EmplDetails_Through_Constructor();
        Accepting_EmplDetails_Through_Constructor e2=new Accepting_EmplDetails_Through_Constructor();
        Accepting_EmplDetails_Through_Constructor e3=new Accepting_EmplDetails_Through_Constructor();
        e1.insert(1,"Sreelatha",20000);
        e2.insert(2,"Meena",30000);
        e3.insert(1,"Bindu",40000);
        e1.display();
        e2.display();
        e3.display();

    }
}
