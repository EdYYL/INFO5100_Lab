package Assignment7_YueliangYu_002743877_section8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class frame2 extends JFrame {
    public static void placeComponents(JPanel panel) {

        panel.setLayout(null);
        // create JLabel，JTextField, JButton, JTextArea
        JLabel label1 = new JLabel("Reading file name: ");
        //JTextField textField1 = new JTextField("/Users/yuyueliang/IdeaProjects/INFO5100_Lab/Assignment7_YueliangYu_002743877_section8/annual.csv");
        JTextField textField1 = new JTextField("Assignment7_YueliangYu_002743877_section8/annual.csv");
        JButton B1 = new JButton("Click to read from file");
        JLabel label2 = new JLabel("First five lines of file:");
        JTextArea textArea1 = new JTextArea();

        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fileName = textField1.getText();
                fileIO fIO = new fileIO();
                String strOut;
                try {
                    strOut = fIO.readFile(fileName);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                textArea1.setText(strOut);

            }
        });
        /* set position
         * setBounds(x, y, width, height)
         */
        label1.setBounds(10, 20, 170, 25);
        panel.add(label1);
        textField1.setBounds(150,20,400,25);
        panel.add(textField1);
        B1.setBounds(10, 65, 170, 25);
        panel.add(B1);
        label2.setBounds(10, 110, 170, 25);
        panel.add(label2);
        textArea1.setBounds(10, 130, 500, 100);
        panel.add(textArea1);

        // create JLabel，JTextField, JButton, JTextArea
        JLabel label3 = new JLabel("File name to write: ");
        //JTextField textField1 = new JTextField("/Users/yuyueliang/IdeaProjects/INFO5100_Lab/Assignment7_YueliangYu_002743877_section8/annual.csv");
        JTextField textField2 = new JTextField("user input");
        JLabel label4 = new JLabel("First five lines of file:");
        JTextArea textArea2 = new JTextArea();
        JButton B2 = new JButton("Click to write to file");
        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fileName = textField2.getText();
                fileIO fIO = new fileIO();
                File f = new File("Assignment7_YueliangYu_002743877_section8/annual.csv");
                String strOut;
                try {
                    fIO.writeFile(fileName,f);
                    strOut = fIO.readFile(fileName);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                textArea2.setText(strOut);

            }
        });

        /* set position
         * setBounds(x, y, width, height)
         */
        label3.setBounds(650, 20, 170, 25);
        panel.add(label3);
        textField2.setBounds(790,20,400,25);
        panel.add(textField2);
        B2.setBounds(650, 65, 170, 25);
        panel.add(B2);
        label4.setBounds(650, 110, 170, 25);
        panel.add(label4);
        textArea2.setBounds(650, 130, 500, 100);
        panel.add(textArea2);
    }
}

