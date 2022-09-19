import javax.swing.*;
import java.awt.*;
import javax.swing.*;

public class buttons{
    buttons() {
        JFrame f = new JFrame();
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        JPanel p3 = new JPanel();
        p3.setLayout(null);
        JLabel l1 = new JLabel("firstname:");
        JTextField jtf = new JTextField("enter your first name");
        JTextField jtf1 = new JTextField(100);
        JTextField jtf2 = new JTextField(120);
        l1.setBounds(20, 20, 90, 30);
        jtf.setBounds(80, 20, 90, 30);
        p1.add(jtf);
        p1.add(l1);
        JLabel l2 = new JLabel("lastname:");
        JTextField jtf4 = new JTextField("enter your last name");
        l2.setBounds(20, 60, 90, 30);
        jtf4.setBounds(80, 60, 90, 30);
        p1.add(jtf4);
        p1.add(l2);
        JLabel l3 = new JLabel("regdno:");
        JTextField jtf5 = new JTextField("enter your regd no");
        l3.setBounds(20, 100, 90, 30);
        jtf5.setBounds(80, 100, 90, 30);
        p1.add(jtf5);
        p1.add(l3);
        JLabel l4 = new JLabel("email:");
        JTextField jtf6 = new JTextField("enter your email");
        l4.setBounds(20, 140, 90, 30);
        jtf6.setBounds(80, 140, 90, 30);
        p1.add(jtf6);
        p1.add(l4);
        JLabel l5 = new JLabel("gender:");
        JTextField jtf7 = new JTextField("enter your gender");
        l5.setBounds(20, 180, 90, 30);
        jtf7.setBounds(80, 180, 90, 30);
        p1.add(jtf7);
        p1.add(l5);
        JLabel l6 = new JLabel("address:");
        JTextField jtf8 = new JTextField("enter your address");
        l6.setBounds(20, 220, 90, 30);
        jtf8.setBounds(80, 220, 90, 30);
        p1.add(jtf8);
        p1.add(l6);
        JLabel l7 = new JLabel("skills:");
        JTextField jtf9 = new JTextField("enter your skills");
        l7.setBounds(20, 260, 120, 90);
        jtf9.setBounds(80, 260, 120, 90);
        p1.add(jtf9);
        p1.add(l7);
        JLabel l8 = new JLabel("password:");
        JTextField jtf10 = new JTextField("enter your password");
        l8.setBounds(20, 360, 90, 30);
        jtf10.setBounds(80, 360, 90, 30);
        p1.add(jtf10);
        p1.add(l8);
        JLabel l9 = new JLabel("emailaddress:");
        JTextField jtf11 = new JTextField("enter your email address");
        l9.setBounds(40, 60, 120, 40);
        jtf11.setBounds(120, 60, 120, 40);
        p2.add(jtf11);
        p2.add(l9);
        JLabel l10 = new JLabel("password:");
        JTextField jtf12 = new JTextField("enter yor email password");
        l10.setBounds(40, 120, 120, 40);
        jtf12.setBounds(120, 120, 120, 40);
        p2.add(jtf12);
        p2.add(l10);
        JButton b = new JButton("submit");
        b.setBounds(120, 410, 90, 30);
        p1.add(b);
        JButton b1 = new JButton("login");
        b1.setBounds(120, 210, 90, 30);
        p2.add(b1);
        JLabel l11 = new JLabel("name:");
        JTextField jtf13 = new JTextField("enter your name");
        l11.setBounds(40, 180, 90, 40);
        jtf13.setBounds(90, 180, 120, 40);
        p3.add(jtf13);
        p3.add(l11);
        JButton c = new JButton(" search");
        c.setBounds(280, 180, 120, 40);
        p3.add(c);
        p3.add(jtf2);

        JTabbedPane t = new JTabbedPane();
        t.setBounds(50, 60, 800, 500);
        t.add("registration", p1);
        t.add("login", p2);
        t.add("search", p3);
        f.add(t);
        f.setSize(900, 700);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new buttons();
    }
}
    
