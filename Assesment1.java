
import java.awt.*;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Assesment1{
    public static void main(String[] args){
        


        JFrame frame = new JFrame();
        frame.setTitle("Students Information");
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Border border = BorderFactory.createLineBorder(new Color(16, 8, 24),5);
        frame.setResizable(true);
        ImageIcon image = new ImageIcon("logo.png");

        JButton button=new JButton("Register");  
        button.setBounds(100,300,95,30);  
        frame.add(button);
        // frame.setSize(400,400);  
        frame.setLayout(null);
        // frame.setVisible(true); 



        JButton button1=new JButton("Login");  
        button1.setBounds(200,300,95,30);  
        frame.add(button1);
        // frame.setSize(400,400);  
        frame.setLayout(null);  
        // frame.setVisible(true); 

        JButton button2=new JButton("Search");  
        button2.setBounds(300,300,95,30);  
        frame.add(button2);
        // frame.setSize(400,400);  
        frame.setLayout(null);  
        // frame.setVisible(true); 



        // Image scaledImage1 = image.getScaledInstance(232, 177, Image.SCALE_DEFAULT);
        JLabel label = new JLabel();
        label.setText("Lendi Institute of Engineering and Technology");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,500,500);
        

        // label.setVerticalTextPosition(JLabel.TOP);
        // label.setForeground(new Color(16, 8, 24));
        label.setFont(new Font("MV Boli",Font.BOLD,10));
        label.setIconTextGap(100);
        // frame.getContentPane().setBackground(new Color(255,192,203));
        // label.setOpaque(false);

        // frame.setLayout(null);


        frame.setVisible(true);
        // ImageIcon image = new ImageIcon("logo.png");

        frame.setIconImage(image.getImage());
        // frame.getContentPane().setBackground(new Color(255,192,203));
        frame.add(label);
        
        // JFrame frame =new JFrame("Button Example");  
        frame.setResizable(true);
        frame.getContentPane().setBackground(new Color(255,192,203));
        // frame.setSize(400,400);  
        // frame.setLayout(null);  
        // frame.setVisible(true); 
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setResizable(false);

    }
}

