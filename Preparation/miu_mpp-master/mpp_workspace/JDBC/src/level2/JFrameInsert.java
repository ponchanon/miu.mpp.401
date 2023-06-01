package level2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameInsert extends JFrame implements ActionListener{
	JButton btnSubmit;
	JTextField txtStudentID;
	JTextField txtName;
	JTextField txtAge;
	JTextField txtGPA;
	JButton btnClose;
	
	int lblWidthMin = 160;
	int lblHeight = 25;
	
	JFrameInsert(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Add New Student Info");
		this.setSize(620,500);
		centerFrameOnDesktop(this);
		//this.setResizable(false);
		this.setLayout(new BorderLayout());
		this.setVisible(true);	
		//Border border = BorderFactory.createLineBorder(Color.green, 3);		
		
		JLabel lblStudentID = new JLabel();
		lblStudentID.setText("StudentID(xxx-xxx)");		
		lblStudentID.setPreferredSize(new Dimension(lblWidthMin, lblHeight));
		
		JLabel lblName = new JLabel();
		lblName.setText("Name");		
		lblName.setPreferredSize(new Dimension(lblWidthMin, lblHeight));
		
		JLabel lblAge = new JLabel();
		lblAge.setText("Age");
		lblAge.setPreferredSize(new Dimension(lblWidthMin, lblHeight));
		
		JLabel lblGPA = new JLabel();
		lblGPA.setText("GPA");
		lblGPA.setPreferredSize(new Dimension(lblWidthMin, lblHeight));
		
		txtStudentID = new JTextField();
		txtStudentID.setPreferredSize(new Dimension(lblWidthMin, lblHeight));
		
		txtName = new JTextField();
		txtName.setPreferredSize(new Dimension(lblWidthMin, lblHeight));
		
		txtAge = new JTextField();
		txtAge.setPreferredSize(new Dimension(lblWidthMin, lblHeight));
		
		txtGPA = new JTextField();
		txtGPA.setPreferredSize(new Dimension(lblWidthMin, lblHeight));
		
		txtGPA = new JTextField();
		txtGPA.setPreferredSize(new Dimension(lblWidthMin, lblHeight));
		
		txtGPA = new JTextField();
		txtGPA.setPreferredSize(new Dimension(lblWidthMin, lblHeight));		

		
		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(evt -> {
			 //insert student GPA to database
	        dbconnection dbconnect = new dbconnection();
	        dbconnect.Connect();
	       
	       dbconnect.DoInsert(
	    		   "Insert into StudentInfo (StudentID, StudentName, Age, GPA) values(" + "'" + txtStudentID.getText() + "'"  +  "," + "'" + txtName.getText() + "'" + "," + txtAge.getText() + "," + txtGPA.getText() + ")");
	        
			//System.out.println("New student info successfully added.");
			dbconnect.Close();  //close database connection
		});	
		
		btnClose = new JButton("Close");
		btnClose.addActionListener(evt -> {
			this.dispose();
		});
		
		JPanel northPanel = new JPanel();
		northPanel.setPreferredSize(new Dimension(500, 0));
		northPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,1));
		northPanel.setBorder(BorderFactory.createLineBorder(Color.blue, 0));
		
		JPanel centerPanel = new JPanel();
		centerPanel.setPreferredSize(new Dimension(500, 150));
		centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,0));
		centerPanel.setBorder(BorderFactory.createLineBorder(Color.yellow, 0));
		
		JPanel westPanel = new JPanel();
		westPanel.setPreferredSize(new Dimension(50, 50));
		westPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,0));
		westPanel.setBorder(BorderFactory.createLineBorder(Color.red, 0));
		
		JPanel eastPanel = new JPanel();
		eastPanel.setPreferredSize(new Dimension(50, 50));
		eastPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,0));
		eastPanel.setBorder(BorderFactory.createLineBorder(Color.red, 0));
		
		JPanel southPanel = new JPanel();
		southPanel.setPreferredSize(new Dimension(100, 80));
		southPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,20));
		southPanel.setBorder(BorderFactory.createLineBorder(Color.red, 0));
		
		centerPanel.add(lblStudentID);
		centerPanel.add(lblName);
		centerPanel.add(txtStudentID);
		centerPanel.add(txtName);
		centerPanel.add(lblAge);//
		centerPanel.add(lblGPA);		
		centerPanel.add(txtAge);
		centerPanel.add(txtGPA);//
		southPanel.add(btnSubmit);
		southPanel.add(btnClose);
		
		
		this.add(northPanel,BorderLayout.NORTH);
		this.add(centerPanel,BorderLayout.CENTER);
		this.add(eastPanel, BorderLayout.EAST);
		this.add(westPanel,BorderLayout.WEST);
		this.add(southPanel,BorderLayout.SOUTH);		
		//
		this.pack();
		
	}

	
	public static void centerFrameOnDesktop(Component f) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		int xpos = (width - frameWidth) / 2;
		int ypos = (height - frameHeight) / 3;
		f.setLocation(xpos, ypos);
	}

	public static void main(String[] args) {
		
		JFrameInsert form1 = new JFrameInsert();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
