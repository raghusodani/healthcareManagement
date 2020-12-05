
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;
class Admin{
    private String userName="Admin";
    private String password="1234";
    public boolean check(String userName,String password){
        if(userName.equals(this.userName) && password.equals(this.password))
            return true;
        else
            return false;
    }
    public void godMode(){
        JFrame f = new JFrame("GOD MODE");
        f.setSize(1920,1080);
        f.setVisible(true);
    }
}
class login extends Admin{
    private static JDialog d;
    public void loginFailed(){
        JFrame f= new JFrame();  
        d = new JDialog(f , "Dialog Example", true);  
        d.setLayout( new FlowLayout() );  
        JButton b = new JButton ("OK");  
        b.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
                login.d.setVisible(false);  
            }  
        });  
        d.add( new JLabel ("Click button to continue."));  
        d.add(b);   
        d.setSize(300,300);
        d.setVisible(true); 
    }
    public static void AdminLogin(){
        login obj = new login();
        JFrame f=new JFrame("Admin Login");
        JTextField tf=new JTextField();
        JLabel l0=new JLabel("Username:");    
        l0.setBounds(600,150,80,30);
        tf.setBounds(700,150,200,30);
        JPasswordField value = new JPasswordField();   
        JLabel l1=new JLabel("Password:");    
        l1.setBounds(600,200, 80,30);    
        value.setBounds(700,200,200,30);    
        JButton b=new JButton("Login");
        b.setBounds(650,300,155,30);
        b.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String userName = tf.getText();
                String password = value.getText();
                System.out.println(userName+" "+password);
                tf.setText("");
                value.setText("");
                if(obj.check(userName,password)){
                    obj.godMode();
                }
                else{
                    obj.loginFailed();
                }
            }
        });
        f.add(l0);
        f.add(value);  
        f.add(l1);
        f.add(tf);
        f.add(b);
        f.setSize(1920,1080);  
        f.setLayout(null);  
        f.setVisible(true);
    }
    public static void DoctorLogin(){
        login obj = new login();
        JFrame f=new JFrame("Doctor Login");
        JTextField tf=new JTextField();
        JLabel l0=new JLabel("Username:");    
        l0.setBounds(600,150,80,30);
        tf.setBounds(700,150,200,30);
        JPasswordField value = new JPasswordField();   
        JLabel l1=new JLabel("Password:");    
        l1.setBounds(600,200, 80,30);    
        value.setBounds(700,200,200,30);    
        JButton b=new JButton("Login");
        b.setBounds(650,300,155,30);
        b.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String userName = tf.getText();
                String password = value.getText();
                tf.setText("");
                value.setText("");
                if(obj.check(userName,password)){
                    obj.godMode();
                }
                else{
                    obj.loginFailed();
                }
            }
        });
        f.add(l0);
        f.add(value);  
        f.add(l1);
        f.add(tf);
        f.add(b);
        f.setSize(1920,1080);  
        f.setLayout(null);  
        f.setVisible(true);
    }
    public static void PatientLogin(){
        login obj = new login();
        JFrame f=new JFrame("Patient Login");
        JTextField tf=new JTextField();
        JLabel l0=new JLabel("Username:");    
        l0.setBounds(600,150,80,30);
        tf.setBounds(700,150,200,30);
        JPasswordField value = new JPasswordField();   
        JLabel l1=new JLabel("Password:");    
        l1.setBounds(600,200, 80,30);    
        value.setBounds(700,200,200,30);    
        JButton b=new JButton("Login");
        b.setBounds(650,300,155,30);
        b.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String userName = tf.getText();
                String password = value.getText();
                System.out.println(userName);
                value.setText("");
                tf.setText("");
                if(obj.check(userName,password)){
                    obj.godMode();
                }
                else{
                    obj.loginFailed();
                }
            }
        });
        f.add(l0);
        f.add(value);  
        f.add(l1);
        f.add(tf);
        f.add(b);
        f.setSize(1920,1080);  
        f.setLayout(null);  
        f.setVisible(true);
    }
}

class Navigation extends login{  
    public void LoginPage(){  
        JFrame f=new JFrame("Login Page");  
        JButton b0=new JButton("Admin Login");  
        b0.setBounds(700,100,155,30);  
        JButton b1=new JButton("Doctor Login");  
        b1.setBounds(700,150,155,30);
        JButton b2=new JButton("Patient Login");  
        b2.setBounds(700,200,155,30);
        b0.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                AdminLogin();
            }
        });
        b1.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                DoctorLogin();
            }
        });
        b2.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                PatientLogin();
            }
        });
        f.add(b0);  
        f.add(b1); 
        f.add(b2); 
        f.setSize(1920,1080);  
        f.setLayout(null);  
        f.setVisible(true);   
    }  
}
class Hospital extends Navigation{  
public static void main(String[] args) {  
    Hospital obj = new Hospital();
    obj.LoginPage();
}
}