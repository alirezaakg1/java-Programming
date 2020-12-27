
package View;

import Model.Entity.UserEntity;
import Model.Service.UserService;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class UserView implements ActionListener{
    
    JFrame f;
    JRadioButton singUp,logIn;
    JButton click,submit;
    JLabel lTitle,lName,lPassword,lUserName,lEmail;
    JTextField tfName,tfUserName,tfEmail;
    JPasswordField pPassword;
    JLabel message1,message2;
    
    public UserView(){
        f = new JFrame();
        lTitle = new JLabel();
        lName = new JLabel();
        lPassword = new JLabel();
        lUserName = new JLabel();
        lEmail = new JLabel();
        tfName = new JTextField();
        tfUserName = new JTextField();
        tfEmail = new JTextField();
        pPassword = new JPasswordField();
        message1 = new JLabel();
        message2 = new JLabel();
        submit = new JButton("Submit");
        singUp = new JRadioButton("1) SignUP");
        logIn = new JRadioButton("2) LogIn");
        singUp.setBounds(150,100,200,30);
        logIn.setBounds(150,125,200,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(singUp);
        bg.add(logIn);
        click = new JButton("Click");
        click.setBounds(140,170,100,25);
        click.addActionListener(this);
        
        
        f.add(lTitle);
        f.add(lName);
        f.add(lPassword);
        f.add(lUserName);
        f.add(lEmail);
        f.add(tfName);
        f.add(pPassword);
        f.add(tfUserName);
        f.add(tfEmail);
        f.add(click);
        f.add(submit);
        f.add(singUp);
        f.add(logIn);
        f.add(message1);
        f.add(message2);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        if(singUp.isSelected()){
            lTitle.setText("<< SignUp >>");
            lTitle.setBounds(150,35,100,30);
            lName.setText("Name :");
            lName.setBounds(70,80,100,30);
            lPassword.setText("Password :");
            lPassword.setBounds(70,120,100,30);
            lUserName.setText("UserName :");
            lUserName.setBounds(70,160,100,30);
            lEmail.setText("Email :");
            lEmail.setBounds(70,200,100,30);
            
            tfName.setBounds(145,85,150,20);
            pPassword.setBounds(145,125,150,20);
            tfUserName.setBounds(145,165,150,20);
            tfEmail.setBounds(145,205,150,20);
            submit.setBounds(145,250,100,25);
            
            submit.addActionListener(new ActionListener(){
                
                public void actionPerformed(ActionEvent e){
                    
                    lTitle.setVisible(false);
                    lName.setVisible(false);
                    lPassword.setVisible(false);
                    lUserName.setVisible(false);
                    lEmail.setVisible(false);
                    tfName.setVisible(false);
                    tfUserName.setVisible(false);
                    tfEmail.setVisible(false);
                    pPassword.setVisible(false);
                    submit.setVisible(false);
                    
                    if(tfName.getText().equals("") || pPassword.getText().equals("") || tfUserName.getText().equals("")
                            || tfEmail.getText().equals("")){
                        message1.setText("Invalid Information");
                        message1.setBounds(100,150,300,20);
                    } else{
                    try{
                        UserService.getInstatnce().insert(new UserEntity().setName(tfName.getText()).setPass(pPassword.getText())
                                .setUserName(tfUserName.getText()).setEmail(tfEmail.getText()));
                        message1.setText("SingUp was Successfully");
                        message1.setBounds(100,150,300,20);
                    } catch(Exception ex){
                        message2.setText("Fail to SignUp");
                        message2.setBounds(100,150,300,20);
                        ex.printStackTrace();
                    }
                    }
                }
                
            });
            
            singUp.setVisible(false);
            logIn.setVisible(false);
            click.setVisible(false);
        } // End of if
        
        
        if(logIn.isSelected()){
            lTitle.setText("<< LogIn >> ");
            lTitle.setBounds(150,35,100,30);
            lUserName.setText("UserName :");
            lUserName.setBounds(70,100,100,30);
            lPassword.setText("Password :");
            lPassword.setBounds(70,140,100,30);
            
            tfUserName.setBounds(150,105,150,20);
            pPassword.setBounds(150,145,150,20);
            submit.setBounds(150,200,100,25);
            
            submit.addActionListener(new ActionListener(){
                
                public void actionPerformed(ActionEvent e){
                    
                    lTitle.setVisible(false);
                    lPassword.setVisible(false);
                    lUserName.setVisible(false);
                    tfUserName.setVisible(false);
                    pPassword.setVisible(false);
                    submit.setVisible(false);
                    boolean check = false;
                    
                    try{
                        List<UserEntity> userEntityList = UserService.getInstatnce().select();
                        for(UserEntity userEntity : userEntityList){
                            if(userEntity.getUserName().equals(tfUserName.getText()) && userEntity.getPass().equals(pPassword.getText())){
                                check = true;
                                break;
                            }
                        }
                        if(check == true){
                            message1.setText("LogIn was Successfully");
                            message1.setBounds(100,150,300,20);
                        } else{
                            message1.setText("userName or Password is Invalid");
                            message1.setBounds(100,150,300,20);
                          }
                        
                    } catch(Exception ex){
                        message2.setText("Fail to LogIn");
                        message2.setBounds(100,150,300,20);
                        ex.printStackTrace();
                    }
                    
                }
                
            });
            
            singUp.setVisible(false);
            logIn.setVisible(false);
            click.setVisible(false);
        } // End of if
    }
}
