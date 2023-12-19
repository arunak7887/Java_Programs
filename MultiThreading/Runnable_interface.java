public class Runnable_interface implements Runnable {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("By Using Runnable Interface");
        
    }
    public static void main(String[] args) {
        Runnable_interface m1=new  Runnable_interface();
        Thread t1=new Thread(m1);
        t1.start();
        
    }
}
