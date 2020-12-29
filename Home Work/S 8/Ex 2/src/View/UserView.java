package View;

import Controller.UserController;
import Model.Entity.UserEntity;
import Model.Repository.UserRepo;
import Model.Service.UserService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class UserView implements ActionListener {
    
    JFrame f;
    JRadioButton signUp,login;
    JButton submit1,submit2,updateSubmit;
    JLabel lbTitle,lbName,lbAge,lbUserName,lbPassword,lbEmail,updatelbTitle,updatelbPassword,updatelbUserName;
    JTextField tfName,tfAge,tfUserName,tfEmail,updatetfUserName;
    JPasswordField tfPassword,updatetfPassword;
    
    public UserView(){
        
        f = new JFrame("EX 2");
        lbTitle = new JLabel();
        lbName = new JLabel();
        lbAge = new JLabel();
        lbUserName = new JLabel();
        lbPassword = new JLabel();
        lbEmail = new JLabel();
        tfName = new JTextField();
        tfAge = new JTextField();
        tfUserName = new JTextField();
        tfPassword = new JPasswordField();
        tfEmail = new JTextField();
        updatelbTitle = new JLabel();
        updatelbPassword =  new JLabel();
        updateSubmit = new JButton("Submit");
        updatetfPassword = new JPasswordField();
        updatelbUserName = new JLabel();
        updatetfUserName = new JTextField();
        submit2 = new JButton("Submit");
        signUp = new JRadioButton("SignUp");
        login = new JRadioButton("LogIn");
        signUp.setBounds(130,100,100,20);
        login.setBounds(130,130,100,20);
        submit1 = new JButton("Submit");
        submit1.setBounds(125,165,85,25);
        submit1.addActionListener(this);
        
        
        f.add(signUp);
        f.add(login);
        f.add(submit1);
        f.add(lbTitle);
        f.add(lbName);
        f.add(lbAge);
        f.add(lbUserName);
        f.add(lbPassword);
        f.add(lbEmail);
        f.add(tfName);
        f.add(tfAge);
        f.add(tfUserName);
        f.add(tfPassword);
        f.add(tfEmail);
        f.add(submit2);
        f.add(updatelbTitle);
        f.add(updatelbPassword);
        f.add(updateSubmit);
        f.add(updatetfPassword);
        f.add(updatelbUserName);
        f.add(updatetfUserName);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(signUp.isSelected()){
            
            signUp.setVisible(false);
            login.setVisible(false);
            submit1.setVisible(false);
            
            lbTitle.setText("<< SignUp >>");
            lbTitle.setBounds(145,35,100,20);
            lbName.setText("Name :");
            lbName.setBounds(75,80,100,20);
            lbAge.setText("Age :");
            lbAge.setBounds(75,120,100,20);
            lbUserName.setText("UserName :");
            lbUserName.setBounds(75,160,100,20);
            lbPassword.setText("Password :");
            lbPassword.setBounds(75,200,100,20);
            lbEmail.setText("Email :");
            lbEmail.setBounds(75,240,100,20);
            tfName.setBounds(160,80,150,20);
            tfAge.setBounds(160,120,150,20);
            tfUserName.setBounds(160,160,150,20);
            tfPassword.setBounds(160,200,150,20);
            tfEmail.setBounds(160,240,150,20);
            submit2.setBounds(130,300,85,25);
            submit2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                    lbTitle.setVisible(false);
                    lbName.setVisible(false);
                    lbAge.setVisible(false);
                    lbUserName.setVisible(false);
                    lbPassword.setVisible(false);
                    lbEmail.setVisible(false);
                    tfName.setVisible(false);
                    tfAge.setVisible(false);
                    tfUserName.setVisible(false);
                    tfPassword.setVisible(false);
                    tfEmail.setVisible(false);
                    submit2.setVisible(false);
                    
                    try {
                        UserController userController = new UserController();
                        if(userController.insert(tfName.getText(), tfAge.getText(), tfUserName.getText(), tfPassword.getText(), tfEmail.getText()) == true){
                            JOptionPane.showMessageDialog(f, "You have successfully signed up");
                            UserService.getInstance().insert(new UserEntity().setName(tfName.getText()).setAge(tfAge.getText())
                            .setUserName(tfUserName.getText()).setPassword(tfPassword.getText()).setEmail(tfEmail.getText()));
                        } else{
                            JOptionPane.showMessageDialog(f, "Invalid information","Alert",JOptionPane.WARNING_MESSAGE);
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });
        }
        
        if(login.isSelected()){
            
            signUp.setVisible(false);
            login.setVisible(false);
            submit1.setVisible(false);
            
            lbTitle.setText("<< LogIn >>");
            lbTitle.setBounds(145,35,100,20);
            lbUserName.setText("UserName :");
            lbUserName.setBounds(75,100,100,20);
            lbPassword.setText("Password :");
            lbPassword.setBounds(75,140,100,20);
            tfUserName.setBounds(150,100,150,25);
            tfPassword.setBounds(150,140,150,25);
            submit2.setBounds(130,200,85,25);
            submit2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                    lbTitle.setVisible(false);
                    lbUserName.setVisible(false);
                    lbPassword.setVisible(false);
                    tfUserName.setVisible(false);
                    tfPassword.setVisible(false);
                    submit2.setVisible(false);
                    
                    try{    
                        UserController userController = new UserController();
                        if(userController.select(tfUserName.getText(),tfPassword.getText()) == true){
                            
                            JRadioButton rb = new JRadioButton("Update");
                            rb.setBounds(150,100,100,20);
                            JButton submit = new JButton("Submit");
                            submit.setBounds(140,140,85,25);
                            f.add(rb);
                            f.add(submit);
                            submit.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent e){
                                    
                                    rb.setVisible(false);
                                    submit.setVisible(false);
                                    
                                    updatelbTitle.setText("<< Update >>");
                                    updatelbTitle.setBounds(145,15,100,20);
                                    updatelbUserName.setText("UserName :");
                                    updatelbUserName.setBounds(75,40,100,20);
                                    lbName.setText("Name :");
                                    lbName.setBounds(75,80,100,20);
                                    lbAge.setText("Age :");
                                    lbAge.setBounds(75,120,100,20);
                                    updatelbPassword.setText("Password :");
                                    updatelbPassword.setBounds(75,160,100,20);
                                    lbEmail.setText("Email :");
                                    lbEmail.setBounds(75,200,100,20);
                                    updatetfUserName.setBounds(160,40,150,20);
                                    tfName.setBounds(160,80,150,20);
                                    tfAge.setBounds(160,120,150,20);
                                    updatetfPassword.setBounds(160,160,150,20);
                                    tfEmail.setBounds(160,200,150,20);
                                    updateSubmit.setBounds(170,250,85,25);
                                    updateSubmit.addActionListener(new ActionListener(){
                                        public void actionPerformed(ActionEvent e){
                                            updatelbTitle.setVisible(false);
                                            lbName.setVisible(false);
                                            lbAge.setVisible(false);
                                            updatelbPassword.setVisible(false);
                                            lbEmail.setVisible(false);
                                            tfName.setVisible(false);
                                            tfAge.setVisible(false);
                                            updatetfPassword.setVisible(false);
                                            tfEmail.setVisible(false);
                                            updateSubmit.setVisible(false);
                                            updatelbUserName.setVisible(false);
                                            updatetfUserName.setVisible(false);
                                            try {
                                                UserController userController = new UserController();
                                                if(userController.update(tfName.getText(), tfAge.getText(), updatetfUserName.getText(),
                                                        updatetfPassword.getText(), tfEmail.getText()) == true){
                                                    JOptionPane.showMessageDialog(f, "Update was successfully");
                                                    
                                                }else{
                                                    JOptionPane.showMessageDialog(f, "invalid information");
                                                }
                                            } catch (Exception ex) {
                                                ex.printStackTrace();
                                            }
                                        }
                                    });
                                    
                                }
                            });
                            
                        } else{
                            JOptionPane.showMessageDialog(f, "Your UserName or Password is INCORRECT","Alert",JOptionPane.WARNING_MESSAGE);
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(UserView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
        }
    };
}
