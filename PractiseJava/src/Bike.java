abstract class Bike {
    abstract void add();
    void reply(){
        System.out.println("reply method");
    }

}
class RoyalEnfield extends Bike{
    void add(){
        System.out.println("add method");
    }
    public static void main(String args[]){
        Bike b=new RoyalEnfield();
        b.reply();
        b.add();
    }

}
