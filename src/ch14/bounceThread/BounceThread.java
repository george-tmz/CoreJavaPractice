package ch14.bounceThread;

public class BounceThread {
    private static int i = 0;

    public static void main(String[] args) {
        for (int j = 0; j < 10; j++) {
            new Thread(BounceThread::add).start();
        }
    }

    private static void add() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i++;
        System.out.println(i);
    }
}

//class BounceFrame extends JFrame
//{
////    private
//}
