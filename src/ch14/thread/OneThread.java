package ch14.thread;

public class OneThread {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(() -> System.out.println(finalI)).start();
        }
        System.out.println("777777");
    }
}
