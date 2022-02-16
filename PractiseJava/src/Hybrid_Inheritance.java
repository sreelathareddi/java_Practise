class Arithematic{
    void operations(){
        System.out.println("arithematic operations");
    }
}
class Add extends Arithematic{
    void addition1(int a,int b){
        int c=a+b;
        System.out.println("addition" + c);
    }
}
class Sub extends Arithematic{
    void substraction(int a,int b){
        int c=a-b;
        System.out.println("Substraction " + c);
    }
}
public class Hybrid_Inheritance {
    public static void main(String []args){
        Sub s=new Sub();
        s.substraction(10,20);
        s.operations();
        Add a=new Add();
        a.addition1(30,20);
        a.operations();
    }
}
