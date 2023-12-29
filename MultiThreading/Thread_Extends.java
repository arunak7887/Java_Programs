public class Thread_Extends extends Thread{
    public void run(){
        System.out.println("Thread is Running");
    }
    public static void main(String[] args) {
        Thread_Extends t1=new Thread_Extends();
        t1.run();
    }
}
