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
}
class login extends Admin{
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
		    	    // System.out.println(no_of_doctors);
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
		     
		     
		     b.addActionListener( new ActionListener() {
		    	 public void actionPerformed(ActionEvent e) {
		    		 String name = t0.getText(),gender=t2.getText(),bg=t3.getText();
		    	     int age = Integer.parseInt(t1.getText()),phnNo=Integer.parseInt(t4.getText());
		    	     patient a = new patient(name,gender,phnNo,age,bg);
		    	     patients_all[no_of_patients]=a;
		    	     no_of_patients++;
		    	     doctors_button_list(a);
		    	 }
		     });
		     pat.setSize(1920,1080);  
		     pat.setLayout(null);  
		     pat.setVisible(true); 
		     
		     
		}
	    public static void make_bill(patient a) {
	    	JFrame pat =new JFrame("Patient detalis and bill");
	    	JLabel l0=new JLabel("Name:");
	    	JLabel l1=new JLabel("Age:");
	    	JLabel l2=new JLabel("Gender:");
	    	JLabel l3=new JLabel("BG :");
	    	JLabel l4=new JLabel("Contact no.:");
	    	JLabel l5=new JLabel(a.getName());
	    	JLabel l6=new JLabel(Integer.toString(a.getAge()));
	    	JLabel l7=new JLabel(a.getGender());
	    	JLabel l8=new JLabel(a.getBlood_group());
	    	JLabel l9=new JLabel(Integer.toString(a.getContact()));
	    	 l0.setBounds(500,100,155,20);
		     l1.setBounds(500,140,155,20);
		     l2.setBounds(500,180,155,20);
		     l3.setBounds(500,220,155,20);
		     l4.setBounds(500,260,155,20);
		     l5.setBounds(600,100,155,20);
		     l6.setBounds(600,140,155,20);
		     l7.setBounds(600,180,155,20);
		     l8.setBounds(600,220,155,20);
		     l9.setBounds(600,260,155,20);
		     pat.add(l0);
		     pat.add(l1);
		     pat.add(l2);
		     pat.add(l3);
		     pat.add(l4);
		     pat.add(l5);
		     pat.add(l6);
		     pat.add(l7);
		     pat.add(l8);
		     pat.add(l9);
		     int r = a.getStatus();
		   //  JLabel test=new JLabel(Integer.toString(r));
		    // test.setBounds(600,300,155,20);
		    // pat.add(test);
		     int amt = 100;
		     if(r==1) {
		    	 JLabel l10 = new JLabel("Doctor Fees : "+ amt);
		    	 JLabel l11 = new JLabel("Total amount to be paid : "+amt);
		         l10.setBounds(600,300,155,20);
			     l11.setBounds(600,340,155,20);
			     pat.add(l10);
			     pat.add(l11);
		     }
		     if(r==0) {
		    	 JLabel l10 = new JLabel("Doctor Fees : "+ amt);
		    	 JLabel l11 = new JLabel("Isolation Ward : "+ 5000);
		    	 JLabel l12 = new JLabel("Total amount to be paid : 5100 ");
		    	 l10.setBounds(600,300,155,20);
			     l11.setBounds(600,340,155,20);
			     l12.setBounds(600,380,155,20);
			     pat.add(l10);
			     pat.add(l11);
			     pat.add(l12);
			     
		     }
		     if(r==2) {
		    	 JLabel l10 = new JLabel("Doctor Fees : "+ amt);
		    	 JLabel l11 = new JLabel("Normal Ward : "+ 3000);
		    	 JLabel l12 = new JLabel("Total amount to be paid : 3100");
		    	 l10.setBounds(600,300,155,20);
			     l11.setBounds(600,340,155,20);
			     l12.setBounds(600,380,155,20);
			     pat.add(l10);
			     pat.add(l11);
			     pat.add(l12);
		     }
		     pat.setSize(1920,1080);  
		     pat.setLayout(null);  
		     pat.setVisible(true); 
		     
		     
	    }	    
	    public static void Patient_list() {
	    	JFrame pl =new JFrame("Patient List");
	    	for(int i=0;i<no_of_patients;i++) {
	    		JLabel a = new JLabel(patients_all[i].getName());
	    		int height = 100;
	    		a.setBounds(700,height+(20*i),155,30);
	    		pl.add(a);	 
	    	}
	    	pl.setSize(1920,1080);  
		    pl.setLayout(null);  
		    pl.setVisible(true); 
	    }
	    public static void Doc_list() {
	    	JFrame dl =new JFrame("Doctor List");
	    	for(int i=0;i<no_of_doctors;i++) {
	    		JLabel a = new JLabel(doctor_all[i].getName());
	    		int height = 100;
	    		a.setBounds(700,height+(20*i),155,30);
	    		dl.add(a);	 
	    	}
	    	dl.setSize(1920,1080);  
		    dl.setLayout(null);  
		    dl.setVisible(true); 
	    }
	    public static void send_report(patient a,doctor d) {
	    	report covid = new report();
	    	report cbc = new report();
	    	report sugar = new report();
	    	report bp = new report();
	    	report[] arr = new report[4];
	    	arr[0]=covid;
	    	arr[1]=cbc;
	    	arr[2]=sugar;
	    	arr[3]=bp;
	    	int return_wala = d.check_report(arr);
	    	a.setStatus(return_wala);
	    	if(return_wala == 0) {
	    		JFrame rw = new JFrame("Isolation!!!!");
	    		JLabel l1 = new JLabel("you have been reported corona positive and u have some other fatal diseases also, ");
	    		JLabel l2=new JLabel("you are refered to Isoltion Ward!!");		
	    		l1.setBounds(100,100,1100,40);
	    		l2.setBounds(100,150,1100,40);
	    		Font font = new Font("Courier", Font.BOLD,20);
	    		l1.setForeground(Color.RED);
	    		l2.setForeground(Color.RED);
	    		 
	    		
	    		 l1.setFont(font);
	    		 l2.setFont(font);
	    		rw.add(l1);
	    		rw.add(l2);
	    		rw.setSize(1920,1080);  
		    	rw.setLayout(null);  
		    	rw.setVisible(true); 
		    	H1.book_isolation_ward();
		    	}
	    	if(return_wala == 1) {
	    		JFrame rw = new JFrame("Home Isolation!!!!");
	    		JLabel l1 = new JLabel("you have been reported corona positive but u don't have some other fatal diseases,");
	    		JLabel l2=new JLabel("so you are recommended 14 days of Home Isoltion");		
	    		
	    		l1.setBounds(100,100,1100,40);
	    		l2.setBounds(100,150,1100,40);
	    		Font font = new Font("Courier", Font.BOLD,20);
	    		l1.setForeground(Color.RED);
	    		l2.setForeground(Color.RED);
	    		 
	    		
	    		 l1.setFont(font);
	    		 l2.setFont(font);
	    		rw.add(l1);
	    		rw.add(l2);
	    		rw.setSize(1920,1080);  
		    	rw.setLayout(null);  
		    	rw.setVisible(true); 
	    	}
	    	if(return_wala == 2) {
	    		JFrame rw = new JFrame("No Corona!!! ");
	    		JLabel l1 = new JLabel("you have been reported corona negative but u have some other fatal diseases,");
	    		JLabel l2= new JLabel("so you are Shifted to normal wards that are properly santized to prevent u from corona!");
	    		 
	    		 //set font for JLabel
	    		
	    		l1.setBounds(100,100,1100,40);
	    		l2.setBounds(100,150,1100,40);
	    		Font font = new Font("Courier", Font.BOLD,20);
	    		l1.setForeground(Color.GREEN);
	    		l2.setForeground(Color.GREEN);
	    		 
	    		 //set font for JLabel
	    		 l1.setFont(font);
	    		 l2.setFont(font);
	    		rw.add(l1);
	    		rw.add(l2);
	    		rw.setSize(1920,1080);  
		    	rw.setLayout(null);  
		    	rw.setVisible(true);
		    	H1.book_normal_ward();
	    	}
	    	}
	    public static void doctors_button_list(patient a) {
		JFrame dl=new JFrame("Doctors List");
		for(int i=0;i<no_of_doctors;i++) {
			JButton b=new JButton(doctor_all[i].getName());
			int height=100;
			b.setBounds(700,height+(50*i),155,30);
			dl.add(b);
			int refer =i;
			b.addActionListener( new ActionListener()
	        {
	            public void actionPerformed(ActionEvent e)
	            {
	                send_report(a,doctor_all[refer]);
	            }

				
	        });
		}

	dl.setSize(1920,1080);
		dl.setLayout(null);
		dl.setVisible(true);
	}
	    public static void Patient_button_list() {
	    	JFrame pl=new JFrame("patient List");
			for(int i=0;i<no_of_patients;i++) {
				JButton b=new JButton(patients_all[i].getName());
				int height=100;
				b.setBounds(700,height+(20*i),155,30);
				pl.add(b);
				int refer =i;
				b.addActionListener( new ActionListener()
		        {
		            public void actionPerformed(ActionEvent e)
		            {
		               make_bill(patients_all[refer]);
		            }

					
		        });
			}

			pl.setSize(1920,1080);
			pl.setLayout(null);
			pl.setVisible(true);
	    		    }
	    
	    
	    
	    
}
  
    class Navigation extends login{  
    public void Home(){  
        JFrame f=new JFrame("Home");  
        JButton b0=new JButton("Doctor list");  
        b0.setBounds(700,100,155,30);  
        JButton b1=new JButton("New Doctor");  
        b1.setBounds(700,150,155,30);
        JButton b2=new JButton("New Patient");  
        JButton b3=new JButton("Patients list"); 
        b3.setBounds(700,250,155,30);
        b2.setBounds(700,200,155,30);
        JButton b4=new JButton("Discharge");
        b4.setBounds(700,300,155,30);
        b0.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Doc_list();
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
                Patient_list();
            }
        });
        
        b4.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Patient_button_list();
                
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
class Menu extends Navigation{ 
     public static void main(String[] args) {  
    	 Menu h1 = new Menu();
    	 h1.Home();  	 
}
}