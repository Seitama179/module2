public class Demo extends Thread{
    public void run(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Demo demoThread = new Demo();
        demoThread.start();
    }
}
