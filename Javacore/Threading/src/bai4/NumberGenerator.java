package bai4;

public class NumberGenerator implements Runnable{
    private int numbreGenerator;
    private int count = 0;

    public NumberGenerator(int numbreGenerator) {
        this.numbreGenerator = numbreGenerator;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the count " + i);
                Thread.sleep(500);
                System.out.println(this);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }
}
class main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator(1);
        NumberGenerator numberGenerator1 = new NumberGenerator(2);
        Thread thread = new Thread(numberGenerator);
        Thread thread1 = new Thread(numberGenerator1);
        thread.start();
        thread1.start();

    }
}