package Variable_Length_argument;

public class Ex1 {
    
    public static void main(String[] args) {
        vararg_findsum(10,20);
        vararg_findsum(10,20,30);


    }
    public static void vararg_findsum(int...values){
        int  sum=0;
        for(int n:values){
            sum+=n;
        }
        System.out.println("Sum Is :"+sum);
    }
}
