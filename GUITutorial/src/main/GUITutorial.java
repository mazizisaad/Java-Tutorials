package main;

/**
 *
 * @author Muhammad Azizi
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class GUITutorial implements ActionListener 
{
    JTextField firstNum, secondNum, answer;
    JButton btnCal;
    
    public GUITutorial()
    {
        JLabel lblFirstNum = new JLabel("First Number");
        JLabel lblSecondNum = new JLabel("Second Number");
        
        firstNum = new JTextField(10);
        secondNum = new JTextField(10);
        answer = new JTextField(10);
        
        btnCal = new JButton("Calculate");
        btnCal.addActionListener(this);
                
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(lblFirstNum);
        panel1.add(firstNum);
        
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(lblSecondNum);
        panel2.add(secondNum);
        
        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        panel3.add(btnCal);
        
        JPanel panelMain = new JPanel();
        panelMain.setLayout(new GridLayout(4,1));
        panelMain.add(panel1);
        panelMain.add(panel2);
        panelMain.add(answer);
        panelMain.add(panel3);
        
        JFrame frame = new JFrame("Java GUI");
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(panelMain);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        int num1 = Integer.parseInt(firstNum.getText());
        int num2 = Integer.parseInt(secondNum.getText());
        int num3 = num1 + num2;
        answer.setText(String.valueOf(num3));
    } 
    
    public static void main(String[] args) 
    {
        GUITutorial guiTutorial = new GUITutorial();
    }
}
