import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args){

        JFrame frame = new JFrame();
        frame.setSize(400,400);

        Panel panel = new Panel();
        panel.setBackground(Color.BLUE);
       // panel.setLayout(new GridLayout(3,2));
       // panel.setLayout(new BorderLayout());
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();




        JButton button1 = new JButton("First");
        JButton button2 = new JButton("Second");
        JButton button3 = new JButton("Third");
        JButton button4 = new JButton("Fourth");
        JButton button5 = new JButton("Fifth");
        JButton button6 = new JButton("Sixth");

        gc.gridx = 2;
        gc.gridy = 3;
        panel.add(button1, gc);

        gc.gridx = 3;
        gc.gridy = 3;
        panel.add(button3, gc);

        gc.gridx = 2;
        gc.gridy = 4;
        gc.gridwidth = 2;
        gc.fill = GridBagConstraints.BOTH;
        panel.add(button2, gc);




        // BorderLayout
        // Create a panel for the top of the BorderLayout
//        JPanel panelTop = new JPanel();
//        panelTop.add(button1);
//        panelTop.add(button6);
//
//        panel.add(panelTop, BorderLayout.PAGE_START);
//
//        panel.add(button2, BorderLayout.LINE_START);
//        panel.add(button3, BorderLayout.CENTER);
//        panel.add(button4, BorderLayout.LINE_END);
//        panel.add(button5, BorderLayout.PAGE_END);
       // panel.add(button6);


        frame.add(panel);

        //frame.pack();

        frame.setVisible(true);

    }
}



