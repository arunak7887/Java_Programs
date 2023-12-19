public class Ex1 extends Thread{
    @Override
    public void run() {
      
        System.out.println("Thread is Running");
    }
    public static void main(String[] args) {
        Ex1 t1=new Ex1();
        t1.start();
    }
}
