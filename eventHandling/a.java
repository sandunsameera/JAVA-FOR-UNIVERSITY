import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javafx.scene.control.PasswordField;

public class a extends JFrame{
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;


    public a(){
        super("This is the title bar");
        setLayout(new FlowLayout());

        item1 = new JTextField(10);
        add(item1);
        item2 = new JTextField("Enter txt here ");
        add(item2);
        item3 = new JTextField("Unedditable",20);
        item3.setEditable(false);
        passwordField = new JPasswordField("ThisIsMyPassword");
        add(passwordField);


        theHandler handler = new theHandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        passwordField.addActionListener(handler);


    }

    private class theHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String string = "";

            if(event.getSource() == item1)
                string = String.format("field 1 is %s " , event.getActionCommand());

                else if(event.getSource() == item2)
                    string = String.format("field 2 is %s " , event.getActionCommand());
                    
                    else if(event.getSource() == item3)
                    string = String.format("field 3 is %s " , event.getActionCommand());
                    
                    else if(event.getSource() == passwordField)
                    string = String.format("PasswordField is %s " , event.getActionCommand());
            
                    JOptionPane.showMessageDialog(null, string);
        }

    }


}