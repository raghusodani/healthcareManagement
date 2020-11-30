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

class Navigation extends login{  
    public void Home(){  
        JFrame f=new JFrame("Home");  
        JButton b0=new JButton("Admin Login");  
        b0.setBounds(700,100,155,30);  
        JButton b1=new JButton("New Doctor");  
        b1.setBounds(700,150,155,30);
        JButton b2=new JButton("New Patient");  
        b2.setBounds(700,200,155,30);
        b0.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                AdminLogin();
            }
        });
       
        b2.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                newPatient();
            }

			private void newPatient() {
				JFrame pat =new JFrame("New Patient Entry");
				 JTextField t0=new JTextField();
			     JLabel l0=new JLabel("Name:");
			     JTextField t1=new JTextField();
			     JLabel l1=new JLabel("Age:");
			     JTextField t2=new JTextField();
			     JLabel l2=new JLabel("Gender:");
			     JTextField t3=new JTextField();
			     JLabel l3=new JLabel("Blood Group:");
			     l0.setBounds(600,100,155,20);
			     l1.setBounds(600,140,155,20);
			     l2.setBounds(600,180,155,20);
			     l3.setBounds(600,220,155,20);
			     t0.setBounds(700,100,155,20);
			     t1.setBounds(700,140,155,20);
			     t2.setBounds(700,180,155,20);
			     t3.setBounds(700,220,155,20);
			     
				
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
class Hospital extends Navigation{  }
public static void main(String[] args) {  
    Hospital h1 = new Hospital();
    h1.Home();
}
}