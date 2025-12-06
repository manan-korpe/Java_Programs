public class Practical45 implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Practical45 Thread is Running : "+ i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Practical45 p1 = new Practical45();
        Thread t1 = new Thread(p1);

        t1.start();
        for (int i = 1; i <= 3; i++) {
            System.out.println("Main Thread is Running : " + i);
        }
    }
}
