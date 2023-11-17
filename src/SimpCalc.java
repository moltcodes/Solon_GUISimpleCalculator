import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpCalc extends JFrame {
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JButton btnCompute;
    private JLabel a1stNumberLabel;
    private JLabel a2ndNumberLabel;
    private JLabel resultLabel;
    private JPanel jpanel;
    private JLabel lblResult;

    public SimpCalc(){

        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblResult.setForeground(Color.BLACK);
                double num1 = 0;
                double num2 = 0;
                String res = null;
                double ans;

                try{
                    num1 = Double.parseDouble(tfNumber1.getText());
                    num2 =Double.parseDouble(tfNumber2.getText());
                }catch (Exception exc){
                    JOptionPane.showMessageDialog(null, "Please input correctly!");
                }


                String op = (String) cbOperations.getSelectedItem();
                if(op == "+"){
                    ans = num1 + num2;
                    res = Double.toString(ans);
                    lblResult.setText(res);
                }else if(op == "-"){
                    ans = num1 - num2;
                    res = Double.toString(ans);
                    lblResult.setText(res);
                }else if(op == "*"){
                    ans = num1 * num2;
                    res = Double.toString(ans);
                    lblResult.setText(res);
                }else if(op == "/"){
                    if(num2 == 0){
                        lblResult.setForeground(Color.RED);
                        lblResult.setText("Undefined!");
                        return;
                    }
                        ans = num1 / num2;
                        res = Double.toString(ans);
                        lblResult.setText(res);

                }
            }
        });

    }

    public static void main(String[] args) {
        SimpCalc app = new SimpCalc();
        app.setContentPane(app.jpanel);
        app.setSize(700, 200);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);
    }

}