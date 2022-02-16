public class TypePromotionOverloading {
    void multiply(int a,long b){System.out.println("multiplying integer and long" + a*b);}
    void multiply(int a,int b,int c){System.out.println("multiplying three integers"+ (a*b*c));}
}
class TypePromotion{
    public static void main(String[] args){
        TypePromotionOverloading t1=new TypePromotionOverloading();
        t1.multiply(10,20);//literal a is converted into long
        t1.multiply(1,2,3);

    }
}
