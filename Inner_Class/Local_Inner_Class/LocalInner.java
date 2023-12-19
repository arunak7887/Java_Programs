package Inner_Class.Local_Inner_Class;

public class LocalInner {
    private int data=30;
    void display(){
        class InnerLocalInner {
            void msg(){
                System.out.println(data);

            }
        }
        InnerLocalInner in=new InnerLocalInner();
        in.msg();
    }
    public static void main(String[] args) {
        LocalInner s1=new LocalInner();
        s1.display();
    }
    
}
