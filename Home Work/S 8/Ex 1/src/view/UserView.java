
package view;

import Controller.UserController;
import Model.Entity.UserEntity;
import Model.Service.UserService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class UserView implements ActionListener {
    
    JFrame f = new JFrame();
    JLabel lbName,lbAge,lbFatherName,lbPhoneNumber,lbNationalCode,lbAddress;
    JTextField tfName,tfAge,tfFatherName,tfPhoneNumber,tfNationalCode,tfAddress;
    JButton submit;
    
    public UserView(){
        //Label
        lbName = new JLabel("Name :");
        lbName.setBounds(70,50,100,20);
        lbAge = new JLabel("Age :");
        lbAge.setBounds(70,85,100,20);
        lbFatherName = new JLabel("Father Name :");
        lbFatherName.setBounds(70,120,100,20);
        lbPhoneNumber = new JLabel("Phone Number :");
        lbPhoneNumber.setBounds(70,155,100,20);
        lbNationalCode = new JLabel("National Code :");
        lbNationalCode.setBounds(70,190,100,20);
        lbAddress = new JLabel("Address :");
        lbAddress.setBounds(70,225,100,20);
        //TextField
        tfName = new JTextField();
        tfName.setBounds(170,50,150,20);
        tfAge = new JTextField();
        tfAge.setBounds(170,85,150,20);
        tfFatherName = new JTextField();
        tfFatherName.setBounds(170,120,150,20);
        tfPhoneNumber = new JTextField();
        tfPhoneNumber.setBounds(170,155,150,20);
        tfNationalCode = new JTextField();
        tfNationalCode.setBounds(170,190,150,20);
        tfAddress = new JTextField();
        tfAddress.setBounds(170,225,150,20);
        submit = new JButton("Submit");
        submit.setBounds(150,280,100,30);
        submit.addActionListener(this);
        
        
        f.add(lbName);
        f.add(lbAge);
        f.add(lbFatherName);
        f.add(lbPhoneNumber);
        f.add(lbNationalCode);
        f.add(lbAddress);
        f.add(tfName);
        f.add(tfAge);
        f.add(tfFatherName);
        f.add(tfPhoneNumber);
        f.add(tfNationalCode);
        f.add(tfAddress);
        f.add(submit);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    
    
    public void actionPerformed(ActionEvent e){
        
        lbName.setVisible(false);
        lbAge.setVisible(false);
        lbFatherName.setVisible(false);
        lbPhoneNumber.setVisible(false);
        lbNationalCode.setVisible(false);
        lbAddress.setVisible(false);
        tfName.setVisible(false);
        tfAge.setVisible(false);
        tfFatherName.setVisible(false);
        tfPhoneNumber.setVisible(false);
        tfNationalCode.setVisible(false);
        tfAddress.setVisible(false);
        submit.setVisible(false);
        
        try {
            UserController userController = new UserController();
            
            if(userController.insert(tfName.getText(), tfAge.getText(), tfFatherName.getText(), tfPhoneNumber.getText(),
                    tfNationalCode.getText(), tfAddress.getText()) == false){
                
                JOptionPane.showMessageDialog(f, "Invalid Information", "Alert", JOptionPane.ERROR_MESSAGE);
                
            } else{
                
                UserService.getInstance().insert(new UserEntity().setName(tfName.getText()).setAge(tfAge.getText())
                .setFatherName(tfFatherName.getText()).setPhoneNumber(tfPhoneNumber.getText()).setNationalCode(tfNationalCode.getText())
                .setAddress(tfAddress.getText()));
                
                JOptionPane.showMessageDialog(f,"Your information was successfully registered");
                
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
}
