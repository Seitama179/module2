public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() +
                    ", Number: " + i +
                    ", HashCode: " + this.hashCode());
            try {
                Thread.sleep(500); // Dừng lại 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
