import java.util.Scanner;
interface Draw{
    void draw();
    static int square(int side){return 4*side;}
}
class Rectangle implements Draw{
    public void draw(){
        System.out.println("Drawing an rectangle");
        
    }

}
public class StaticMethodInInterface {
    public static void main(String [] args){

        Rectangle r=new Rectangle();
        r.draw();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        int s=sc.nextInt();
        System.out.println(Draw.square(s));


    }
}
