public interface Printing {
    int a=30;
    void print();
}
class TestPrint implements Printing{
    public void print(){
        System.out.println("Printing...");
    }
    public static void main(String [] args){
        TestPrint t=new TestPrint();
        t.print();
        System.out.println(t.a);
    }
}
