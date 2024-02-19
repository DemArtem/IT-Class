package IT_Class.M21_Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample1 extends JFrame {

     private JTextField textField2;
     private JTextField textField3;
     private JButton button1;
     private JPanel panel;
     private JTextArea textArea1;
     private JComboBox comboBox1;
     private JRadioButton radioButton1;
     private JCheckBox checkBox1;
     private JPasswordField passwordField1;
     private JFormattedTextField formattedTextField1;
     private JList list1;
     private JTree tree1;
     private JTabbedPane tabbedPane1;
     private JSpinner spinner1;
     private JLabel Label;
     private JScrollPane ScrollPane;

     public Sample1() {
        setTitle("Sample1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setContentPane(panel);
        setLocationRelativeTo(null);
        setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public static void main(String[] args) {
        Sample1 sample1 = new Sample1();

    }
}