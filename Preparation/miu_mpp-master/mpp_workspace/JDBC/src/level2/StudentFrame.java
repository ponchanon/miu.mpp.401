package level2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/**
 * A basic JFC 1.1 based application.
 */
 
public class StudentFrame extends javax.swing.JFrame
{
       private JScrollPane JScrollPane1;
   

	public StudentFrame()
	{
		//{{INIT_CONTROLS

		setTitle("JDBC example");
		setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(502,349);
		setVisible(false);
		Bshowdata.setText("showdata");
		Bshowdata.setActionCommand("showdata");
		getContentPane().add(Bshowdata);
		Bshowdata.setBounds(48,288,100,25);
		Bshowselection.setText("showselection");
		Bshowselection.setActionCommand("showselection");
		BshowUpdate.setText("Update Student GPA");
		BshowUpdate.setActionCommand("showsUpdate");
		BshowInsert.setText("Add New Student");
		BshowInsert.setActionCommand("showsInsert");
		BshowDelete.setText("Delete Student");
		BshowDelete.setActionCommand("showsDelete");
		getContentPane().add(BshowUpdate);
		getContentPane().add(BshowInsert);
		getContentPane().add(BshowDelete);
		getContentPane().add(Bshowselection);
		BshowUpdate.setBounds(48,200, 150,25);
		BshowInsert.setBounds(48,150, 150,25);
		BshowDelete.setBounds(48,250, 150,25);
		Bshowselection.setBounds(180,288,120,24);
		BExit.setText("Exit");
		BExit.setActionCommand("Exit");
		getContentPane().add(BExit);
		BExit.setBounds(324,288,100,25);
		
		
		//}}

		//{{INIT_MENUS
		//}}

		//{{REGISTER_LISTENERS
		SymWindow aSymWindow = new SymWindow();
		this.addWindowListener(aSymWindow);
		SymAction lSymAction = new SymAction();
		Bshowdata.addActionListener(lSymAction);
		Bshowselection.addActionListener(lSymAction);
		BshowUpdate.addActionListener(lSymAction);
		BshowInsert.addActionListener(lSymAction);
		BshowDelete.addActionListener(lSymAction);
		BExit.addActionListener(lSymAction);
		//}}
	}

	
	/**
	 * The entry point for this application.
	 * Sets the Look and Feel to the System Look and Feel.
	 * Creates a new JFrame1 and makes it visible.
	 */
	static public void main(String args[])
	{
		try {
		    // Add the following code if you want the Look and Feel
		    // to be set to the Look and Feel of the native system.
		    
		    try {
		        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		    } 
		    catch (Exception e) { 
		    }
		    

			//Create a new instance of our application's frame, and make it visible.
			(new StudentFrame()).setVisible(true);
		} 
		catch (Throwable t) {
			t.printStackTrace();
			//Ensure the application exits with an error condition.
			System.exit(1);
		}
	}


	//{{DECLARE_CONTROLS
	javax.swing.JButton Bshowdata = new javax.swing.JButton();
	javax.swing.JButton Bshowselection = new javax.swing.JButton();
	javax.swing.JButton BshowUpdate = new javax.swing.JButton();
	javax.swing.JButton BshowInsert = new javax.swing.JButton();
	javax.swing.JButton BshowDelete = new javax.swing.JButton();
	javax.swing.JButton BExit = new javax.swing.JButton();
	//}}

	//{{DECLARE_MENUS
	//}}

	void exitApplication()
	{
		try {
		    	this.setVisible(false);    // hide the Frame
		    	this.dispose();            // free the system resources
		    	System.exit(0);            // close the application
			}
		catch (Exception e) {
		}
	}

	class SymWindow extends java.awt.event.WindowAdapter
	{
		public void windowClosing(java.awt.event.WindowEvent event)
		{
			Object object = event.getSource();
			if (object == StudentFrame.this)
				StudentFrame_windowClosing(event);
		}
	}

	void StudentFrame_windowClosing(java.awt.event.WindowEvent event)
	{
		// to do: code goes here.
			 
		StudentFrame_windowClosing_Interaction1(event);
	}

	void StudentFrame_windowClosing_Interaction1(java.awt.event.WindowEvent event) {
		try {
			this.exitApplication();
		} catch (Exception e) {
		}
	}

	class SymAction implements java.awt.event.ActionListener
	{
		public void actionPerformed(java.awt.event.ActionEvent event)
		{
			Object object = event.getSource();
			if (object == Bshowdata)
				Bshowdata_actionPerformed(event);
			else if (object == Bshowselection)
				Bshowselection_actionPerformed(event);
			else if (object == BshowUpdate)
				BshowUpdate_actionPerformed(event);
			else if (object == BshowInsert)
				BshowInsert_actionPerformed(event);
			else if (object == BshowDelete)
				BshowDelete_actionPerformed(event);
			else if (object == BExit)
				BExit_actionPerformed(event);
			
		}
	}

	void Bshowdata_actionPerformed(java.awt.event.ActionEvent event)
	{
	    String id, name, age, gpa;
	    
		// load data from the database!!
	    double totalGPA = 0.0; int count = 0;
        dbconnection dbconnect = new dbconnection();
        dbconnect.Connect();
        ResultSet rs;
        rs=dbconnect.DoQuery("Select * from StudentInfo");
		
		try {
		  while (rs.next()) {
				id = rs.getString("StudentID");
				name = rs.getString("StudentName");
				age = rs.getString("Age");
				gpa = rs.getString("GPA");
                //level 1
				totalGPA += Double.parseDouble(gpa);
				count++;
                System.out.println("Student ID is " + id + "   Student Name is " + name + ", age is " + age + ", GPA is " + gpa);
                
		    }
		  System.out.println("Average GPA of all Student is " + totalGPA/count);
		  
		} catch (SQLException ex) {
			System.err.println("error in database connection");
		}

		dbconnect.Close();  //close database connection
			 
	}

	void Bshowselection_actionPerformed(java.awt.event.ActionEvent event)
	{
	    String id="";
       
        
		JFrame2 frame = new JFrame2();
		frame.setid(id);
		frame.setVisible(true);
			 
	}
	
	void BshowUpdate_actionPerformed(java.awt.event.ActionEvent event)
	{      
        
		JFrameUpdate frame = new JFrameUpdate();
		//frame.setid(id);
		frame.setVisible(true);
			 
	}
	void BshowInsert_actionPerformed(java.awt.event.ActionEvent event)
	{      
        
		JFrameInsert frame = new JFrameInsert();
		//frame.setid(id);
		frame.setVisible(true);
			 
	}
	void BshowDelete_actionPerformed(java.awt.event.ActionEvent event)
	{      
        
		JFrameDelete frame = new JFrameDelete();
		//frame.setid(id);
		frame.setVisible(true);
			 
	}

	void BExit_actionPerformed(java.awt.event.ActionEvent event)
	{
		exitApplication();
			 
	}
}
