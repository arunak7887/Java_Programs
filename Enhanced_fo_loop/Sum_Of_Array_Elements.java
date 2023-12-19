package Enhanced_fo_loop;

public class Sum_Of_Array_Elements {
    public static void main(String[] args) {
        int count=0;
    
        int a[]={ 10,5,16,78,65};
        for (int i : a) {
            count+=i;
        }
        System.out.println("Sum Of Array Elements:"+count);
    }
    
}
