public class Practical44 extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Practical44 Thread is Running : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        Practical44 t1 = new Practical44();
        t1.start();
        for (int i = 1; i <= 3; i++) {
            System.out.println("Main Thread is Running : " + i);
        }
    }
}