public class A {
    void method1(){System.out.println("class A called");}
}
class B extends A{
    void method1(){System.out.println("class B");}
}
class TestUpcasting{
    public static void main(String [] args){
        A a= new B();
        a.method1();//Upcasting
    }
}
