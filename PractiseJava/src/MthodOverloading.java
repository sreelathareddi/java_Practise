public class MthodOverloading
{
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}
}
class Overloading{
    public static void main(String[] args){
        System.out.println(MthodOverloading.add(20,30));
        System.out.println(MthodOverloading.add(10,20,50));
    }
}
