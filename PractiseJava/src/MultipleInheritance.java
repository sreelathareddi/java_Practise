interface Drawable{
   abstract void draw();

}
interface Coloring{
   abstract void color();
}


public class MultipleInheritance implements Drawable,Coloring {
    public void draw(){System.out.println("Drawing");}
    public void color(){System.out.println("coloring");}
    public static void main(String[] args){
        MultipleInheritance mi=new MultipleInheritance();
        mi.draw();
        mi.color();
    }
}
