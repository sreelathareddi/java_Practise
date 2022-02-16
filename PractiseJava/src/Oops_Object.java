public class Oops_Object {
    int f1;
    String s1;
    void enterValues(int a,String str){
        f1=a;
        s1=str;
    }
    void displayData(){
        System.out.println("Initializing object through method");
        System.out.println(f1+" "+s1);
    }

}
class Object_creation{

    {
        //Creating an object for Oops_Object class and assigning values through reference variable and printing the values
        Oops_Object o1 = new Oops_Object();
        o1.f1 = 60;
        o1.s1 = "Welcome";
        System.out.println( "intializing object through reference variable "+o1.f1 +" " + o1.s1);
        //intializing object through method
        o1.enterValues(10,"Sree");
        o1.displayData();

    }

    public static void main(String args[]){
        //Creating object for Object_creation class
        Object_creation oc1=new Object_creation();

    }


}
