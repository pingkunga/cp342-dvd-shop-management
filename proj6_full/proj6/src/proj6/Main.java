package proj6;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import java.awt.Rectangle;
import javax.swing.JDesktopPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.BorderFactory;
import javax.swing.border.BevelBorder;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel MainPage = null;
	private JPanel jContentPane = null;
	private JTextField mem_name_search = null;
	private JButton name_search_button = null;
	private JTextArea member_result = null;
	private JButton all_name_button = null;
	private JTextField mem_lastname_search = null;
	private JButton Clear_All_Button = null;
	private JButton lastname_search_button = null;
	private JLabel Member_Title = null;
	private JTextField mem_id_search = null;
	private JButton id_search_button = null;
	/**
	 * This is the default constructor
	 * @throws SQLException 
	 */
	public Main() throws SQLException {		
		super();
		Connection con = null;
		//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
        PreparedStatement pstmt = null;
		// ประกาศ rset เป็น instance ของคลาส ResultSet
		ResultSet rset = null;
        //ดักจับข้อผิดพลาด
		try {
          //Registering the JDBC Drivers : MySQL
		  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
		  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
		  //Show all records in STUDENT table
		  String sale = null;
		  String sale_id = null;
		  String sale_name = null;
		  while(sale==null){
			
		  	sale = JOptionPane.showInputDialog(null,"Please insert sale id:");
		  	pstmt = con.prepareStatement ("SELECT  * FROM SALE WHERE SALE_ID="+sale);
			rset = pstmt.executeQuery(); 
			while(rset.next()){
				sale_id=rset.getString("SALE_ID");
				sale_name=rset.getString("SALE_NAME");
			}
			
			if (sale_id!=null){
				JOptionPane.showMessageDialog(null, "Welcome, "+sale_name+"...\n\nHave a nice day!!");
				initialize();
			}else{
				JOptionPane.showMessageDialog(null, "Your sale id is not match");
				sale = null;
				rset = null;
				pstmt = null;
				continue;
			}
			

		  }
		}catch (Exception e){ 
			System.out.println(e.getMessage());
		// finally block
		} finally {
        //Closing the Result Set Objects 
		rset.close();
		//Closing the Statement Objects 
		pstmt.close();
		//Closing the Connection
		con.close();
		}

		
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(1024, 768);
		this.setContentPane(getJContentPane());
		this.setTitle("DVD Shop Management V.1");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
			jContentPane.add(getMainPage(), null);
			jContentPane.setVisible(true);
		}
		return jContentPane;
	}

	/**
	 * This method initializes MainPage	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getMainPage() {
		if (MainPage == null) {
			MainPage = new JPanel();
			MainPage.setBounds(new Rectangle(40, 20, 1008, 729));
			MainPage.setLayout(null);
			MainPage.setBackground(Color.white);
			MainPage.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
			MainPage.add(getMem_name_search(), null);
			MainPage.add(getName_search_button(), null);
			MainPage.add(getMember_result(), null);
			MainPage.add(getAll_name_button(), null);
			MainPage.add(getMem_lastname_search(), null);
			MainPage.add(getClear_All_Button(), null);
			MainPage.add(getLastname_search_button(), null);
			MainPage.add(Member_Title, null);
			MainPage.add(getMem_id_search(), null);
			MainPage.add(getId_search_button(), null);
		}
		return MainPage;
	}
	
	private JTextField getMem_name_search() {
		if (mem_name_search == null) {
			mem_name_search = new JTextField();
			mem_name_search.setBounds(new Rectangle(555, 167, 211, 28));
			mem_name_search.setBackground(new Color(255, 255, 204));
		}
		return mem_name_search;
	}

	/**
	 * This method initializes name_search_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getName_search_button() {
		if (name_search_button == null) {
			name_search_button = new JButton();
			name_search_button.setBounds(new Rectangle(555, 198, 210, 30));
			name_search_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			name_search_button.setText("Search by First Name");
			name_search_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null;
					String name = (mem_name_search.getText().toUpperCase());
					String name_search=" |-- ID --|-- First Name/Last Name --|\n";
					String mem_name=null;
					member_result.setText(" ");
			     //ดักจับข้อผิดพลาด
					try {
			       //Registering the JDBC Drivers : MySQL
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
					  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
					  //Show all records in STUDENT table
					  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
					  pstmt = con.prepareStatement ("SELECT * FROM MEMBERS WHERE MEM_NAME=\'"+name+"\'");
					 //Executing a Query 
					  rset = pstmt.executeQuery(); 
					  //Processing the Result Set 
					  while (rset.next()) {
						//รับค่า String id จาก attribute ID
						String mem_id = rset.getString("MEM_ID");
						name_search=name_search+mem_id+"\t";
						mem_name = rset.getString("MEM_NAME");
						name_search=name_search+mem_name+" ";	
						String mem_lastname = rset.getString("MEM_LASTNAME");
						name_search=name_search+mem_lastname+"\n";
					  }	
					  
					  if (mem_name!=null){
						  member_result.setText(name_search);
					  }else
					  {
						  member_result.setText(" Your Input is not match!!");
					  }
					rset.close();
					pstmt.close();
					con.close();
					}catch (Exception e){ 
							System.out.println(e.getMessage());
							// finally block
					}
				}
			});
		}
		return name_search_button;
	}

	/**
	 * This method initializes member_result	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getMember_result() {
		if (member_result == null) {
			member_result = new JTextArea();
			member_result.setBounds(new Rectangle(31, 92, 412, 259));
			member_result.setEditable(false);
			member_result.setBackground(new Color(255, 255, 204));
			//member_result.setAutoscrolls(true);
			
		}
		return member_result;
	}

	/**
	 * This method initializes all_name_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAll_name_button() {
		if (all_name_button == null) {
			all_name_button = new JButton();
			all_name_button.setBounds(new Rectangle(32, 362, 200, 38));
			all_name_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			all_name_button.setText("Show All Member");
			all_name_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null;

					String name_search="     |---- ID ----|------------ First Name/Last Name ------------|\n     =====================================================\n\n     ";
					member_result.setText("");
			     //ดักจับข้อผิดพลาด
					try {
			       //Registering the JDBC Drivers : MySQL
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
					  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
					  //Show all records in STUDENT table
					  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
					  pstmt = con.prepareStatement ("SELECT * FROM MEMBERS");
					 //Executing a Query 
					  rset = pstmt.executeQuery(); 
					  //Processing the Result Set 
					  while (rset.next()) {
						//รับค่า String id จาก attribute ID
						String mem_id = rset.getString("MEM_ID");
						name_search=name_search+mem_id+"\t";
						String mem_name = rset.getString("MEM_NAME");
						name_search=name_search+mem_name+" ";	
						String mem_lastname = rset.getString("MEM_LASTNAME");
						name_search=name_search+mem_lastname+"\n     ";
					  }	
					member_result.setText(name_search);
					rset.close();
					pstmt.close();
					con.close();
					}catch (Exception e){ 
							System.out.println(e.getMessage());
							// finally block
					}
				}
			});
		}
		return all_name_button;
	}

	/**
	 * This method initializes mem_lastname_search	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getMem_lastname_search() {
		if (mem_lastname_search == null) {
			mem_lastname_search = new JTextField();
			mem_lastname_search.setBounds(new Rectangle(555, 241, 211, 28));
			mem_lastname_search.setBackground(new Color(255, 255, 204));
		}
		return mem_lastname_search;
	}

	/**
	 * This method initializes Clear_All_Button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getClear_All_Button() {
		if (Clear_All_Button == null) {
			Clear_All_Button = new JButton();
			Clear_All_Button.setBounds(new Rectangle(250, 362, 194, 38));
			Clear_All_Button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			Clear_All_Button.setText("Clear All Field");
			Clear_All_Button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					mem_id_search.setText("");
					mem_name_search.setText("");
					mem_lastname_search.setText("");
					member_result.setText("");
				}
			});
		}
		return Clear_All_Button;
	}

	/**
	 * This method initializes lastname_search_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getLastname_search_button() {
		if (lastname_search_button == null) {
			lastname_search_button = new JButton();
			lastname_search_button.setBounds(new Rectangle(555, 271, 210, 30));
			lastname_search_button.setText("Search by Last Name");
			lastname_search_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			lastname_search_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null;
					String lastname = (mem_lastname_search.getText().toUpperCase());
					String name_search=" |-- ID --|-- First Name/Last Name --|\n";
					String mem_name=null;
					member_result.setText("");
			     //ดักจับข้อผิดพลาด
					try {
			       //Registering the JDBC Drivers : MySQL
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
					  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
					  //Show all records in STUDENT table
					  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
					  pstmt = con.prepareStatement ("SELECT * FROM MEMBERS WHERE MEM_LASTNAME=\'"+lastname+"\'");
					 //Executing a Query 
					  rset = pstmt.executeQuery(); 
					  //Processing the Result Set 
					  while (rset.next()) {
						//รับค่า String id จาก attribute ID
						String mem_id = rset.getString("MEM_ID");
						name_search=name_search+mem_id+"\t";
						mem_name = rset.getString("MEM_NAME");
						name_search=name_search+mem_name+" ";	
						String mem_lastname = rset.getString("MEM_LASTNAME");
						name_search=name_search+mem_lastname+"\n";
					  }	
					  
					  if (mem_name!=null){
						  member_result.setText(name_search);
					  }else
					  {
						  member_result.setText(" Your Input is not match!!");
					  }
					
					rset.close();
					pstmt.close();
					con.close();
					}catch (Exception e){ 
							System.out.println(e.getMessage());
							// finally block
					}
				}
			});
		}
		return lastname_search_button;
	}

	/**
	 * This method initializes mem_id_search	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getMem_id_search() {
		if (mem_id_search == null) {
			mem_id_search = new JTextField();
			mem_id_search.setBounds(new Rectangle(555, 91, 211, 28));
			mem_id_search.setBackground(new Color(255, 255, 204));
		}
		return mem_id_search;
	}

	/**
	 * This method initializes id_search_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getId_search_button() {
		if (id_search_button == null) {
			id_search_button = new JButton();
			id_search_button.setBounds(new Rectangle(555, 123, 210, 30));
			id_search_button.setText("Search by Member id");
			id_search_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			id_search_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null;
					String id = (mem_id_search.getText().toUpperCase());
					String name_search=" |-- ID --|-- First Name/Last Name --|\n";
					String mem_id = null;
					member_result.setText("");
			     //ดักจับข้อผิดพลาด
					try {
			       //Registering the JDBC Drivers : MySQL
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
					  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
					  //Show all records in STUDENT table
					  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
					  pstmt = con.prepareStatement ("SELECT * FROM MEMBERS WHERE MEM_ID=\'"+id+"\'");
					 //Executing a Query 
					  rset = pstmt.executeQuery(); 
					  //Processing the Result Set 
					  while (rset.next()) {
						//รับค่า String id จาก attribute ID
						mem_id = rset.getString("MEM_ID");
						name_search=name_search+mem_id+"\t";
						String mem_name = rset.getString("MEM_NAME");
						name_search=name_search+mem_name+" ";	
						String mem_lastname = rset.getString("MEM_LASTNAME");
						name_search=name_search+mem_lastname+"\n";
					  }	
					  if (mem_id!=null){
						  member_result.setText(name_search);
					  }
					  else
					  {
						  member_result.setText(" Your Input is not match!!");
					  }
					
					rset.close();
					pstmt.close();
					con.close();
					}catch (Exception e){ 
							System.out.println(e.getMessage());
							// finally block
					}
				}
			});
		}
		return id_search_button;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
