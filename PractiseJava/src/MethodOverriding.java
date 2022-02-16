public class MethodOverriding {
    void method(){System.out.println("parent method");}
}
class Child extends MethodOverriding{
    void method(){System.out.println("child class overriden method");}
    public static void main(String[] args){
        Child c=new Child();
        c.method();
    }
}


