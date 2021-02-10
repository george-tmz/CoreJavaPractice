package ch06.timer;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.ActionListener;

public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(1000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
