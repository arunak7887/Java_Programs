package Inner_Class.Local_Inner_Class;

public class LocalInner2 {
    private int data=30;
    void display(){
        int value=50;
        class InnerLocalInner2 {
            void msg(){
                System.out.println(value);
            } 
        }
        InnerLocalInner2 s1=new InnerLocalInner2();
        s1.msg();

    }
    public static void main(String[] args) {
        LocalInner2 li2=new LocalInner2();
        li2.display();
    }
    
}
