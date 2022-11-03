package Assignment6_YueliangYu_002743877_section8;



import javax.swing.*;



public class main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Main");// Setting the width and height of frame
        frame.setSize(545, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();//create panel
        frame.add(panel);//add panel
        myFrame frame1 = new myFrame();
        frame1.placeComponents(panel);
        frame.setVisible(true);

    }
}


