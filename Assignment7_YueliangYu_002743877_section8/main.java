package Assignment7_YueliangYu_002743877_section8;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");// Setting the width and height of frame
        frame.setSize(2500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();//create panel
        frame.add(panel);//add panel
        frame2.placeComponents(panel);
        frame.setVisible(true);
    }
}