/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField; 
/**
 *
 * @author RC_Student_lab
 */
public class Register {

    public void RegisterUser(){
        
         JFrame frame = new JFrame("GUI");
        // Setting the width and height of frame
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        JPanel panel = new JPanel();    
        // adding panel to frame
        frame.add(panel);
        
        placeComponents(panel);

        // Setting the frame visibility to true
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        // Creating JLabel
        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);
        
        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        JLabel nameLabel = new JLabel("Firstname");
        nameLabel.setBounds(10,50,80,25);
        panel.add(nameLabel);
        JTextField Firstname = new JTextField(20);
        Firstname.setBounds(100,50,165,25);
        panel.add(Firstname);
         //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        JLabel nameLabel2 = new JLabel("Lastname");
        nameLabel2.setBounds(10,80,80,25);
        panel.add(nameLabel2);
        JTextField Lastname = new JTextField(20);
        Lastname.setBounds(100,80,165,25);
        panel.add(Lastname);  
     // Same process for password label and text field.
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,110,80,25);
        panel.add(passwordLabel);
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,110,165,25);
        panel.add(passwordText);

        // Creating login button
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 140, 80, 25);
        panel.add(loginButton);
    }

}
     


    
    

