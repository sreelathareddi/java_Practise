class Animals{
    static int a=20;
    int b=5;
    static void test() {
        System.out.println("Animals class" + a);
    }
}
class Doggy extends Animals{
    int a=30;
    void printing(){
        System.out.println("doggy class" + a);
    }

    public static void test() {
        System.out.println("doggy class" + Animals.a);
    }

}
public class StaticOverloadingTest {
    public static void main(String [] args){
        Doggy d=new Doggy();
        d.printing();
        Doggy.test();
        Animals.test();

    }
}
