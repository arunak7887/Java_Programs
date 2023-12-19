package Inner_Class.Member_Inner_Class;

public class Test_Member_Outer {
    private int data=30;
    class Inner{
        void msg(){
            System.out.println("data is"+data);
        }
    }
    public static void main(String[] args) {
        Test_Member_Outer obj=new Test_Member_Outer();
        Test_Member_Outer.Inner in=obj.new Inner();
        in.msg();
    }
    
}
