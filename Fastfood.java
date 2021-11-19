import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Chatbot extends JFrame{
    private JTextArea ca = new JTextArea();
    private JTextField cf = new JTextField();
    private JButton b = new JButton();
    private JLabel l = new JLabel();

    Chatbot(){
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);
        f.setLayout(null);
        f.setSize(400,400);
        f.getContentPane().setBackground(Color.RED);
        f.setTitle("Pizzarap");
        f.add(ca);
        f.add(cf);
        f.add(b);
        f.add(l);
        ca.setSize(400,310);
        ca.setLocation(1,1);
        ca.setBackground(Color.WHITE);
        cf.setSize(300,20);
        cf.setLocation(1,320);
        l.setText("SEND");
        b.add(l);
        b.setSize(400,20);
        b.setLocation(300,320);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==b){
                    String text = cf.getText();
                    ca.append("You -->" + text+ "\n");
                    cf.setText("");

                    if(text.contains("order"));{
                        replyMeth("Hi there!! my name is Dianna I am A Computer Bot");
                        replyMeth("System is still busy please wait for a While");
                        replyMeth("Thank you!!");
                    }

                }

            }
        });

    }
    public void replyMeth(String s){
        ca.append("ChatBot -->" +s+ "\n");

    }

}



public class FastFoodChatBot {

    public static void main(String[] args) {
       Chatbot chat = new Chatbot();

    }
}
