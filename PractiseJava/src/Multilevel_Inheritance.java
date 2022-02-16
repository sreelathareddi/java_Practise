class Animal{
    void eat(){System.out.println("eating");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking");}
}
class Puppy extends Dog{
    void weep(){
        System.out.println("weeping");
    }
}
public class Multilevel_Inheritance {
    public static void main(String []args){
        Puppy p=new Puppy();
        p.weep();
        p.eat();
        p.bark();
    }
}
