public class PassingArrayToMethod {
    static void min(int a[]){
        int min=a[0];
        for(int i=0;i< a.length;i++){
            if(min>a[i])
                min=a[i];

        }
        System.out.println(min);
    }
    static int[] getValues(){
        return new int[]{10,20,30};
    }
    public static void main(String[] args){
        int arr[]={10,20,30,40};
        min(arr);
        int a1[]=getValues();
        for(int i=0;i< a1.length;i++){
            System.out.print(" "+a1[i]);
        }
    }
}
