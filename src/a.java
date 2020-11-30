import javax.swing.*;  

import java.awt.*;  
import java.awt.event.*;
class Admin{
	static receptionist r1 = new receptionist();
	static hospitals H1 = new hospitals(10,10);
	static patient[] patients_all = new patient[10];
	static doctor[] doctor_all = new doctor[10];
	static int no_of_doctors = 0;
	static int no_of_patients = 0;

	static int[] doctor_age=new int[10];
	static String[] doctor_name=new String[10];
	static String[] doctor_gender=new String[10];
	static int[] doctor_contact=new int[10];
	static int[] patient_age=new int[10];
	static String[] patient_name=new String[10];
	static String[] patient_gender=new String[10];
	static int[] patient_contact=new int[10];
	
	
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
    public void newDoctor() {
		JFrame doc =new JFrame("New Doctor Entry");
		 JTextField t0=new JTextField();
	     JLabel l0=new JLabel("Name:");
	     JTextField t1=new JTextField();
	     JLabel l1=new JLabel("Age:");
	     JTextField t2=new JTextField();
	     JLabel l2=new JLabel("Gender:");
	     JTextField t4=new JTextField();
	     JLabel l4=new JLabel("Phone Number:");
	     JButton b = new JButton("Enter");
	     
	     l0.setBounds(600,100,155,20);
	     l1.setBounds(600,140,155,20);
	     l2.setBounds(600,180,155,20);
	     l4.setBounds(600,220,155,20);
	     b.setBounds(600,300,155,20);
	     t0.setBounds(700,100,155,20);
	     t1.setBounds(700,140,155,20);
	     t2.setBounds(700,180,155,20);
	     t4.setBounds(700,220,155,20);
	    
	     doc.add(b);
	     doc.add(l0);
	     doc.add(l1);
	     doc.add(l2);
	     doc.add(l4);
	     doc.add(t4);
	     doc.add(t0);
	     doc.add(t1);
	     doc.add(t2);
	     doc.setSize(1920,1080);  
	     doc.setLayout(null);  
	     doc.setVisible(true);
	     b.addActionListener( new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	    		 String name = t0.getText(),gender=t2.getText();
	    	     int age = Integer.parseInt(t1.getText()),phnNo=Integer.parseInt(t4.getText());
	    	     
	    		 doctor a = new doctor(name,gender,phnNo,age);
         	     doctor_all[no_of_doctors]=a;
	    	     no_of_doctors++;
	    	     System.out.println(no_of_doctors);
	    		
	    	     
	    	    
	    	     //dikkat
	    	     for(int i=0;i<10;i++) {
	    		 doctor_name[i] = t0.getText();
	    		 doctor_gender[i]=t2.getText();
	    	      doctor_age[i] = Integer.parseInt(t1.getText());
	    	      doctor_contact[i]=Integer.parseInt(t4.getText());
	    		 
	    		 }
	    	    	 
	    	  
	    	     
	    	     JFrame success = new JFrame("success");
	    	     JLabel l5 = new JLabel("successfully resgistered");
	    	     l5.setBounds(700,300,155,20);
	    	     success.add(l5);
	    	     success.setSize(1920,1080);  
	    	     success.setLayout(null);  
	    	     success.setVisible(true);
	    		   
	    	 }
	    	 
	    	 
	    	 
	     });
	     
	     
	     
	}
    public static void newPatient() {
		JFrame pat =new JFrame("New Patient admit");
		 JTextField t0=new JTextField();
	     JLabel l0=new JLabel("Name:");
	     JTextField t1=new JTextField();
	     JLabel l1=new JLabel("Age:");
	     JTextField t2=new JTextField();
	     JLabel l2=new JLabel("Gender:");
	     JTextField t3=new JTextField();
	     JLabel l3=new JLabel("Blood Group:");
	     JTextField t4=new JTextField();
	     JLabel l4=new JLabel("Phone Number:");
	     l0.setBounds(500,100,155,20);
	     l1.setBounds(500,140,155,20);
	     l2.setBounds(500,180,155,20);
	     l3.setBounds(500,220,155,20);
	     l4.setBounds(500,260,155,20);
	     t0.setBounds(600,100,155,20);
	     t1.setBounds(600,140,155,20);
	     t2.setBounds(600,180,155,20);
	     t3.setBounds(600,220,155,20);
	     t4.setBounds(600,260,155,20);
	     pat.add(l0);
	     pat.add(l1);
	     pat.add(l2);
	     pat.add(l3);
	     pat.add(t0);
	     pat.add(t1);
	     pat.add(t2);
	     pat.add(t3);
	     pat.add(t4);
	     pat.add(l4);
	     
	     JButton b = new JButton("Enter");
	     b.setBounds(700,300,155,20);
	     pat.add(b);
	     pat.setSize(1920,1080);  
	     pat.setLayout(null);  
	     pat.setVisible(true); 
	     
	     b.addActionListener( new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	    		 String name = t0.getText(),gender=t2.getText(),bg=t3.getText();
	    	     int age = Integer.parseInt(t1.getText()),phnNo=Integer.parseInt(t4.getText());
	    	     patient a = new patient(name,gender,phnNo,age,bg);
	    	     
	    	     
	    	     //dikkat
	    	     for(int i=0;i<10;i++) {
		    		 patient_name[i] = t0.getText();
		    		 patient_gender[i]=t2.getText();
		    	      patient_age[i] = Integer.parseInt(t1.getText());
		    	      patient_contact[i]=Integer.parseInt(t4.getText());
		    		 
		    		 }
	    	     
	    	     
	    	     
	    	     if(r1.book_room(H1)) {
	    	     patients_all[no_of_patients]=a;
	    	     no_of_patients++;
	    	     JFrame success = new JFrame("success");
	    	     JLabel l5 = new JLabel("successfully resgistered");
	    	     l5.setBounds(700,300,155,20);
	    	     success.add(l5);
	    	     success.setSize(1920,1080);  
	    	     success.setLayout(null);  
	    	     success.setVisible(true);
	    	     System.out.println(no_of_patients);
	    	      }
	    	     else {
	    	    	 JFrame failure = new JFrame("failure");
		    	     JLabel l6 = new JLabel("room not available");
		    	     l6.setBounds(700,300,155,20);
		    	     failure.add(l6);
		    	     failure.setSize(1920,1080);  
		    	     failure.setLayout(null);  
		    	     failure.setVisible(true); 
	    	     }
	    	 }
	     });
	     
	     
	}
    
    public void doctorList() {
     	
     	JFrame doclist=new JFrame("Doctor List");
     	
     	 
     	JLabel l1=new JLabel();
     	JLabel l2=new JLabel();
     	JLabel l3=new JLabel();
     	JLabel l4=new JLabel();
     	JLabel l5=new JLabel();
     	JLabel l6=new JLabel();
     	JLabel l7=new JLabel();
     	JLabel l8=new JLabel();
     	JLabel l9=new JLabel();
     	JLabel l10=new JLabel();
     	JLabel l11=new JLabel();
     	JLabel l12=new JLabel();
     	 l1.setBounds(500,140,155,20);
	     l2.setBounds(500,180,155,20);
	     l3.setBounds(500,220,155,20);
	     l4.setBounds(500,260,155,20);
	     l5.setBounds(500,300,155,20);
	     l6.setBounds(500,340,155,20);
	     l7.setBounds(500,380,155,20);
	     l8.setBounds(500,420,155,20);
	     l9.setBounds(500,460,155,20);
	     l10.setBounds(500,500,155,20);
	     l11.setBounds(500,540,155,20);
	     l12.setBounds(500,580,155,20);
     	doclist.add(l1);
     	doclist.add(l2);
     	doclist.add(l3);
     	doclist.add(l4);
     	doclist.add(l5);
     	doclist.add(l6);
     	doclist.add(l7);
     	doclist.add(l8);
     	doclist.add(l9);
     	doclist.add(l10);
     	doclist.add(l11);
     	doclist.add(l12);
     	

     	 
     	
     	l1.setText("Name: "+doctor_name[0]);
     	l2.setText("Age: "+doctor_age[0]);
     	l3.setText("Gender: "+doctor_gender[0]);
     	l4.setText("Contact: "+doctor_contact[0]);
//     	l5.setText("Name: "+doctor_name[1]);
//     	l6.setText("Age: "+doctor_age[1]);
//     	l7.setText("Gender: "+doctor_gender[1]);
//     	l8.setText("Contact: "+doctor_contact[1]);
//     	l9.setText("Name: "+doctor_name[2]);
//     	l10.setText("Age: "+doctor_age[2]);
//     	l11.setText("Gender: "+doctor_gender[2]);
//     	l12.setText("Contact: "+doctor_contact[2]);
//     	
     	
     	
     	doclist.setSize(1920,1080);  
	     doclist.setLayout(null);  
	     doclist.setVisible(true); 
    }
   
    
    
    public void patientList() {
    	JFrame patlist=new JFrame("Patient List");
     	
    	 
     	JLabel l1=new JLabel();
     	JLabel l2=new JLabel();
     	JLabel l3=new JLabel();
     	JLabel l4=new JLabel();
     	JLabel l5=new JLabel();
     	JLabel l6=new JLabel();
     	JLabel l7=new JLabel();
     	JLabel l8=new JLabel();
     	JLabel l9=new JLabel();
     	JLabel l10=new JLabel();
     	JLabel l11=new JLabel();
     	JLabel l12=new JLabel();
     	 l1.setBounds(500,140,155,20);
	     l2.setBounds(500,180,155,20);
	     l3.setBounds(500,220,155,20);
	     l4.setBounds(500,260,155,20);
	     l5.setBounds(500,300,155,20);
	     l6.setBounds(500,340,155,20);
	     l7.setBounds(500,380,155,20);
	     l8.setBounds(500,420,155,20);
	     l9.setBounds(500,460,155,20);
	     l10.setBounds(500,500,155,20);
	     l11.setBounds(500,540,155,20);
	     l12.setBounds(500,580,155,20);
     	patlist.add(l1);
     	patlist.add(l2);
     	patlist.add(l3);
     	patlist.add(l4);
     	patlist.add(l5);
     	patlist.add(l6);
     	patlist.add(l7);
     	patlist.add(l8);
     	patlist.add(l9);
     	patlist.add(l10);
     	patlist.add(l11);
     	patlist.add(l12);
     	

     	 
     	
     	l1.setText("Name: "+patient_name[0]);
     	l2.setText("Age: "+patient_age[0]);
     	l3.setText("Gender: "+patient_gender[0]);
     	l4.setText("Contact: "+patient_contact[0]);
//     	l5.setText("Name: "+doctor_name[1]);
//     	l6.setText("Age: "+doctor_age[1]);
//     	l7.setText("Gender: "+doctor_gender[1]);
//     	l8.setText("Contact: "+doctor_contact[1]);
//     	l9.setText("Name: "+doctor_name[2]);
//     	l10.setText("Age: "+doctor_age[2]);
//     	l11.setText("Gender: "+doctor_gender[2]);
//     	l12.setText("Contact: "+doctor_contact[2]);
//     	
     	
     	
     	patlist.setSize(1920,1080);  
	    patlist.setLayout(null);  
	    patlist.setVisible(true);
    }
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
        JButton b3=new JButton("Doctor List");
        b3.setBounds(700,250,155,30);
        JButton b4=new JButton("Patient List");
        b4.setBounds(700,300,155,30);
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
                newDoctor();
            }
            
			
        });
        b2.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                newPatient();
            }

			
        });
        
        b3.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                doctorList();
            }

			
        });
        
        b4.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                patientList();
            }

			
        });
        f.add(b0);  
        f.add(b1); 
        f.add(b2); 
        f.add(b3);
        f.add(b4);
        f.setSize(1920,1080);  
        f.setLayout(null);  
        f.setVisible(true);   
    }  
}
class Hospital extends Navigation{ 
	
	 
	
     public static void main(String[] args) {  
    	 Hospital h1 = new Hospital();
    	 h1.Home();
    	 
}
}




