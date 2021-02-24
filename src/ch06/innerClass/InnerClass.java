package ch06.innerClass;

import javax.swing.JOptionPane;

public class InnerClass {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
