package source;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

import my.Package.Client;
import source.Register;
class Welcome3 extends JFrame
{
    JButton b1,b2;
    JLabel l1,l3;
    
    public Welcome3()
    {
        JFrame frame=new JFrame();
        frame.setTitle("Welcome To Airline Ticket Booking...");
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("C:\\Users\\HP\\Downloads\\New folder\\Airline-Reservation-System\\Airline-Reservation-System\\assets\\aeroplane3.jpg"));
        frame.add(background);
        background.setLayout(new BorderLayout());

        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        panel1.setOpaque(false);
        panel2.setOpaque(false);


        JLabel l2=new JLabel();
        l2.setText("AERO TRAVELS");
        l2.setFont(new Font("Verdana", Font.PLAIN, 90));
        l2.setLocation(150, 150);
        l1=new JLabel("");
        b1=new JButton("Login");
        b2=new JButton("Register");
        b2.setBounds(10,200,195,130);

        l2.setForeground(Color.WHITE);
//        background.add(l1);
//        background.add(b1);
//        background.add(b2);
//        System.out.println("\n\n");
//        background.add(l2);
//        setSize(400,400);
//        setSize(400,400);

        panel1.add(l2);
        panel2.add(b1);
        panel2.add(b2);
        background.add(panel1,BorderLayout.NORTH);
        background.add(panel2,BorderLayout.CENTER);

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("clicked Register");
                MyFrame myFrame=new MyFrame();
                myFrame.setVisible(true);

            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked Login");
                RunClient runClient=new RunClient();
                runClient.start();
            }
        });
    }
   
    static class RunClient{
        public void start() {
            Client client = new Client();
            client.runClient();
        }
    }

    public static void main(String args[])
    {
    new Welcome3();
    }
}