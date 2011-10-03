package proj6;

import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Rectangle;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;
import java.lang.Object;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.lang.String;
import java.awt.event.KeyEvent;
import javax.swing.JProgressBar;

public class MainClass extends JFrame {

	private int totalwitoutdecimal;
	private DecimalFormat df = new DecimalFormat("#,###");  //  @jve:decl-index=0:
    private ButtonGroup group = new ButtonGroup();  //  @jve:decl-index=0:
    private ButtonGroup group1 = new ButtonGroup();//  @jve:decl-index=0:
    private ButtonGroup group2 = new ButtonGroup();  //  @jve:decl-index=0:
    private ButtonGroup group3 = new ButtonGroup();  //  @jve:decl-index=0:
    private ButtonGroup group4 = new ButtonGroup();
    private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel Member_Page = null;  //  @jve:decl-index=0:visual-constraint="-599,3"
	private JTextField mem_name_search = null;
	private JButton name_search_button = null;
	private JButton all_sort_id__button = null;
	private JTextField mem_lastname_search = null;
	private JButton Clear_All_Button = null;
	private JButton lastname_search_button = null;
	private JTextField mem_id_search = null;
	private JButton id_search_button = null;
	private JScrollPane member_result_scroll = null;
	private JTextArea member_result = null;
	private JPanel MoviePage = null;
	private JButton jButton1 = null;
	private JPanel Member_New = null;
	private JTextField New_MemName = null;
	private JTextField New_MemLastName = null;
	private JTextField New_MemAddress = null;
	private JLabel name_label = null;
	private JLabel lastname_label = null;
	private JLabel address_label = null;
	private JTextField New_MemEmail = null;
	private JLabel email_label = null;
	private JTextField New_MemTel = null;
	private JLabel tel_label = null;
	private JButton newmem_send = null;
	private JButton newmem_clear = null;
	private JTextField New_MemId = null;
	private JLabel id_label = null;
	private JPanel Member_Edit = null;
	private JTextField Edit_MemName = null;
	private JTextField Edit_MemLastName = null;
	private JTextField Edit_MemAddress = null;
	private JLabel name_label_edit = null;
	private JLabel lastname_label_edit = null;
	private JLabel address_label_edit = null;
	private JTextField New_MemEmail_Edit = null;
	private JLabel email_label_Edit = null;
	private JTextField New_MemTel_Edit = null;
	private JLabel tel_label_edit = null;
	private JButton mem_send_edit = null;
	private JButton newmem_clear_edit = null;
	private JTextField New_MemId_edit = null;
	private JLabel id_label_edit = null;
	private JButton Add_Member_Back_Button_Edit = null;
	private JTextField mem_id_search_edit = null;
	private JButton edit_search_button = null;
	private JButton mem_delete_edit = null;
	private JLabel Member_label = null;
	private JLabel Member_id_label = null;
	private JLabel Add_Member_label = null;
	private JLabel Member_View_Label = null;
	private JLabel member_detail_label = null;
	private JLabel Member_topic_label = null;
	private JButton all_sort_name__button = null;
	private JButton all_sort_lastname__button = null;
	private JLabel sort_detail_label = null;
	private JLabel Sort_Label = null;
	private JLabel search_id_detail_label = null;
	private JLabel Search_Label = null;
	private JLabel search_detail_label = null;
	private JLabel search_name_detail_label = null;
	private JLabel search_lastname_detail_label = null;
	private JLabel Search_id_Label = null;
	private JLabel Search_firstname_Label = null;
	private JLabel Search_lastname_Label = null;
	private JPanel Main_Page = null;
	private JButton member_button = null;
	private JButton sales_button = null;
	private JButton shelf_button = null;
	private JButton movie_button = null;
	private JButton order_button = null;
	private JPanel Sale_Page = null;  //  @jve:decl-index=0:visual-constraint="-512,800"
	private JTextField sale_name_search = null;
	private JButton sale_name_search_button = null;
	private JButton sale_all_sort_id__button = null;
	private JTextField sale_lastname_search = null;
	private JButton sale_Clear_All_Button = null;
	private JButton salelastname_search_button = null;
	private JTextField sale_id_search = null;
	private JButton sale_id_search_button = null;
	private JScrollPane sale_result_scroll = null;
	private JTextArea sale_result = null;
	private JTextField mem_id_search_edit1 = null;
	private JButton sale_edit_search_button = null;
	private JLabel sale_View_Label = null;
	private JLabel sale_detail_label = null;
	private JLabel sale_topic_label = null;
	private JButton sale_all_sort_name__button = null;
	private JButton sale_all_sort_lastname__button = null;
	private JLabel sale_sort_detail_label = null;
	private JLabel sale_Sort_Label = null;
	private JLabel sale_search_id_detail_label = null;
	private JLabel sale_Search_Label = null;
	private JLabel sale_search_detail_label = null;
	private JLabel sale_search_name_detail_label = null;
	private JLabel sale_search_lastname_detail_label = null;
	private JLabel sale_Search_id_Label = null;
	private JLabel sale_Search_firstname_Label = null;
	private JLabel sale_Search_lastname_Label = null;
	private JPanel sale_New = null;
	private JTextField New_saleName = null;
	private JTextField New_saleLastName = null;
	private JTextField New_saleAddress = null;
	private JLabel sale_name_label = null;
	private JLabel sale_lastname_label = null;
	private JLabel sale_address_label = null;
	private JButton newsale_send = null;
	private JButton newsale_clear = null;
	private JTextField New_saleId = null;
	private JLabel sale_id_label = null;
	private JLabel Add_sale_label = null;
	private JPanel sale_Edit = null;
	private JTextField Edit_saleName = null;
	private JTextField Edit_saleLastName = null;
	private JTextField Edit_saleAddress = null;
	private JLabel sale_name_label_edit = null;
	private JLabel sale_lastname_label_edit = null;
	private JLabel sale_address_label_edit = null;
	private JButton sale_send_edit = null;
	private JButton newsale_clear_edit = null;
	private JTextField New_saleId_edit = null;
	private JLabel sale_id_label_edit = null;
	private JButton Add_sale_Back_Button_Edit = null;
	private JButton sale_delete_edit = null;
	private JLabel sale_label = null;
	private JLabel sales_id_label = null;
	private JButton newsale_send1 = null;
	private JButton member_backtomain = null;
	private JPanel Shelf_Page = null;  //  @jve:decl-index=0:visual-constraint="709,903"
	private JTextField shelf_name_search = null;
	private JButton shelf_name_search_button = null;
	private JButton shelf_all_sort_id__button = null;
	private JButton shelf_Clear_All_Button = null;
	private JTextField shelf_id_search = null;
	private JButton shelf_id_search_button = null;
	private JScrollPane shelf_result_scroll = null;
	private JTextArea shelf_result = null;
	private JTextField shelf_id_search_edit = null;
	private JButton shelf_edit_search_button = null;
	private JLabel shelf_View_Label = null;
	private JLabel shelf_detail_label = null;
	private JLabel shelf_topic_label = null;
	private JButton shelf_all_sort_name__button = null;
	private JLabel shelf_sort_detail_label = null;
	private JLabel shelf_Sort_Label = null;
	private JLabel shelf_search_id_detail_label = null;
	private JLabel shelf_Search_Label = null;
	private JLabel shelf_search_detail_label = null;
	private JLabel shelf_search_name_detail_label = null;
	private JLabel shelf_Search_id_Label = null;
	private JLabel shelf_Search_firstname_Label = null;
	private JPanel shelf_New = null;
	private JLabel shelf_name_label = null;
	private JButton newshelf_send = null;
	private JTextField New_shelfId = null;
	private JLabel shelf_id_label = null;
	private JLabel Add_shelf_label = null;
	private JRadioButton new_shelf_radio_action = null;
	private JLabel new_action_Label = null;
	private JRadioButton new_shelf_radio_animation = null;
	private JLabel new_animation_Label = null;
	private JRadioButton new_shelf_radio_adventure = null;
	private JLabel new_adventure_Label = null;
	private JRadioButton new_shelf_radio_comedy = null;
	private JLabel new_comedy_Label = null;
	private JRadioButton new_shelf_radio_crime = null;
	private JLabel new_crime_Label = null;
	private JRadioButton new_shelf_radio_drama = null;
	private JLabel new_drama_Label = null;
	private JRadioButton new_shelf_radio_fantasy = null;
	private JLabel new_fantasy_Label = null;
	private JRadioButton new_shelf_radio_horror = null;
	private JLabel new_horror_Label = null;
	private JLabel new_romantic_Label = null;
	private JRadioButton new_shelf_radio_romantic = null;
	private JRadioButton new_shelf_radio_scifi = null;
	private JLabel new_scifi_Label = null;
	private JRadioButton new_shelf_radio_series = null;
	private JLabel new_Series_Label = null;
	private JPanel shelf_Edit = null;
	private JLabel shelf_name_label_edit = null;
	private JButton shelf_send_edit = null;
	private JTextField New_shelfId_edit = null;
	private JLabel shelf_id_label_edit = null;
	private JButton Add_shelf_Back_Button_Edit = null;
	private JButton shelf_delete_edit = null;
	private JLabel shelf_label = null;
	private JLabel shelfs_id_label = null;
	private JRadioButton shelf_radio_action = null;
	private JLabel action_Label = null;
	private JLabel animation_Label = null;
	private JRadioButton shelf_radio_animation = null;
	private JRadioButton shelf_radio_adventure = null;
	private JLabel adventure_Label = null;
	private JRadioButton shelf_radio_comedy = null;
	private JRadioButton shelf_radio_crime = null;
	private JRadioButton shelf_radio_drama = null;
	private JLabel comedy_Label1 = null;
	private JLabel crime_Label = null;
	private JLabel drama_Label = null;
	private JRadioButton shelf_radio_fantasy = null;
	private JRadioButton shelf_radio_horror = null;
	private JRadioButton shelf_radio_romantic = null;
	private JLabel fantasy_Label = null;
	private JLabel horror_Label = null;
	private JLabel romantic_Label = null;
	private JRadioButton shelf_radio_scifi = null;
	private JRadioButton shelf_radio_series = null;
	private JLabel scifi_Label = null;
	private JLabel Series_Label = null;
	private JButton member_backtomain1 = null;
	private JPanel Add_Order_Page = null;  //  @jve:decl-index=0:visual-constraint="-603,144"
	private JLabel addorder_topic_label = null;
	private JTextField member_id_input = null;
	private JButton member_id_input_button = null;
	private JLabel member_id_input_label = null;
	private JTextField MemId_add_order = null;
	private JLabel name_add_order = null;
	private JTextField Memname_add_order = null;
	private JLabel lastname_add_order = null;
	private JPanel add_order = null;
	private JLabel Add_Movie_Label = null;
	private JLabel movie_id_input_label = null;
	private JLabel movie_add_order = null;
	private JTextField movie_id_input = null;
	private JLabel unit_add_order = null;
	private JTextField unit_input = null;
	private JButton add_input_button = null;
	private JScrollPane result_scroll = null;
	private JTextArea add_result = null;
	private JLabel Order_detail_Label = null;
	private JLabel id_order_label = null;
	private JTextField order_date_order = null;
	private JLabel date_order_label = null;
	private JLabel sale_order_label = null;
	private JTextField sale_id_order = null;
	private JLabel sale_name_order_label = null;
	private JTextField order_name_order = null;
	private JLabel sale_lastname_order_label = null;
	private JTextField order_sale_lastname_order = null;
	private JButton cal_button = null;
	private JLabel Order_no_label = null;
	private JPanel add_to_database = null;
	private JLabel total_price_label = null;
	private JLabel unit_baht_label = null;
	private JButton add_button = null;
	private JButton delete_button = null;
	private String order_no = "";  //  @jve:decl-index=0:
	private String movie_detail;
	private JButton order_manage_button = null;
	private String sale_id;
	private JButton addorder_send = null;
	private JLabel Sales_bg = null;
	private JLabel Sales_bg11 = null;
	private JPanel MoviePage1 = null;  //  @jve:decl-index=0:visual-constraint="514,1589"
	private JTextField movie_thainame_search = null;
	private JButton movie_thainame_search_button = null;
	private JButton movie_all_sort_id__button = null;
	private JTextField movie_engname_search = null;
	private JButton movie_Clear_All_Button = null;
	private JButton movie_engname_search_button = null;
	private JTextField movie_id_search = null;
	private JButton movie_id_search_button = null;
	private JScrollPane movie_result_scroll = null;
	private JTextArea movie_result = null;
	private JTextField movie_id_search_edit = null;
	private JButton movie_edit_search_button = null;
	private JLabel movie_View_Label = null;
	private JLabel movie_detail_label = null;
	private JLabel movie_topic_label = null;
	private JButton movie_all_sort_thainame__button = null;
	private JButton movie_all_sort_engname__button = null;
	private JLabel movie_sort_detail_label = null;
	private JLabel movie_Sort_Label = null;
	private JLabel movie_search_id_detail_label = null;
	private JLabel movie_Search_Label = null;
	private JLabel movie_search_detail_label = null;
	private JLabel movie_search_name_detail_label = null;
	private JLabel movie_search_lastname_detail_label = null;
	private JLabel movie_Search_id_Label = null;
	private JLabel movie_Search_thainame_Label = null;
	private JLabel movie_Search_engname_Label = null;
	private JPanel movie_Edit = null;
	private JTextField Edit_moviethaiName = null;
	private JTextField Edit_movieengName = null;
	private JLabel movie_thainame_label_edit = null;
	private JLabel movie_engname_label_edit = null;
	private JLabel movie_des_label_edit = null;
	private JTextField New_movienation_Edit = null;
	private JLabel movie_nation_label_Edit = null;
	private JTextField New_movieaudio_Edit = null;
	private JLabel movie_audio_label_edit = null;
	private JButton movie_send_edit = null;
	private JButton newmovie_clear_edit = null;
	private JTextField New_movieId_edit = null;
	private JLabel movie_id_label_edit = null;
	private JButton Add_movie_Back_Button_Edit = null;
	private JButton movie_delete_edit = null;
	private JLabel movie_label = null;
	private JLabel movies_id_label = null;
	private JLabel movie_sub_label_edit = null;
	private JLabel movie_price_label_edit = null;
	private JTextField New_moviesub_Edit = null;
	private JTextField New_movieprice_Edit = null;
	private JLabel movie_type_label_edit1 = null;
	private JRadioButton movie1_radio_action = null;
	private JLabel action_Label1 = null;
	private JRadioButton movie1_radio_comedy = null;
	private JLabel comedy_Label11 = null;
	private JRadioButton movie1_radio_animation = null;
	private JLabel animation_Label1 = null;
	private JRadioButton movie1_radio_adventure = null;
	private JLabel adventure_Label1 = null;
	private JRadioButton movie1_radio_crime = null;
	private JLabel crime_Label1 = null;
	private JRadioButton movie1_radio_drama = null;
	private JLabel drama_Label1 = null;
	private JRadioButton movie1_radio_fantasy = null;
	private JLabel fantasy_Label1 = null;
	private JRadioButton movie1_radio_horror = null;
	private JLabel horror_Label1 = null;
	private JRadioButton movie1_radio_romantic = null;
	private JLabel romantic_Label1 = null;
	private JRadioButton movie1_radio_scifi = null;
	private JLabel scifi_Label1 = null;
	private JRadioButton movie1_radio_series = null;
	private JLabel Series_Label1 = null;
	private JLabel movie_screen_label_edit1 = null;
	private JRadioButton movie_radio_fullscreen1 = null;
	private JLabel fullscreen_Label1 = null;
	private JRadioButton movie_radio_widescreen1 = null;
	private JLabel widescreen_Label1 = null;
	private JScrollPane edit_movie_Scroll = null;
	private JTextArea Edit_moviedes = null;
	private JPanel movie_New = null;
	private JTextField New_movieName = null;
	private JTextField New_movieEngName = null;
	private JTextField New_movieDes = null;
	private JLabel movie_thainame_label = null;
	private JLabel movie_engname_label = null;
	private JLabel movie_des_label = null;
	private JTextField New_movieNation = null;
	private JLabel movie_nation_label = null;
	private JTextField New_movieAudio = null;
	private JLabel movie_audio_label = null;
	private JButton newmovie_send = null;
	private JButton newmovie_clear = null;
	private JTextField New_movieId = null;
	private JLabel movie_id_label = null;
	private JLabel Add_movie_label = null;
	private JLabel movie_sub_label = null;
	private JTextField New_movieSub = null;
	private JLabel movie_price_label = null;
	private JTextField New_moviePrice = null;
	private JLabel movie_type_label = null;
	private JRadioButton movie_radio_action = null;
	private JLabel action_Label2 = null;
	private JRadioButton movie_radio_animation = null;
	private JRadioButton movie_radio_adventure = null;
	private JLabel animation_Label2 = null;
	private JLabel adventure_Label2 = null;
	private JRadioButton movie_radio_comedy = null;
	private JRadioButton movie_radio_crime = null;
	private JRadioButton movie_radio_drama = null;
	private JLabel comedy_Label = null;
	private JLabel crime_Label2 = null;
	private JLabel drama_Label2 = null;
	private JRadioButton movie_radio_fantasy = null;
	private JRadioButton movie_radio_horror = null;
	private JRadioButton movie_radio_romantic = null;
	private JLabel fantasy_Label2 = null;
	private JLabel horror_Label2 = null;
	private JLabel romantic_Label2 = null;
	private JRadioButton movie_radio_scifi = null;
	private JRadioButton movie_radio_series = null;
	private JLabel scifi_Label2 = null;
	private JLabel Series_Label2 = null;
	private JLabel movie_screen_label = null;
	private JRadioButton movie_radio_fullscreen = null;
	private JLabel fullscreen_Label = null;
	private JRadioButton movie_radio_widescreen = null;
	private JLabel widescreen_Label = null;
	private JLabel Movie_Pic = null;
	private String lyn2 = null;  //  @jve:decl-index=0:
	private JTextField New_moviepic_Edit = null;
	private JLabel movie_nation_label_Edit1 = null;
	private JLabel movie_nation_label_Edit11 = null;
	private JTextField New_moviepic = null;
	private JButton addorder_send1 = null;
	private JLabel Sales_bg111 = null;
	private JLabel Sales_bg13 = null;
	private JLabel Sales_bg2 = null;
	private JPanel Order_Manage_Page = null;
	private JTextField order_name_search = null;
	private JButton order_name_search_button = null;
	private JButton order_all_sort_id__button = null;
	private JButton order_Clear_All_Button = null;
	private JTextField order_id_search = null;
	private JButton order_id_search_button = null;
	private JScrollPane order_result_scroll = null;
	private JTextArea order_result = null;
	private JTextField order_id_search_edit = null;
	private JButton order_edit_search_button = null;
	private JLabel order_View_Label = null;
	private JLabel order_detail_label = null;
	private JLabel order_topic_label = null;
	private JButton order_all_sort_name__button = null;
	private JLabel order_sort_detail_label = null;
	private JLabel order_Sort_Label = null;
	private JLabel order_search_id_detail_label = null;
	private JLabel order_Search_Label = null;
	private JLabel order_search_detail_label = null;
	private JLabel order_search_name_detail_label = null;
	private JLabel order_Search_id_Label = null;
	private JLabel order_Search_firstname_Label = null;
	private JPanel order_Edit = null;
	private JTextField New_mem_id_edit = null;
	private JLabel order_id_label_edit = null;
	private JButton Addorder_Back_Button_Edit = null;
	private JButton order_delete_edit = null;
	private JLabel order_label = null;
	private JLabel order_id_label1 = null;
	private JScrollPane order_view_scroll = null;
	private JTextArea order_view_result = null;
	private JLabel order_mem_id_label_edit = null;
	private JLabel order_sale_id_label_edit = null;
	private JLabel order_sale_name_label_edit = null;
	private JTextField New_mem_name_edit = null;
	private JTextField New_sale_id_edit = null;
	private JTextField New_sale_name_edit = null;
	private JTextField New_order_date_edit = null;
	private JLabel order_date_label_edit = null;
	private JTextField order_date_search = null;
	private JButton order_date_search_button = null;
	private JLabel order_Search_date_Label = null;
	private JLabel order_search_date_detail_label = null;
	private JButton order_all_sort_date__button = null;
	private JButton addorder_send11 = null;
	private JLabel Sales_bg21 = null;
	private JLabel movie_id_input_label1 = null;
	private JLabel order_sale_name_label_edit1 = null;
	private JTextField total_amount_text = null;
	private JLabel Sales_bg1 = null;
	/**
	 * This is the default constructor
	 */
	public MainClass() throws SQLException {
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
		  sale_id = null;
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
		this.setSize(1024, 778);
		this.setResizable(false);
		this.setContentPane(getJContentPane());
		this.setTitle("DVD Shop Management V.1 (Beta)");
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
			jContentPane.add(getAdd_Order_Page(), null);
			
			jContentPane.add(getMember_Page(), null);
			jContentPane.add(getShelf_Page(), null);
			jContentPane.add(getSale_Page(),null);
			jContentPane.add(getMoviePage1(),null);
			jContentPane.add(getMain_Page(), null);
			jContentPane.add(getOrder_Manage_Page(), null);
			
		}
		return jContentPane;
	}

			

	/**
	 * This method initializes Member_Page	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getMember_Page() {
		if (Member_Page == null) {
			Sales_bg11 = new JLabel();
			Sales_bg11.setBounds(new Rectangle(0, 0, 1024, 768));
			Sales_bg11.setText("");
			Sales_bg11.setIcon(new ImageIcon("bg/bg1.jpg"));
			Search_lastname_Label = new JLabel();
			Search_lastname_Label.setForeground(new Color(205, 235, 255));
			Search_lastname_Label.setBounds(new Rectangle(32, 311, 107, 28));
			Search_lastname_Label.setText("By LastName");
			Search_lastname_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			Search_firstname_Label = new JLabel();
			Search_firstname_Label.setForeground(new Color(205, 235, 255));
			Search_firstname_Label.setBounds(new Rectangle(31, 260, 107, 28));
			Search_firstname_Label.setText("By FirstName");
			Search_firstname_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			Search_id_Label = new JLabel();
			Search_id_Label.setForeground(new Color(205, 235, 255));
			Search_id_Label.setBounds(new Rectangle(30, 211, 66, 28));
			Search_id_Label.setText("By ID");
			Search_id_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			Search_id_Label.setForeground(new Color(205, 235, 255));
			search_lastname_detail_label = new JLabel();
			search_lastname_detail_label.setForeground(new Color(205, 235, 255));
			search_lastname_detail_label.setBounds(new Rectangle(147, 340, 229, 16));
			search_lastname_detail_label.setText("Insert at most 50 letters");
			search_lastname_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			search_name_detail_label = new JLabel();
			search_name_detail_label.setForeground(new Color(205, 235, 255));
			search_name_detail_label.setBounds(new Rectangle(146, 289, 229, 16));
			search_name_detail_label.setText("Insert at most 50 letters");
			search_name_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			search_detail_label = new JLabel();
			search_detail_label.setForeground(new Color(205, 235, 255));
			search_detail_label.setBounds(new Rectangle(30, 172, 494, 21));
			search_detail_label.setText("You can search by member id/member first name/member last name");
			search_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			Search_Label = new JLabel();
			Search_Label.setForeground(new Color(205, 235, 255));
			Search_Label.setBounds(new Rectangle(29, 135, 220, 28));
			Search_Label.setText("Search Members");
			Search_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			search_id_detail_label = new JLabel();
			search_id_detail_label.setForeground(new Color(205, 235, 255));
			search_id_detail_label.setBounds(new Rectangle(146, 237, 235, 16));
			search_id_detail_label.setText("Insert only number 0-9 (4 digits)");
			search_id_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			Sort_Label = new JLabel();
			Sort_Label.setForeground(new Color(205, 235, 255));
			Sort_Label.setBounds(new Rectangle(29, 380, 231, 28));
			Sort_Label.setText("Show All Members");
			Sort_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			sort_detail_label = new JLabel();
			sort_detail_label.setForeground(new Color(205, 235, 255));
			sort_detail_label.setBounds(new Rectangle(31, 431, 56, 16));
			sort_detail_label.setText("sort by");
			sort_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			Member_topic_label = new JLabel();
			Member_topic_label.setForeground(new Color(235, 245, 255));
			Member_topic_label.setBounds(new Rectangle(30, 43, 299, 62));
			Member_topic_label.setText("Member");
			Member_topic_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 72));
			member_detail_label = new JLabel();
			member_detail_label.setForeground(new Color(205, 235, 255));
			member_detail_label.setBounds(new Rectangle(541, 172, 399, 21));
			member_detail_label.setText("insert member id to view or edit/update/delete member");
			member_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			Member_View_Label = new JLabel();
			Member_View_Label.setForeground(new Color(205, 235, 255));
			Member_View_Label.setBounds(new Rectangle(540, 135, 190, 28));
			Member_View_Label.setText("Member Detail");
			Member_View_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			Member_Page = new JPanel();
			Member_Page.setLayout(null);
			Member_Page.setBackground(Color.white);
			Member_Page.setVisible(false);
			Member_Page.setBounds(new Rectangle(0, 0, 1024, 768));
			Member_Page.add(getMem_name_search(), null);
			Member_Page.add(getName_search_button(), null);
			Member_Page.add(getAll_sort_id__button(), null);
			Member_Page.add(getMem_lastname_search(), null);
			Member_Page.add(getClear_All_Button(), null);
			Member_Page.add(getLastname_search_button(), null);
			Member_Page.add(getMem_id_search(), null);
			Member_Page.add(getId_search_button(), null);
			Member_Page.add(getMember_result_scroll(), null);
			Member_Page.add(getMember_New(), null);
			Member_Page.add(getMem_id_search_edit(), null);
			Member_Page.add(getEdit_search_button(), null);
			Member_Page.add(getMember_Edit(), null);
			Member_Page.add(Member_View_Label, null);
			Member_Page.add(member_detail_label, null);
			Member_Page.add(Member_topic_label, null);
			Member_Page.add(getAll_sort_name__button(), null);
			Member_Page.add(getAll_sort_lastname__button(), null);
			Member_Page.add(sort_detail_label, null);
			Member_Page.add(Sort_Label, null);
			Member_Page.add(search_id_detail_label, null);
			Member_Page.add(Search_Label, null);
			Member_Page.add(search_detail_label, null);
			Member_Page.add(search_name_detail_label, null);
			Member_Page.add(search_lastname_detail_label, null);
			Member_Page.add(Search_id_Label, null);
			Member_Page.add(Search_firstname_Label, null);
			Member_Page.add(Search_lastname_Label, null);
			Member_Page.add(getMember_backtomain(), null);
			Member_Page.add(Sales_bg11, null);
			
		}
		return Member_Page;
	}

	/**
	 * This method initializes mem_name_search	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getMem_name_search() {
		if (mem_name_search == null) {
			mem_name_search = new JTextField();
			mem_name_search.setBackground(new Color(235, 245, 255));
			mem_name_search.setBounds(new Rectangle(146, 259, 211, 28));
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
			name_search_button.setBounds(new Rectangle(360, 259, 104, 28));
			name_search_button.setText("Search");
			name_search_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			name_search_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null;
					String name = (mem_name_search.getText().toUpperCase());
					String name_search="     |---- ID ----|------------ First Name/Last Name ------------|\n     =====================================================\n\n     ";
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
					  pstmt = con.prepareStatement ("SELECT * FROM MEMBERS WHERE MEM_NAME LIKE \'"+name+"%\'");
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
	 * This method initializes all_sort_id__button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAll_sort_id__button() {
		if (all_sort_id__button == null) {
			all_sort_id__button = new JButton();
			all_sort_id__button.setBounds(new Rectangle(103, 423, 118, 28));
			all_sort_id__button.setText("Id");
			all_sort_id__button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			all_sort_id__button.addActionListener(new java.awt.event.ActionListener() {
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
					  pstmt = con.prepareStatement ("SELECT * FROM MEMBERS ORDER BY MEM_ID");
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
		return all_sort_id__button;
	}

	/**
	 * This method initializes mem_lastname_search	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getMem_lastname_search() {
		if (mem_lastname_search == null) {
			mem_lastname_search = new JTextField();
			mem_lastname_search.setBackground(new Color(235, 245, 255));
			mem_lastname_search.setBounds(new Rectangle(147, 310, 211, 28));
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
			Clear_All_Button.setBounds(new Rectangle(247, 668, 214, 38));
			Clear_All_Button.setText("Clear All Search Field");
			Clear_All_Button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
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
			lastname_search_button.setBounds(new Rectangle(360, 310, 104, 28));
			lastname_search_button.setText("Search");
			lastname_search_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			lastname_search_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null;
					String lastname = (mem_lastname_search.getText().toUpperCase());
					String name_search="     |---- ID ----|------------ First Name/Last Name ------------|\n     =====================================================\n\n     ";
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
					  pstmt = con.prepareStatement ("SELECT * FROM MEMBERS WHERE MEM_LASTNAME LIKE \'"+lastname+"%\'");
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
			mem_id_search = new JTextField(null,4);
			mem_id_search.setBackground(new Color(235, 245, 255));
			mem_id_search.setBounds(new Rectangle(146, 210, 211, 28));
			
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
			id_search_button.setBounds(new Rectangle(360, 210, 104, 28));
			id_search_button.setText("Search");
			id_search_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			id_search_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null;
					String id = (mem_id_search.getText().toUpperCase());
					String name_search="     |---- ID ----|------------ First Name/Last Name ------------|\n     =====================================================\n\n     ";
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
					  pstmt = con.prepareStatement ("SELECT * FROM MEMBERS WHERE MEM_ID LIKE \'"+id+"%\'");
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

	/**
	 * This method initializes member_result_scroll	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getMember_result_scroll() {
		if (member_result_scroll == null) {
			member_result_scroll = new JScrollPane();
			member_result_scroll.setBounds(new Rectangle(31, 454, 431, 210));
			member_result_scroll.setViewportView(getMember_result());
		}
		return member_result_scroll;
	}

	/**
	 * This method initializes member_result	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getMember_result() {
		if (member_result == null) {
			member_result = new JTextArea();
			member_result.setBackground(new Color(235, 245, 255));
		}
		return member_result;
	}

	/**
	 * This method initializes MoviePage	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getMoviePage() {
		if (MoviePage == null) {
			MoviePage = new JPanel();
			MoviePage.setLayout(null);
			MoviePage.setBackground(new Color(238, 238, 0));
			MoviePage.setVisible(false);
			MoviePage.setBounds(new Rectangle(386, 18, 1019, 740));
			MoviePage.add(getJButton1(), null);
			MoviePage.add(MoviePage, null);
		}
		return MoviePage;
	}

	/**
	 * This method initializes jButton1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setBounds(new Rectangle(326, 323, 121, 101));
			jButton1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					MoviePage.setVisible(false);
					Member_Page.setVisible(true);
				}
			});
		}
		return jButton1;
	}

	/**
	 * This method initializes Member_New	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getMember_New() {
		if (Member_New == null) {
			Add_Member_label = new JLabel();
			Add_Member_label.setBounds(new Rectangle(35, 19, 282, 28));
			Add_Member_label.setText("Add Member");
			Add_Member_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			id_label = new JLabel();
			id_label.setBounds(new Rectangle(35, 59, 97, 21));
			id_label.setText("ID");
			id_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			tel_label = new JLabel();
			tel_label.setBounds(new Rectangle(34, 255, 56, 21));
			tel_label.setText("Tel.");
			tel_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			email_label = new JLabel();
			email_label.setBounds(new Rectangle(35, 212, 73, 21));
			email_label.setText("E-Mail");
			email_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			address_label = new JLabel();
			address_label.setBounds(new Rectangle(35, 174, 95, 21));
			address_label.setText("Address");
			address_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			lastname_label = new JLabel();
			lastname_label.setBounds(new Rectangle(35, 136, 112, 21));
			lastname_label.setText("Last Name");
			lastname_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			name_label = new JLabel();
			name_label.setBounds(new Rectangle(35, 94, 111, 26));
			name_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			name_label.setText("First Name");
			Member_New = new JPanel();
			Member_New.setLayout(null);
			Member_New.setBackground(Color.white);
			Member_New.setVisible(true);
			Member_New.setBounds(new Rectangle(507, 248, 484, 417));
			Member_New.add(getNew_MemName(), null);
			Member_New.add(getNew_MemLastName(), null);
			Member_New.add(getNew_MemAddress(), null);
			Member_New.add(name_label, null);
			Member_New.add(lastname_label, null);
			Member_New.add(address_label, null);
			Member_New.add(getNew_MemEmail(), null);
			Member_New.add(email_label, null);
			Member_New.add(getNew_MemTel(), null);
			Member_New.add(tel_label, null);
			Member_New.add(getNewmem_send(), null);
			Member_New.add(getNewmem_clear(), null);
			Member_New.add(getNew_MemId(), null);
			Member_New.add(id_label, null);
			Member_New.add(Add_Member_label, null);
		}
		return Member_New;
	}

	/**
	 * This method initializes New_MemName	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_MemName() {
		if (New_MemName == null) {
			New_MemName = new JTextField();
			New_MemName.setBounds(new Rectangle(150, 95, 293, 25));
		}
		return New_MemName;
	}

	/**
	 * This method initializes New_MemLastName	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_MemLastName() {
		if (New_MemLastName == null) {
			New_MemLastName = new JTextField();
			New_MemLastName.setBounds(new Rectangle(150, 135, 293, 25));
		}
		return New_MemLastName;
	}

	/**
	 * This method initializes New_MemAddress	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_MemAddress() {
		if (New_MemAddress == null) {
			New_MemAddress = new JTextField();
			New_MemAddress.setBounds(new Rectangle(150, 174, 293, 25));
		}
		return New_MemAddress;
	}

	/**
	 * This method initializes New_MemEmail	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_MemEmail() {
		if (New_MemEmail == null) {
			New_MemEmail = new JTextField();
			New_MemEmail.setBounds(new Rectangle(150, 212, 293, 25));
		}
		return New_MemEmail;
	}

	/**
	 * This method initializes New_MemTel	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_MemTel() {
		if (New_MemTel == null) {
			New_MemTel = new JTextField();
			New_MemTel.setBounds(new Rectangle(150, 251, 293, 25));
		}
		return New_MemTel;
	}

	/**
	 * This method initializes newmem_send	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getNewmem_send() {
		if (newmem_send == null) {
			newmem_send = new JButton();
			newmem_send.setBounds(new Rectangle(73, 307, 157, 40));
			newmem_send.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			newmem_send.setText("Add Member");
			newmem_send.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					String new_id=New_MemId.getText();
					String new_name=New_MemName.getText();
					String new_lastname=New_MemLastName.getText();
					String new_address=New_MemAddress.getText();
					String new_email=New_MemEmail.getText();
					String new_tel=New_MemTel.getText();
					if (new_name.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_lastname.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_address.equalsIgnoreCase(""))
					{
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_email.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_tel.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else
					{
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
						pstmt = con.prepareStatement ("INSERT INTO MEMBERS(MEM_ID,MEM_NAME,MEM_LASTNAME,MEM_ADDRESS,MEM_EMAIL,MEM_TEL) VALUES(SEQ_MEM_ID.NEXTVAL,\'"+new_name+"\',\'"+new_lastname+"\',\'"+new_address+"\',\'"+new_email+"\',\'"+new_tel+"\');");
						JOptionPane.showMessageDialog(null,"Insert successfully!");
						New_MemId.setText("Program will generate Id to you");
						New_MemName.setText("");
						New_MemLastName.setText("");
						New_MemAddress.setText("");
						New_MemEmail.setText("");
						New_MemTel.setText("");
						rset = pstmt.executeQuery(); 	
									  
						rset.close();
						pstmt.close();
						con.close();
						}catch (Exception e){ 
								System.out.println(e.getMessage());
								// finally block
						}
					}
				}
			});
		}
		return newmem_send;
	}

	/**
	 * This method initializes newmem_clear	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getNewmem_clear() {
		if (newmem_clear == null) {
			newmem_clear = new JButton();
			newmem_clear.setBounds(new Rectangle(245, 307, 157, 40));
			newmem_clear.setText("Clear Field");
			newmem_clear.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			newmem_clear.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					New_MemName.setText("");
					New_MemLastName.setText("");
					New_MemAddress.setText("");
					New_MemEmail.setText("");
					New_MemTel.setText("");
				}
			});
		}
		return newmem_clear;
	}

	/**
	 * This method initializes New_MemId	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_MemId() {
		if (New_MemId == null) {
			New_MemId = new JTextField();
			New_MemId.setBounds(new Rectangle(150, 58, 293, 25));
			New_MemId.setText("Program will generate Id to you");
			New_MemId.setEditable(false);
		}
		return New_MemId;
	}

	/**
	 * This method initializes Member_Edit	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getMember_Edit() {
		if (Member_Edit == null) {
			Member_id_label = new JLabel();
			Member_id_label.setBounds(new Rectangle(155, 17, 238, 28));
			Member_id_label.setForeground(Color.red);
			Member_id_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			Member_label = new JLabel();
			Member_label.setBounds(new Rectangle(34, 17, 112, 28));
			Member_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			Member_label.setText("Member");
			id_label_edit = new JLabel();
			id_label_edit.setBounds(new Rectangle(35, 59, 97, 21));
			id_label_edit.setText("ID");
			id_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			tel_label_edit = new JLabel();
			tel_label_edit.setBounds(new Rectangle(34, 255, 56, 21));
			tel_label_edit.setText("Tel.");
			tel_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			email_label_Edit = new JLabel();
			email_label_Edit.setBounds(new Rectangle(35, 212, 73, 21));
			email_label_Edit.setText("E-Mail");
			email_label_Edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			address_label_edit = new JLabel();
			address_label_edit.setBounds(new Rectangle(35, 174, 95, 21));
			address_label_edit.setText("Address");
			address_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			lastname_label_edit = new JLabel();
			lastname_label_edit.setBounds(new Rectangle(35, 136, 112, 21));
			lastname_label_edit.setText("Last Name");
			lastname_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			name_label_edit = new JLabel();
			name_label_edit.setBounds(new Rectangle(35, 94, 111, 26));
			name_label_edit.setText("First Name");
			name_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			Member_Edit = new JPanel();
			Member_Edit.setForeground(new Color(205, 235, 255));
			Member_Edit.setLayout(null);
			Member_Edit.setBackground(new Color(235, 245, 255));
			Member_Edit.setBounds(new Rectangle(508, 248, 484, 419));
			Member_Edit.add(getEdit_MemName(), null);
			Member_Edit.add(getEdit_MemLastName(), null);
			Member_Edit.add(getEdit_MemAddress(), null);
			Member_Edit.add(name_label_edit, null);
			Member_Edit.add(lastname_label_edit, null);
			Member_Edit.add(address_label_edit, null);
			Member_Edit.add(getNew_MemEmail_Edit(), null);
			Member_Edit.add(email_label_Edit, null);
			Member_Edit.add(getNew_MemTel_Edit(), null);
			Member_Edit.add(tel_label_edit, null);
			Member_Edit.add(getMem_send_edit(), null);
			Member_Edit.add(getNewmem_clear_edit(), null);
			Member_Edit.add(getNew_MemId_edit(), null);
			Member_Edit.add(id_label_edit, null);
			Member_Edit.add(getAdd_Member_Back_Button_Edit(), null);
			Member_Edit.add(getMem_delete_edit(), null);
			Member_Edit.add(Member_label, null);
			Member_Edit.add(Member_id_label, null);
			Member_Edit.setVisible(false);
		}
		return Member_Edit;
	}

	/**
	 * This method initializes Edit_MemName	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getEdit_MemName() {
		if (Edit_MemName == null) {
			Edit_MemName = new JTextField();
			Edit_MemName.setBounds(new Rectangle(150, 95, 293, 25));
		}
		return Edit_MemName;
	}

	/**
	 * This method initializes Edit_MemLastName	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getEdit_MemLastName() {
		if (Edit_MemLastName == null) {
			Edit_MemLastName = new JTextField();
			Edit_MemLastName.setBounds(new Rectangle(150, 135, 293, 25));
		}
		return Edit_MemLastName;
	}

	/**
	 * This method initializes Edit_MemAddress	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getEdit_MemAddress() {
		if (Edit_MemAddress == null) {
			Edit_MemAddress = new JTextField();
			Edit_MemAddress.setBounds(new Rectangle(150, 174, 293, 25));
		}
		return Edit_MemAddress;
	}

	/**
	 * This method initializes New_MemEmail_Edit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_MemEmail_Edit() {
		if (New_MemEmail_Edit == null) {
			New_MemEmail_Edit = new JTextField();
			New_MemEmail_Edit.setBounds(new Rectangle(150, 212, 293, 25));
		}
		return New_MemEmail_Edit;
	}

	/**
	 * This method initializes New_MemTel_Edit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_MemTel_Edit() {
		if (New_MemTel_Edit == null) {
			New_MemTel_Edit = new JTextField();
			New_MemTel_Edit.setBounds(new Rectangle(150, 251, 293, 25));
		}
		return New_MemTel_Edit;
	}

	/**
	 * This method initializes mem_send_edit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getMem_send_edit() {
		if (mem_send_edit == null) {
			mem_send_edit = new JButton();
			mem_send_edit.setBounds(new Rectangle(76, 301, 100, 40));
			mem_send_edit.setText("Edit");
			mem_send_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			mem_send_edit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					String new_id=New_MemId_edit.getText();
					String new_name=Edit_MemName.getText();
					String new_lastname=Edit_MemLastName.getText();
					String new_address=Edit_MemAddress.getText();
					String new_email=New_MemEmail_Edit.getText();
					String new_tel=New_MemTel_Edit.getText();
					
					if (new_id.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_name.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_lastname.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_address.equalsIgnoreCase(""))
					{
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_email.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_tel.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else
					{
						Connection con = null;
						//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
						PreparedStatement pstmt = null;
						// ประกาศ rset เป็น instance ของคลาส ResultSet
						ResultSet rset = null;

						JOptionPane.showMessageDialog(null, "Update Complete!!");	
						Member_New.setVisible(true);
						Member_Edit.setVisible(false);
						//ดักจับข้อผิดพลาด
						try {
				       //Registering the JDBC Drivers : MySQL
							Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
						  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
						  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
						  pstmt = con.prepareStatement ("UPDATE MEMBERS SET MEM_ID="+Integer.parseInt(new_id)+",MEM_NAME=\'"+new_name+"\',MEM_LASTNAME=\'"+new_lastname+"\',MEM_ADDRESS=\'"+new_address+"\',MEM_EMAIL=\'"+new_email+"\',MEM_TEL=\'"+new_tel+"\' WHERE MEM_ID="+new_id);
							 //Executing a Query 
							  rset = pstmt.executeQuery(); 
							  //Processing the Result Set 
							    						  
						rset.close();
						pstmt.close();
						con.close();
						

						
						}catch (Exception e){ 
							System.out.println(e.getMessage());
							// finally block
					}
				}
				}
			});
		}
		return mem_send_edit;
	}

	/**
	 * This method initializes newmem_clear_edit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getNewmem_clear_edit() {
		if (newmem_clear_edit == null) {
			newmem_clear_edit = new JButton();
			newmem_clear_edit.setBounds(new Rectangle(315, 301, 100, 40));
			newmem_clear_edit.setText("Clear");
			newmem_clear_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			newmem_clear_edit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Edit_MemName.setText("");
					Edit_MemLastName.setText("");
					Edit_MemAddress.setText("");
					New_MemEmail_Edit.setText("");
					New_MemTel_Edit.setText("");
				}
			});
		}
		return newmem_clear_edit;
	}

	/**
	 * This method initializes New_MemId_edit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_MemId_edit() {
		if (New_MemId_edit == null) {
			New_MemId_edit = new JTextField();
			New_MemId_edit.setBounds(new Rectangle(150, 58, 293, 25));
			New_MemId_edit.setEnabled(false);
			New_MemId_edit.setEditable(false);
		}
		return New_MemId_edit;
	}

	/**
	 * This method initializes Add_Member_Back_Button_Edit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAdd_Member_Back_Button_Edit() {
		if (Add_Member_Back_Button_Edit == null) {
			Add_Member_Back_Button_Edit = new JButton();
			Add_Member_Back_Button_Edit.setBounds(new Rectangle(76, 346, 339, 40));
			Add_Member_Back_Button_Edit.setText("Back");
			Add_Member_Back_Button_Edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			Add_Member_Back_Button_Edit
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							Member_Edit.setVisible(false);
							Member_New.setVisible(true);
						}
					});
		}
		return Add_Member_Back_Button_Edit;
	}

	/**
	 * This method initializes mem_id_search_edit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getMem_id_search_edit() {
		if (mem_id_search_edit == null) {
			mem_id_search_edit = new JTextField();
			mem_id_search_edit.setBounds(new Rectangle(541, 209, 211, 28));
			mem_id_search_edit.setBackground(new Color(235, 245, 255));
		}
		return mem_id_search_edit;
	}

	/**
	 * This method initializes edit_search_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getEdit_search_button() {
		if (edit_search_button == null) {
			edit_search_button = new JButton();
			edit_search_button.setBounds(new Rectangle(756, 210, 93, 26));
			edit_search_button.setText("View");
			edit_search_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			edit_search_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					
					
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null;
					
					String edit_member=null;
					edit_member= mem_id_search_edit.getText();
					//System.out.println("Edit Member :"+edit_member);
					//ดักจับข้อผิดพลาด
					try {
			       //Registering the JDBC Drivers : MySQL
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
					  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
					  //Show all records in STUDENT table
					  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
					  pstmt = con.prepareStatement ("SELECT * FROM MEMBERS WHERE MEM_ID=\'"+edit_member+"\'");
					 //Executing a Query 
					  rset = pstmt.executeQuery(); 
					  //Processing the Result Set 
					  String mem_id = null;
					  String mem_name = null;
					  String mem_lastname = null;
					  String mem_address = null;
					  String mem_email = null;
					  String mem_tel = null;

					  while (rset.next()) {
							//รับค่า String id จาก attribute ID
							mem_id = rset.getString("MEM_ID");
							mem_name = rset.getString("MEM_NAME");
							mem_lastname = rset.getString("MEM_LASTNAME");
							mem_address = rset.getString("MEM_ADDRESS");
							mem_email = rset.getString("MEM_EMAIL");
							mem_tel = rset.getString("MEM_TEL");
							Member_id_label.setText(mem_id);
							
					 }	
					  
					  if (mem_id!=null){
						  Member_New.setVisible(false);
						  Member_Edit.setVisible(true);
						  New_MemId_edit.setText(mem_id);
						  Edit_MemName.setText(mem_name);
						  Edit_MemLastName.setText(mem_lastname);
						  Edit_MemAddress.setText(mem_address);
						  New_MemEmail_Edit.setText(mem_email);
						  New_MemTel_Edit.setText(mem_tel);
						  
					  }
					  else
					  {
						  JOptionPane.showMessageDialog(null, "Your member id is not match!!");
						  Member_Edit.setVisible(false);
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
		return edit_search_button;
	}

	/**
	 * This method initializes mem_delete_edit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getMem_delete_edit() {
		if (mem_delete_edit == null) {
			mem_delete_edit = new JButton();
			mem_delete_edit.setBounds(new Rectangle(196, 301, 100, 40));
			mem_delete_edit.setText("Delete");
			mem_delete_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			mem_delete_edit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					String new_id=Member_id_label.getText();
					int ch=0;
					

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
						  ch = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete?",JOptionPane.YES_NO_OPTION);
						  if (ch!=1){
							  pstmt = con.prepareStatement ("DELETE FROM MEMBERS WHERE MEM_ID=\'+"+new_id+"\'");
							  JOptionPane.showMessageDialog(null, "Delete Complete!!");
						  }
						  
							Member_New.setVisible(true);
							Member_Edit.setVisible(false);
							 //Executing a Query 
							  rset = pstmt.executeQuery(); 
							  //Processing the Result Set 
							    						  
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
		return mem_delete_edit;
	}

	/**
	 * This method initializes all_sort_name__button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAll_sort_name__button() {
		if (all_sort_name__button == null) {
			all_sort_name__button = new JButton();
			all_sort_name__button.setBounds(new Rectangle(222, 423, 119, 28));
			all_sort_name__button.setText("First Name");
			all_sort_name__button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			all_sort_name__button.addActionListener(new java.awt.event.ActionListener() {
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
					  pstmt = con.prepareStatement ("SELECT * FROM MEMBERS ORDER BY MEM_NAME");
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
		return all_sort_name__button;
	}

	/**
	 * This method initializes all_sort_lastname__button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAll_sort_lastname__button() {
		if (all_sort_lastname__button == null) {
			all_sort_lastname__button = new JButton();
			all_sort_lastname__button.setBounds(new Rectangle(342, 423, 119, 28));
			all_sort_lastname__button.setText("Last Name");
			all_sort_lastname__button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			all_sort_lastname__button
					.addActionListener(new java.awt.event.ActionListener() {
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
							  pstmt = con.prepareStatement ("SELECT * FROM MEMBERS ORDER BY MEM_LASTNAME");
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
		return all_sort_lastname__button;
	}

	/**
	 * This method initializes Main_Page	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getMain_Page() {
		if (Main_Page == null) {
			Sales_bg13 = new JLabel();
			Sales_bg13.setBounds(new Rectangle(0, 0, 1024, 768));
			Sales_bg13.setText("");
			Sales_bg13.setIcon(new ImageIcon("bg/bg.jpg"));
			Main_Page = new JPanel();
			Main_Page.setLayout(null);
			Main_Page.setBackground(Color.white);
			Main_Page.setVisible(true);
			Main_Page.setBounds(new Rectangle(0, 0, 1024, 768));
			Main_Page.add(getMember_button(), null);
			Main_Page.add(getSales_button(), null);
			Main_Page.add(getShelf_button(), null);
			Main_Page.add(getMovie_button(), null);
			Main_Page.add(getOrder_button(), null);
			Main_Page.add(getOrder_manage_button(), null);
			Main_Page.add(Sales_bg13, null);
		}
		return Main_Page;
	}

	/**
	 * This method initializes member_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getMember_button() {
		if (member_button == null) {
			member_button = new JButton();
			member_button.setBounds(new Rectangle(45, 585, 223, 66));
			member_button.setFont(new Font("Dialog", Font.BOLD, 18));
			member_button.setText("Member Manager");
			member_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Main_Page.setVisible(false);
					Add_Order_Page.setVisible(false);
					Shelf_Page.setVisible(false);
					Member_Page.setVisible(true);
					Sale_Page.setVisible(false);
					MoviePage1.setVisible(false);
					Order_Manage_Page.setVisible(false);
				}
			});
		}
		return member_button;
	}

	/**
	 * This method initializes sales_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getSales_button() {
		if (sales_button == null) {
			sales_button = new JButton();
			sales_button.setBounds(new Rectangle(45, 660, 223, 66));
			sales_button.setText("Sales Manager");
			sales_button.setFont(new Font("Dialog", Font.BOLD, 18));
			sales_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Main_Page.setVisible(false);
					Add_Order_Page.setVisible(false);
					Shelf_Page.setVisible(false);
					Member_Page.setVisible(false);
					Sale_Page.setVisible(true);
					MoviePage1.setVisible(false);
					Order_Manage_Page.setVisible(false);
				}
			});
		}
		return sales_button;
	}

	/**
	 * This method initializes shelf_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getShelf_button() {
		if (shelf_button == null) {
			shelf_button = new JButton();
			shelf_button.setBounds(new Rectangle(45, 510, 223, 66));
			shelf_button.setText("Shelf Manager");
			shelf_button.setFont(new Font("Dialog", Font.BOLD, 18));
			shelf_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Main_Page.setVisible(false);
					Add_Order_Page.setVisible(false);
					Shelf_Page.setVisible(true);
					Member_Page.setVisible(false);
					Sale_Page.setVisible(false);
					MoviePage1.setVisible(false);
					Order_Manage_Page.setVisible(false);
				}
			});
		}
		return shelf_button;
	}

	/**
	 * This method initializes movie_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getMovie_button() {
		if (movie_button == null) {
			movie_button = new JButton();
			movie_button.setBounds(new Rectangle(45, 435, 223, 66));
			movie_button.setText("Movie Manager");
			movie_button.setFont(new Font("Dialog", Font.BOLD, 18));
			movie_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Main_Page.setVisible(false);
					Add_Order_Page.setVisible(false);
					Shelf_Page.setVisible(false);
					Member_Page.setVisible(false);
					Sale_Page.setVisible(false);
					MoviePage1.setVisible(true);
					Order_Manage_Page.setVisible(false);
				}
			});
		}
		return movie_button;
	}

	/**
	 * This method initializes order_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getOrder_button() {
		if (order_button == null) {
			order_button = new JButton();
			order_button.setBounds(new Rectangle(45, 285, 223, 66));
			order_button.setText("Add Order");
			order_button.setFont(new Font("Dialog", Font.BOLD, 18));
			order_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Main_Page.setVisible(false);
					Add_Order_Page.setVisible(true);
					Shelf_Page.setVisible(false);
					Member_Page.setVisible(false);
					Sale_Page.setVisible(false);
					MoviePage1.setVisible(false);
					Order_Manage_Page.setVisible(false);
				}
			});
		}
		return order_button;
	}

	/**
	 * This method initializes Sale_Page	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getSale_Page() {
		if (Sale_Page == null) {
			Sales_bg = new JLabel();
			Sales_bg.setIcon(new ImageIcon("bg/bg1.jpg"));
			Sales_bg.setBounds(new Rectangle(0, 0, 1024, 768));
			Sales_bg.setText("");
			sale_Search_lastname_Label = new JLabel();
			sale_Search_lastname_Label.setBounds(new Rectangle(32, 311, 107, 28));
			sale_Search_lastname_Label.setText("By LastName");
			sale_Search_lastname_Label.setForeground(new Color(205, 235, 255));
			sale_Search_lastname_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			sale_Search_firstname_Label = new JLabel();
			sale_Search_firstname_Label.setBounds(new Rectangle(31, 260, 107, 28));
			sale_Search_firstname_Label.setForeground(new Color(205, 235, 255));
			sale_Search_firstname_Label.setText("By FirstName");
			sale_Search_firstname_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			sale_Search_id_Label = new JLabel();
			sale_Search_id_Label.setBounds(new Rectangle(30, 211, 66, 28));
			sale_Search_id_Label.setText("By ID");
			sale_Search_id_Label.setForeground(new Color(205, 235, 255));
			sale_Search_id_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			sale_search_lastname_detail_label = new JLabel();
			sale_search_lastname_detail_label.setBounds(new Rectangle(147, 340, 229, 16));
			sale_search_lastname_detail_label.setForeground(new Color(205, 235, 255));
			sale_search_lastname_detail_label.setText("Insert at most 50 letters");
			sale_search_lastname_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			sale_search_name_detail_label = new JLabel();
			sale_search_name_detail_label.setBounds(new Rectangle(146, 289, 229, 16));
			sale_search_name_detail_label.setForeground(new Color(205, 235, 255));
			sale_search_name_detail_label.setText("Insert at most 50 letters");
			sale_search_name_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			sale_search_detail_label = new JLabel();
			sale_search_detail_label.setBounds(new Rectangle(30, 172, 494, 21));
			sale_search_detail_label.setText("You can search by sale id/sale first name/sale last name");
			sale_search_detail_label.setForeground(new Color(205, 235, 255));
			sale_search_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			sale_Search_Label = new JLabel();
			sale_Search_Label.setBounds(new Rectangle(29, 135, 220, 28));
			sale_Search_Label.setForeground(new Color(205, 235, 255));
			sale_Search_Label.setText("Search Sales");
			sale_Search_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			sale_search_id_detail_label = new JLabel();
			sale_search_id_detail_label.setBounds(new Rectangle(146, 237, 235, 16));
			sale_search_id_detail_label.setText("Insert only number 0-9 (4 digits)");
			sale_search_id_detail_label.setForeground(new Color(205, 235, 255));
			sale_search_id_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			sale_Sort_Label = new JLabel();
			sale_Sort_Label.setForeground(new Color(205, 235, 255));
			sale_Sort_Label.setBounds(new Rectangle(29, 380, 231, 28));
			sale_Sort_Label.setText("Show All Sales");
			sale_Sort_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			sale_sort_detail_label = new JLabel();
			sale_sort_detail_label.setForeground(new Color(205, 235, 255));
			sale_sort_detail_label.setBounds(new Rectangle(31, 431, 56, 16));
			sale_sort_detail_label.setText("sort by");
			sale_sort_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			sale_topic_label = new JLabel();
			sale_topic_label.setBounds(new Rectangle(30, 43, 299, 62));
			sale_topic_label.setText("Sales");
			sale_topic_label.setForeground(new Color(235, 245, 255));
			sale_topic_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 72));
			sale_detail_label = new JLabel();
			sale_detail_label.setForeground(new Color(205, 235, 255));
			sale_detail_label.setBounds(new Rectangle(541, 172, 399, 21));
			sale_detail_label.setText("insert sale id to view or edit/update/delete sale");
			sale_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			sale_View_Label = new JLabel();
			sale_View_Label.setForeground(new Color(205, 235, 255));
			sale_View_Label.setBounds(new Rectangle(540, 135, 190, 28));
			sale_View_Label.setText("Sales Detail");
			sale_View_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			Sale_Page = new JPanel();
			Sale_Page.setLayout(null);
			Sale_Page.setBackground(Color.white);
			Sale_Page.setVisible(false);
			Sale_Page.setSize(new Dimension(1028, 768));
			Sale_Page.add(getSale_name_search(), null);
			Sale_Page.add(getSale_name_search_button(), null);
			Sale_Page.add(getSale_all_sort_id__button(), null);
			Sale_Page.add(getSale_lastname_search(), null);
			Sale_Page.add(getSale_Clear_All_Button(), null);
			Sale_Page.add(getSalelastname_search_button(), null);
			Sale_Page.add(getSale_id_search(), null);
			Sale_Page.add(getSale_id_search_button(), null);
			Sale_Page.add(getSale_result_scroll(), null);
			Sale_Page.add(getMem_id_search_edit1(), null);
			Sale_Page.add(getSale_edit_search_button(), null);
			Sale_Page.add(sale_View_Label, null);
			Sale_Page.add(sale_detail_label, null);
			Sale_Page.add(sale_topic_label, null);
			Sale_Page.add(getSale_all_sort_name__button(), null);
			Sale_Page.add(getSale_all_sort_lastname__button(), null);
			Sale_Page.add(sale_sort_detail_label, null);
			Sale_Page.add(sale_Sort_Label, null);
			Sale_Page.add(sale_search_id_detail_label, null);
			Sale_Page.add(sale_Search_Label, null);
			Sale_Page.add(sale_search_detail_label, null);
			Sale_Page.add(sale_search_name_detail_label, null);
			Sale_Page.add(sale_search_lastname_detail_label, null);
			Sale_Page.add(sale_Search_id_Label, null);
			Sale_Page.add(sale_Search_firstname_Label, null);
			Sale_Page.add(sale_Search_lastname_Label, null);
			Sale_Page.add(getSale_New(), null);
			Sale_Page.add(getSale_Edit(), null);
			Sale_Page.add(getNewsale_send1(), null);
			Sale_Page.add(Sales_bg, null);
			
		}
		return Sale_Page;
	}

	/**
	 * This method initializes sale_name_search	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getSale_name_search() {
		if (sale_name_search == null) {
			sale_name_search = new JTextField();
			sale_name_search.setBounds(new Rectangle(146, 259, 211, 28));
			sale_name_search.setBackground(new Color(205, 235, 255));
		}
		return sale_name_search;
	}

	/**
	 * This method initializes sale_name_search_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getSale_name_search_button() {
		if (sale_name_search_button == null) {
			sale_name_search_button = new JButton();
			sale_name_search_button.setBounds(new Rectangle(360, 259, 104, 28));
			sale_name_search_button.setText("Search");
			sale_name_search_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			sale_name_search_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null;
					String name = (sale_name_search.getText().toUpperCase());
					String name_search="     |---- ID ----|------------ First Name/Last Name ------------|\n     =====================================================\n\n     ";
					String mem_id = null;
					String mem_name=null;
					sale_result.setText("");
			     //ดักจับข้อผิดพลาด
					try {
			       //Registering the JDBC Drivers : MySQL
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
					  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
					  //Show all records in STUDENT table
					  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
					  pstmt = con.prepareStatement ("SELECT * FROM SALE WHERE SALE_NAME LIKE\'"+name+"%\'");
					 //Executing a Query 
					  rset = pstmt.executeQuery(); 
					  //Processing the Result Set 
					  while (rset.next()) {
						//รับค่า String id จาก attribute ID
						mem_id = rset.getString("SALE_ID");
						name_search=name_search+mem_id+"\t";
						mem_name = rset.getString("SALE_NAME");
						name_search=name_search+mem_name+" ";	
						String mem_lastname = rset.getString("SALE_LASTNAME");
						name_search=name_search+mem_lastname+"\n     ";
					  }	
					  if (mem_name!=null){
						  sale_result.setText(name_search);
					  }
					  else
					  {
						  sale_result.setText(" Your Input is not match!!");
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
		return sale_name_search_button;
	}

	/**
	 * This method initializes sale_all_sort_id__button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getSale_all_sort_id__button() {
		if (sale_all_sort_id__button == null) {
			sale_all_sort_id__button = new JButton();
			sale_all_sort_id__button.setBounds(new Rectangle(103, 423, 118, 28));
			sale_all_sort_id__button.setText("Id");
			sale_all_sort_id__button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			sale_all_sort_id__button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null;

					String name_search="     |---- ID ----|------------ First Name/Last Name ------------|\n     =====================================================\n\n     ";
					sale_result.setText("");
			     //ดักจับข้อผิดพลาด
					try {
			       //Registering the JDBC Drivers : MySQL
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
					  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
					  //Show all records in STUDENT table
					  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
					  pstmt = con.prepareStatement ("SELECT * FROM SALE ORDER BY SALE_ID");
					 //Executing a Query 
					  rset = pstmt.executeQuery(); 
					  //Processing the Result Set 
					  while (rset.next()) {
						//รับค่า String id จาก attribute ID
						String mem_id = rset.getString("SALE_ID");
						name_search=name_search+mem_id+"\t";
						String mem_name = rset.getString("SALE_NAME");
						name_search=name_search+mem_name+" ";	
						String mem_lastname = rset.getString("SALE_LASTNAME");
						name_search=name_search+mem_lastname+"\n     ";
					  }	
					sale_result.setText(name_search);
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
		return sale_all_sort_id__button;
	}

	/**
	 * This method initializes sale_lastname_search	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getSale_lastname_search() {
		if (sale_lastname_search == null) {
			sale_lastname_search = new JTextField();
			sale_lastname_search.setBounds(new Rectangle(147, 310, 211, 28));
			sale_lastname_search.setBackground(new Color(205, 235, 255));
		}
		return sale_lastname_search;
	}

	/**
	 * This method initializes sale_Clear_All_Button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getSale_Clear_All_Button() {
		if (sale_Clear_All_Button == null) {
			sale_Clear_All_Button = new JButton();
			sale_Clear_All_Button.setBounds(new Rectangle(247, 668, 214, 38));
			sale_Clear_All_Button.setText("Clear All Search Field");
			sale_Clear_All_Button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			sale_Clear_All_Button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
				sale_result.setText("");
				sale_lastname_search.setText("");
				sale_name_search.setText("");
				sale_id_search.setText("");
				}
			});
		}
		return sale_Clear_All_Button;
	}

	/**
	 * This method initializes salelastname_search_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getSalelastname_search_button() {
		if (salelastname_search_button == null) {
			salelastname_search_button = new JButton();
			salelastname_search_button.setBounds(new Rectangle(360, 310, 104, 28));
			salelastname_search_button.setText("Search");
			salelastname_search_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			salelastname_search_button.addActionListener(new java.awt.event.ActionListener() {
							public void actionPerformed(java.awt.event.ActionEvent e1) {
								Connection con = null;
								//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
								PreparedStatement pstmt = null;
								// ประกาศ rset เป็น instance ของคลาส ResultSet
								ResultSet rset = null;
								String name = (sale_lastname_search.getText().toUpperCase());
								String name_search="     |---- ID ----|------------ First Name/Last Name ------------|\n     =====================================================\n\n     ";
								String mem_id = null;
								String mem_name=null;
								sale_result.setText("");
						     //ดักจับข้อผิดพลาด
								try {
						       //Registering the JDBC Drivers : MySQL
									Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
								  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
								  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
								  //Show all records in STUDENT table
								  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
								  pstmt = con.prepareStatement ("SELECT * FROM SALE WHERE SALE_LASTNAME LIKE\'"+name+"%\'");
								 //Executing a Query 
								  rset = pstmt.executeQuery(); 
								  //Processing the Result Set 
								  while (rset.next()) {
									//รับค่า String id จาก attribute ID
									mem_id = rset.getString("SALE_ID");
									name_search=name_search+mem_id+"\t";
									mem_name = rset.getString("SALE_NAME");
									name_search=name_search+mem_name+" ";	
									String mem_lastname = rset.getString("SALE_LASTNAME");
									name_search=name_search+mem_lastname+"\n     ";
								  }	
								  if (mem_name!=null){
									  sale_result.setText(name_search);
								  }
								  else
								  {
									  sale_result.setText(" Your Input is not match!!");
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
		return salelastname_search_button;
	}

	/**
	 * This method initializes sale_id_search	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getSale_id_search() {
		if (sale_id_search == null) {
			sale_id_search = new JTextField(null, 4);
			sale_id_search.setBounds(new Rectangle(146, 210, 211, 28));
			sale_id_search.setBackground(new Color(205, 235, 255));
		}
		return sale_id_search;
	}

	/**
	 * This method initializes sale_id_search_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getSale_id_search_button() {
		if (sale_id_search_button == null) {
			sale_id_search_button = new JButton();
			sale_id_search_button.setBounds(new Rectangle(360, 210, 104, 28));
			sale_id_search_button.setText("Search");
			sale_id_search_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			sale_id_search_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null; 
					String id = (sale_id_search.getText().toUpperCase());
					String name_search="     |---- ID ----|------------ First Name/Last Name ------------|\n     =====================================================\n\n     ";
					String mem_id = null;
					sale_result.setText("");
			     //ดักจับข้อผิดพลาด
					try {
			       //Registering the JDBC Drivers : MySQL
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
					  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
					  //Show all records in STUDENT table
					  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
					  pstmt = con.prepareStatement ("SELECT * FROM SALE WHERE SALE_ID LIKE \'"+id+"%\'");
					 //Executing a Query 
					  rset = pstmt.executeQuery(); 
					  //Processing the Result Set 
					  while (rset.next()) {
						//รับค่า String id จาก attribute ID
						mem_id = rset.getString("SALE_ID");
						name_search=name_search+mem_id+"\t";
						String mem_name = rset.getString("SALE_NAME");
						name_search=name_search+mem_name+" ";	
						String mem_lastname = rset.getString("SALE_LASTNAME");
						name_search=name_search+mem_lastname+"\n     ";
					  }	
					  if (mem_id!=null){
						  sale_result.setText(name_search);
					  }
					  else
					  {
						  sale_result.setText(" Your Input is not match!!");
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
		return sale_id_search_button;
	}

	/**
	 * This method initializes sale_result_scroll	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getSale_result_scroll() {
		if (sale_result_scroll == null) {
			sale_result_scroll = new JScrollPane();
			sale_result_scroll.setBounds(new Rectangle(31, 454, 431, 210));
			sale_result_scroll.setViewportView(getSale_result());
		}
		return sale_result_scroll;
	}

	/**
	 * This method initializes sale_result	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getSale_result() {
		if (sale_result == null) {
			sale_result = new JTextArea();
			sale_result.setBackground(new Color(205, 235, 255));
		}
		return sale_result;
	}

	/**
	 * This method initializes mem_id_search_edit1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getMem_id_search_edit1() {
		if (mem_id_search_edit1 == null) {
			mem_id_search_edit1 = new JTextField();
			mem_id_search_edit1.setBounds(new Rectangle(541, 209, 211, 28));
			mem_id_search_edit1.setBackground(new Color(205, 235, 255));
		}
		return mem_id_search_edit1;
	}

	/**
	 * This method initializes sale_edit_search_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getSale_edit_search_button() {
		if (sale_edit_search_button == null) {
			sale_edit_search_button = new JButton();
			sale_edit_search_button.setBounds(new Rectangle(756, 210, 93, 26));
			sale_edit_search_button.setText("View");
			sale_edit_search_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			sale_edit_search_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null;
					
					String edit_member=null;
					edit_member = mem_id_search_edit1.getText();
					//System.out.println("Edit Member :"+edit_member);
					//ดักจับข้อผิดพลาด
					try {
			       //Registering the JDBC Drivers : MySQL
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
					  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
					  //Show all records in STUDENT table
					  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
					  pstmt = con.prepareStatement ("SELECT SALE_ID,SALE_NAME,SALE_LASTNAME,TO_CHAR(SALE_HIREDATE, 'DD-MON-YYYY') AS SALE_HIREDATE FROM SALE WHERE SALE_ID=\'"+edit_member+"\'");
					 //Executing a Query 
					  rset = pstmt.executeQuery(); 
					  //Processing the Result Set 
					  String mem_id = null;
					  String mem_name = null;
					  String mem_lastname = null;
					  String mem_hiredate = null;
					 // String mem_email = null;
					  //String mem_tel = null;

					  while (rset.next()) {
							//รับค่า String id จาก attribute ID
							mem_id = rset.getString("SALE_ID");
							mem_name = rset.getString("SALE_NAME");
							mem_lastname = rset.getString("SALE_LASTNAME");
							mem_hiredate = rset.getString("SALE_HIREDATE");
							//mem_email = rset.getString("SALE_EMAIL");
							//mem_tel = rset.getString("SALE_TEL");
							sales_id_label.setText(mem_id);
							
					 }	
					  
					  if ((mem_id!=null)||(mem_name!=null)){
						  sale_New.setVisible(false);
						  sale_Edit.setVisible(true);
						  New_saleId_edit.setText(mem_id);
						  Edit_saleName.setText(mem_name);
						  Edit_saleLastName.setText(mem_lastname);
						  Edit_saleAddress.setText(mem_hiredate);
						  mem_id=null;
						  mem_name=null;
						  mem_lastname=null;
						  mem_hiredate=null;
						 
						  
					  }
					  else
					  {
						  JOptionPane.showMessageDialog(null, "Your member id is not match!!");
						  sale_Edit.setVisible(false);
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
		return sale_edit_search_button;
	}

	/**
	 * This method initializes sale_all_sort_name__button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getSale_all_sort_name__button() {
		if (sale_all_sort_name__button == null) {
			sale_all_sort_name__button = new JButton();
			sale_all_sort_name__button.setBounds(new Rectangle(222, 423, 119, 28));
			sale_all_sort_name__button.setText("First Name");
			sale_all_sort_name__button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			sale_all_sort_name__button
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e1) {
							Connection con = null;
							//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
							PreparedStatement pstmt = null;
							// ประกาศ rset เป็น instance ของคลาส ResultSet
							ResultSet rset = null;

							String name_search="     |---- ID ----|------------ First Name/Last Name ------------|\n     =====================================================\n\n     ";
							sale_result.setText("");
					     //ดักจับข้อผิดพลาด
							try {
					       //Registering the JDBC Drivers : MySQL
								Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
							  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
							  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
							  //Show all records in STUDENT table
							  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
							  pstmt = con.prepareStatement ("SELECT * FROM SALE ORDER BY SALE_NAME");
							 //Executing a Query 
							  rset = pstmt.executeQuery(); 
							  //Processing the Result Set 
							  while (rset.next()) {
								//รับค่า String id จาก attribute ID
								String mem_id = rset.getString("SALE_ID");
								name_search=name_search+mem_id+"\t";
								String mem_name = rset.getString("SALE_NAME");
								name_search=name_search+mem_name+" ";	
								String mem_lastname = rset.getString("SALE_LASTNAME");
								name_search=name_search+mem_lastname+"\n     ";
							  }	
							sale_result.setText(name_search);
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
		return sale_all_sort_name__button;
	}

	/**
	 * This method initializes sale_all_sort_lastname__button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getSale_all_sort_lastname__button() {
		if (sale_all_sort_lastname__button == null) {
			sale_all_sort_lastname__button = new JButton();
			sale_all_sort_lastname__button.setBounds(new Rectangle(342, 423, 119, 28));
			sale_all_sort_lastname__button.setText("Last Name");
			sale_all_sort_lastname__button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			sale_all_sort_lastname__button
					.addActionListener(new java.awt.event.ActionListener() {
							public void actionPerformed(java.awt.event.ActionEvent e1) {
								Connection con = null;
								//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
								PreparedStatement pstmt = null;
								// ประกาศ rset เป็น instance ของคลาส ResultSet
								ResultSet rset = null;

								String name_search="     |---- ID ----|------------ First Name/Last Name ------------|\n     =====================================================\n\n     ";
								sale_result.setText("");
						     //ดักจับข้อผิดพลาด
								try {
						       //Registering the JDBC Drivers : MySQL
									Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
								  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
								  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
								  //Show all records in STUDENT table
								  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
								  pstmt = con.prepareStatement ("SELECT * FROM SALE ORDER BY SALE_LASTNAME");
								 //Executing a Query 
								  rset = pstmt.executeQuery(); 
								  //Processing the Result Set 
								  while (rset.next()) {
									//รับค่า String id จาก attribute ID
									String mem_id = rset.getString("SALE_ID");
									name_search=name_search+mem_id+"\t";
									String mem_name = rset.getString("SALE_NAME");
									name_search=name_search+mem_name+" ";	
									String mem_lastname = rset.getString("SALE_LASTNAME");
									name_search=name_search+mem_lastname+"\n     ";
								  }	
								sale_result.setText(name_search);
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
		return sale_all_sort_lastname__button;
	}

	/**
	 * This method initializes sale_New	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getSale_New() {
		if (sale_New == null) {
			Add_sale_label = new JLabel();
			Add_sale_label.setBounds(new Rectangle(35, 19, 282, 28));
			Add_sale_label.setText("Add Sale");
			Add_sale_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			sale_id_label = new JLabel();
			sale_id_label.setBounds(new Rectangle(35, 59, 97, 21));
			sale_id_label.setText("ID");
			sale_id_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			sale_address_label = new JLabel();
			sale_address_label.setBounds(new Rectangle(35, 174, 95, 21));
			sale_address_label.setText("HireDate");
			sale_address_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			sale_lastname_label = new JLabel();
			sale_lastname_label.setBounds(new Rectangle(35, 136, 112, 21));
			sale_lastname_label.setText("Last Name");
			sale_lastname_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			sale_name_label = new JLabel();
			sale_name_label.setBounds(new Rectangle(35, 94, 111, 26));
			sale_name_label.setText("First Name");
			sale_name_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			sale_New = new JPanel();
			sale_New.setLayout(null);
			sale_New.setLocation(new Point(508, 248));
			sale_New.setBackground(Color.white);
			sale_New.setEnabled(true);
			sale_New.setSize(new Dimension(484, 417));
			sale_New.add(getNew_saleName(), null);
			sale_New.add(getNew_saleLastName(), null);
			sale_New.add(getNew_saleAddress(), null);
			sale_New.add(sale_name_label, null);
			sale_New.add(sale_lastname_label, null);
			sale_New.add(sale_address_label, null);
			sale_New.add(getNewsale_send(), null);
			sale_New.add(getNewsale_clear(), null);
			sale_New.add(getNew_saleId(), null);
			sale_New.add(sale_id_label, null);
			sale_New.add(Add_sale_label, null);
			sale_New.setVisible(true);
		}
		return sale_New;
	}

	/**
	 * This method initializes New_saleName	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_saleName() {
		if (New_saleName == null) {
			New_saleName = new JTextField();
			New_saleName.setBounds(new Rectangle(150, 95, 293, 25));
			New_saleName.setBackground(Color.white);
		}
		return New_saleName;
	}

	/**
	 * This method initializes New_saleLastName	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_saleLastName() {
		if (New_saleLastName == null) {
			New_saleLastName = new JTextField();
			New_saleLastName.setBounds(new Rectangle(150, 132, 293, 25));
			New_saleLastName.setBackground(Color.white);
		}
		return New_saleLastName;
	}

	/**
	 * This method initializes New_saleAddress	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_saleAddress() {
		if (New_saleAddress == null) {
			New_saleAddress = new JTextField();
			New_saleAddress.setBounds(new Rectangle(150, 174, 293, 25));
			New_saleAddress.setText("Program will set date from today.");
			New_saleAddress.setEditable(false);
			New_saleAddress.setEnabled(false);
		}
		return New_saleAddress;
	}

	/**
	 * This method initializes newsale_send	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getNewsale_send() {
		if (newsale_send == null) {
			newsale_send = new JButton();
			newsale_send.setBounds(new Rectangle(73, 307, 157, 40));
			newsale_send.setText("Add Sale");
			newsale_send.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			newsale_send.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					String new_id=New_saleId.getText();
					String new_name=New_saleName.getText();
					String new_lastname=New_saleLastName.getText();
					//String new_email=New_MemEmail.getText();
					//String new_tel=New_MemTel.getText();
					if (new_id.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_name.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_lastname.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					/*else if (new_email.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_tel.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}*/
					else
					{
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
						pstmt = con.prepareStatement ("INSERT INTO SALE(SALE_ID,SALE_NAME,SALE_LASTNAME,SALE_HIREDATE) VALUES(SEQ_SALE_ID.NEXTVAL,\'"+new_name.toUpperCase()+"\',\'"+new_lastname.toUpperCase()+"\',to_date(SYSDATE, \'DD-MON-YYYY'));");
						JOptionPane.showMessageDialog(null,"Insert successfully!");
						New_saleId.setText("Program will generate Id to you");
						New_saleName.setText("");
						New_saleLastName.setText("");
						rset = pstmt.executeQuery(); 	
									  
						rset.close();
						pstmt.close();
						con.close();
						}catch (Exception e){ 
								System.out.println(e.getMessage());
								// finally block
						}
					}
				}
			});
		}
		return newsale_send;
	}

	/**
	 * This method initializes newsale_clear	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getNewsale_clear() {
		if (newsale_clear == null) {
			newsale_clear = new JButton();
			newsale_clear.setBounds(new Rectangle(245, 307, 157, 40));
			newsale_clear.setText("Clear Field");
			newsale_clear.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			newsale_clear.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					New_saleName.setText("");
					New_saleLastName.setText("");
				}
			});
		}
		return newsale_clear;
	}

	/**
	 * This method initializes New_saleId	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_saleId() {
		if (New_saleId == null) {
			New_saleId = new JTextField();
			New_saleId.setBounds(new Rectangle(150, 58, 293, 25));
			New_saleId.setText("Program will generate Id to you");
			New_saleId.setEditable(false);
			New_saleId.setEnabled(false);
		}
		return New_saleId;
	}

	/**
	 * This method initializes sale_Edit	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getSale_Edit() {
		if (sale_Edit == null) {
			sales_id_label = new JLabel();
			sales_id_label.setBounds(new Rectangle(155, 17, 238, 28));
			sales_id_label.setForeground(Color.red);
			sales_id_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			sale_label = new JLabel();
			sale_label.setBounds(new Rectangle(34, 17, 112, 28));
			sale_label.setText("Sale");
			sale_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			sale_id_label_edit = new JLabel();
			sale_id_label_edit.setBounds(new Rectangle(35, 59, 97, 21));
			sale_id_label_edit.setText("ID");
			sale_id_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			sale_address_label_edit = new JLabel();
			sale_address_label_edit.setBounds(new Rectangle(35, 174, 95, 21));
			sale_address_label_edit.setText("HireDate");
			sale_address_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			sale_lastname_label_edit = new JLabel();
			sale_lastname_label_edit.setBounds(new Rectangle(35, 136, 112, 21));
			sale_lastname_label_edit.setText("Last Name");
			sale_lastname_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			sale_name_label_edit = new JLabel();
			sale_name_label_edit.setBounds(new Rectangle(35, 94, 111, 26));
			sale_name_label_edit.setText("First Name");
			sale_name_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			sale_Edit = new JPanel();
			sale_Edit.setLayout(null);
			sale_Edit.setBackground(new Color(205, 235, 255));
			sale_Edit.setBounds(new Rectangle(508, 248, 486, 419));
			sale_Edit.add(getEdit_saleName(), null);
			sale_Edit.add(getEdit_saleLastName(), null);
			sale_Edit.add(getEdit_saleAddress(), null);
			sale_Edit.add(sale_name_label_edit, null);
			sale_Edit.add(sale_lastname_label_edit, null);
			sale_Edit.add(sale_address_label_edit, null);
			sale_Edit.add(getSale_send_edit(), null);
			sale_Edit.add(getNewsale_clear_edit(), null);
			sale_Edit.add(getNew_saleId_edit(), null);
			sale_Edit.add(sale_id_label_edit, null);
			sale_Edit.add(getAdd_sale_Back_Button_Edit(), null);
			sale_Edit.add(getSale_delete_edit(), null);
			sale_Edit.add(sale_label, null);
			sale_Edit.add(sales_id_label, null);
			sale_Edit.setVisible(false);
		}
		return sale_Edit;
	}

	/**
	 * This method initializes Edit_saleName	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getEdit_saleName() {
		if (Edit_saleName == null) {
			Edit_saleName = new JTextField();
			Edit_saleName.setBounds(new Rectangle(150, 95, 293, 25));
		}
		return Edit_saleName;
	}

	/**
	 * This method initializes Edit_saleLastName	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getEdit_saleLastName() {
		if (Edit_saleLastName == null) {
			Edit_saleLastName = new JTextField();
			Edit_saleLastName.setBounds(new Rectangle(150, 135, 293, 25));
			Edit_saleLastName.setEditable(true);
		}
		return Edit_saleLastName;
	}

	/**
	 * This method initializes Edit_saleAddress	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getEdit_saleAddress() {
		if (Edit_saleAddress == null) {
			Edit_saleAddress = new JTextField();
			Edit_saleAddress.setBounds(new Rectangle(150, 174, 293, 25));
			Edit_saleAddress.setText("You cannot edit your hire date.");
			Edit_saleAddress.setEditable(false);
			Edit_saleAddress.setEnabled(false);
		}
		return Edit_saleAddress;
	}

	/**
	 * This method initializes sale_send_edit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getSale_send_edit() {
		if (sale_send_edit == null) {
			sale_send_edit = new JButton();
			sale_send_edit.setBounds(new Rectangle(76, 301, 100, 40));
			sale_send_edit.setText("Edit");
			sale_send_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			sale_send_edit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					String new_id=New_saleId_edit.getText();
					String new_name=Edit_saleName.getText();
					String new_lastname=Edit_saleLastName.getText();
					String new_address=Edit_saleAddress.getText();
					
					if (new_id.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_name.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_lastname.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_address.equalsIgnoreCase(""))
					{
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					
					else
					{
						Connection con = null;
						//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
						PreparedStatement pstmt = null;
						// ประกาศ rset เป็น instance ของคลาส ResultSet
						ResultSet rset = null;

						JOptionPane.showMessageDialog(null, "Update Complete!!");	
						sale_New.setVisible(true);
						sale_Edit.setVisible(false);
						//ดักจับข้อผิดพลาด
						try {
				       //Registering the JDBC Drivers : MySQL
							Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
						  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
						  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
						  pstmt = con.prepareStatement ("UPDATE SALE SET SALE_ID="+Integer.parseInt(new_id)+",SALE_NAME=\'"+new_name.toUpperCase()+"\',SALE_LASTNAME=\'"+new_lastname.toUpperCase()+"\',SALE_HIREDATE=to_date(\'"+new_address+"\', \'DD-MON-YYYY') WHERE SALE_ID="+new_id);
							 //Executing a Query 
							  rset = pstmt.executeQuery(); 
							  //Processing the Result Set 
							    						  
						rset.close();
						pstmt.close();
						con.close();
						

						
						}catch (Exception e){ 
							System.out.println(e.getMessage());
							// finally block
					}
					}
				}
			});
		}
		return sale_send_edit;
	}

	/**
	 * This method initializes newsale_clear_edit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getNewsale_clear_edit() {
		if (newsale_clear_edit == null) {
			newsale_clear_edit = new JButton();
			newsale_clear_edit.setBounds(new Rectangle(315, 301, 100, 40));
			newsale_clear_edit.setText("Clear");
			newsale_clear_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			newsale_clear_edit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Edit_saleName.setText("");
					Edit_saleLastName.setText("");
				}
			});
		}
		return newsale_clear_edit;
	}

	/**
	 * This method initializes New_saleId_edit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_saleId_edit() {
		if (New_saleId_edit == null) {
			New_saleId_edit = new JTextField();
			New_saleId_edit.setBounds(new Rectangle(149, 56, 293, 25));
			New_saleId_edit.setEnabled(false);
			New_saleId_edit.setEditable(false);
			New_saleId_edit.setVisible(true);
		}
		return New_saleId_edit;
	}

	/**
	 * This method initializes Add_sale_Back_Button_Edit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAdd_sale_Back_Button_Edit() {
		if (Add_sale_Back_Button_Edit == null) {
			Add_sale_Back_Button_Edit = new JButton();
			Add_sale_Back_Button_Edit.setBounds(new Rectangle(74, 347, 339, 40));
			Add_sale_Back_Button_Edit.setText("Back");
			Add_sale_Back_Button_Edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			Add_sale_Back_Button_Edit
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							sale_Edit.setVisible(false);
							sale_New.setVisible(true);
						}
					});
		}
		return Add_sale_Back_Button_Edit;
	}

	/**
	 * This method initializes sale_delete_edit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getSale_delete_edit() {
		if (sale_delete_edit == null) {
			sale_delete_edit = new JButton();
			sale_delete_edit.setBounds(new Rectangle(196, 301, 100, 40));
			sale_delete_edit.setText("Delete");
			sale_delete_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			sale_delete_edit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					String new_id =sales_id_label.getText();
					int ch=0;
					

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
						  ch = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete?",JOptionPane.YES_NO_OPTION);
						  if (ch!=1){
							  pstmt = con.prepareStatement ("DELETE FROM SALE WHERE SALE_ID=\'+"+new_id+"\'");
							  JOptionPane.showMessageDialog(null, "Delete Complete!!");
						  }
						  
							sale_New.setVisible(true);
							sale_Edit.setVisible(false);
							 //Executing a Query 
							  rset = pstmt.executeQuery(); 
							  //Processing the Result Set 
							    						  
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
		return sale_delete_edit;
	}

	/**
	 * This method initializes newsale_send1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getNewsale_send1() {
		if (newsale_send1 == null) {
			newsale_send1 = new JButton();
			newsale_send1.setBounds(new Rectangle(778, 675, 214, 38));
			newsale_send1.setText("Back To Main Menu");
			newsale_send1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			newsale_send1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Main_Page.setVisible(true);
					Member_Page.setVisible(false);
					Sale_Page.setVisible(false);
				}
			});
		}
		return newsale_send1;
	}

	/**
	 * This method initializes member_backtomain	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getMember_backtomain() {
		if (member_backtomain == null) {
			member_backtomain = new JButton();
			member_backtomain.setBounds(new Rectangle(776, 669, 214, 38));
			member_backtomain.setText("Back To Main Menu");
			member_backtomain.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			member_backtomain.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Main_Page.setVisible(true);
					Shelf_Page.setVisible(false);
					Member_Page.setVisible(false);
					Sale_Page.setVisible(false);
				}
			});
		}
		return member_backtomain;
	}

	/**
	 * This method initializes Shelf_Page	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getShelf_Page() {
		if (Shelf_Page == null) {
			Sales_bg1 = new JLabel();
			Sales_bg1.setBounds(new Rectangle(0, 0, 1024, 768));
			Sales_bg1.setText("");
			Sales_bg1.setIcon(new ImageIcon("bg/bg1.jpg"));
			shelf_Search_firstname_Label = new JLabel();
			shelf_Search_firstname_Label.setForeground(new Color(205, 235, 255));
			shelf_Search_firstname_Label.setBounds(new Rectangle(30, 258, 107, 28));
			shelf_Search_firstname_Label.setText("By Type");
			shelf_Search_firstname_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			shelf_Search_id_Label = new JLabel();
			shelf_Search_id_Label.setForeground(new Color(205, 235, 255));
			shelf_Search_id_Label.setBounds(new Rectangle(30, 211, 66, 28));
			shelf_Search_id_Label.setText("By ID");
			shelf_Search_id_Label.setForeground(new Color(205, 235, 255));
			shelf_Search_id_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			shelf_search_name_detail_label = new JLabel();
			shelf_search_name_detail_label.setForeground(new Color(205, 235, 255));
			shelf_search_name_detail_label.setBounds(new Rectangle(146, 289, 229, 16));
			shelf_search_name_detail_label.setText("Insert at most 50 letters");
			shelf_search_name_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			shelf_search_detail_label = new JLabel();
			shelf_search_detail_label.setForeground(new Color(205, 235, 255));
			shelf_search_detail_label.setBounds(new Rectangle(30, 172, 494, 21));
			shelf_search_detail_label.setText("You can search by shelf id/shelf type");
			shelf_search_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			shelf_Search_Label = new JLabel();
			shelf_Search_Label.setForeground(new Color(205, 235, 255));
			shelf_Search_Label.setBounds(new Rectangle(29, 135, 220, 28));
			shelf_Search_Label.setForeground(new Color(205, 235, 255));
			shelf_Search_Label.setText("Search Shelf");
			shelf_Search_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			shelf_search_id_detail_label = new JLabel();
			shelf_search_id_detail_label.setForeground(new Color(205, 235, 255));
			shelf_search_id_detail_label.setBounds(new Rectangle(146, 237, 235, 16));
			shelf_search_id_detail_label.setText("Insert only number 0-9 (2 digits)");
			shelf_search_id_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			shelf_Sort_Label = new JLabel();
			shelf_Sort_Label.setForeground(new Color(205, 235, 255));
			shelf_Sort_Label.setBounds(new Rectangle(29, 380, 231, 28));
			shelf_Sort_Label.setText("Show All Shelf");
			shelf_Sort_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			shelf_sort_detail_label = new JLabel();
			shelf_sort_detail_label.setForeground(new Color(205, 235, 255));
			shelf_sort_detail_label.setBounds(new Rectangle(31, 431, 56, 16));
			shelf_sort_detail_label.setText("sort by");
			shelf_sort_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			shelf_topic_label = new JLabel();
			shelf_topic_label.setForeground(new Color(235, 245, 255));
			shelf_topic_label.setBounds(new Rectangle(30, 43, 299, 62));
			shelf_topic_label.setText("Shelf");
			shelf_topic_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 72));
			shelf_detail_label = new JLabel();
			shelf_detail_label.setForeground(new Color(205, 235, 255));
			shelf_detail_label.setBounds(new Rectangle(541, 172, 399, 21));
			shelf_detail_label.setText("insert shelf id to view or edit/update/delete shelf");
			shelf_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			shelf_View_Label = new JLabel();
			shelf_View_Label.setForeground(new Color(205, 235, 255));
			shelf_View_Label.setBounds(new Rectangle(540, 135, 190, 28));
			shelf_View_Label.setText("Shelf Detail");
			shelf_View_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			Shelf_Page = new JPanel();
			Shelf_Page.setLayout(null);
			Shelf_Page.setBackground(Color.white);
			Shelf_Page.setVisible(false);
			Shelf_Page.setSize(new Dimension(1024, 768));
			Shelf_Page.setLocation(new Point(0, 0));
			Shelf_Page.add(getShelf_name_search(), null);
			Shelf_Page.add(getShelf_name_search_button(), null);
			Shelf_Page.add(getShelf_all_sort_id__button(), null);
			Shelf_Page.add(getShelf_Clear_All_Button(), null);
			Shelf_Page.add(getShelf_id_search(), null);
			Shelf_Page.add(getShelf_id_search_button(), null);
			Shelf_Page.add(getShelf_result_scroll(), null);
			Shelf_Page.add(getShelf_id_search_edit(), null);
			Shelf_Page.add(getShelf_edit_search_button(), null);
			Shelf_Page.add(shelf_View_Label, null);
			Shelf_Page.add(shelf_detail_label, null);
			Shelf_Page.add(shelf_topic_label, null);
			Shelf_Page.add(getShelf_all_sort_name__button(), null);
			Shelf_Page.add(shelf_sort_detail_label, null);
			Shelf_Page.add(shelf_Sort_Label, null);
			Shelf_Page.add(shelf_search_id_detail_label, null);
			Shelf_Page.add(shelf_Search_Label, null);
			Shelf_Page.add(shelf_search_detail_label, null);
			Shelf_Page.add(shelf_search_name_detail_label, null);
			Shelf_Page.add(shelf_Search_id_Label, null);
			Shelf_Page.add(shelf_Search_firstname_Label, null);
			Shelf_Page.add(getMember_backtomain1(), null);
			Shelf_Page.add(getShelf_New(), null);
			Shelf_Page.add(getShelf_Edit(), null);
			Shelf_Page.add(Sales_bg1, null);
		}
		return Shelf_Page;
	}

	/**
	 * This method initializes shelf_name_search	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getShelf_name_search() {
		if (shelf_name_search == null) {
			shelf_name_search = new JTextField();
			shelf_name_search.setBackground(new Color(205, 235, 255));
			shelf_name_search.setBounds(new Rectangle(146, 259, 211, 28));
		}
		return shelf_name_search;
	}

	/**
	 * This method initializes shelf_name_search_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getShelf_name_search_button() {
		if (shelf_name_search_button == null) {
			shelf_name_search_button = new JButton();
			shelf_name_search_button.setBounds(new Rectangle(360, 259, 104, 28));
			shelf_name_search_button.setText("Search");
			shelf_name_search_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			shelf_name_search_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null;
					String name = (shelf_name_search.getText().toUpperCase());
					//System.out.println("NAME ="+name);
					String name_search="     |---- Shelf ID ----|------------ Genre Name ------------|\n     =====================================================\n\n     ";
					String mem_id = null;
					String mem_name=null;
					shelf_result.setText("");
			     //ดักจับข้อผิดพลาด
					try {
			       //Registering the JDBC Drivers : MySQL
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
					  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
					  //Show all records in STUDENT table
					  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
					  pstmt = con.prepareStatement ("SELECT * FROM SHELF NATURAL JOIN GENRE WHERE GENRE_NAME LIKE \'"+name+"%\'");
					 //Executing a Query 
					  rset = pstmt.executeQuery(); 
					  //Processing the Result Set 
					  while (rset.next()) {
						//รับค่า String id จาก attribute ID
						mem_id = rset.getString("SHELF_ID");
						name_search=name_search+mem_id+"\t";
						mem_name = rset.getString("GENRE_NAME");
						//System.out.println("MEM_NAME"+mem_name);
						name_search=name_search+mem_name+"\n   ";	
						
					  }	
					  if (mem_name!=null){
						  shelf_result.setText(name_search);
						  name=null;
					  }
					  else
					  {
						  shelf_result.setText(" Your Input is not match!!");
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
		return shelf_name_search_button;
	}

	/**
	 * This method initializes shelf_all_sort_id__button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getShelf_all_sort_id__button() {
		if (shelf_all_sort_id__button == null) {
			shelf_all_sort_id__button = new JButton();
			shelf_all_sort_id__button.setBounds(new Rectangle(103, 423, 166, 28));
			shelf_all_sort_id__button.setText("Id");
			shelf_all_sort_id__button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			shelf_all_sort_id__button
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e1) {
							Connection con = null;
							//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
							PreparedStatement pstmt = null;
							// ประกาศ rset เป็น instance ของคลาส ResultSet
							ResultSet rset = null;

							String name_search="     |---- Shelf ID ----|------------ Genre Name ------------|\n     =====================================================\n\n     ";
							shelf_result.setText("");
					     //ดักจับข้อผิดพลาด
							try {
					       //Registering the JDBC Drivers : MySQL
								Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
							  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
							  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
							  //Show all records in STUDENT table
							  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
							  pstmt = con.prepareStatement ("SELECT * FROM SHELF NATURAL JOIN GENRE ORDER BY SHELF_ID");
							 //Executing a Query 
							  rset = pstmt.executeQuery(); 
							  //Processing the Result Set 
							  while (rset.next()) {
								//รับค่า String id จาก attribute ID
								String mem_id = rset.getString("SHELF_ID");
								name_search=name_search+mem_id+"\t";
								String mem_name = rset.getString("GENRE_NAME");
								name_search=name_search+mem_name+"\n     ";	
								
							  }	
							shelf_result.setText(name_search);
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
		return shelf_all_sort_id__button;
	}

	/**
	 * This method initializes shelf_Clear_All_Button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getShelf_Clear_All_Button() {
		if (shelf_Clear_All_Button == null) {
			shelf_Clear_All_Button = new JButton();
			shelf_Clear_All_Button.setBounds(new Rectangle(247, 668, 214, 38));
			shelf_Clear_All_Button.setText("Clear All Search Field");
			shelf_Clear_All_Button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			shelf_Clear_All_Button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					shelf_id_search.setText("");
					shelf_name_search.setText("");
					shelf_result.setText("");
				}
			});
		}
		return shelf_Clear_All_Button;
	}

	/**
	 * This method initializes shelf_id_search	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getShelf_id_search() {
		if (shelf_id_search == null) {
			shelf_id_search = new JTextField(null, 4);
			shelf_id_search.setBackground(new Color(205, 235, 255));
			shelf_id_search.setBounds(new Rectangle(146, 210, 211, 28));
		}
		return shelf_id_search;
	}

	/**
	 * This method initializes shelf_id_search_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getShelf_id_search_button() {
		if (shelf_id_search_button == null) {
			shelf_id_search_button = new JButton();
			shelf_id_search_button.setBounds(new Rectangle(360, 210, 104, 28));
			shelf_id_search_button.setText("Search");
			shelf_id_search_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			shelf_id_search_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null;
					String id = (shelf_id_search.getText().toUpperCase());
					String name_search="     |---- Shelf ID ----|------------ Genre Name ------------|\n     =====================================================\n\n     ";
					String genre_id = null;
					shelf_result.setText("");
			     //ดักจับข้อผิดพลาด
					try {
			       //Registering the JDBC Drivers : MySQL
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
					  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
					  //Show all records in STUDENT table
					  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
					  pstmt = con.prepareStatement ("SELECT * FROM SHELF NATURAL JOIN GENRE WHERE SHELF_ID=\'"+id+"\'");
					 //Executing a Query 
					  rset = pstmt.executeQuery(); 
					  //Processing the Result Set 
					  while (rset.next()) {
						//รับค่า String id จาก attribute ID
						genre_id = rset.getString("SHELF_ID");
						name_search=name_search+genre_id+"\t";
						String mem_name = rset.getString("GENRE_NAME");
						name_search=name_search+mem_name+" ";	
						
					  }	
					  if (genre_id!=null){
						  shelf_result.setText(name_search);
					  }
					  else
					  {
						  shelf_result.setText(" Your Input is not match!!");
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
		return shelf_id_search_button;
	}

	/**
	 * This method initializes shelf_result_scroll	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getShelf_result_scroll() {
		if (shelf_result_scroll == null) {
			shelf_result_scroll = new JScrollPane();
			shelf_result_scroll.setBounds(new Rectangle(31, 454, 431, 210));
			shelf_result_scroll.setViewportView(getShelf_result());
		}
		return shelf_result_scroll;
	}

	/**
	 * This method initializes shelf_result	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getShelf_result() {
		if (shelf_result == null) {
			shelf_result = new JTextArea();
			shelf_result.setBackground(new Color(205, 235, 255));
		}
		return shelf_result;
	}

	/**
	 * This method initializes shelf_id_search_edit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getShelf_id_search_edit() {
		if (shelf_id_search_edit == null) {
			shelf_id_search_edit = new JTextField();
			shelf_id_search_edit.setBackground(new Color(205, 235, 255));
			shelf_id_search_edit.setBounds(new Rectangle(508, 209, 244, 28));
		}
		return shelf_id_search_edit;
	}

	/**
	 * This method initializes shelf_edit_search_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getShelf_edit_search_button() {
		if (shelf_edit_search_button == null) {
			shelf_edit_search_button = new JButton();
			shelf_edit_search_button.setBounds(new Rectangle(756, 210, 93, 26));
			shelf_edit_search_button.setText("View");
			shelf_edit_search_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			shelf_edit_search_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null;
					
					String edit_member=null;
					edit_member= shelf_id_search_edit.getText();
					//System.out.println("Edit Member :"+edit_member);
					//ดักจับข้อผิดพลาด
					try {
			       //Registering the JDBC Drivers : MySQL
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
					  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
					  //Show all records in STUDENT table
					  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
					  pstmt = con.prepareStatement ("SELECT  SHELF_ID,GENRE_ID FROM SHELF WHERE SHELF_ID=\'"+edit_member+"\'");
					 //Executing a Query 
					  rset = pstmt.executeQuery(); 
					  //Processing the Result Set 
					  String shelf_id = null;
					  String genre_id = null;

					  while (rset.next()) {
							//รับค่า String id จาก attribute ID
						  shelf_id = rset.getString("SHELF_ID");
						  genre_id = rset.getString("GENRE_ID");
						  
						  //System.out.println("SHELF_ID="+shelf_id);
						  //System.out.println("GENRE_ID="+genre_id);
										
							shelfs_id_label.setText(shelf_id);
							New_shelfId_edit.setText(shelf_id);
							
							if(genre_id.equals("1")){
								shelf_radio_action.setSelected(true);
								//System.out.println("GENRE_ID in if ="+genre_id);
							}
							if(genre_id.equals("2")){
								shelf_radio_adventure.setSelected(true);
							}
							if(genre_id.equals("3")){
								shelf_radio_animation.setSelected(true);
							}
							if(genre_id.equals("4")){
								shelf_radio_comedy.setSelected(true);
							}
							if(genre_id.equals("5")){
								shelf_radio_crime.setSelected(true);
							}
							if(genre_id.equals("6")){
								shelf_radio_drama.setSelected(true);
							}
							if(genre_id.equals("7")){
								shelf_radio_fantasy.setSelected(true);
							}
							if(genre_id.equals("8")){
								shelf_radio_horror.setSelected(true);
							}
							if(genre_id.equals("9")){
								shelf_radio_romantic.setSelected(true);
							}
							if(genre_id.equals("=10")){
								shelf_radio_scifi.setSelected(true);
							}
							if(genre_id.equals("=11")){
								shelf_radio_series.setSelected(true);
							}
							
					 }	
					  
					  if ((shelf_id!=null)||(genre_id!=null)){
						  shelf_Edit.setVisible(true);
						  shelf_New.setVisible(false);
						  
						  New_shelfId_edit.setText(shelf_id);
						 
			
						  shelf_id=null;
						  genre_id=null;
						 
						  
					  }
					  else
					  {
						  JOptionPane.showMessageDialog(null, "Your member id is not match!!");
						  shelf_Edit.setVisible(false);
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
		return shelf_edit_search_button;
	}

	/**
	 * This method initializes shelf_all_sort_name__button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getShelf_all_sort_name__button() {
		if (shelf_all_sort_name__button == null) {
			shelf_all_sort_name__button = new JButton();
			shelf_all_sort_name__button.setLocation(new Point(277, 424));
			shelf_all_sort_name__button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			shelf_all_sort_name__button.setText("Type");
			shelf_all_sort_name__button.setSize(new Dimension(166, 28));
			shelf_all_sort_name__button
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e1) {
							Connection con = null;
							//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
							PreparedStatement pstmt = null;
							// ประกาศ rset เป็น instance ของคลาส ResultSet
							ResultSet rset = null;

							String name_search="     |---- Shelf ID ----|------------ Genre Name ------------|\n     =====================================================\n\n     ";
							shelf_result.setText("");
					     //ดักจับข้อผิดพลาด
							try {
					       //Registering the JDBC Drivers : MySQL
								Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
							  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
							  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
							  //Show all records in STUDENT table
							  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
							  pstmt = con.prepareStatement ("SELECT * FROM GENRE NATURAL JOIN SHELF ORDER BY GENRE_NAME");
							 //Executing a Query 
							  rset = pstmt.executeQuery(); 
							  //Processing the Result Set 
							  while (rset.next()) {
								//รับค่า String id จาก attribute ID
								String mem_id = rset.getString("SHELF_ID");
								name_search=name_search+mem_id+"\t";
								String mem_name = rset.getString("GENRE_NAME");
								name_search=name_search+mem_name+"\n     ";	
								
							  }	
							shelf_result.setText(name_search);
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
		return shelf_all_sort_name__button;
	}

	/**
	 * This method initializes shelf_New	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getShelf_New() {
		if (shelf_New == null) {
			new_Series_Label = new JLabel();
			new_Series_Label.setBounds(new Rectangle(412, 121, 37, 16));
			new_Series_Label.setText("Series");
			new_scifi_Label = new JLabel();
			new_scifi_Label.setBounds(new Rectangle(412, 101, 29, 16));
			new_scifi_Label.setText("Sci-fi");
			new_romantic_Label = new JLabel();
			new_romantic_Label.setBounds(new Rectangle(341, 142, 54, 16));
			new_romantic_Label.setText("Romantic");
			new_horror_Label = new JLabel();
			new_horror_Label.setBounds(new Rectangle(341, 121, 37, 16));
			new_horror_Label.setText("Horror");
			new_fantasy_Label = new JLabel();
			new_fantasy_Label.setBounds(new Rectangle(340, 101, 44, 16));
			new_fantasy_Label.setText("Fantasy");
			new_drama_Label = new JLabel();
			new_drama_Label.setBounds(new Rectangle(266, 142, 38, 16));
			new_drama_Label.setText("Drama");
			new_crime_Label = new JLabel();
			new_crime_Label.setBounds(new Rectangle(266, 121, 34, 16));
			new_crime_Label.setText("Crime");
			new_comedy_Label = new JLabel();
			new_comedy_Label.setBounds(new Rectangle(265, 101, 46, 16));
			new_comedy_Label.setText("Comedy");
			new_adventure_Label = new JLabel();
			new_adventure_Label.setBounds(new Rectangle(170, 144, 58, 16));
			new_adventure_Label.setText("Adventure");
			new_animation_Label = new JLabel();
			new_animation_Label.setBounds(new Rectangle(171, 121, 57, 16));
			new_animation_Label.setText("Animation");
			new_action_Label = new JLabel();
			new_action_Label.setBounds(new Rectangle(171, 101, 36, 16));
			new_action_Label.setText("Action");
			Add_shelf_label = new JLabel();
			Add_shelf_label.setBounds(new Rectangle(35, 19, 282, 28));
			Add_shelf_label.setText("Add Shelf");
			Add_shelf_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			shelf_id_label = new JLabel();
			shelf_id_label.setBounds(new Rectangle(35, 59, 97, 21));
			shelf_id_label.setText("ID");
			shelf_id_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			shelf_name_label = new JLabel();
			shelf_name_label.setBounds(new Rectangle(35, 94, 111, 26));
			shelf_name_label.setText("Type");
			shelf_name_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			shelf_New = new JPanel();
			shelf_New.setLayout(null);
			shelf_New.setEnabled(true);
			shelf_New.setBackground(Color.white);
			shelf_New.setBounds(new Rectangle(509, 240, 478, 371));
			shelf_New.add(shelf_name_label, null);
			shelf_New.add(getNewshelf_send(), null);
			shelf_New.add(getNew_shelfId(), null);
			shelf_New.add(shelf_id_label, null);
			shelf_New.add(Add_shelf_label, null);
			shelf_New.add(getNew_shelf_radio_action(), null);
			shelf_New.add(new_action_Label, null);
			shelf_New.add(getNew_shelf_radio_animation(), null);
			shelf_New.add(new_animation_Label, null);
			shelf_New.add(getNew_shelf_radio_adventure(), null);
			shelf_New.add(new_adventure_Label, null);
			shelf_New.add(getNew_shelf_radio_comedy(), null);
			shelf_New.add(new_comedy_Label, null);
			shelf_New.add(getNew_shelf_radio_crime(), null);
			shelf_New.add(new_crime_Label, null);
			shelf_New.add(getNew_shelf_radio_drama(), null);
			shelf_New.add(new_drama_Label, null);
			shelf_New.add(getNew_shelf_radio_fantasy(), null);
			shelf_New.add(new_fantasy_Label, null);
			shelf_New.add(getNew_shelf_radio_horror(), null);
			shelf_New.add(new_horror_Label, null);
			shelf_New.add(new_romantic_Label, null);
			shelf_New.add(getNew_shelf_radio_romantic(), null);
			shelf_New.add(getNew_shelf_radio_scifi(), null);
			shelf_New.add(new_scifi_Label, null);
			shelf_New.add(getNew_shelf_radio_series(), null);
			shelf_New.add(new_Series_Label, null);
			shelf_New.setVisible(true);
		}
		return shelf_New;
	}

	/**
	 * This method initializes newshelf_send	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getNewshelf_send() {
		if (newshelf_send == null) {
			newshelf_send = new JButton();
			newshelf_send.setBounds(new Rectangle(290, 306, 157, 40));
			newshelf_send.setText("Add Shelf");
			newshelf_send.setFont(new Font("Dialog", Font.BOLD, 18));
			newshelf_send.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					String new_id=New_shelfId.getText();
					String newtype=null;
					
					if (new_id.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					//System.out.println("newtype = "+newtype);
						if (new_shelf_radio_action.isSelected()){
							newtype="1";
							//System.out.println("newtype="+newtype);
						}
						else if (new_shelf_radio_adventure.isSelected()){
							newtype="2";
						}
						else if (new_shelf_radio_animation.isSelected()){
							newtype="3";
						}
						else if (new_shelf_radio_comedy.isSelected()){
							newtype="4";
						}
						else if (new_shelf_radio_crime.isSelected()){
							newtype="5";
						}
						else if (new_shelf_radio_drama.isSelected()){
							newtype="6";
						}
						else if (new_shelf_radio_fantasy.isSelected()){
							newtype="7";
						}
						else if (new_shelf_radio_horror.isSelected()){
							newtype="8";
						}
						else if (new_shelf_radio_romantic.isSelected()){
							newtype="9";
						}
						else if (new_shelf_radio_scifi.isSelected()){
							newtype="10";
						}
						else if (new_shelf_radio_series.isSelected()){
							newtype="11";
						}
						else if(newtype==null){
							JOptionPane.showMessageDialog(null, "Please insert all fields.");
						}
					if(newtype!=null)
					{
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
						pstmt = con.prepareStatement ("INSERT INTO SHELF(SHELF_ID,GENRE_ID) VALUES(SEQ_SHELF_ID.NEXTVAL,"+newtype+");");
						JOptionPane.showMessageDialog(null,"Insert successfully!");
						New_shelfId.setText("Program will generate Id to you");

						rset = pstmt.executeQuery(); 	
									  
						rset.close();
						pstmt.close();
						con.close();
						}catch (Exception e){ 
								System.out.println(e.getMessage());
								// finally block
						}
				}
				}
			});
		}
		return newshelf_send;
	}

	/**
	 * This method initializes New_shelfId	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_shelfId() {
		if (New_shelfId == null) {
			New_shelfId = new JTextField();
			New_shelfId.setBounds(new Rectangle(150, 58, 293, 25));
			New_shelfId.setEnabled(false);
			New_shelfId.setText("Program will generate Id to you");
			New_shelfId.setEditable(false);
			New_shelfId.setBackground(Color.white);
		}
		return New_shelfId;
	}

	/**
	 * This method initializes new_shelf_radio_action	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getNew_shelf_radio_action() {
		if (new_shelf_radio_action == null) {
			new_shelf_radio_action = new JRadioButton();
			new_shelf_radio_action.setBounds(new Rectangle(148, 99, 21, 21));
			new_shelf_radio_action.setBackground(Color.white);
			group2.add(new_shelf_radio_action);
		}
		return new_shelf_radio_action;
	}

	/**
	 * This method initializes new_shelf_radio_animation	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getNew_shelf_radio_animation() {
		if (new_shelf_radio_animation == null) {
			new_shelf_radio_animation = new JRadioButton();
			new_shelf_radio_animation.setBounds(new Rectangle(148, 121, 21, 21));
			new_shelf_radio_animation.setBackground(Color.white);
			group2.add(new_shelf_radio_animation);
		}
		return new_shelf_radio_animation;
	}

	/**
	 * This method initializes new_shelf_radio_adventure	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getNew_shelf_radio_adventure() {
		if (new_shelf_radio_adventure == null) {
			new_shelf_radio_adventure = new JRadioButton();
			new_shelf_radio_adventure.setBounds(new Rectangle(148, 142, 21, 21));
			new_shelf_radio_adventure.setBackground(Color.white);
			group2.add(new_shelf_radio_adventure);
		}
		return new_shelf_radio_adventure;
	}

	/**
	 * This method initializes new_shelf_radio_comedy	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getNew_shelf_radio_comedy() {
		if (new_shelf_radio_comedy == null) {
			new_shelf_radio_comedy = new JRadioButton();
			new_shelf_radio_comedy.setBounds(new Rectangle(242, 99, 21, 21));
			new_shelf_radio_comedy.setBackground(Color.white);
			group2.add(new_shelf_radio_comedy);
		}
		return new_shelf_radio_comedy;
	}

	/**
	 * This method initializes new_shelf_radio_crime	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getNew_shelf_radio_crime() {
		if (new_shelf_radio_crime == null) {
			new_shelf_radio_crime = new JRadioButton();
			new_shelf_radio_crime.setBounds(new Rectangle(242, 121, 21, 21));
			new_shelf_radio_crime.setBackground(Color.white);
			group2.add(new_shelf_radio_crime);
		}
		return new_shelf_radio_crime;
	}

	/**
	 * This method initializes new_shelf_radio_drama	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getNew_shelf_radio_drama() {
		if (new_shelf_radio_drama == null) {
			new_shelf_radio_drama = new JRadioButton();
			new_shelf_radio_drama.setBounds(new Rectangle(242, 142, 21, 21));
			new_shelf_radio_drama.setBackground(Color.white);
			group2.add(new_shelf_radio_drama);
		}
		return new_shelf_radio_drama;
	}

	/**
	 * This method initializes new_shelf_radio_fantasy	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getNew_shelf_radio_fantasy() {
		if (new_shelf_radio_fantasy == null) {
			new_shelf_radio_fantasy = new JRadioButton();
			new_shelf_radio_fantasy.setBounds(new Rectangle(319, 98, 21, 21));
			new_shelf_radio_fantasy.setBackground(Color.white);
			group2.add(new_shelf_radio_fantasy);
		}
		return new_shelf_radio_fantasy;
	}

	/**
	 * This method initializes new_shelf_radio_horror	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getNew_shelf_radio_horror() {
		if (new_shelf_radio_horror == null) {
			new_shelf_radio_horror = new JRadioButton();
			new_shelf_radio_horror.setBounds(new Rectangle(319, 121, 21, 21));
			new_shelf_radio_horror.setBackground(Color.white);
			group2.add(new_shelf_radio_horror);
		}
		return new_shelf_radio_horror;
	}

	/**
	 * This method initializes new_shelf_radio_romantic	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getNew_shelf_radio_romantic() {
		if (new_shelf_radio_romantic == null) {
			new_shelf_radio_romantic = new JRadioButton();
			new_shelf_radio_romantic.setBounds(new Rectangle(319, 141, 21, 21));
			new_shelf_radio_romantic.setBackground(Color.white);
			group2.add(new_shelf_radio_romantic);
		}
		return new_shelf_radio_romantic;
	}

	/**
	 * This method initializes new_shelf_radio_scifi	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getNew_shelf_radio_scifi() {
		if (new_shelf_radio_scifi == null) {
			new_shelf_radio_scifi = new JRadioButton();
			new_shelf_radio_scifi.setBounds(new Rectangle(391, 98, 21, 21));
			new_shelf_radio_scifi.setBackground(Color.white);
			group2.add(new_shelf_radio_scifi);
		}
		return new_shelf_radio_scifi;
	}

	/**
	 * This method initializes new_shelf_radio_series	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getNew_shelf_radio_series() {
		if (new_shelf_radio_series == null) {
			new_shelf_radio_series = new JRadioButton();
			new_shelf_radio_series.setBounds(new Rectangle(391, 120, 21, 21));
			new_shelf_radio_series.setBackground(Color.white);
			group2.add(new_shelf_radio_series);
		}
		return new_shelf_radio_series;
	}

	/**
	 * This method initializes shelf_Edit	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getShelf_Edit() {
		if (shelf_Edit == null) {
			Series_Label = new JLabel();
			Series_Label.setBounds(new Rectangle(404, 131, 44, 16));
			Series_Label.setText("Series");
			scifi_Label = new JLabel();
			scifi_Label.setBounds(new Rectangle(404, 109, 44, 16));
			scifi_Label.setText("Sci-fi");
			romantic_Label = new JLabel();
			romantic_Label.setBounds(new Rectangle(320, 155, 55, 16));
			romantic_Label.setText("Romantic");
			horror_Label = new JLabel();
			horror_Label.setBounds(new Rectangle(320, 131, 46, 16));
			horror_Label.setText("Horror");
			fantasy_Label = new JLabel();
			fantasy_Label.setBounds(new Rectangle(320, 109, 46, 16));
			fantasy_Label.setText("Fantasy");
			drama_Label = new JLabel();
			drama_Label.setBounds(new Rectangle(245, 155, 46, 16));
			drama_Label.setText("Drama");
			crime_Label = new JLabel();
			crime_Label.setBounds(new Rectangle(245, 132, 46, 16));
			crime_Label.setText("Crime");
			comedy_Label1 = new JLabel();
			comedy_Label1.setBounds(new Rectangle(245, 108, 54, 16));
			comedy_Label1.setText("Comedy");
			adventure_Label = new JLabel();
			adventure_Label.setBounds(new Rectangle(160, 155, 64, 16));
			adventure_Label.setText("Adventure");
			animation_Label = new JLabel();
			animation_Label.setBounds(new Rectangle(160, 133, 61, 16));
			animation_Label.setText("Animation");
			action_Label = new JLabel();
			action_Label.setBounds(new Rectangle(160, 109, 38, 16));
			action_Label.setText("Action");
			shelfs_id_label = new JLabel();
			shelfs_id_label.setBounds(new Rectangle(155, 17, 238, 28));
			shelfs_id_label.setForeground(Color.red);
			shelfs_id_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			shelf_label = new JLabel();
			shelf_label.setBounds(new Rectangle(34, 17, 112, 28));
			shelf_label.setText("Shelf");
			shelf_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			shelf_id_label_edit = new JLabel();
			shelf_id_label_edit.setBounds(new Rectangle(33, 65, 97, 21));
			shelf_id_label_edit.setText("ID");
			shelf_id_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			shelf_name_label_edit = new JLabel();
			shelf_name_label_edit.setBounds(new Rectangle(31, 105, 111, 26));
			shelf_name_label_edit.setText("Type");
			shelf_name_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			shelf_Edit = new JPanel();
			shelf_Edit.setLayout(null);
			shelf_Edit.setBackground(new Color(205, 235, 255));
			shelf_Edit.setBounds(new Rectangle(509, 240, 477, 342));
			shelf_Edit.add(shelf_name_label_edit, null);
			shelf_Edit.add(getShelf_send_edit(), null);
			shelf_Edit.add(getNew_shelfId_edit(), null);
			shelf_Edit.add(shelf_id_label_edit, null);
			shelf_Edit.add(getAdd_shelf_Back_Button_Edit(), null);
			shelf_Edit.add(getShelf_delete_edit(), null);
			shelf_Edit.add(shelf_label, null);
			shelf_Edit.add(shelfs_id_label, null);
			shelf_Edit.add(getShelf_radio_action(), null);
			shelf_Edit.add(action_Label, null);
			shelf_Edit.add(animation_Label, null);
			shelf_Edit.add(getShelf_radio_animation(), null);
			shelf_Edit.add(getShelf_radio_adventure(), null);
			shelf_Edit.add(adventure_Label, null);
			shelf_Edit.add(getShelf_radio_comedy(), null);
			shelf_Edit.add(getShelf_radio_crime(), null);
			shelf_Edit.add(getShelf_radio_drama(), null);
			shelf_Edit.add(comedy_Label1, null);
			shelf_Edit.add(crime_Label, null);
			shelf_Edit.add(drama_Label, null);
			shelf_Edit.add(getShelf_radio_fantasy(), null);
			shelf_Edit.add(getShelf_radio_horror(), null);
			shelf_Edit.add(getShelf_radio_romantic(), null);
			shelf_Edit.add(fantasy_Label, null);
			shelf_Edit.add(horror_Label, null);
			shelf_Edit.add(romantic_Label, null);
			shelf_Edit.add(getShelf_radio_scifi(), null);
			shelf_Edit.add(getShelf_radio_series(), null);
			shelf_Edit.add(scifi_Label, null);
			shelf_Edit.add(Series_Label, null);
			shelf_Edit.setVisible(false);
		}
		return shelf_Edit;
	}

	/**
	 * This method initializes shelf_send_edit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getShelf_send_edit() {
		if (shelf_send_edit == null) {
			shelf_send_edit = new JButton();
			shelf_send_edit.setBounds(new Rectangle(77, 198, 100, 40));
			shelf_send_edit.setText("Edit");
			shelf_send_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			shelf_send_edit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					String new_id=New_shelfId_edit.getText();
					//System.out.println("new_id"+new_id);
					String newtype=null;
					
					if (new_id.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					//System.out.println("newtype = "+newtype);
						if (shelf_radio_action.isSelected()){
							newtype="1";
							//System.out.println("newtype="+newtype);
						}
						else if (shelf_radio_adventure.isSelected()){
							newtype="2";
						}
						else if (shelf_radio_animation.isSelected()){
							newtype="3";
						}
						else if (shelf_radio_comedy.isSelected()){
							newtype="4";
						}
						else if (shelf_radio_crime.isSelected()){
							newtype="5";
						}
						else if (shelf_radio_drama.isSelected()){
							newtype="6";
						}
						else if (shelf_radio_fantasy.isSelected()){
							newtype="7";
						}
						else if (shelf_radio_horror.isSelected()){
							newtype="8";
						}
						else if (shelf_radio_romantic.isSelected()){
							newtype="9";
						}
						else if (shelf_radio_scifi.isSelected()){
							newtype="10";
						}
						else if (shelf_radio_series.isSelected()){
							newtype="11";
						}
						else if(newtype==null){
							JOptionPane.showMessageDialog(null, "Please insert all fields.");
						}
					if(newtype!=null)
					{
						Connection con = null;
						//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
						PreparedStatement pstmt = null;
						// ประกาศ rset เป็น instance ของคลาส ResultSet
						ResultSet rset = null;

						JOptionPane.showMessageDialog(null, "Update Complete!!");	
						shelf_New.setVisible(true);
						shelf_Edit.setVisible(false);
						//ดักจับข้อผิดพลาด
						try {
				       //Registering the JDBC Drivers : MySQL
							Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
						  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
						  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
						  pstmt = con.prepareStatement ("UPDATE SHELF SET SHELF_ID="+Integer.parseInt(new_id)+",GENRE_ID="+Integer.parseInt(newtype)+" WHERE SHELF_ID="+new_id);
							 //Executing a Query 
							  rset = pstmt.executeQuery(); 
							  //Processing the Result Set 
							    						  
						rset.close();
						pstmt.close();
						con.close();
						}

						
						catch (Exception e){ 
							System.out.println(e.getMessage());
							// finally block
						}
					}
				}
			});
		}
		return shelf_send_edit;
	}

	/**
	 * This method initializes New_shelfId_edit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_shelfId_edit() {
		if (New_shelfId_edit == null) {
			New_shelfId_edit = new JTextField();
			New_shelfId_edit.setBounds(new Rectangle(151, 60, 293, 25));
			New_shelfId_edit.setText("");
			New_shelfId_edit.setEditable(false);
			New_shelfId_edit.setVisible(true);
		}
		return New_shelfId_edit;
	}

	/**
	 * This method initializes Add_shelf_Back_Button_Edit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAdd_shelf_Back_Button_Edit() {
		if (Add_shelf_Back_Button_Edit == null) {
			Add_shelf_Back_Button_Edit = new JButton();
			Add_shelf_Back_Button_Edit.setBounds(new Rectangle(77, 252, 339, 40));
			Add_shelf_Back_Button_Edit.setText("Back");
			Add_shelf_Back_Button_Edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			Add_shelf_Back_Button_Edit
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							shelf_Edit.setVisible(false);
							shelf_New.setVisible(true);
						}
					});
		}
		return Add_shelf_Back_Button_Edit;
	}

	/**
	 * This method initializes shelf_delete_edit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getShelf_delete_edit() {
		if (shelf_delete_edit == null) {
			shelf_delete_edit = new JButton();
			shelf_delete_edit.setBounds(new Rectangle(315, 198, 100, 40));
			shelf_delete_edit.setText("Delete");
			shelf_delete_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			shelf_delete_edit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					String new_id=shelfs_id_label.getText();
					int ch=0;
					

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
						  ch = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete?",JOptionPane.YES_NO_OPTION);
						  if (ch!=1){
							  pstmt = con.prepareStatement ("DELETE FROM SHELF WHERE SHELF_ID=\'+"+new_id+"\'");
							  JOptionPane.showMessageDialog(null, "Delete Complete!!");
						  }
						  
							shelf_Edit.setVisible(false);
							shelf_New.setVisible(true);
							 //Executing a Query 
							  rset = pstmt.executeQuery(); 
							  //Processing the Result Set 
							    						  
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
		return shelf_delete_edit;
	}

	/**
	 * This method initializes shelf_radio_action	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getShelf_radio_action() {
		if (shelf_radio_action == null) {
			shelf_radio_action = new JRadioButton();
			shelf_radio_action.setBounds(new Rectangle(140, 107, 18, 18));
			shelf_radio_action.setBackground(new Color(205, 235, 255));
			group.add(shelf_radio_action);
		}
		return shelf_radio_action;
	}

	/**
	 * This method initializes shelf_radio_animation	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getShelf_radio_animation() {
		if (shelf_radio_animation == null) {
			shelf_radio_animation = new JRadioButton();
			shelf_radio_animation.setBounds(new Rectangle(140, 130, 21, 21));
			shelf_radio_animation.setBackground(new Color(205, 235, 255));
			group.add(shelf_radio_animation);
		}
		return shelf_radio_animation;
	}

	/**
	 * This method initializes shelf_radio_adventure	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getShelf_radio_adventure() {
		if (shelf_radio_adventure == null) {
			shelf_radio_adventure = new JRadioButton();
			shelf_radio_adventure.setBounds(new Rectangle(140, 153, 21, 21));
			shelf_radio_adventure.setBackground(new Color(205, 235, 255));
			group.add(shelf_radio_adventure);
		}
		return shelf_radio_adventure;
	}

	/**
	 * This method initializes shelf_radio_comedy	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getShelf_radio_comedy() {
		if (shelf_radio_comedy == null) {
			shelf_radio_comedy = new JRadioButton();
			shelf_radio_comedy.setBounds(new Rectangle(221, 105, 21, 21));
			shelf_radio_comedy.setBackground(new Color(205, 235, 255));
			group.add(shelf_radio_comedy);
		}
		return shelf_radio_comedy;
	}

	/**
	 * This method initializes shelf_radio_crime	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getShelf_radio_crime() {
		if (shelf_radio_crime == null) {
			shelf_radio_crime = new JRadioButton();
			shelf_radio_crime.setBounds(new Rectangle(221, 130, 21, 21));
			shelf_radio_crime.setBackground(new Color(205, 235, 255));
			group.add(shelf_radio_crime);
		}
		return shelf_radio_crime;
	}

	/**
	 * This method initializes shelf_radio_drama	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getShelf_radio_drama() {
		if (shelf_radio_drama == null) {
			shelf_radio_drama = new JRadioButton();
			shelf_radio_drama.setBounds(new Rectangle(221, 153, 21, 21));
			shelf_radio_drama.setBackground(new Color(205, 235, 255));
			group.add(shelf_radio_drama);
		}
		return shelf_radio_drama;
	}

	/**
	 * This method initializes shelf_radio_fantasy	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getShelf_radio_fantasy() {
		if (shelf_radio_fantasy == null) {
			shelf_radio_fantasy = new JRadioButton();
			shelf_radio_fantasy.setBounds(new Rectangle(299, 105, 21, 21));
			shelf_radio_fantasy.setBackground(new Color(205, 235, 255));
			group.add(shelf_radio_fantasy);
		}
		return shelf_radio_fantasy;
	}

	/**
	 * This method initializes shelf_radio_horror	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getShelf_radio_horror() {
		if (shelf_radio_horror == null) {
			shelf_radio_horror = new JRadioButton();
			shelf_radio_horror.setBounds(new Rectangle(299, 130, 21, 21));
			shelf_radio_horror.setBackground(new Color(205, 235, 255));
			group.add(shelf_radio_horror);
		}
		return shelf_radio_horror;
	}

	/**
	 * This method initializes shelf_radio_romantic	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getShelf_radio_romantic() {
		if (shelf_radio_romantic == null) {
			shelf_radio_romantic = new JRadioButton();
			shelf_radio_romantic.setBounds(new Rectangle(299, 153, 21, 21));
			shelf_radio_romantic.setBackground(new Color(205, 235, 255));
			group.add(shelf_radio_romantic);
		}
		return shelf_radio_romantic;
	}

	/**
	 * This method initializes shelf_radio_scifi	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getShelf_radio_scifi() {
		if (shelf_radio_scifi == null) {
			shelf_radio_scifi = new JRadioButton();
			shelf_radio_scifi.setBounds(new Rectangle(379, 105, 21, 21));
			shelf_radio_scifi.setBackground(new Color(205, 235, 255));
			group.add(shelf_radio_scifi);
		}
		return shelf_radio_scifi;
	}

	/**
	 * This method initializes shelf_radio_series	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getShelf_radio_series() {
		if (shelf_radio_series == null) {
			shelf_radio_series = new JRadioButton();
			shelf_radio_series.setBounds(new Rectangle(379, 130, 21, 21));
			shelf_radio_series.setBackground(new Color(205, 235, 255));
			group.add(shelf_radio_series);
		}
		return shelf_radio_series;
	}

	/**
	 * This method initializes member_backtomain1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getMember_backtomain1() {
		if (member_backtomain1 == null) {
			member_backtomain1 = new JButton();
			member_backtomain1.setBounds(new Rectangle(740, 668, 214, 38));
			member_backtomain1.setText("Back To Main Menu");
			member_backtomain1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			member_backtomain1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Main_Page.setVisible(true);
					Add_Order_Page.setVisible(false);
					Shelf_Page.setVisible(false);
					Member_Page.setVisible(false);
					Sale_Page.setVisible(false);
				}
			});
		}
		return member_backtomain1;
	}

	/**
	 * This method initializes Add_Order_Page	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getAdd_Order_Page() {
		if (Add_Order_Page == null) {
			Sales_bg111 = new JLabel();
			Sales_bg111.setText("");
			Sales_bg111.setBounds(new Rectangle(0, 0, 1024, 768));
			Sales_bg111.setIcon(new ImageIcon("bg/bg1.jpg"));
			lastname_add_order = new JLabel();
			lastname_add_order.setForeground(new Color(235, 245, 255));
			lastname_add_order.setBounds(new Rectangle(599, 139, 94, 16));
			lastname_add_order.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			lastname_add_order.setText("Last Name");
			lastname_add_order.setVisible(false);
			name_add_order = new JLabel();
			name_add_order.setBounds(new Rectangle(393, 139, 54, 16));
			name_add_order.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			name_add_order.setText("Name");
			name_add_order.setForeground(new Color(235, 245, 255));
			name_add_order.setVisible(false);
			member_id_input_label = new JLabel();
			member_id_input_label.setForeground(new Color(235, 245, 255));
			member_id_input_label.setBounds(new Rectangle(31, 133, 185, 28));
			member_id_input_label.setText("Enter member id to add order");
			addorder_topic_label = new JLabel();
			addorder_topic_label.setForeground(new Color(205, 235, 255));
			addorder_topic_label.setBounds(new Rectangle(30, 43, 382, 62));
			addorder_topic_label.setText("Add Order");
			addorder_topic_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 72));
			Add_Order_Page = new JPanel();
			Add_Order_Page.setLayout(null);
			Add_Order_Page.setBackground(Color.white);
			Add_Order_Page.setVisible(false);
			Add_Order_Page.setSize(new Dimension(1024, 768));
			Add_Order_Page.setLocation(new Point(0, 0));
			Add_Order_Page.add(addorder_topic_label, null);
			Add_Order_Page.add(getMember_id_input(), null);
			Add_Order_Page.add(getMember_id_input_button(), null);
			Add_Order_Page.add(member_id_input_label, null);
			Add_Order_Page.add(getMemId_add_order(), null);
			Add_Order_Page.add(name_add_order, null);
			Add_Order_Page.add(getMemname_add_order(), null);
			Add_Order_Page.add(lastname_add_order, null);
			Add_Order_Page.add(getAdd_order(), null);
			Add_Order_Page.add(getAddorder_send(), null);
			Add_Order_Page.add(Sales_bg111, null);
		}
		return Add_Order_Page;
	}

	/**
	 * This method initializes member_id_input	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getMember_id_input() {
		if (member_id_input == null) {
			member_id_input = new JTextField();
			member_id_input.setBounds(new Rectangle(216, 133, 96, 28));
			member_id_input.setBackground(new Color(255, 255, 204));
		}
		return member_id_input;
	}

	/**
	 * This method initializes member_id_input_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getMember_id_input_button() {
		if (member_id_input_button == null) {
			member_id_input_button = new JButton();
			member_id_input_button.setBounds(new Rectangle(314, 133, 71, 28));
			member_id_input_button.setText("OK");
			member_id_input_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null;
					
					String edit_member=null;
					edit_member= member_id_input.getText();
					//System.out.println("Edit Member :"+edit_member);
					//ดักจับข้อผิดพลาด
					try {
			       //Registering the JDBC Drivers : MySQL
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
					  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
					  //Show all records in STUDENT table
					  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
					
					  pstmt = con.prepareStatement ("SELECT * FROM MEMBERS WHERE MEM_ID=\'"+edit_member+"\'");
					 //Executing a Query 
					  rset = pstmt.executeQuery(); 
					  //Processing the Result Set 
					  String mem_id = null;
					  String mem_name = null;
					  String mem_lastname = null;
					  String mem_address = null;
					  String mem_email = null;
					  String mem_tel = null;
					  String sale_name = null;
					  String sale_lastname = null;

					  while (rset.next()) {
							//รับค่า String id จาก attribute ID
							mem_id = rset.getString("MEM_ID");
							mem_name = rset.getString("MEM_NAME");
							mem_lastname = rset.getString("MEM_LASTNAME");
							mem_address = rset.getString("MEM_ADDRESS");
							mem_email = rset.getString("MEM_EMAIL");
							mem_tel = rset.getString("MEM_TEL");
							MemId_add_order.setText(mem_name);
							Memname_add_order.setText(mem_lastname);
							
					 }	
					  if (mem_id!=null){
						  //System.out.println("sale_id "+sale_id);
						  pstmt = con.prepareStatement ("SELECT * FROM SALE WHERE SALE_ID=\'"+sale_id+"\';");
							 rset = pstmt.executeQuery(); 
							 while (rset.next()) {
									//รับค่า String id จาก attribute ID
									sale_id = rset.getString("SALE_ID");
									sale_name = rset.getString("SALE_NAME");
									sale_lastname = rset.getString("SALE_LASTNAME");
									sale_id_order.setText(sale_id);
									//System.out.println("sale_id"+sale_id);
									order_name_order.setText(sale_name);
									//System.out.println("sale_name"+sale_name);
									order_sale_lastname_order.setText(sale_lastname);
									//System.out.println("sale_lastname"+sale_lastname);
							 	}	
							 	pstmt = con.prepareStatement ("SELECT MAX(ORDER_NO) FROM ORDER_HEAD");
								 //Executing a Query 
								rset = pstmt.executeQuery();
								while (rset.next()) {
									//รับค่า String id จาก attribute ID
									order_no = rset.getString("MAX(ORDER_NO)");
									//System.out.println("order "+order_no);
									int temp = Integer.parseInt(order_no)+1;
									Order_no_label.setText(String.valueOf(temp));
							 	}
								
								
								
								if (order_no.equals(null)){
									order_no="1";
								}
								
								add_order.setVisible(true);
								name_add_order.setVisible(true);
								MemId_add_order.setVisible(true);
								lastname_add_order.setVisible(true);
								Memname_add_order.setVisible(true);
								member_id_input_button.setEnabled(false);
								member_id_input.setEditable(false);
								add_result.setText("");
								
								Add_Movie_Label.setVisible(true);
								movie_id_input_label.setVisible(true);
								movie_add_order.setVisible(true);
								movie_id_input.setVisible(true);
								unit_add_order.setVisible(true);
								unit_input.setVisible(true);
								add_input_button.setVisible(true);
								
								addorder_send.setVisible(false);
								
								pstmt = con.prepareStatement ("INSERT INTO ORDER_HEAD(ORDER_NO) VALUES("+(Integer.parseInt(order_no)+1)+")");
								 //Executing a Query 
								rset = pstmt.executeQuery();
						 
						  
					  }
					  else
					  {
						  add_order.setVisible(false);
						  JOptionPane.showMessageDialog(null, "Your member id is not match!!");
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
		return member_id_input_button;
	}

	/**
	 * This method initializes MemId_add_order	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getMemId_add_order() {
		if (MemId_add_order == null) {
			MemId_add_order = new JTextField();
			MemId_add_order.setBounds(new Rectangle(450, 134, 147, 28));
			MemId_add_order.setEnabled(true);
			MemId_add_order.setBackground(Color.white);
			MemId_add_order.setEditable(false);
			MemId_add_order.setForeground(new Color(255, 153, 0));
			MemId_add_order.setVisible(false);
		}
		return MemId_add_order;
	}

	/**
	 * This method initializes Memname_add_order	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getMemname_add_order() {
		if (Memname_add_order == null) {
			Memname_add_order = new JTextField();
			Memname_add_order.setBounds(new Rectangle(694, 134, 147, 28));
			Memname_add_order.setEnabled(true);
			Memname_add_order.setBackground(Color.white);
			Memname_add_order.setEditable(false);
			Memname_add_order.setForeground(new Color(255, 153, 0));
			Memname_add_order.setVisible(false);
		}
		return Memname_add_order;
	}

	/**
	 * This method initializes add_order	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getAdd_order() {
		if (add_order == null) {
			movie_id_input_label1 = new JLabel();
			movie_id_input_label1.setBounds(new Rectangle(17, 286, 616, 16));
			movie_id_input_label1.setText(" |-- Movie ID -- | ----- TH Name ----- | ----- EN Name -----  | -- Unit -- | -- Price -- | -- Total -- |");
			Order_no_label = new JLabel();
			Order_no_label.setBounds(new Rectangle(142, 54, 188, 28));
			Order_no_label.setForeground(Color.red);
			Order_no_label.setText("");
			Order_no_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			sale_lastname_order_label = new JLabel();
			sale_lastname_order_label.setBounds(new Rectangle(454, 100, 127, 18));
			sale_lastname_order_label.setText("Sale Last Name");
			sale_lastname_order_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			sale_name_order_label = new JLabel();
			sale_name_order_label.setBounds(new Rectangle(140, 100, 83, 18));
			sale_name_order_label.setText("Sale Name");
			sale_name_order_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			sale_order_label = new JLabel();
			sale_order_label.setBounds(new Rectangle(15, 100, 62, 18));
			sale_order_label.setText("Sale Id");
			sale_order_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			date_order_label = new JLabel();
			date_order_label.setBounds(new Rectangle(352, 61, 107, 18));
			date_order_label.setText("Order Date");
			date_order_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			id_order_label = new JLabel();
			id_order_label.setBounds(new Rectangle(15, 61, 115, 18));
			id_order_label.setText("Order Number");
			id_order_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			Order_detail_Label = new JLabel();
			Order_detail_Label.setBounds(new Rectangle(16, 17, 157, 28));
			Order_detail_Label.setText("Order Detail");
			Order_detail_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			unit_add_order = new JLabel();
			unit_add_order.setBounds(new Rectangle(183, 251, 38, 18));
			unit_add_order.setText("Unit");
			unit_add_order.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			movie_add_order = new JLabel();
			movie_add_order.setBounds(new Rectangle(15, 249, 71, 20));
			movie_add_order.setText("Movie Id");
			movie_add_order.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			movie_id_input_label = new JLabel();
			movie_id_input_label.setBounds(new Rectangle(14, 227, 432, 16));
			movie_id_input_label.setText("Enter movie id and unit of its. Then click \"Add\" to add movie into your order.");
			Add_Movie_Label = new JLabel();
			Add_Movie_Label.setBounds(new Rectangle(15, 193, 132, 28));
			Add_Movie_Label.setText("Add Movie");
			Add_Movie_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			add_order = new JPanel();
			add_order.setLayout(null);
			add_order.setBounds(new Rectangle(14, 168, 974, 556));
			add_order.setBackground(new Color(205, 235, 255));
			add_order.add(Add_Movie_Label, null);
			add_order.add(movie_id_input_label, null);
			add_order.add(movie_add_order, null);
			add_order.add(getMovie_id_input(), null);
			add_order.add(unit_add_order, null);
			add_order.add(getUnit_input(), null);
			add_order.add(getAdd_input_button(), null);
			add_order.add(getResult_scroll(), null);
			add_order.add(Order_detail_Label, null);
			add_order.add(id_order_label, null);
			add_order.add(getOrder_date_order(), null);
			add_order.add(date_order_label, null);
			add_order.add(sale_order_label, null);
			add_order.add(getSale_id_order(), null);
			add_order.add(sale_name_order_label, null);
			add_order.add(getOrder_name_order(), null);
			add_order.add(sale_lastname_order_label, null);
			add_order.add(getOrder_sale_lastname_order(), null);
			add_order.add(getCal_button(), null);
			add_order.add(Order_no_label, null);
			add_order.add(getAdd_to_database(), null);
			add_order.setVisible(false);
			add_order.add(movie_id_input_label1, null);
		}
		return add_order;
	}

	/**
	 * This method initializes movie_id_input	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getMovie_id_input() {
		if (movie_id_input == null) {
			movie_id_input = new JTextField();
			movie_id_input.setBounds(new Rectangle(87, 245, 96, 28));
			movie_id_input.setBackground(Color.white);
		}
		return movie_id_input;
	}

	/**
	 * This method initializes unit_input	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getUnit_input() {
		if (unit_input == null) {
			unit_input = new JTextField();
			unit_input.setBounds(new Rectangle(221, 246, 96, 28));
			unit_input.setBackground(Color.white);
		}
		return unit_input;
	}

	/**
	 * This method initializes add_input_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAdd_input_button() {
		if (add_input_button == null) {
			add_input_button = new JButton();
			add_input_button.setBounds(new Rectangle(318, 245, 71, 28));
			add_input_button.setText("Add");
			add_input_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					String movie_id=movie_id_input.getText();
					String unit=unit_input.getText();
					String movie_en_name=null;
					String movie_th_name=null;
					String movie_price = null;
					String temp=null;
					

					
					//String new_email=New_MemEmail.getText();
					//String new_tel=New_MemTel.getText();
					if (movie_id.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (unit.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}else
					{
						//System.out.println(movie_id);
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
						  
						pstmt = con.prepareStatement ("SELECT * FROM MOVIES WHERE MOVIE_ID=\'"+movie_id+"\';" );
						rset = pstmt.executeQuery();
						
						while (rset.next()) {
							//รับค่า String id จาก attribute ID
							temp = rset.getString("MOVIE_ID");
							//System.out.println("MOVIE_ID "+temp);
							movie_th_name= rset.getString("TITLE_TH");
							//System.out.println("TITLE_TH "+movie_th_name);
							movie_en_name = rset.getString("TITLE_EN");
							//System.out.println("TITLE_EN "+movie_en_name);
							movie_price = rset.getString("PRICE");
							//System.out.println("PRICE "+movie_price);
														
						}	
						
						if(temp==null){
							JOptionPane.showMessageDialog(null, "Your movie id is not match!!");
						}
						else{
						int cal_price = Integer.parseInt(movie_price)*Integer.parseInt(unit); 
						String mem_id=member_id_input.getText();
						pstmt = con.prepareStatement ("INSERT INTO ORDER_DATA(ORDER_NO,MEM_ID,MOVIE_ID,UNIT,PRICE,TOTALPERMOVIE) VALUES("+(Integer.parseInt(order_no)+1)+",\'"+mem_id+"\',\'"+movie_id+"\',\'"+unit+"\',\'"+movie_price+"\',"+cal_price+")" );
						JOptionPane.showMessageDialog(null,"Insert successfully!");
						movie_detail=" "+movie_id+"\t"+movie_th_name+"\t"+movie_en_name+"\t"+unit+"\t"+df.format(Integer.parseInt(movie_price))+"\t"+df.format(cal_price)+"\n";
						movie_id_input.setText("");
						unit_input.setText("");
						add_result.append(movie_detail);
						
						rset = pstmt.executeQuery(); 	
									  
						rset.close();
						pstmt.close();
						con.close();
						}
						}catch (Exception e){ 
								System.out.println(e.getMessage());
								// finally block
						}
					}
				}
			});
		}
		return add_input_button;
	}

	/**
	 * This method initializes result_scroll	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getResult_scroll() {
		if (result_scroll == null) {
			result_scroll = new JScrollPane();
			result_scroll.setBounds(new Rectangle(15, 303, 620, 206));
			result_scroll.setViewportView(getAdd_result());
		}
		return result_scroll;
	}

	/**
	 * This method initializes add_result	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getAdd_result() {
		if (add_result == null) {
			add_result = new JTextArea();
		}
		return add_result;
	}

	/**
	 * This method initializes order_date_order	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getOrder_date_order() {
		if (order_date_order == null) {
			order_date_order = new JTextField();
			order_date_order.setBounds(new Rectangle(466, 54, 215, 28));
			order_date_order.setEnabled(false);
			order_date_order.setForeground(Color.black);
			order_date_order.setText("Program will generate to you");
			order_date_order.setEditable(false);
			order_date_order.setBackground(Color.white);
		}
		return order_date_order;
	}

	/**
	 * This method initializes sale_id_order	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getSale_id_order() {
		if (sale_id_order == null) {
			sale_id_order = new JTextField();
			sale_id_order.setBounds(new Rectangle(79, 96, 59, 28));
			sale_id_order.setEnabled(true);
			sale_id_order.setEditable(false);
			sale_id_order.setBackground(Color.white);
		}
		return sale_id_order;
	}

	/**
	 * This method initializes order_name_order	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getOrder_name_order() {
		if (order_name_order == null) {
			order_name_order = new JTextField();
			order_name_order.setBounds(new Rectangle(228, 96, 215, 28));
			order_name_order.setEnabled(true);
			order_name_order.setEditable(false);
			order_name_order.setBackground(Color.white);
		}
		return order_name_order;
	}

	/**
	 * This method initializes order_sale_lastname_order	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getOrder_sale_lastname_order() {
		if (order_sale_lastname_order == null) {
			order_sale_lastname_order = new JTextField();
			order_sale_lastname_order.setBounds(new Rectangle(588, 96, 215, 28));
			order_sale_lastname_order.setEnabled(true);
			order_sale_lastname_order.setEditable(false);
			order_sale_lastname_order.setBackground(Color.white);
		}
		return order_sale_lastname_order;
	}

	/**
	 * This method initializes cal_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getCal_button() {
		if (cal_button == null) {
			cal_button = new JButton();
			cal_button.setBounds(new Rectangle(704, 216, 197, 57));
			cal_button.setText("Calculate");
			cal_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			cal_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {

					Add_Movie_Label.setVisible(false);
					movie_id_input_label.setVisible(false);
					movie_add_order.setVisible(false);
					movie_id_input.setVisible(false);
					unit_add_order.setVisible(false);
					unit_input.setVisible(false);
					add_input_button.setVisible(false);
					
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null;
					
					String edit_member=null;
					
					//System.out.println("Edit Member :"+edit_member);
					//ดักจับข้อผิดพลาด
					try {
			       //Registering the JDBC Drivers : MySQL
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
					  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
					  //Show all records in STUDENT table
					  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
					
					  pstmt = con.prepareStatement ("SELECT * FROM ORDER_DATA WHERE ORDER_NO=\'"+(Integer.parseInt(order_no)+1)+"\'");
					 //Executing a Query 
					  rset = pstmt.executeQuery(); 
					  //Processing the Result Set 
					  int total = 0;
					  String temp = null;
					  String mem_lastname = null;
					  String mem_address = null;
					  String mem_email = null;
					  String mem_tel = null;
					  String sale_id = null;
					  String sale_name = null;
					  String sale_lastname = null;

					  while (rset.next()) {
							//รับค่า String id จาก attribute ID
							temp= rset.getString("TOTALPERMOVIE");
							total = total + Integer.parseInt(temp);
							
					 }	
					add_to_database.setVisible(true);
					totalwitoutdecimal=total;
					total_price_label.setText(String.valueOf(df.format(total)));
					if (total<=0){
						add_button.setVisible(false);
					}
					else
					{
						add_button.setVisible(true);
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
		return cal_button;
	}

	/**
	 * This method initializes add_to_database	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getAdd_to_database() {
		if (add_to_database == null) {
			unit_baht_label = new JLabel();
			unit_baht_label.setBounds(new Rectangle(195, 33, 49, 18));
			unit_baht_label.setText("Baht");
			unit_baht_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			total_price_label = new JLabel();
			total_price_label.setBounds(new Rectangle(47, 13, 141, 56));
			total_price_label.setForeground(Color.red);
			total_price_label.setHorizontalAlignment(SwingConstants.CENTER);
			total_price_label.setHorizontalTextPosition(SwingConstants.CENTER);
			total_price_label.setText("");
			total_price_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			add_to_database = new JPanel();
			add_to_database.setLayout(null);
			add_to_database.setBounds(new Rectangle(658, 280, 289, 246));
			add_to_database.setBackground(new Color(235, 245, 255));
			add_to_database.add(total_price_label, null);
			add_to_database.add(unit_baht_label, null);
			add_to_database.add(getAdd_button(), null);
			add_to_database.add(getDelete_button(), null);
			add_to_database.setVisible(false);
		}
		return add_to_database;
	}

	/**
	 * This method initializes add_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAdd_button() {
		if (add_button == null) {
			add_button = new JButton();
			add_button.setBounds(new Rectangle(45, 88, 197, 57));
			add_button.setText("Add Order");
			add_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			add_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					String mem_id=member_id_input.getText();
					//System.out.println("mem_id "+mem_id);
					String totalamount=String.valueOf(totalwitoutdecimal);
					//System.out.println("totalamount "+totalamount);
					String unit=unit_input.getText();
					//System.out.println("unit "+unit);
					String sale_id=sale_id_order.getText();
					//System.out.println("sale_id "+sale_id);
					String movie_price = null;
					//System.out.println("order "+order_no);
										
					//String new_email=New_MemEmail.getText();
					//String new_tel=New_MemTel.getText();
					//System.out.println(movie_id);
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
						  
						//System.out.println("ผ่านตรงนี้นะ");
											
						pstmt = con.prepareStatement ("UPDATE ORDER_HEAD SET ORDER_DATE=TO_CHAR(SYSDATE,\'DD-MON-YYYY\'),MEM_ID=\'"+mem_id+"\',SALE_ID=\'"+sale_id+"\',TOTALAMOUNT=\'"+totalamount+"\' WHERE ORDER_NO=\'"+(Integer.parseInt(order_no)+1)+"\';" );
						JOptionPane.showMessageDialog(null,"Add order successfully!");
						add_to_database.setVisible(false);
						add_order.setVisible(false);
						member_id_input.setText("");
						member_id_input.setEditable(true);
						member_id_input_button.setEnabled(true);
						name_add_order.setVisible(false);
						MemId_add_order.setVisible(false);
						lastname_add_order.setVisible(false);
						Memname_add_order.setVisible(false);
						
						addorder_send.setVisible(true);
						
						rset = pstmt.executeQuery(); 	
									  
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
		return add_button;
	}

	/**
	 * This method initializes delete_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getDelete_button() {
		if (delete_button == null) {
			delete_button = new JButton();
			delete_button.setBounds(new Rectangle(45, 150, 197, 57));
			delete_button.setText("Delete Order");
			delete_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			delete_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					String new_id=member_id_input.getText();
					int ch=0;
					

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
						  ch = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete?",JOptionPane.YES_NO_OPTION);
						  if (ch!=1){
							  pstmt = con.prepareStatement ("DELETE FROM ORDER_DATA WHERE ORDER_NO="+(Integer.parseInt(order_no)+1)+";");
							  pstmt.executeUpdate();  
							  pstmt = con.prepareStatement ("DELETE FROM ORDER_HEAD WHERE ORDER_NO="+(Integer.parseInt(order_no)+1)+";");
							  JOptionPane.showMessageDialog(null, "Delete Complete!!");
							  pstmt.executeUpdate();
								add_to_database.setVisible(false);
								add_order.setVisible(false);
								member_id_input.setText("");
								member_id_input.setEditable(true);
								member_id_input_button.setEnabled(true);
								name_add_order.setVisible(false);
								MemId_add_order.setVisible(false);
								lastname_add_order.setVisible(false);
								Memname_add_order.setVisible(false);
							  
								addorder_send.setVisible(true);
						  }
						  
							 //Executing a Query 
							  rset = pstmt.executeQuery(); 
							  //Processing the Result Set 
							    						  
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
		return delete_button;
	}

	/**
	 * This method initializes order_manage_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getOrder_manage_button() {
		if (order_manage_button == null) {
			order_manage_button = new JButton();
			order_manage_button.setBounds(new Rectangle(45, 360, 223, 66));
			order_manage_button.setText("Order Manager");
			order_manage_button.setFont(new Font("Dialog", Font.BOLD, 18));
			order_manage_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Main_Page.setVisible(false);
					Add_Order_Page.setVisible(false);
					Shelf_Page.setVisible(false);
					Member_Page.setVisible(false);
					Sale_Page.setVisible(false);
					MoviePage1.setVisible(false);
					Order_Manage_Page.setVisible(true);
				}
			});
		}
		return order_manage_button;
	}

	/**
	 * This method initializes addorder_send	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAddorder_send() {
		if (addorder_send == null) {
			addorder_send = new JButton();
			addorder_send.setBounds(new Rectangle(764, 15, 214, 38));
			addorder_send.setText("Back To Main Menu");
			addorder_send.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			addorder_send.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Main_Page.setVisible(true);
					Add_Order_Page.setVisible(false);
					Shelf_Page.setVisible(false);
					Member_Page.setVisible(false);
					Sale_Page.setVisible(false);
				}
			});
		}
		return addorder_send;
	}

	/**
	 * This method initializes MoviePage1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getMoviePage1() {
		if (MoviePage1 == null) {
			Sales_bg2 = new JLabel();
			Sales_bg2.setBounds(new Rectangle(0, 0, 1024, 768));
			Sales_bg2.setText("");
			Sales_bg2.setIcon(new ImageIcon("bg/bg1.jpg"));
			Movie_Pic = new JLabel();
			Movie_Pic.setBounds(new Rectangle(894, 20, 115, 158));
			Movie_Pic.setText("");
			Movie_Pic.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			
			movie_Search_engname_Label = new JLabel();
			movie_Search_engname_Label.setForeground(new Color(205, 235, 255));
			movie_Search_engname_Label.setBounds(new Rectangle(32, 311, 107, 28));
			movie_Search_engname_Label.setText("By Eng Name");
			movie_Search_engname_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			movie_Search_thainame_Label = new JLabel();
			movie_Search_thainame_Label.setForeground(new Color(205, 235, 255));
			movie_Search_thainame_Label.setBounds(new Rectangle(31, 260, 107, 28));
			movie_Search_thainame_Label.setText("By ThaiName");
			movie_Search_thainame_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			movie_Search_id_Label = new JLabel();
			movie_Search_id_Label.setForeground(new Color(205, 235, 255));
			movie_Search_id_Label.setBounds(new Rectangle(30, 211, 66, 28));
			movie_Search_id_Label.setText("By ID");
			movie_Search_id_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			movie_search_lastname_detail_label = new JLabel();
			movie_search_lastname_detail_label.setForeground(new Color(205, 235, 255));
			movie_search_lastname_detail_label.setBounds(new Rectangle(147, 340, 229, 16));
			movie_search_lastname_detail_label.setText("Insert at most 200 letters");
			movie_search_lastname_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			movie_search_name_detail_label = new JLabel();
			movie_search_name_detail_label.setForeground(new Color(205, 235, 255));
			movie_search_name_detail_label.setBounds(new Rectangle(146, 289, 229, 16));
			movie_search_name_detail_label.setText("Insert at most 200 letters");
			movie_search_name_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			movie_search_detail_label = new JLabel();
			movie_search_detail_label.setForeground(new Color(205, 235, 255));
			movie_search_detail_label.setBounds(new Rectangle(30, 172, 494, 21));
			movie_search_detail_label.setText("You can search by Movie Id/Movie  Thainame /Movie Engname");
			movie_search_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			movie_Search_Label = new JLabel();
			movie_Search_Label.setForeground(new Color(205, 235, 255));
			movie_Search_Label.setBounds(new Rectangle(29, 135, 220, 28));
			movie_Search_Label.setText("Search Movies");
			movie_Search_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			movie_search_id_detail_label = new JLabel();
			movie_search_id_detail_label.setForeground(new Color(205, 235, 255));
			movie_search_id_detail_label.setBounds(new Rectangle(146, 237, 235, 16));
			movie_search_id_detail_label.setText("Insert only number 0-9 (5 digits)");
			movie_search_id_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			movie_Sort_Label = new JLabel();
			movie_Sort_Label.setForeground(new Color(205, 235, 255));
			movie_Sort_Label.setBounds(new Rectangle(29, 380, 231, 28));
			movie_Sort_Label.setText("Show All Movies");
			movie_Sort_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			movie_sort_detail_label = new JLabel();
			movie_sort_detail_label.setForeground(new Color(205, 235, 255));
			movie_sort_detail_label.setBounds(new Rectangle(31, 431, 56, 16));
			movie_sort_detail_label.setText("sort by");
			movie_sort_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			movie_topic_label = new JLabel();
			movie_topic_label.setForeground(new Color(235, 245, 255));
			movie_topic_label.setBounds(new Rectangle(30, 43, 299, 62));
			movie_topic_label.setText("Movies");
			movie_topic_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 72));
			movie_detail_label = new JLabel();
			movie_detail_label.setForeground(new Color(205, 235, 255));
			movie_detail_label.setBounds(new Rectangle(510, 113, 373, 21));
			movie_detail_label.setText("insert movie id to view \nor edit/update/delete movie");
			movie_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			movie_View_Label = new JLabel();
			movie_View_Label.setBounds(new Rectangle(510, 83, 190, 28));
			movie_View_Label.setText("Movie Detail");
			movie_View_Label.setForeground(new Color(205, 235, 255));
			movie_View_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			MoviePage1 = new JPanel();
			MoviePage1.setLayout(null);
			MoviePage1.setBackground(Color.white);
			MoviePage1.setBounds(new Rectangle(0, 0, 1024, 768));
			MoviePage1.setVisible(false);
			MoviePage1.add(getMovie_thainame_search(), null);
			MoviePage1.add(getMovie_thainame_search_button(), null);
			MoviePage1.add(getMovie_all_sort_id__button(), null);
			MoviePage1.add(getMovie_engname_search(), null);
			MoviePage1.add(getMovie_Clear_All_Button(), null);
			MoviePage1.add(getMovie_engname_search_button(), null);
			MoviePage1.add(getMovie_id_search(), null);
			MoviePage1.add(getMovie_id_search_button(), null);
			MoviePage1.add(getMovie_result_scroll(), null);
			MoviePage1.add(getMovie_id_search_edit(), null);
			MoviePage1.add(getMovie_edit_search_button(), null);
			MoviePage1.add(movie_View_Label, null);
			MoviePage1.add(movie_detail_label, null);
			MoviePage1.add(movie_topic_label, null);
			MoviePage1.add(getMovie_all_sort_thainame__button(), null);
			MoviePage1.add(getMovie_all_sort_engname__button(), null);
			MoviePage1.add(movie_sort_detail_label, null);
			MoviePage1.add(movie_Sort_Label, null);
			MoviePage1.add(movie_search_id_detail_label, null);
			MoviePage1.add(movie_Search_Label, null);
			MoviePage1.add(movie_search_detail_label, null);
			MoviePage1.add(movie_search_name_detail_label, null);
			MoviePage1.add(movie_search_lastname_detail_label, null);
			MoviePage1.add(movie_Search_id_Label, null);
			MoviePage1.add(movie_Search_thainame_Label, null);
			MoviePage1.add(movie_Search_engname_Label, null);
			MoviePage1.add(Movie_Pic, null);
			MoviePage1.add(getAddorder_send1(), null);
			MoviePage1.add(getMovie_New(), null);
			MoviePage1.add(getMovie_Edit(), null);
			MoviePage1.add(Sales_bg2, null);
		}
		return MoviePage1;
	}

	/**
	 * This method initializes movie_thainame_search	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getMovie_thainame_search() {
		if (movie_thainame_search == null) {
			movie_thainame_search = new JTextField();
			movie_thainame_search.setBounds(new Rectangle(146, 259, 211, 28));
			movie_thainame_search.setBackground(new Color(235, 245, 255));
		}
		return movie_thainame_search;
	}

	/**
	 * This method initializes movie_thainame_search_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getMovie_thainame_search_button() {
		if (movie_thainame_search_button == null) {
			movie_thainame_search_button = new JButton();
			movie_thainame_search_button.setBounds(new Rectangle(360, 259, 104, 28));
			movie_thainame_search_button.setText("Search");
			movie_thainame_search_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			movie_thainame_search_button
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e1) {
							Connection con = null;
							//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
							PreparedStatement pstmt = null;
							// ประกาศ rset เป็น instance ของคลาส ResultSet
							ResultSet rset = null;
							String name = (movie_thainame_search.getText().toUpperCase());
							String name_search="       |---- ID ----|------------ Thai Name  /  English Name ------------|\n     =====================================================\n\n     ";
							String movie_name=null;
							movie_result.setText(" ");
					     //ดักจับข้อผิดพลาด
							try {
					       //Registering the JDBC Drivers : MySQL
								Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
							  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
							  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
							  //Show all records in STUDENT table
							  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
							  pstmt = con.prepareStatement ("SELECT MOVIE_ID,TITLE_TH,TITLE_EN FROM MOVIES WHERE TITLE_TH LIKE\'"+name+"%\'");
							 //Executing a Query 
							  rset = pstmt.executeQuery(); 
							  //Processing the Result Set 
							  while (rset.next()) {
								//รับค่า String id จาก attribute ID
								String mem_id = rset.getString("MOVIE_ID");
								name_search=name_search+mem_id+"\t";
								movie_name = rset.getString("TITLE_TH");
								name_search=name_search+movie_name+"\t";	
								String movie_engname = rset.getString("TITLE_EN");
								name_search=name_search+movie_engname+"\n    ";
							  }	
							  
							  if (movie_name!=null){
								  movie_result.setText(name_search);
							  }else
							  {
								  movie_result.setText(" Your Input is not match!!");
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
		return movie_thainame_search_button;
	}

	/**
	 * This method initializes movie_all_sort_id__button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getMovie_all_sort_id__button() {
		if (movie_all_sort_id__button == null) {
			movie_all_sort_id__button = new JButton();
			movie_all_sort_id__button.setBounds(new Rectangle(91, 424, 118, 28));
			movie_all_sort_id__button.setText("Id");
			movie_all_sort_id__button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			movie_all_sort_id__button
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e1) {
							Connection con = null;
							//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
							PreparedStatement pstmt = null;
							// ประกาศ rset เป็น instance ของคลาส ResultSet
							ResultSet rset = null;

							String name_search="       |---- ID ----|------------ Thai Name    /    English Name ------------|\n     =====================================================\n\n     ";
							movie_result.setText("");
					     //ดักจับข้อผิดพลาด
							try {
					       //Registering the JDBC Drivers : MySQL
								Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
							  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
							  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
							  //Show all records in STUDENT table
							  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
							  pstmt = con.prepareStatement ("SELECT MOVIE_ID,TITLE_TH,TITLE_EN FROM MOVIES ORDER BY MOVIE_ID");
							 //Executing a Query 
							  rset = pstmt.executeQuery(); 
							  //Processing the Result Set 
							  while (rset.next()) {
								//รับค่า String id จาก attribute ID
								String movie_id = rset.getString("MOVIE_ID");
								name_search=name_search+movie_id+"\t";
								String movie_name = rset.getString("TITLE_TH");
								name_search=name_search+movie_name+"   ";	
								String movie_engname = rset.getString("TITLE_EN");
								name_search=name_search+movie_engname+"\n     ";
							  }	
							movie_result.setText(name_search);
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
		return movie_all_sort_id__button;
	}

	/**
	 * This method initializes movie_engname_search	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getMovie_engname_search() {
		if (movie_engname_search == null) {
			movie_engname_search = new JTextField();
			movie_engname_search.setBounds(new Rectangle(147, 310, 211, 28));
			movie_engname_search.setBackground(new Color(235, 245, 255));
		}
		return movie_engname_search;
	}

	/**
	 * This method initializes movie_Clear_All_Button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getMovie_Clear_All_Button() {
		if (movie_Clear_All_Button == null) {
			movie_Clear_All_Button = new JButton();
			movie_Clear_All_Button.setBounds(new Rectangle(247, 668, 214, 38));
			movie_Clear_All_Button.setText("Clear All Search Field");
			movie_Clear_All_Button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			movie_Clear_All_Button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					movie_id_search.setText("");
					movie_thainame_search.setText("");
					movie_engname_search.setText("");
					movie_result.setText("");
				}
			});
		}
		return movie_Clear_All_Button;
	}

	/**
	 * This method initializes movie_engname_search_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getMovie_engname_search_button() {
		if (movie_engname_search_button == null) {
			movie_engname_search_button = new JButton();
			movie_engname_search_button.setBounds(new Rectangle(360, 310, 104, 28));
			movie_engname_search_button.setText("Search");
			movie_engname_search_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			movie_engname_search_button
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e1) {
							Connection con = null;
							//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
							PreparedStatement pstmt = null;
							// ประกาศ rset เป็น instance ของคลาส ResultSet
							ResultSet rset = null;
							String engname = (movie_engname_search.getText().toUpperCase());
							String name_search="      |---- ID ----|------------ Thai Name   /   English Name ------------|\n     =====================================================\n\n     ";
							String movie_name=null;
							movie_result.setText("");
					     //ดักจับข้อผิดพลาด
							try {
					       //Registering the JDBC Drivers : MySQL
								Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
							  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
							  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
							  //Show all records in STUDENT table
							  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
							  pstmt = con.prepareStatement ("SELECT MOVIE_ID,TITLE_TH,TITLE_EN FROM MOVIES WHERE TITLE_EN LIKE\'"+engname.toUpperCase()+"%\'");
							 //Executing a Query 
							  rset = pstmt.executeQuery(); 
							  //Processing the Result Set 
							  while (rset.next()) {
								//รับค่า String id จาก attribute ID
								String movie_id = rset.getString("MOVIE_ID");
								name_search=name_search+movie_id+"\t";
								movie_name = rset.getString("TITLE_TH");
								name_search=name_search+"   "+movie_name+"\t";	
								String movie_engname = rset.getString("TITLE_EN");
								name_search=name_search+""+movie_engname+"\n    ";
							  }	
							  
							  if (movie_name!=null){
								  movie_result.setText(name_search);
							  }else
							  {
								  movie_result.setText(" Your Input is not match!!");
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
		return movie_engname_search_button;
	}

	/**
	 * This method initializes movie_id_search	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getMovie_id_search() {
		if (movie_id_search == null) {
			movie_id_search = new JTextField(null, 4);
			movie_id_search.setBounds(new Rectangle(146, 210, 211, 28));
			movie_id_search.setBackground(new Color(232, 245, 255));
		}
		return movie_id_search;
	}

	/**
	 * This method initializes movie_id_search_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getMovie_id_search_button() {
		if (movie_id_search_button == null) {
			movie_id_search_button = new JButton();
			movie_id_search_button.setBounds(new Rectangle(360, 210, 104, 28));
			movie_id_search_button.setText("Search");
			movie_id_search_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			movie_id_search_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null;
					String id = (movie_id_search.getText().toUpperCase());
					String name_search="     |---- ID ----|------------ Thai Name / English Name ------------|\n     =====================================================\n\n     ";
					String movie_id = null;
					movie_result.setText("");
			     //ดักจับข้อผิดพลาด
					try {
			       //Registering the JDBC Drivers : MySQL
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
					  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
					  //Show all records in STUDENT table
					  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
					  pstmt = con.prepareStatement ("SELECT MOVIE_ID,TITLE_TH,TITLE_EN FROM MOVIES WHERE MOVIE_ID LIKE \'"+id+"%\'");
					 //Executing a Query 
					  rset = pstmt.executeQuery(); 
					  //Processing the Result Set 
					  while (rset.next()) {
						//รับค่า String id จาก attribute ID
						movie_id = rset.getString("MOVIE_ID");
						name_search=name_search+movie_id+"\t";
						String movie_th = rset.getString("TITLE_TH");
						name_search=name_search+movie_th+"\t";	
						String movie_en = rset.getString("TITLE_EN");
						name_search=name_search+movie_en+"\n    ";
					  }	
					  if (movie_id!=null){
						  movie_result.setText(name_search);
					  }
					  else
					  {
						  movie_result.setText(" Your Input is not match!!");
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
		return movie_id_search_button;
	}

	/**
	 * This method initializes movie_result_scroll	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getMovie_result_scroll() {
		if (movie_result_scroll == null) {
			movie_result_scroll = new JScrollPane();
			movie_result_scroll.setBounds(new Rectangle(31, 454, 431, 210));
			movie_result_scroll.setViewportView(getMovie_result());
		}
		return movie_result_scroll;
	}

	/**
	 * This method initializes movie_result	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getMovie_result() {
		if (movie_result == null) {
			movie_result = new JTextArea();
			movie_result.setSize(new Dimension(428, 207));
			movie_result.setVisible(true);
		}
		return movie_result;
	}

	/**
	 * This method initializes movie_id_search_edit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getMovie_id_search_edit() {
		if (movie_id_search_edit == null) {
			movie_id_search_edit = new JTextField();
			movie_id_search_edit.setBounds(new Rectangle(510, 138, 243, 28));
			movie_id_search_edit.setBackground(new Color(235, 245, 255));
		}
		return movie_id_search_edit;
	}

	/**
	 * This method initializes movie_edit_search_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getMovie_edit_search_button() {
		if (movie_edit_search_button == null) {
			movie_edit_search_button = new JButton();
			movie_edit_search_button.setBounds(new Rectangle(754, 138, 93, 26));
			movie_edit_search_button.setText("View");
			movie_edit_search_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			movie_edit_search_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null;
					
					String edit_movie=null;
					edit_movie= movie_id_search_edit.getText();
					//System.out.println("Edit Member :"+edit_member);
					//ดักจับข้อผิดพลาด
					try {
			       //Registering the JDBC Drivers : MySQL
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
					  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
					  //Show all records in STUDENT table
					  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
					  pstmt = con.prepareStatement ("SELECT * FROM MOVIES WHERE MOVIE_ID=\'"+edit_movie+"\'");
					  		//" INNER JOIN SCREEN ON MOVIES.SCREEN_ID=SCREEN.SCREEN_ID" +
					  	//	"INNER JOIN ON MOVIES.GENRE_ID=GENRE.GENRE_ID WHERE MOVIE_ID=\'"+edit_movie+"\'");
					 //Executing a Query 
					  rset = pstmt.executeQuery(); 
					  //Processing the Result Set 
					  String movie_id = null;
					  String movie_thainame = null;
					  String movie_engname = null;
					  String movie_des = null;
					  String movie_nation = null;
					  String movie_audio = null;
					  String movie_sub = null;
					  String movie_screen = null;
					  String movie_type = null;
					  String movie_price = null;
					  String moviepic = null;

					  while (rset.next()) {
							//รับค่า String id จาก attribute ID
						  movie_id = rset.getString("MOVIE_ID");
						  movie_thainame = rset.getString("TITLE_TH");
						  movie_engname = rset.getString("TITLE_EN");
						  movie_des = rset.getString("DESCRIPTION");
						  movie_nation = rset.getString("NATION_NAME");
						  movie_audio = rset.getString("AUDIO");
						  movie_sub = rset.getString("SUBTITLE");
						  movie_screen = rset.getString("SCREEN_ID");
						  movie_type = rset.getString("GENRE_ID");
						  movie_price = rset.getString("PRICE");
						  moviepic = rset.getString("MOVIEPIC");
						  
													
					 }	
					  
					  if (movie_id!=null){
						  movie_New.setVisible(false);
						  movie_Edit.setVisible(true);
						  New_movieId_edit.setText(movie_id);
						  Edit_moviethaiName.setText(movie_thainame);
						  Edit_movieengName.setText(movie_engname);
						  Edit_moviedes.setText(movie_des);
						  New_movienation_Edit.setText(movie_nation);
						  New_movieaudio_Edit.setText(movie_audio);
						  New_moviesub_Edit.setText(movie_sub);
						  New_movieprice_Edit.setText(movie_price);
						  New_moviepic_Edit.setText(moviepic);
						  
						  if (moviepic==null){
							  String movie_pic_text = "cover/no_image.jpg";
							  Movie_Pic.setIcon(new ImageIcon(movie_pic_text));
						  }else{
						  String movie_pic_text = "cover/"+moviepic;
						  Movie_Pic.setIcon(new ImageIcon(movie_pic_text));
						  }
						  
						
						  
						  if(movie_type.equals("1"))
							  movie1_radio_action.setSelected(true);
						  else if(movie_type.equals("2"))
							  movie1_radio_animation.setSelected(true);
						  else if(movie_type.equals("3"))
							  movie1_radio_adventure.setSelected(true);
						  else if(movie_type.equals("4"))
							  movie1_radio_comedy.setSelected(true);
						  else if(movie_type.equals("5"))
							  movie1_radio_crime.setSelected(true);
						  else if(movie_type.equals("6"))
							  movie1_radio_drama.setSelected(true);
						  else if(movie_type.equals("7"))
							  movie1_radio_fantasy.setSelected(true);
						  else if(movie_type.equals("8"))
							  movie1_radio_horror.setSelected(true);
						  else if(movie_type.equals("9"))
							  movie1_radio_romantic.setSelected(true);
						  else if(movie_type.equals("10"))
							  movie1_radio_scifi.setSelected(true);
						  else {
							  movie1_radio_series.setSelected(true);
						  }
						  
						  if(movie_screen.equals("1"))
							  movie_radio_widescreen1.setSelected(true);
						  else{
							  movie_radio_fullscreen1.setSelected(true);
						  }
						
							
					  }
					  else
					  {
						  JOptionPane.showMessageDialog(null, "Your member id is not match!!");
						  movie_Edit.setVisible(false);
						  Movie_Pic.setVisible(false);
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
		return movie_edit_search_button;
	}

	/**
	 * This method initializes movie_all_sort_thainame__button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getMovie_all_sort_thainame__button() {
		if (movie_all_sort_thainame__button == null) {
			movie_all_sort_thainame__button = new JButton();
			movie_all_sort_thainame__button.setBounds(new Rectangle(212, 424, 119, 28));
			movie_all_sort_thainame__button.setText("Thai Name");
			movie_all_sort_thainame__button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			movie_all_sort_thainame__button
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e1) {
							Connection con = null;
							//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
							PreparedStatement pstmt = null;
							// ประกาศ rset เป็น instance ของคลาส ResultSet
							ResultSet rset = null;

							String name_search="       |---- ID ----|------------ Thai Name    /    English Name ------------|\n     =====================================================\n\n     ";
							movie_result.setText("");
					     //ดักจับข้อผิดพลาด
							try {
					       //Registering the JDBC Drivers : MySQL
								Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
							  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
							  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
							  //Show all records in STUDENT table
							  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
							  pstmt = con.prepareStatement ("SELECT MOVIE_ID,TITLE_TH,TITLE_EN FROM MOVIES ORDER BY TITLE_TH");
							 //Executing a Query 
							  rset = pstmt.executeQuery(); 
							  //Processing the Result Set 
							  while (rset.next()) {
								//รับค่า String id จาก attribute ID
								String movie_id = rset.getString("MOVIE_ID");
								name_search=name_search+movie_id+"\t";
								String movie_name = rset.getString("TITLE_TH");
								name_search=name_search+movie_name+"    ";	
								String movie_engname = rset.getString("TITLE_EN");
								name_search=name_search+movie_engname+"\n     ";
							  }	
							movie_result.setText(name_search);
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
		return movie_all_sort_thainame__button;
	}

	/**
	 * This method initializes movie_all_sort_engname__button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getMovie_all_sort_engname__button() {
		if (movie_all_sort_engname__button == null) {
			movie_all_sort_engname__button = new JButton();
			movie_all_sort_engname__button.setBounds(new Rectangle(334, 424, 119, 28));
			movie_all_sort_engname__button.setText("Eng Name");
			movie_all_sort_engname__button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			movie_all_sort_engname__button
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e1) {
							Connection con = null;
							//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
							PreparedStatement pstmt = null;
							// ประกาศ rset เป็น instance ของคลาส ResultSet
							ResultSet rset = null;

							String name_search="       |---- ID ----|------------ Thai Name    /    English Name ------------|\n     =====================================================\n\n     ";
							movie_result.setText("");
					     //ดักจับข้อผิดพลาด
							try {
					       //Registering the JDBC Drivers : MySQL
								Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
							  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
							  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
							  //Show all records in STUDENT table
							  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
							  pstmt = con.prepareStatement ("SELECT MOVIE_ID,TITLE_TH,TITLE_EN FROM MOVIES ORDER BY TITLE_EN");
							 //Executing a Query 
							  rset = pstmt.executeQuery(); 
							  //Processing the Result Set 
							  while (rset.next()) {
								//รับค่า String id จาก attribute ID
								String movie_id = rset.getString("MOVIE_ID");
								name_search=name_search+movie_id+"\t";
								String movie_name = rset.getString("TITLE_EN");
								name_search=name_search+movie_name+"    ";	
								String movie_thname = rset.getString("TITLE_TH");
								name_search=name_search+movie_thname+"\n     ";
							  }	
							movie_result.setText(name_search);
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
		return movie_all_sort_engname__button;
	}

	/**
	 * This method initializes movie_Edit	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getMovie_Edit() {
		if (movie_Edit == null) {
			movie_nation_label_Edit1 = new JLabel();
			movie_nation_label_Edit1.setBounds(new Rectangle(26, 214, 114, 21));
			movie_nation_label_Edit1.setText("Cover Image");
			movie_nation_label_Edit1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			widescreen_Label1 = new JLabel();
			widescreen_Label1.setBounds(new Rectangle(228, 419, 94, 20));
			widescreen_Label1.setText("Widescreen");
			fullscreen_Label1 = new JLabel();
			fullscreen_Label1.setBounds(new Rectangle(141, 421, 77, 20));
			fullscreen_Label1.setText("Fullscreen");
			movie_screen_label_edit1 = new JLabel();
			movie_screen_label_edit1.setBounds(new Rectangle(24, 417, 68, 21));
			movie_screen_label_edit1.setText("Screen");
			movie_screen_label_edit1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			Series_Label1 = new JLabel();
			Series_Label1.setBounds(new Rectangle(404, 362, 48, 16));
			Series_Label1.setText("Series");
			scifi_Label1 = new JLabel();
			scifi_Label1.setBounds(new Rectangle(403, 335, 46, 19));
			scifi_Label1.setText("Sci-fi");
			romantic_Label1 = new JLabel();
			romantic_Label1.setBounds(new Rectangle(314, 387, 64, 15));
			romantic_Label1.setText("Romantic");
			horror_Label1 = new JLabel();
			horror_Label1.setBounds(new Rectangle(313, 362, 48, 14));
			horror_Label1.setText("Horror");
			fantasy_Label1 = new JLabel();
			fantasy_Label1.setBounds(new Rectangle(312, 337, 52, 14));
			fantasy_Label1.setText("Fantasy");
			drama_Label1 = new JLabel();
			drama_Label1.setBounds(new Rectangle(232, 383, 44, 20));
			drama_Label1.setText("Drama");
			crime_Label1 = new JLabel();
			crime_Label1.setBounds(new Rectangle(232, 360, 43, 16));
			crime_Label1.setText("Crime");
			adventure_Label1 = new JLabel();
			adventure_Label1.setBounds(new Rectangle(141, 384, 64, 16));
			adventure_Label1.setText("Adventure");
			animation_Label1 = new JLabel();
			animation_Label1.setBounds(new Rectangle(139, 359, 68, 17));
			animation_Label1.setText("Animation");
			comedy_Label11 = new JLabel();
			comedy_Label11.setBounds(new Rectangle(231, 337, 55, 14));
			comedy_Label11.setText("Comedy");
			action_Label1 = new JLabel();
			action_Label1.setBounds(new Rectangle(141, 335, 53, 16));
			action_Label1.setText("Action");
			movie_type_label_edit1 = new JLabel();
			movie_type_label_edit1.setBounds(new Rectangle(26, 333, 67, 21));
			movie_type_label_edit1.setText("Type");
			movie_type_label_edit1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			movie_price_label_edit = new JLabel();
			movie_price_label_edit.setBounds(new Rectangle(26, 290, 56, 21));
			movie_price_label_edit.setText("Price");
			movie_price_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			movie_sub_label_edit = new JLabel();
			movie_sub_label_edit.setBounds(new Rectangle(26, 264, 69, 21));
			movie_sub_label_edit.setText("Subtitle");
			movie_sub_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			movies_id_label = new JLabel();
			movies_id_label.setBounds(new Rectangle(162, 17, 238, 28));
			movies_id_label.setForeground(Color.red);
			movies_id_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			movie_label = new JLabel();
			movie_label.setBounds(new Rectangle(25, 17, 112, 28));
			movie_label.setText("Movie");
			movie_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			movie_id_label_edit = new JLabel();
			movie_id_label_edit.setBounds(new Rectangle(25, 59, 97, 21));
			movie_id_label_edit.setText("Movie ID");
			movie_id_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			movie_audio_label_edit = new JLabel();
			movie_audio_label_edit.setBounds(new Rectangle(26, 241, 56, 21));
			movie_audio_label_edit.setText("Audio");
			movie_audio_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			movie_nation_label_Edit = new JLabel();
			movie_nation_label_Edit.setBounds(new Rectangle(26, 187, 73, 21));
			movie_nation_label_Edit.setText("Nation");
			movie_nation_label_Edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			movie_des_label_edit = new JLabel();
			movie_des_label_edit.setBounds(new Rectangle(25, 140, 111, 21));
			movie_des_label_edit.setText("Description");
			movie_des_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			movie_engname_label_edit = new JLabel();
			movie_engname_label_edit.setBounds(new Rectangle(25, 116, 123, 21));
			movie_engname_label_edit.setText("English Name");
			movie_engname_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			movie_thainame_label_edit = new JLabel();
			movie_thainame_label_edit.setBounds(new Rectangle(25, 84, 111, 26));
			movie_thainame_label_edit.setText("Thai Name");
			movie_thainame_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			movie_Edit = new JPanel();
			movie_Edit.setLayout(null);
			movie_Edit.setBackground(new Color(235, 245, 255));
			movie_Edit.setBounds(new Rectangle(517, 183, 482, 565));
			movie_Edit.add(getEdit_moviethaiName(), null);
			movie_Edit.add(getEdit_movieengName(), null);
			movie_Edit.add(movie_thainame_label_edit, null);
			movie_Edit.add(movie_engname_label_edit, null);
			movie_Edit.add(movie_des_label_edit, null);
			movie_Edit.add(getNew_movienation_Edit(), null);
			movie_Edit.add(movie_nation_label_Edit, null);
			movie_Edit.add(getNew_movieaudio_Edit(), null);
			movie_Edit.add(movie_audio_label_edit, null);
			movie_Edit.add(getMovie_send_edit(), null);
			movie_Edit.add(getNewmovie_clear_edit(), null);
			movie_Edit.add(getNew_movieId_edit(), null);
			movie_Edit.add(movie_id_label_edit, null);
			movie_Edit.add(getAdd_movie_Back_Button_Edit(), null);
			movie_Edit.add(getMovie_delete_edit(), null);
			movie_Edit.add(movie_label, null);
			movie_Edit.add(movies_id_label, null);
			movie_Edit.add(movie_sub_label_edit, null);
			movie_Edit.add(movie_price_label_edit, null);
			movie_Edit.add(getNew_moviesub_Edit(), null);
			movie_Edit.add(getNew_movieprice_Edit(), null);
			movie_Edit.add(movie_type_label_edit1, null);
			movie_Edit.add(getMovie1_radio_action(), null);
			movie_Edit.add(action_Label1, null);
			movie_Edit.add(getMovie1_radio_comedy(), null);
			movie_Edit.add(comedy_Label11, null);
			movie_Edit.add(getMovie1_radio_animation(), null);
			movie_Edit.add(animation_Label1, null);
			movie_Edit.add(getMovie1_radio_adventure(), null);
			movie_Edit.add(adventure_Label1, null);
			movie_Edit.add(getMovie1_radio_crime(), null);
			movie_Edit.add(crime_Label1, null);
			movie_Edit.add(getMovie1_radio_drama(), null);
			movie_Edit.add(drama_Label1, null);
			movie_Edit.add(getMovie1_radio_fantasy(), null);
			movie_Edit.add(fantasy_Label1, null);
			movie_Edit.add(getMovie1_radio_horror(), null);
			movie_Edit.add(horror_Label1, null);
			movie_Edit.add(getMovie1_radio_romantic(), null);
			movie_Edit.add(romantic_Label1, null);
			movie_Edit.add(getMovie1_radio_scifi(), null);
			movie_Edit.add(scifi_Label1, null);
			movie_Edit.add(getMovie1_radio_series(), null);
			movie_Edit.add(Series_Label1, null);
			movie_Edit.add(movie_screen_label_edit1, null);
			movie_Edit.add(getMovie_radio_fullscreen1(), null);
			movie_Edit.add(fullscreen_Label1, null);
			movie_Edit.add(getMovie_radio_widescreen1(), null);
			movie_Edit.add(widescreen_Label1, null);
			movie_Edit.add(getEdit_movie_Scroll(), null);
			movie_Edit.setVisible(false);
			movie_Edit.add(getNew_moviepic_Edit(), null);
			movie_Edit.add(movie_nation_label_Edit1, null);
		}
		return movie_Edit;
	}

	/**
	 * This method initializes Edit_moviethaiName	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getEdit_moviethaiName() {
		if (Edit_moviethaiName == null) {
			Edit_moviethaiName = new JTextField();
			Edit_moviethaiName.setBounds(new Rectangle(162, 86, 293, 25));
		}
		return Edit_moviethaiName;
	}

	/**
	 * This method initializes Edit_movieengName	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getEdit_movieengName() {
		if (Edit_movieengName == null) {
			Edit_movieengName = new JTextField();
			Edit_movieengName.setBounds(new Rectangle(162, 111, 293, 25));
		}
		return Edit_movieengName;
	}

	/**
	 * This method initializes New_movienation_Edit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_movienation_Edit() {
		if (New_movienation_Edit == null) {
			New_movienation_Edit = new JTextField();
			New_movienation_Edit.setBounds(new Rectangle(162, 185, 293, 25));
		}
		return New_movienation_Edit;
	}

	/**
	 * This method initializes New_movieaudio_Edit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_movieaudio_Edit() {
		if (New_movieaudio_Edit == null) {
			New_movieaudio_Edit = new JTextField();
			New_movieaudio_Edit.setBounds(new Rectangle(162, 237, 293, 25));
		}
		return New_movieaudio_Edit;
	}

	/**
	 * This method initializes movie_send_edit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getMovie_send_edit() {
		if (movie_send_edit == null) {
			movie_send_edit = new JButton();
			movie_send_edit.setBounds(new Rectangle(83, 458, 100, 40));
			movie_send_edit.setText("Edit");
			movie_send_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			movie_send_edit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					String new_id=New_movieId_edit.getText();
					String new_thainame=Edit_moviethaiName.getText();
					String new_engname=Edit_movieengName.getText();
					String new_des=Edit_moviedes.getText();
					String new_nation=New_movienation_Edit.getText();
					String new_audio=New_movieaudio_Edit.getText();
					String new_sub=New_moviesub_Edit.getText();
					String new_price=New_movieprice_Edit.getText();
					String new_moviepic=New_moviepic_Edit.getText();
					
					String new_screen = null;
					if (movie_radio_widescreen1.isSelected()){
						new_screen="1";
						//System.out.println("newtype="+newtype);
					}
					else if (movie_radio_fullscreen1.isSelected()){
						new_screen="2";
					}
					else if(new_screen==null){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					
					String new_type = null;
					if (movie1_radio_action.isSelected()){
						new_type="1";
						//System.out.println("newtype="+newtype);
					}
					else if (movie1_radio_adventure.isSelected()){
						new_type="2";
					}
					else if (movie1_radio_animation.isSelected()){
						new_type="3";
					}
					else if (movie1_radio_comedy.isSelected()){
						new_type="4";
					}
					else if (movie1_radio_crime.isSelected()){
						new_type="5";
					}
					else if (movie1_radio_drama.isSelected()){
						new_type="6";
					}
					else if (movie1_radio_fantasy.isSelected()){
						new_type="7";
					}
					else if (movie1_radio_horror.isSelected()){
						new_type="8";
					}
					else if (movie1_radio_romantic.isSelected()){
						new_type="9";
					}
					else if (movie1_radio_scifi.isSelected()){
						new_type="10";
					}
					else if (movie1_radio_series.isSelected()){
						new_type="11";
					}
					else if(new_type==null){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					

					if (new_id.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_thainame.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_engname.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_des.equalsIgnoreCase(""))
					{
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_nation.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_audio.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_sub.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_price.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}else if (new_moviepic.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					
					
					else
					{
						Connection con = null;
						//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
						PreparedStatement pstmt = null;
						// ประกาศ rset เป็น instance ของคลาส ResultSet
						ResultSet rset = null;

						JOptionPane.showMessageDialog(null, "Update Complete!!");	
						movie_New.setVisible(true);
						movie_Edit.setVisible(false);
						//ดักจับข้อผิดพลาด
						try {
				       //Registering the JDBC Drivers : MySQL
							Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
						  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
						  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
						  pstmt = con.prepareStatement ("UPDATE MOVIES SET MOVIE_ID="+Integer.parseInt(new_id)+",TITLE_TH=\'"+new_thainame+"\',TITLE_EN=\'"+new_engname+"\',DESCRIPTION=\'"+new_des+"\',NATION_NAME=\'"+new_nation+"\',AUDIO=\'"+new_audio+"\',PRICE=\'"+new_price+"\',MOVIEPIC=\'"+new_moviepic+"\',GENRE_ID=\'"+new_type+"\',SUBTITLE=\'"+new_sub+"\',SCREEN_ID=\'"+new_screen+"\' WHERE MOVIE_ID="+new_id);
						  String movie_pic_text = "cover/";
						  Movie_Pic.setIcon(new ImageIcon(movie_pic_text)); 
							  rset = pstmt.executeQuery(); 
							  //Processing the Result Set 
							    						  
						rset.close();
						pstmt.close();
						con.close();
						

						
						}catch (Exception e){ 
							System.out.println(e.getMessage());
							// finally block
					}
					}
				}
			});
		}
		return movie_send_edit;
	}

	/**
	 * This method initializes newmovie_clear_edit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getNewmovie_clear_edit() {
		if (newmovie_clear_edit == null) {
			newmovie_clear_edit = new JButton();
			newmovie_clear_edit.setBounds(new Rectangle(296, 459, 100, 40));
			newmovie_clear_edit.setText("Clear");
			newmovie_clear_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			newmovie_clear_edit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Edit_moviethaiName.setText("");
					Edit_movieengName.setText("");
					Edit_moviedes.setText("");
					New_movienation_Edit.setText("");
					New_movieaudio_Edit.setText("");
					New_moviesub_Edit.setText("");
					New_movieprice_Edit.setText("");
					New_moviepic_Edit.setText("");
					/*movie1_radio_action.setSelected(false);
					movie1_radio_animation.setSelected(false);
					movie1_radio_adventure.setSelected(false);
					movie1_radio_comedy.setSelected(false);
					movie1_radio_crime.setSelected(false);
					movie1_radio_drama.setSelected(false);
					movie1_radio_fantasy.setSelected(false);
					movie1_radio_horror.setSelected(false);
					movie1_radio_romantic.setSelected(false);
					movie1_radio_scifi.setSelected(false);
					movie1_radio_series.setSelected(false);
					movie_radio_fullscreen1.setSelected(false);
					movie_radio_widescreen1.setSelected(false);*/
					group1.clearSelection();
					group4.clearSelection();
				}
			});
		}
		return newmovie_clear_edit;
	}

	/**
	 * This method initializes New_movieId_edit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_movieId_edit() {
		if (New_movieId_edit == null) {
			New_movieId_edit = new JTextField();
			New_movieId_edit.setBounds(new Rectangle(162, 58, 293, 25));
			New_movieId_edit.setEditable(false);
		}
		return New_movieId_edit;
	}

	/**
	 * This method initializes Add_movie_Back_Button_Edit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAdd_movie_Back_Button_Edit() {
		if (Add_movie_Back_Button_Edit == null) {
			Add_movie_Back_Button_Edit = new JButton();
			Add_movie_Back_Button_Edit.setBounds(new Rectangle(83, 501, 313, 40));
			Add_movie_Back_Button_Edit.setText("Back");
			Add_movie_Back_Button_Edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			Add_movie_Back_Button_Edit
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e1) {
							movie_Edit.setVisible(false);
							movie_New.setVisible(true);
							String movie_pic_text = "cover/";
							Movie_Pic.setIcon(new ImageIcon(movie_pic_text));
						}
					});
		}
		return Add_movie_Back_Button_Edit;
	}

	/**
	 * This method initializes movie_delete_edit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getMovie_delete_edit() {
		if (movie_delete_edit == null) {
			movie_delete_edit = new JButton();
			movie_delete_edit.setBounds(new Rectangle(190, 458, 100, 40));
			movie_delete_edit.setText("Delete");
			movie_delete_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			movie_delete_edit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					String new_id =New_movieId_edit.getText();
					int ch=0;
					

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
						  ch = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete?",JOptionPane.YES_NO_OPTION);
						  if (ch!=1){
							  pstmt = con.prepareStatement ("DELETE FROM MOVIES WHERE MOVIE_ID=\'+"+new_id+"\'");
							  JOptionPane.showMessageDialog(null, "Delete Complete!!");
						  }
						  	Movie_Pic.setIcon(new ImageIcon(""));
							movie_New.setVisible(true);
							movie_Edit.setVisible(false);
							 //Executing a Query 
							  rset = pstmt.executeQuery(); 
							  //Processing the Result Set 
							    						  
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
		return movie_delete_edit;
	}

	/**
	 * This method initializes New_moviesub_Edit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_moviesub_Edit() {
		if (New_moviesub_Edit == null) {
			New_moviesub_Edit = new JTextField();
			New_moviesub_Edit.setBounds(new Rectangle(162, 264, 293, 24));
		}
		return New_moviesub_Edit;
	}

	/**
	 * This method initializes New_movieprice_Edit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_movieprice_Edit() {
		if (New_movieprice_Edit == null) {
			New_movieprice_Edit = new JTextField();
			New_movieprice_Edit.setBounds(new Rectangle(162, 289, 293, 24));
		}
		return New_movieprice_Edit;
	}

	/**
	 * This method initializes movie1_radio_action	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie1_radio_action() {
		if (movie1_radio_action == null) {
			movie1_radio_action = new JRadioButton();
			movie1_radio_action.setBounds(new Rectangle(113, 337, 19, 15));
			movie1_radio_action.setBackground(new Color(235, 245, 254));
			group1.add(movie1_radio_action);
		}
		return movie1_radio_action;
	}

	/**
	 * This method initializes movie1_radio_comedy	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie1_radio_comedy() {
		if (movie1_radio_comedy == null) {
			movie1_radio_comedy = new JRadioButton();
			movie1_radio_comedy.setBounds(new Rectangle(206, 337, 20, 15));
			movie1_radio_comedy.setBackground(new Color(235, 245, 254));
			group1.add(movie1_radio_comedy);
		}
		return movie1_radio_comedy;
	}

	/**
	 * This method initializes movie1_radio_animation	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie1_radio_animation() {
		if (movie1_radio_animation == null) {
			movie1_radio_animation = new JRadioButton();
			movie1_radio_animation.setBounds(new Rectangle(113, 357, 21, 18));
			movie1_radio_animation.setBackground(new Color(235, 245, 254));
			group1.add(movie1_radio_animation);
		}
		return movie1_radio_animation;
	}

	/**
	 * This method initializes movie1_radio_adventure	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie1_radio_adventure() {
		if (movie1_radio_adventure == null) {
			movie1_radio_adventure = new JRadioButton();
			movie1_radio_adventure.setBounds(new Rectangle(113, 383, 20, 16));
			movie1_radio_adventure.setBackground(new Color(235, 245, 254));
			group1.add(movie1_radio_adventure);
		}
		return movie1_radio_adventure;
	}

	/**
	 * This method initializes movie1_radio_crime	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie1_radio_crime() {
		if (movie1_radio_crime == null) {
			movie1_radio_crime = new JRadioButton();
			movie1_radio_crime.setBounds(new Rectangle(207, 358, 19, 17));
			movie1_radio_crime.setBackground(new Color(235, 245, 254));
			group1.add(movie1_radio_crime);
		}
		return movie1_radio_crime;
	}

	/**
	 * This method initializes movie1_radio_drama	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie1_radio_drama() {
		if (movie1_radio_drama == null) {
			movie1_radio_drama = new JRadioButton();
			movie1_radio_drama.setBounds(new Rectangle(207, 384, 23, 15));
			movie1_radio_drama.setBackground(new Color(235, 245, 254));
			group1.add(movie1_radio_drama);
		}
		return movie1_radio_drama;
	}

	/**
	 * This method initializes movie1_radio_fantasy	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie1_radio_fantasy() {
		if (movie1_radio_fantasy == null) {
			movie1_radio_fantasy = new JRadioButton();
			movie1_radio_fantasy.setBounds(new Rectangle(290, 337, 21, 14));
			movie1_radio_fantasy.setBackground(new Color(235, 245, 254));
			group1.add(movie1_radio_fantasy);
		}
		return movie1_radio_fantasy;
	}

	/**
	 * This method initializes movie1_radio_horror	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie1_radio_horror() {
		if (movie1_radio_horror == null) {
			movie1_radio_horror = new JRadioButton();
			movie1_radio_horror.setBounds(new Rectangle(290, 362, 16, 14));
			movie1_radio_horror.setBackground(new Color(235, 245, 254));
			group1.add(movie1_radio_horror);
		}
		return movie1_radio_horror;
	}

	/**
	 * This method initializes movie1_radio_romantic	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie1_radio_romantic() {
		if (movie1_radio_romantic == null) {
			movie1_radio_romantic = new JRadioButton();
			movie1_radio_romantic.setBounds(new Rectangle(290, 387, 16, 15));
			movie1_radio_romantic.setBackground(new Color(235, 245, 254));
			group1.add(movie1_radio_romantic);
		}
		return movie1_radio_romantic;
	}

	/**
	 * This method initializes movie1_radio_scifi	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie1_radio_scifi() {
		if (movie1_radio_scifi == null) {
			movie1_radio_scifi = new JRadioButton();
			movie1_radio_scifi.setBounds(new Rectangle(381, 338, 19, 13));
			movie1_radio_scifi.setBackground(new Color(235, 245, 254));
			group1.add(movie1_radio_scifi);
		}
		return movie1_radio_scifi;
	}

	/**
	 * This method initializes movie1_radio_series	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie1_radio_series() {
		if (movie1_radio_series == null) {
			movie1_radio_series = new JRadioButton();
			movie1_radio_series.setBounds(new Rectangle(381, 360, 20, 18));
			movie1_radio_series.setBackground(new Color(235, 245, 254));
			group1.add(movie1_radio_series);
		}
		return movie1_radio_series;
	}

	/**
	 * This method initializes movie_radio_fullscreen1	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie_radio_fullscreen1() {
		if (movie_radio_fullscreen1 == null) {
			movie_radio_fullscreen1 = new JRadioButton();
			movie_radio_fullscreen1.setBounds(new Rectangle(113, 420, 18, 18));
			movie_radio_fullscreen1.setBackground(new Color(235, 245, 254));
			group4.add(movie_radio_fullscreen1);
		}
		return movie_radio_fullscreen1;
	}

	/**
	 * This method initializes movie_radio_widescreen1	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie_radio_widescreen1() {
		if (movie_radio_widescreen1 == null) {
			movie_radio_widescreen1 = new JRadioButton();
			movie_radio_widescreen1.setBounds(new Rectangle(208, 420, 26, 21));
			movie_radio_widescreen1.setBackground(new Color(235, 245, 254));
			group4.add(movie_radio_widescreen1);
		}
		return movie_radio_widescreen1;
	}

	/**
	 * This method initializes edit_movie_Scroll	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getEdit_movie_Scroll() {
		if (edit_movie_Scroll == null) {
			edit_movie_Scroll = new JScrollPane();
			edit_movie_Scroll.setBounds(new Rectangle(162, 139, 293, 44));
			edit_movie_Scroll.setViewportView(getEdit_moviedes());
		}
		return edit_movie_Scroll;
	}

	/**
	 * This method initializes Edit_moviedes	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getEdit_moviedes() {
		if (Edit_moviedes == null) {
			Edit_moviedes = new JTextArea();
		}
		return Edit_moviedes;
	}

	/**
	 * This method initializes movie_New	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getMovie_New() {
		if (movie_New == null) {
			movie_nation_label_Edit11 = new JLabel();
			movie_nation_label_Edit11.setBounds(new Rectangle(36, 285, 112, 21));
			movie_nation_label_Edit11.setText("Cover Image");
			movie_nation_label_Edit11.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			widescreen_Label = new JLabel();
			widescreen_Label.setBounds(new Rectangle(241, 482, 86, 16));
			widescreen_Label.setText("Widel Screen");
			fullscreen_Label = new JLabel();
			fullscreen_Label.setBounds(new Rectangle(148, 483, 72, 16));
			fullscreen_Label.setText("Full Screen");
			movie_screen_label = new JLabel();
			movie_screen_label.setBounds(new Rectangle(35, 475, 68, 27));
			movie_screen_label.setText("Screen");
			movie_screen_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			Series_Label2 = new JLabel();
			Series_Label2.setBounds(new Rectangle(419, 409, 37, 16));
			Series_Label2.setText("Series");
			scifi_Label2 = new JLabel();
			scifi_Label2.setBounds(new Rectangle(419, 381, 29, 16));
			scifi_Label2.setText("Sci-fi");
			romantic_Label2 = new JLabel();
			romantic_Label2.setBounds(new Rectangle(331, 436, 54, 16));
			romantic_Label2.setText("Romantic");
			horror_Label2 = new JLabel();
			horror_Label2.setBounds(new Rectangle(330, 409, 37, 16));
			horror_Label2.setText("Horror");
			fantasy_Label2 = new JLabel();
			fantasy_Label2.setBounds(new Rectangle(329, 381, 44, 16));
			fantasy_Label2.setText("Fantasy");
			drama_Label2 = new JLabel();
			drama_Label2.setBounds(new Rectangle(244, 437, 38, 16));
			drama_Label2.setText("Drama");
			crime_Label2 = new JLabel();
			crime_Label2.setBounds(new Rectangle(244, 408, 34, 16));
			crime_Label2.setText("Crime");
			comedy_Label = new JLabel();
			comedy_Label.setBounds(new Rectangle(244, 380, 46, 16));
			comedy_Label.setText("Comedy");
			adventure_Label2 = new JLabel();
			adventure_Label2.setBounds(new Rectangle(158, 438, 58, 16));
			adventure_Label2.setText("Adventure");
			animation_Label2 = new JLabel();
			animation_Label2.setBounds(new Rectangle(157, 408, 57, 16));
			animation_Label2.setText("Animation");
			action_Label2 = new JLabel();
			action_Label2.setBounds(new Rectangle(157, 378, 36, 16));
			action_Label2.setText("Action");
			movie_type_label = new JLabel();
			movie_type_label.setBounds(new Rectangle(37, 391, 65, 21));
			movie_type_label.setText("Type");
			movie_type_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			movie_price_label = new JLabel();
			movie_price_label.setBounds(new Rectangle(36, 255, 69, 21));
			movie_price_label.setText("Price");
			movie_price_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			movie_sub_label = new JLabel();
			movie_sub_label.setLocation(new Point(35, 230));
			movie_sub_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			movie_sub_label.setText("Subtitle");
			movie_sub_label.setSize(new Dimension(78, 21));
			Add_movie_label = new JLabel();
			Add_movie_label.setBounds(new Rectangle(35, 19, 282, 28));
			Add_movie_label.setText("Add Movie");
			Add_movie_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			movie_id_label = new JLabel();
			movie_id_label.setBounds(new Rectangle(35, 59, 97, 21));
			movie_id_label.setText("Movie ID");
			movie_id_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			movie_audio_label = new JLabel();
			movie_audio_label.setLocation(new Point(35, 205));
			movie_audio_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			movie_audio_label.setText("Audio");
			movie_audio_label.setSize(new Dimension(66, 21));
			movie_nation_label = new JLabel();
			movie_nation_label.setBounds(new Rectangle(35, 176, 73, 21));
			movie_nation_label.setText("Nation");
			movie_nation_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			movie_des_label = new JLabel();
			movie_des_label.setBounds(new Rectangle(34, 151, 116, 21));
			movie_des_label.setText("Description");
			movie_des_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			movie_engname_label = new JLabel();
			movie_engname_label.setBounds(new Rectangle(34, 121, 123, 21));
			movie_engname_label.setText("English Name");
			movie_engname_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			movie_thainame_label = new JLabel();
			movie_thainame_label.setLocation(new Point(34, 95));
			movie_thainame_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			movie_thainame_label.setText("Thai Name");
			movie_thainame_label.setSize(new Dimension(111, 21));
			movie_New = new JPanel();
			movie_New.setLayout(null);
			movie_New.setBackground(Color.white);
			movie_New.setBounds(new Rectangle(517, 183, 481, 566));
			movie_New.add(getNew_movieName(), null);
			movie_New.add(getNew_movieEngName(), null);
			movie_New.add(getNew_movieDes(), null);
			movie_New.add(movie_thainame_label, null);
			movie_New.add(movie_engname_label, null);
			movie_New.add(movie_des_label, null);
			movie_New.add(getNew_movieNation(), null);
			movie_New.add(movie_nation_label, null);
			movie_New.add(getNew_movieAudio(), null);
			movie_New.add(movie_audio_label, null);
			movie_New.add(getNewmovie_send(), null);
			movie_New.add(getNewmovie_clear(), null);
			movie_New.add(getNew_movieId(), null);
			movie_New.add(movie_id_label, null);
			movie_New.add(Add_movie_label, null);
			movie_New.add(movie_sub_label, null);
			movie_New.add(getNew_movieSub(), null);
			movie_New.add(movie_price_label, null);
			movie_New.add(getNew_moviePrice(), null);
			movie_New.add(movie_type_label, null);
			movie_New.add(getMovie_radio_action(), null);
			movie_New.add(action_Label2, null);
			movie_New.add(getMovie_radio_animation(), null);
			movie_New.add(getMovie_radio_adventure(), null);
			movie_New.add(animation_Label2, null);
			movie_New.add(adventure_Label2, null);
			movie_New.add(getMovie_radio_comedy(), null);
			movie_New.add(getMovie_radio_crime(), null);
			movie_New.add(getMovie_radio_drama(), null);
			movie_New.add(comedy_Label, null);
			movie_New.add(crime_Label2, null);
			movie_New.add(drama_Label2, null);
			movie_New.add(getMovie_radio_fantasy(), null);
			movie_New.add(getMovie_radio_horror(), null);
			movie_New.add(getMovie_radio_romantic(), null);
			movie_New.add(fantasy_Label2, null);
			movie_New.add(horror_Label2, null);
			movie_New.add(romantic_Label2, null);
			movie_New.add(getMovie_radio_scifi(), null);
			movie_New.add(getMovie_radio_series(), null);
			movie_New.add(scifi_Label2, null);
			movie_New.add(Series_Label2, null);
			movie_New.add(movie_screen_label, null);
			movie_New.add(getMovie_radio_fullscreen(), null);
			movie_New.add(fullscreen_Label, null);
			movie_New.add(getMovie_radio_widescreen(), null);
			movie_New.add(widescreen_Label, null);
			movie_New.setVisible(true);
			movie_New.add(movie_nation_label_Edit11, null);
			movie_New.add(getNew_moviepic(), null);
		}
		return movie_New;
	}

	/**
	 * This method initializes New_movieName	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_movieName() {
		if (New_movieName == null) {
			New_movieName = new JTextField();
			New_movieName.setBounds(new Rectangle(160, 97, 293, 25));
		}
		return New_movieName;
	}

	/**
	 * This method initializes New_movieEngName	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_movieEngName() {
		if (New_movieEngName == null) {
			New_movieEngName = new JTextField();
			New_movieEngName.setBounds(new Rectangle(160, 123, 293, 25));
		}
		return New_movieEngName;
	}

	/**
	 * This method initializes New_movieDes	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_movieDes() {
		if (New_movieDes == null) {
			New_movieDes = new JTextField();
			New_movieDes.setBounds(new Rectangle(160, 149, 293, 25));
		}
		return New_movieDes;
	}

	/**
	 * This method initializes New_movieNation	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_movieNation() {
		if (New_movieNation == null) {
			New_movieNation = new JTextField();
			New_movieNation.setBounds(new Rectangle(160, 175, 293, 25));
		}
		return New_movieNation;
	}

	/**
	 * This method initializes New_movieAudio	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_movieAudio() {
		if (New_movieAudio == null) {
			New_movieAudio = new JTextField();
			New_movieAudio.setBounds(new Rectangle(160, 202, 293, 25));
		}
		return New_movieAudio;
	}

	/**
	 * This method initializes newmovie_send	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getNewmovie_send() {
		if (newmovie_send == null) {
			newmovie_send = new JButton();
			newmovie_send.setBounds(new Rectangle(67, 509, 157, 40));
			newmovie_send.setText("Add Movie");
			newmovie_send.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			newmovie_send.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					String new_id= New_movieId.getText();
					String new_thainame = New_movieName.getText();
					String new_engname=New_movieEngName.getText();
					String new_des=New_movieDes.getText();
					String new_audio=New_movieAudio.getText();
					String new_sub=New_movieSub.getText();
					String new_price=New_moviePrice.getText();
					String new_nation=New_movieNation.getText();
					String new_moviepic = New_moviepic.getText();
					String new_screen = null;
					if (movie_radio_widescreen.isSelected()){
						new_screen="1";
						//System.out.println("newtype="+newtype);
					}
					else if (movie_radio_fullscreen.isSelected()){
						new_screen="2";
					}
					else if(new_screen==null){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					
					String new_type = null;
					if (movie_radio_action.isSelected()){
						new_type="1";
						//System.out.println("newtype="+newtype);
					}
					else if (movie_radio_adventure.isSelected()){
						new_type="2";
					}
					else if (movie_radio_animation.isSelected()){
						new_type="3";
					}
					else if (movie_radio_comedy.isSelected()){
						new_type="4";
					}
					else if (movie_radio_crime.isSelected()){
						new_type="5";
					}
					else if (movie_radio_drama.isSelected()){
						new_type="6";
					}
					else if (movie_radio_fantasy.isSelected()){
						new_type="7";
					}
					else if (movie_radio_horror.isSelected()){
						new_type="8";
					}
					else if (movie_radio_romantic.isSelected()){
						new_type="9";
					}
					else if (movie_radio_scifi.isSelected()){
						new_type="10";
					}
					else if (movie_radio_series.isSelected()){
						new_type="11";
					}
					else if(new_type==null){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					
					
					if (new_id.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_thainame.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_engname.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_des.equalsIgnoreCase(""))
					{
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_audio.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_sub.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_nation.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					}
					else if (new_price.equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Please insert all fields.");
					
					}
					else
					{
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
						pstmt = con.prepareStatement ("INSERT INTO MOVIES(MOVIE_ID,TITLE_TH,TITLE_EN,DESCRIPTION,NATION_NAME,SCREEN_ID,GENRE_ID,AUDIO,SUBTITLE,PRICE,MOVIEPIC) VALUES(\'"+new_id+"\'," +
								"\'"+new_thainame+"\',\'"+new_engname+"\',\'"+new_des+"\',\'"+new_nation+"\',\'"+new_screen+"\',\'"+new_type+"\',\'"+new_audio+"\',\'"+new_sub+"\',\'"+new_price+"\',\'"+new_moviepic+"\');");
						JOptionPane.showMessageDialog(null,"Insert successfully!");
						//System.out.println("ผ่านตรงนี้นะ");
						New_movieId.setText("");
						New_movieName.setText("");
						New_movieEngName.setText("");
						New_movieDes.setText("");
						New_movieAudio.setText("");
						New_movieSub.setText("");
						New_movieNation.setText("");
						New_moviePrice.setText("");
						New_moviepic.setText("");
						/*movie_radio_action.setSelected(false);
						movie_radio_animation.setSelected(false);
						movie_radio_adventure.setSelected(false);
						movie_radio_comedy.setSelected(false);
						movie_radio_crime.setSelected(false);
						movie_radio_drama.setSelected(false);
						movie_radio_fantasy.setSelected(false);
						movie_radio_horror.setSelected(false);
						movie_radio_romantic.setSelected(false);
						movie_radio_scifi.setSelected(false);
						movie_radio_series.setSelected(false);
						movie_radio_fullscreen.setSelected(false);
						movie_radio_widescreen.setSelected(false);	*/
						group.clearSelection();
						group2.clearSelection();
						
						rset = pstmt.executeQuery(); 	
									  
						rset.close();
						pstmt.close();
						con.close();
						}catch (Exception e){ 
								System.out.println(e.getMessage());
								// finally block
						}
						}
				}
			});
		}
		return newmovie_send;
	}

	/**
	 * This method initializes newmovie_clear	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getNewmovie_clear() {
		if (newmovie_clear == null) {
			newmovie_clear = new JButton();
			newmovie_clear.setBounds(new Rectangle(242, 509, 157, 40));
			newmovie_clear.setText("Clear Field");
			newmovie_clear.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			newmovie_clear.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					New_movieId.setText("");
					New_movieName.setText("");
					New_movieEngName.setText("");
					New_movieDes.setText("");
					New_movieNation.setText("");
					New_movieAudio.setText("");
					New_movieSub.setText("");
					New_moviePrice.setText("");
					/*movie_radio_action.setSelected(false);
					movie_radio_animation.setSelected(false);
					movie_radio_adventure.setSelected(false);
					movie_radio_comedy.setSelected(false);
					movie_radio_crime.setSelected(false);
					movie_radio_drama.setSelected(false);
					movie_radio_fantasy.setSelected(false);
					movie_radio_horror.setSelected(false);
					movie_radio_romantic.setSelected(false);
					movie_radio_scifi.setSelected(false);
					movie_radio_series.setSelected(false);
					movie_radio_fullscreen.setSelected(false);
					movie_radio_widescreen.setSelected(false);*/
					group.clearSelection();
					group2.clearSelection();
				}
			});
		}
		return newmovie_clear;
	}

	/**
	 * This method initializes New_movieId	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_movieId() {
		if (New_movieId == null) {
			New_movieId = new JTextField();
			New_movieId.setBounds(new Rectangle(160, 58, 293, 25));
			New_movieId.setEditable(true);
		}
		return New_movieId;
	}

	/**
	 * This method initializes New_movieSub	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_movieSub() {
		if (New_movieSub == null) {
			New_movieSub = new JTextField();
			New_movieSub.setBounds(new Rectangle(160, 229, 293, 25));
		}
		return New_movieSub;
	}

	/**
	 * This method initializes New_moviePrice	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_moviePrice() {
		if (New_moviePrice == null) {
			New_moviePrice = new JTextField();
			New_moviePrice.setBounds(new Rectangle(160, 255, 293, 25));
		}
		return New_moviePrice;
	}

	/**
	 * This method initializes movie_radio_action	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie_radio_action() {
		if (movie_radio_action == null) {
			movie_radio_action = new JRadioButton();
			movie_radio_action.setBounds(new Rectangle(127, 378, 21, 21));
			movie_radio_action.setBackground(Color.white);
			group2.add(movie_radio_action);
		}
		return movie_radio_action;
	}

	/**
	 * This method initializes movie_radio_animation	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie_radio_animation() {
		if (movie_radio_animation == null) {
			movie_radio_animation = new JRadioButton();
			movie_radio_animation.setBounds(new Rectangle(127, 406, 21, 21));
			movie_radio_animation.setBackground(Color.white);
			group2.add(movie_radio_animation);
		}
		return movie_radio_animation;
	}

	/**
	 * This method initializes movie_radio_adventure	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie_radio_adventure() {
		if (movie_radio_adventure == null) {
			movie_radio_adventure = new JRadioButton();
			movie_radio_adventure.setBounds(new Rectangle(127, 435, 21, 21));
			movie_radio_adventure.setBackground(Color.white);
			group2.add(movie_radio_adventure);
		}
		return movie_radio_adventure;
	}

	/**
	 * This method initializes movie_radio_comedy	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie_radio_comedy() {
		if (movie_radio_comedy == null) {
			movie_radio_comedy = new JRadioButton();
			movie_radio_comedy.setBounds(new Rectangle(216, 378, 21, 21));
			movie_radio_comedy.setBackground(Color.white);
			group2.add(movie_radio_comedy);
		}
		return movie_radio_comedy;
	}

	/**
	 * This method initializes movie_radio_crime	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie_radio_crime() {
		if (movie_radio_crime == null) {
			movie_radio_crime = new JRadioButton();
			movie_radio_crime.setBounds(new Rectangle(216, 407, 21, 21));
			movie_radio_crime.setBackground(Color.white);
			group2.add(movie_radio_crime);
		}
		return movie_radio_crime;
	}

	/**
	 * This method initializes movie_radio_drama	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie_radio_drama() {
		if (movie_radio_drama == null) {
			movie_radio_drama = new JRadioButton();
			movie_radio_drama.setBounds(new Rectangle(216, 436, 21, 21));
			movie_radio_drama.setBackground(Color.white);
			group2.add(movie_radio_drama);
		}
		return movie_radio_drama;
	}

	/**
	 * This method initializes movie_radio_fantasy	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie_radio_fantasy() {
		if (movie_radio_fantasy == null) {
			movie_radio_fantasy = new JRadioButton();
			movie_radio_fantasy.setBounds(new Rectangle(302, 378, 21, 21));
			movie_radio_fantasy.setBackground(Color.white);
			group2.add(movie_radio_fantasy);
		}
		return movie_radio_fantasy;
	}

	/**
	 * This method initializes movie_radio_horror	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie_radio_horror() {
		if (movie_radio_horror == null) {
			movie_radio_horror = new JRadioButton();
			movie_radio_horror.setBounds(new Rectangle(302, 407, 21, 21));
			movie_radio_horror.setBackground(Color.white);
			group2.add(movie_radio_horror);
		}
		return movie_radio_horror;
	}

	/**
	 * This method initializes movie_radio_romantic	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie_radio_romantic() {
		if (movie_radio_romantic == null) {
			movie_radio_romantic = new JRadioButton();
			movie_radio_romantic.setBounds(new Rectangle(302, 436, 21, 21));
			movie_radio_romantic.setBackground(Color.white);
			group2.add(movie_radio_romantic);
		}
		return movie_radio_romantic;
	}

	/**
	 * This method initializes movie_radio_scifi	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie_radio_scifi() {
		if (movie_radio_scifi == null) {
			movie_radio_scifi = new JRadioButton();
			movie_radio_scifi.setBounds(new Rectangle(397, 378, 21, 21));
			movie_radio_scifi.setBackground(Color.white);
			group2.add(movie_radio_scifi);
		}
		return movie_radio_scifi;
	}

	/**
	 * This method initializes movie_radio_series	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie_radio_series() {
		if (movie_radio_series == null) {
			movie_radio_series = new JRadioButton();
			movie_radio_series.setBounds(new Rectangle(397, 406, 21, 21));
			movie_radio_series.setBackground(Color.white);
			group2.add(movie_radio_series);
		}
		return movie_radio_series;
	}

	/**
	 * This method initializes movie_radio_fullscreen	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie_radio_fullscreen() {
		if (movie_radio_fullscreen == null) {
			movie_radio_fullscreen = new JRadioButton();
			movie_radio_fullscreen.setBounds(new Rectangle(127, 481, 21, 21));
			movie_radio_fullscreen.setBackground(Color.white);
			group.add(movie_radio_fullscreen);
		}
		return movie_radio_fullscreen;
	}

	/**
	 * This method initializes movie_radio_widescreen	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getMovie_radio_widescreen() {
		if (movie_radio_widescreen == null) {
			movie_radio_widescreen = new JRadioButton();
			movie_radio_widescreen.setBounds(new Rectangle(217, 479, 21, 21));
			movie_radio_widescreen.setBackground(Color.white);
			group.add(movie_radio_widescreen);
		}
		return movie_radio_widescreen;
	}

	/**
	 * This method initializes lyn2	
	 * 	
	 * @return java.lang.String	
	 */
	private String getLyn2() {
		if (lyn2 == null) {
			lyn2 = "bg/bg1.jpg";
		}
		return lyn2;
	}

	/**
	 * This method initializes New_moviepic_Edit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_moviepic_Edit() {
		if (New_moviepic_Edit == null) {
			New_moviepic_Edit = new JTextField();
			New_moviepic_Edit.setBounds(new Rectangle(162, 211, 293, 25));
		}
		return New_moviepic_Edit;
	}

	/**
	 * This method initializes New_moviepic	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_moviepic() {
		if (New_moviepic == null) {
			New_moviepic = new JTextField();
			New_moviepic.setBounds(new Rectangle(160, 282, 293, 25));
		}
		return New_moviepic;
	}

	/**
	 * This method initializes addorder_send1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAddorder_send1() {
		if (addorder_send1 == null) {
			addorder_send1 = new JButton();
			addorder_send1.setBounds(new Rectangle(31, 668, 214, 38));
			addorder_send1.setText("Back To Main Menu");
			addorder_send1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			addorder_send1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					MoviePage1.setVisible(false);
					Main_Page.setVisible(true);
					movie_Edit.setVisible(false);
				}
			});
		}
		return addorder_send1;
	}

	/**
	 * This method initializes Order_Manage_Page	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getOrder_Manage_Page() {
		if (Order_Manage_Page == null) {
			Sales_bg21 = new JLabel();
			Sales_bg21.setText("");
			Sales_bg21.setBounds(new Rectangle(0, 0, 1024, 768));
			Sales_bg21.setIcon(new ImageIcon("bg/bg1.jpg"));
			order_search_date_detail_label = new JLabel();
			order_search_date_detail_label.setBounds(new Rectangle(146, 343, 297, 16));
			order_search_date_detail_label.setForeground(new Color(205, 235, 255));
			order_search_date_detail_label.setText("Insert date format 'DD-MON-YYYY'");
			order_search_date_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			order_Search_date_Label = new JLabel();
			order_Search_date_Label.setBounds(new Rectangle(32, 315, 96, 18));
			order_Search_date_Label.setForeground(new Color(205, 235, 255));
			order_Search_date_Label.setText("By Date");
			order_Search_date_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			order_Search_firstname_Label = new JLabel();
			order_Search_firstname_Label.setBounds(new Rectangle(31, 260, 107, 28));
			order_Search_firstname_Label.setForeground(new Color(205, 235, 255));
			order_Search_firstname_Label.setText("By Member ID");
			order_Search_firstname_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			order_Search_id_Label = new JLabel();
			order_Search_id_Label.setBounds(new Rectangle(30, 211, 66, 28));
			order_Search_id_Label.setForeground(new Color(205, 235, 255));
			order_Search_id_Label.setText("By ID");
			order_Search_id_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
			order_search_name_detail_label = new JLabel();
			order_search_name_detail_label.setBounds(new Rectangle(146, 289, 229, 16));
			order_search_name_detail_label.setForeground(new Color(205, 235, 255));
			order_search_name_detail_label.setText("Insert at most 50 letters");
			order_search_name_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			order_search_detail_label = new JLabel();
			order_search_detail_label.setBounds(new Rectangle(30, 172, 494, 21));
			order_search_detail_label.setForeground(new Color(205, 235, 255));
			order_search_detail_label.setText("You can search by shelf id/shelf type");
			order_search_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			order_Search_Label = new JLabel();
			order_Search_Label.setBounds(new Rectangle(29, 135, 220, 28));
			order_Search_Label.setForeground(new Color(205, 235, 255));
			order_Search_Label.setText("Search Shelf");
			order_Search_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			order_search_id_detail_label = new JLabel();
			order_search_id_detail_label.setBounds(new Rectangle(146, 237, 235, 16));
			order_search_id_detail_label.setForeground(new Color(205, 235, 255));
			order_search_id_detail_label.setText("Insert only number 0-9 (2 digits)");
			order_search_id_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			order_Sort_Label = new JLabel();
			order_Sort_Label.setBounds(new Rectangle(29, 380, 231, 28));
			order_Sort_Label.setForeground(new Color(205, 235, 255));
			order_Sort_Label.setText("Show All Order");
			order_Sort_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			order_sort_detail_label = new JLabel();
			order_sort_detail_label.setBounds(new Rectangle(31, 431, 56, 16));
			order_sort_detail_label.setForeground(new Color(205, 235, 255));
			order_sort_detail_label.setText("sort by");
			order_sort_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			order_topic_label = new JLabel();
			order_topic_label.setBounds(new Rectangle(30, 43, 569, 79));
			order_topic_label.setForeground(new Color(235, 245, 255));
			order_topic_label.setText("Order Manager");
			order_topic_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 72));
			order_detail_label = new JLabel();
			order_detail_label.setBounds(new Rectangle(541, 172, 399, 21));
			order_detail_label.setForeground(new Color(205, 235, 255));
			order_detail_label.setText("insert shelf id to view or edit/update/delete shelf");
			order_detail_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			order_View_Label = new JLabel();
			order_View_Label.setBounds(new Rectangle(540, 135, 190, 28));
			order_View_Label.setForeground(new Color(205, 235, 255));
			order_View_Label.setText("Order Detail");
			order_View_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			Order_Manage_Page = new JPanel();
			Order_Manage_Page.setLayout(null);
			Order_Manage_Page.setBackground(Color.white);
			Order_Manage_Page.setBounds(new Rectangle(0, 0, 1024, 768));
			Order_Manage_Page.setVisible(false);
			Order_Manage_Page.add(getOrder_name_search(), null);
			Order_Manage_Page.add(getOrder_name_search_button(), null);
			Order_Manage_Page.add(getOrder_all_sort_id__button(), null);
			Order_Manage_Page.add(getOrder_Clear_All_Button(), null);
			Order_Manage_Page.add(getOrder_id_search(), null);
			Order_Manage_Page.add(getOrder_id_search_button(), null);
			Order_Manage_Page.add(getOrder_result_scroll(), null);
			Order_Manage_Page.add(getOrder_id_search_edit(), null);
			Order_Manage_Page.add(getOrder_edit_search_button(), null);
			Order_Manage_Page.add(order_View_Label, null);
			Order_Manage_Page.add(order_detail_label, null);
			Order_Manage_Page.add(order_topic_label, null);
			Order_Manage_Page.add(getOrder_all_sort_name__button(), null);
			Order_Manage_Page.add(order_sort_detail_label, null);
			Order_Manage_Page.add(order_Sort_Label, null);
			Order_Manage_Page.add(order_search_id_detail_label, null);
			Order_Manage_Page.add(order_Search_Label, null);
			Order_Manage_Page.add(order_search_detail_label, null);
			Order_Manage_Page.add(order_search_name_detail_label, null);
			Order_Manage_Page.add(order_Search_id_Label, null);
			Order_Manage_Page.add(order_Search_firstname_Label, null);
			Order_Manage_Page.add(getOrder_Edit(), null);
			Order_Manage_Page.add(getOrder_date_search(), null);
			Order_Manage_Page.add(getOrder_date_search_button(), null);
			Order_Manage_Page.add(order_Search_date_Label, null);
			Order_Manage_Page.add(order_search_date_detail_label, null);
			Order_Manage_Page.add(getOrder_all_sort_date__button(), null);
			Order_Manage_Page.add(getAddorder_send11(), null);
			Order_Manage_Page.add(Sales_bg21, null);
		}
		return Order_Manage_Page;
	}

	/**
	 * This method initializes order_name_search	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getOrder_name_search() {
		if (order_name_search == null) {
			order_name_search = new JTextField();
			order_name_search.setBounds(new Rectangle(146, 259, 211, 28));
			order_name_search.setBackground(new Color(235, 245, 255));
		}
		return order_name_search;
	}

	/**
	 * This method initializes order_name_search_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getOrder_name_search_button() {
		if (order_name_search_button == null) {
			order_name_search_button = new JButton();
			order_name_search_button.setBounds(new Rectangle(360, 259, 104, 28));
			order_name_search_button.setText("Search");
			order_name_search_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			order_name_search_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null;
					String id = (order_name_search.getText().toUpperCase());
					String name_search="     |- ORDER NO -| - DATE - | - MEMBER ID -|-- Full Name -- | -- Total -- |\n     =====================================================\n\n    ";
					String genre_id = null;
					order_result.setText("");
			     //ดักจับข้อผิดพลาด
					try {
			       //Registering the JDBC Drivers : MySQL
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
					  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
					  //Show all records in STUDENT table
					  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
					  pstmt = con.prepareStatement ("SELECT ORDER_NO,TO_CHAR(ORDER_DATE,\'DD-MON-YYYY\'),MEM_ID,MEM_NAME,MEM_LASTNAME,TOTALAMOUNT FROM ORDER_HEAD NATURAL JOIN MEMBERS WHERE MEM_ID LIKE \'"+id+"%\'");
					 //Executing a Query 
					  rset = pstmt.executeQuery(); 
					  //Processing the Result Set 
					  while (rset.next()) {
						//รับค่า String id จาก attribute ID
						  	genre_id = rset.getString("ORDER_NO");
							name_search=name_search+genre_id+"    ";
							String order_date = rset.getString("TO_CHAR(ORDER_DATE,\'DD-MON-YYYY\')");
							name_search=name_search+order_date+"    ";
							String mem_id = rset.getString("MEM_ID");
							name_search=name_search+mem_id+"    ";
							String mem_name = rset.getString("MEM_NAME");
							name_search=name_search+mem_name+" ";
							String mem_lastname = rset.getString("MEM_LASTNAME");
							name_search=name_search+mem_lastname+"    ";
							String totalamount = rset.getString("TOTALAMOUNT");
							name_search=name_search+df.format(Integer.parseInt(totalamount))+"\n    ";
						
						
					  }	
					  if (genre_id!=null){
						  order_result.setText(name_search);
					  }
					  else
					  {
						  order_result.setText(" Your Input is not match!!");
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
		return order_name_search_button;
	}

	/**
	 * This method initializes order_all_sort_id__button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getOrder_all_sort_id__button() {
		if (order_all_sort_id__button == null) {
			order_all_sort_id__button = new JButton();
			order_all_sort_id__button.setBounds(new Rectangle(104, 423, 116, 28));
			order_all_sort_id__button.setText("Order NO");
			order_all_sort_id__button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			order_all_sort_id__button
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e1) {
							Connection con = null;
							//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
							PreparedStatement pstmt = null;
							// ประกาศ rset เป็น instance ของคลาส ResultSet
							ResultSet rset = null;

							String name_search="     |- ORDER NO -| - DATE - | - MEMBER ID -|-- Full Name -- | -- Total -- |\n     =====================================================\n\n    ";
							order_result.setText("");
					     //ดักจับข้อผิดพลาด
							try {
					       //Registering the JDBC Drivers : MySQL
								Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
							  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
							  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
							  //Show all records in STUDENT table
							  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
							  pstmt = con.prepareStatement ("SELECT ORDER_NO,TO_CHAR(ORDER_DATE,\'DD-MON-YYYY\'),MEM_ID,MEM_NAME,MEM_LASTNAME,TOTALAMOUNT FROM ORDER_HEAD NATURAL JOIN MEMBERS ORDER BY ORDER_NO");
							 //Executing a Query 
							  rset = pstmt.executeQuery(); 
							  //Processing the Result Set 
							  while (rset.next()) {
								//รับค่า String id จาก attribute ID
								  	String genre_id = rset.getString("ORDER_NO");
									name_search=name_search+genre_id+"    ";
									String order_date = rset.getString("TO_CHAR(ORDER_DATE,\'DD-MON-YYYY\')");
									name_search=name_search+order_date+"    ";
									String mem_id = rset.getString("MEM_ID");
									name_search=name_search+mem_id+"    ";
									String mem_name = rset.getString("MEM_NAME");
									name_search=name_search+mem_name+" ";
									String mem_lastname = rset.getString("MEM_LASTNAME");
									name_search=name_search+mem_lastname+"    ";
									String totalamount = rset.getString("TOTALAMOUNT");
									name_search=name_search+df.format(Integer.parseInt(totalamount))+"\n    ";
								
							  }	
							order_result.setText(name_search);
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
		return order_all_sort_id__button;
	}

	/**
	 * This method initializes order_Clear_All_Button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getOrder_Clear_All_Button() {
		if (order_Clear_All_Button == null) {
			order_Clear_All_Button = new JButton();
			order_Clear_All_Button.setBounds(new Rectangle(247, 668, 214, 38));
			order_Clear_All_Button.setText("Clear All Search Field");
			order_Clear_All_Button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			order_Clear_All_Button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					order_id_search.setText("");
					order_name_search.setText("");
					order_date_search.setText("");
					order_result.setText("");
				}
			});
		}
		return order_Clear_All_Button;
	}

	/**
	 * This method initializes order_id_search	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getOrder_id_search() {
		if (order_id_search == null) {
			order_id_search = new JTextField(null, 4);
			order_id_search.setBounds(new Rectangle(146, 210, 211, 28));
			order_id_search.setBackground(new Color(235, 245, 255));
		}
		return order_id_search;
	}

	/**
	 * This method initializes order_id_search_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getOrder_id_search_button() {
		if (order_id_search_button == null) {
			order_id_search_button = new JButton();
			order_id_search_button.setBounds(new Rectangle(360, 210, 104, 28));
			order_id_search_button.setText("Search");
			order_id_search_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			order_id_search_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null;
					String id = (order_id_search.getText().toUpperCase());
					String name_search="     |- ORDER NO -| - DATE - | - MEMBER ID -|-- Full Name -- | -- Total -- |\n     =====================================================\n\n    ";
					String genre_id = null;
					order_result.setText("");
			     //ดักจับข้อผิดพลาด
					try {
			       //Registering the JDBC Drivers : MySQL
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
					  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
					  //Show all records in STUDENT table
					  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
					  pstmt = con.prepareStatement ("SELECT ORDER_NO,TO_CHAR(ORDER_DATE,\'DD-MON-YYYY\'),MEM_ID,MEM_NAME,MEM_LASTNAME,TOTALAMOUNT FROM ORDER_HEAD NATURAL JOIN MEMBERS WHERE ORDER_NO LIKE \'"+id+"%\'");
					 //Executing a Query 
					  rset = pstmt.executeQuery(); 
					  //Processing the Result Set 
					  while (rset.next()) {
						//รับค่า String id จาก attribute ID
						  	genre_id = rset.getString("ORDER_NO");
							name_search=name_search+genre_id+"    ";
							String order_date = rset.getString("TO_CHAR(ORDER_DATE,\'DD-MON-YYYY\')");
							name_search=name_search+order_date+"    ";
							String mem_id = rset.getString("MEM_ID");
							name_search=name_search+mem_id+"    ";
							String mem_name = rset.getString("MEM_NAME");
							name_search=name_search+mem_name+" ";
							String mem_lastname = rset.getString("MEM_LASTNAME");
							name_search=name_search+mem_lastname+"    ";
							String totalamount = rset.getString("TOTALAMOUNT");
							name_search=name_search+df.format(Integer.parseInt(totalamount))+"\n    ";
						
						
					  }	
					  if (genre_id!=null){
						  order_result.setText(name_search);
					  }
					  else
					  {
						  order_result.setText(" Your Input is not match!!");
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
		return order_id_search_button;
	}

	/**
	 * This method initializes order_result_scroll	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getOrder_result_scroll() {
		if (order_result_scroll == null) {
			order_result_scroll = new JScrollPane();
			order_result_scroll.setBounds(new Rectangle(31, 454, 431, 210));
			order_result_scroll.setViewportView(getOrder_result());
		}
		return order_result_scroll;
	}

	/**
	 * This method initializes order_result	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getOrder_result() {
		if (order_result == null) {
			order_result = new JTextArea();
			order_result.setBackground(new Color(235, 245, 255));
		}
		return order_result;
	}

	/**
	 * This method initializes order_id_search_edit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getOrder_id_search_edit() {
		if (order_id_search_edit == null) {
			order_id_search_edit = new JTextField();
			order_id_search_edit.setBounds(new Rectangle(508, 209, 244, 28));
			order_id_search_edit.setBackground(new Color(235, 245, 255));
		}
		return order_id_search_edit;
	}

	/**
	 * This method initializes order_edit_search_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getOrder_edit_search_button() {
		if (order_edit_search_button == null) {
			order_edit_search_button = new JButton();
			order_edit_search_button.setBounds(new Rectangle(756, 210, 93, 26));
			order_edit_search_button.setText("View");
			order_edit_search_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			order_edit_search_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null;
					
					String edit_member=null;
					edit_member= order_id_search_edit.getText();
					String temp = null;
					order_view_result.setText("");
					//System.out.println("Edit Member :"+edit_member);
					//ดักจับข้อผิดพลาด
					try {
			       //Registering the JDBC Drivers : MySQL
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
					  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
					  //Show all records in STUDENT table
					  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
					  
					  //Processing the Result Set 
					  String order_id = null;
					  String order_date = null;
					  String order_memId = null;
					  String order_name = null;
					  String order_memLastName = null;
					  String order_totalamount = null;
					 // String order_saleId = null;
					 // String order_saleName = null;
					 // String order_saleLastName = null;
					  temp = " |- MOVIE ID -|-- THAI NAME --|-- ENG NAME -- | - UNIT - | - PRICE - | - TOTAL - |\n     =====================================================\n\n    ";
					  order_view_result.setText(temp);
					  temp=null;
					  pstmt = con.prepareStatement ("SELECT ORDER_NO,TO_CHAR(ORDER_DATE,\'DD-MON-YYYY\'),MEM_ID,MEM_NAME,MEM_LASTNAME,TOTALAMOUNT FROM ORDER_HEAD NATURAL JOIN MEMBERS WHERE ORDER_NO=\'"+edit_member+"\'");
						 //Executing a Query 
						  rset = pstmt.executeQuery(); 

					  while (rset.next()) {
							//รับค่า String id จาก attribute ID
						  order_id = rset.getString("ORDER_NO");
						  order_date = rset.getString("TO_CHAR(ORDER_DATE,\'DD-MON-YYYY\')");
						  order_memId = rset.getString("MEM_ID");
						  order_name = rset.getString("MEM_NAME");
						  order_memLastName = rset.getString("MEM_LASTNAME");
						  order_totalamount = rset.getString("TOTALAMOUNT");
						  
						  //order_saleId = rset.getString("SALE_ID");
						  //order_saleName = rset.getString("SALE_NAME");
						  //order_saleLastName = rset.getString("SALE_LASTNAME");
			
							
					 }	
					  
					  if (order_id!=null){
					  
					  String order_saleId = null;
					  String order_saleName = null;
					  String order_saleLastName = null;
					  
					  //System.out.println("ผ่านตรงนี้ไม๊");
					  pstmt = con.prepareStatement ("SELECT * FROM ORDER_HEAD NATURAL JOIN SALE WHERE ORDER_NO=\'"+edit_member+"\'");
						 //Executing a Query 
						  rset = pstmt.executeQuery(); 

					  while (rset.next()) {
							//รับค่า String id จาก attribute ID
						 // order_id = rset.getString("ORDER_NO");
						//  order_memId = rset.getString("MEM_ID");
						//  order_name = rset.getString("MEM_NAME");
						  order_saleId = rset.getString("SALE_ID");
						  order_saleName = rset.getString("SALE_NAME");
						  order_saleLastName = rset.getString("SALE_LASTNAME");
					 }
					  
					  String movie_id=null;
					  //System.out.println(order_id);
					  pstmt = con.prepareStatement ("SELECT * FROM ORDER_DATA NATURAL JOIN MOVIES WHERE ORDER_NO=\'"+edit_member+"\'");
						 //Executing a Query 
						  rset = pstmt.executeQuery(); 

					  while (rset.next()) {
							//รับค่า String id จาก attribute ID
						 // order_id = rset.getString("ORDER_NO");
						//  order_memId = rset.getString("MEM_ID");
						//  order_name = rset.getString("MEM_NAME");
						  movie_id = rset.getString("MOVIE_ID");
						  
					 }
					  //System.out.println("edit_memId"+edit_member);
					  //System.out.println("edit_memId"+order_memId);
					  //System.out.println("edit_memId"+movie_id);
					  pstmt = con.prepareStatement ("SELECT * FROM ORDER_DATA,MOVIES WHERE ((ORDER_DATA.ORDER_NO=\'"+edit_member+"\' AND ORDER_DATA.MEM_ID=\'"+order_memId+"\') AND (ORDER_DATA.MOVIE_ID=\'"+movie_id+"\' AND MOVIES.MOVIE_ID=\'"+movie_id+"\'))");
					  //pstmt = con.prepareStatement ("SELECT * FROM ORDER_DATA,MOVIES WHERE (ORDER_DATA.ORDER_NO=\'"+edit_member+"\' AND ORDER_DATA.MEM_ID=\'"+order_memId+"\')");
						 //Executing a Query 
						  rset = pstmt.executeQuery(); 
						  //Processing the Result Set 
						  while (rset.next()) {
							 if (temp==(null)){
								 temp="";
							 }
							//รับค่า String id จาก attribute ID
							movie_id = rset.getString("MOVIE_ID");
							//System.out.println("movie_id "+movie_id);
							temp=temp+movie_id+"  ";
							String movie_thname = rset.getString("TITLE_TH");
							//System.out.println("TITLE_TH "+movie_thname);
							temp=temp+movie_thname+"  ";
							String movie_enname = rset.getString("TITLE_EN");
							//System.out.println("TITLE_EN "+movie_enname);
							temp=temp+movie_enname+"  ";
							String order_unit = rset.getString("UNIT");
							//System.out.println("UNIT "+order_unit);
							temp=temp+order_unit+"  ";
							String order_price = rset.getString("PRICE");
							//System.out.println("PRICE "+order_price);
							temp=temp+df.format(Integer.parseInt(order_price))+"  ";
							String order_total = rset.getString("TOTALPERMOVIE");
							//System.out.println("TOTALPERMOVIE "+order_total);
							temp=temp+df.format(Integer.parseInt(order_total))+"\n  ";
							order_view_result.append(temp);
							
						  }	
					  
						  //System.out.println("ผ่านตรงนี้ไม๊");
					 
						  order_Edit.setVisible(true);
						  order_id_label1.setText(order_id);
						  New_order_date_edit.setText(order_date);
						  New_mem_id_edit.setText(order_memId);
						  New_sale_id_edit.setText(order_saleId);
						  New_sale_name_edit.setText(order_saleName + " "+order_saleLastName);
						  New_mem_name_edit.setText(order_name+" "+order_memLastName);
						  total_amount_text.setText(df.format(Integer.parseInt(order_totalamount)));
						  //order_view_result.setText(temp);
						  order_Edit.setVisible(true);
						  
					  }
					  else
					  {
						  JOptionPane.showMessageDialog(null, "Your order id is not match!!");
						  order_Edit.setVisible(false);
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
		return order_edit_search_button;
	}

	/**
	 * This method initializes order_all_sort_name__button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getOrder_all_sort_name__button() {
		if (order_all_sort_name__button == null) {
			order_all_sort_name__button = new JButton();
			order_all_sort_name__button.setBounds(new Rectangle(223, 423, 116, 28));
			order_all_sort_name__button.setText("Member ID");
			order_all_sort_name__button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			order_all_sort_name__button
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e1) {
							Connection con = null;
							//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
							PreparedStatement pstmt = null;
							// ประกาศ rset เป็น instance ของคลาส ResultSet
							ResultSet rset = null;

							String name_search="     |- ORDER NO -| - DATE - | - MEMBER ID -|-- Full Name -- | -- Total -- |\n     =====================================================\n\n    ";
							order_result.setText("");
					     //ดักจับข้อผิดพลาด
							try {
					       //Registering the JDBC Drivers : MySQL
								Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
							  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
							  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
							  //Show all records in STUDENT table
							  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
							  pstmt = con.prepareStatement ("SELECT ORDER_NO,TO_CHAR(ORDER_DATE,\'DD-MON-YYYY\'),MEM_ID,MEM_NAME,MEM_LASTNAME,TOTALAMOUNT FROM ORDER_HEAD NATURAL JOIN MEMBERS ORDER BY MEM_ID");
							 //Executing a Query 
							  rset = pstmt.executeQuery(); 
							  //Processing the Result Set 
							  while (rset.next()) {
								//รับค่า String id จาก attribute ID
								  	String genre_id = rset.getString("ORDER_NO");
									name_search=name_search+genre_id+"    ";
									String order_date = rset.getString("TO_CHAR(ORDER_DATE,\'DD-MON-YYYY\')");
									name_search=name_search+order_date+"    ";
									String mem_id = rset.getString("MEM_ID");
									name_search=name_search+mem_id+"    ";
									String mem_name = rset.getString("MEM_NAME");
									name_search=name_search+mem_name+" ";
									String mem_lastname = rset.getString("MEM_LASTNAME");
									name_search=name_search+mem_lastname+"    ";
									String totalamount = rset.getString("TOTALAMOUNT");
									name_search=name_search+df.format(Integer.parseInt(totalamount))+"\n    ";
								
							  }	
							order_result.setText(name_search);
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
		return order_all_sort_name__button;
	}

	/**
	 * This method initializes order_Edit	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getOrder_Edit() {
		if (order_Edit == null) {
			order_sale_name_label_edit1 = new JLabel();
			order_sale_name_label_edit1.setBounds(new Rectangle(33, 306, 65, 21));
			order_sale_name_label_edit1.setText("Total");
			order_sale_name_label_edit1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			order_date_label_edit = new JLabel();
			order_date_label_edit.setBounds(new Rectangle(33, 63, 117, 21));
			order_date_label_edit.setText("Order Date");
			order_date_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			order_sale_name_label_edit = new JLabel();
			order_sale_name_label_edit.setBounds(new Rectangle(33, 188, 121, 21));
			order_sale_name_label_edit.setText("Sale Name");
			order_sale_name_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			order_sale_id_label_edit = new JLabel();
			order_sale_id_label_edit.setBounds(new Rectangle(33, 158, 89, 21));
			order_sale_id_label_edit.setText("Sale ID");
			order_sale_id_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			order_mem_id_label_edit = new JLabel();
			order_mem_id_label_edit.setBounds(new Rectangle(33, 126, 159, 21));
			order_mem_id_label_edit.setText("Member Name");
			order_mem_id_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			order_id_label1 = new JLabel();
			order_id_label1.setBounds(new Rectangle(202, 17, 191, 28));
			order_id_label1.setForeground(Color.red);
			order_id_label1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			order_label = new JLabel();
			order_label.setBounds(new Rectangle(34, 17, 112, 28));
			order_label.setText("Order");
			order_label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 24));
			order_id_label_edit = new JLabel();
			order_id_label_edit.setBounds(new Rectangle(33, 94, 97, 21));
			order_id_label_edit.setText("Member ID");
			order_id_label_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			order_Edit = new JPanel();
			order_Edit.setLayout(null);
			order_Edit.setBounds(new Rectangle(509, 247, 482, 410));
			order_Edit.setBackground(new Color(235, 245, 255));
			order_Edit.add(getNew_mem_id_edit(), null);
			order_Edit.add(order_id_label_edit, null);
			order_Edit.add(getAddorder_Back_Button_Edit(), null);
			order_Edit.add(getOrder_delete_edit(), null);
			order_Edit.add(order_label, null);
			order_Edit.add(order_id_label1, null);
			order_Edit.add(getOrder_view_scroll(), null);
			order_Edit.add(order_mem_id_label_edit, null);
			order_Edit.add(order_sale_id_label_edit, null);
			order_Edit.add(order_sale_name_label_edit, null);
			order_Edit.add(getNew_mem_name_edit(), null);
			order_Edit.add(getNew_sale_id_edit(), null);
			order_Edit.add(getNew_sale_name_edit(), null);
			order_Edit.add(getNew_order_date_edit(), null);
			order_Edit.add(order_date_label_edit, null);
			order_Edit.setVisible(false);
			order_Edit.add(order_sale_name_label_edit1, null);
			order_Edit.add(getTotal_amount_text(), null);
		}
		return order_Edit;
	}

	/**
	 * This method initializes New_mem_id_edit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_mem_id_edit() {
		if (New_mem_id_edit == null) {
			New_mem_id_edit = new JTextField();
			New_mem_id_edit.setBounds(new Rectangle(202, 91, 242, 25));
			New_mem_id_edit.setText("");
			New_mem_id_edit.setEditable(false);
			New_mem_id_edit.setVisible(true);
		}
		return New_mem_id_edit;
	}

	/**
	 * This method initializes Addorder_Back_Button_Edit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAddorder_Back_Button_Edit() {
		if (Addorder_Back_Button_Edit == null) {
			Addorder_Back_Button_Edit = new JButton();
			Addorder_Back_Button_Edit.setBounds(new Rectangle(255, 350, 100, 40));
			Addorder_Back_Button_Edit.setText("Back");
			Addorder_Back_Button_Edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			Addorder_Back_Button_Edit
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							order_Edit.setVisible(false);
						}
					});
		}
		return Addorder_Back_Button_Edit;
	}

	/**
	 * This method initializes order_delete_edit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getOrder_delete_edit() {
		if (order_delete_edit == null) {
			order_delete_edit = new JButton();
			order_delete_edit.setBounds(new Rectangle(140, 350, 100, 40));
			order_delete_edit.setText("Delete");
			order_delete_edit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			order_delete_edit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					String new_id=order_id_label1.getText();
					int ch=0;
					

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
						  ch = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete?",JOptionPane.YES_NO_OPTION);
						  if (ch!=1){
							 // System.out.println("new_id "+new_id);
							  pstmt = con.prepareStatement ("DELETE FROM ORDER_HEAD WHERE ORDER_NO=\'+"+new_id+"\'");
							  pstmt.executeUpdate();
							  pstmt = con.prepareStatement ("DELETE FROM ORDER_DATA WHERE ORDER_NO=\'+"+new_id+"\'");
							  pstmt.executeUpdate();
							  JOptionPane.showMessageDialog(null, "Delete Complete!!");
						  }
						  
							order_Edit.setVisible(false);
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
		return order_delete_edit;
	}

	/**
	 * This method initializes order_view_scroll	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getOrder_view_scroll() {
		if (order_view_scroll == null) {
			order_view_scroll = new JScrollPane();
			order_view_scroll.setBounds(new Rectangle(30, 227, 420, 67));
			order_view_scroll.setViewportView(getOrder_view_result());
		}
		return order_view_scroll;
	}

	/**
	 * This method initializes order_view_result	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getOrder_view_result() {
		if (order_view_result == null) {
			order_view_result = new JTextArea();
		}
		return order_view_result;
	}

	/**
	 * This method initializes New_mem_name_edit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_mem_name_edit() {
		if (New_mem_name_edit == null) {
			New_mem_name_edit = new JTextField();
			New_mem_name_edit.setBounds(new Rectangle(202, 122, 242, 25));
			New_mem_name_edit.setText("");
			New_mem_name_edit.setEditable(false);
			New_mem_name_edit.setVisible(true);
		}
		return New_mem_name_edit;
	}

	/**
	 * This method initializes New_sale_id_edit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_sale_id_edit() {
		if (New_sale_id_edit == null) {
			New_sale_id_edit = new JTextField();
			New_sale_id_edit.setBounds(new Rectangle(202, 154, 242, 25));
			New_sale_id_edit.setText("");
			New_sale_id_edit.setEditable(false);
			New_sale_id_edit.setVisible(true);
		}
		return New_sale_id_edit;
	}

	/**
	 * This method initializes New_sale_name_edit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_sale_name_edit() {
		if (New_sale_name_edit == null) {
			New_sale_name_edit = new JTextField();
			New_sale_name_edit.setBounds(new Rectangle(202, 185, 242, 25));
			New_sale_name_edit.setText("");
			New_sale_name_edit.setEditable(false);
			New_sale_name_edit.setVisible(true);
		}
		return New_sale_name_edit;
	}

	/**
	 * This method initializes New_order_date_edit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getNew_order_date_edit() {
		if (New_order_date_edit == null) {
			New_order_date_edit = new JTextField();
			New_order_date_edit.setBounds(new Rectangle(202, 61, 242, 25));
			New_order_date_edit.setText("");
			New_order_date_edit.setEditable(false);
			New_order_date_edit.setVisible(true);
		}
		return New_order_date_edit;
	}

	/**
	 * This method initializes order_date_search	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getOrder_date_search() {
		if (order_date_search == null) {
			order_date_search = new JTextField();
			order_date_search.setBounds(new Rectangle(147, 310, 211, 28));
			order_date_search.setBackground(new Color(235, 245, 255));
		}
		return order_date_search;
	}

	/**
	 * This method initializes order_date_search_button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getOrder_date_search_button() {
		if (order_date_search_button == null) {
			order_date_search_button = new JButton();
			order_date_search_button.setBounds(new Rectangle(360, 310, 104, 28));
			order_date_search_button.setText("Search");
			order_date_search_button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			order_date_search_button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e1) {
					Connection con = null;
					//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
					PreparedStatement pstmt = null;
					// ประกาศ rset เป็น instance ของคลาส ResultSet
					ResultSet rset = null;
					String id = (order_date_search.getText().toUpperCase());
					
					String name_search="     |- ORDER NO -| - DATE - | - MEMBER ID -|-- Full Name -- | -- Total -- |\n     =====================================================\n\n    ";
					String genre_id = null;
					order_result.setText("");
			     //ดักจับข้อผิดพลาด
					try {
			       //Registering the JDBC Drivers : MySQL
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
					  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
					  //Show all records in STUDENT table
					  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
					  pstmt = con.prepareStatement ("SELECT * FROM ORDER_HEAD NATURAL JOIN MEMBERS WHERE ORDER_DATE=TO_DATE(\'"+id+"\',\'DD-MON-YYYY\')");
					 //Executing a Query 
					  rset = pstmt.executeQuery(); 
					  //Processing the Result Set 
					  while (rset.next()) {
						//รับค่า String id จาก attribute ID
						  	genre_id = rset.getString("ORDER_NO");
							name_search=name_search+genre_id+"    ";
							String order_date = id;
							name_search=name_search+order_date+"    ";
							String mem_id = rset.getString("MEM_ID");
							name_search=name_search+mem_id+"    ";
							String mem_name = rset.getString("MEM_NAME");
							name_search=name_search+mem_name+" ";
							String mem_lastname = rset.getString("MEM_LASTNAME");
							name_search=name_search+mem_lastname+"    ";
							String totalamount = rset.getString("TOTALAMOUNT");
							name_search=name_search+df.format(Integer.parseInt(totalamount))+"\n    ";
						
						
					  }	
					  if (genre_id!=null){
						  order_result.setText(name_search);
					  }
					  else
					  {
						  order_result.setText(" Your Input is not match!!");
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
		return order_date_search_button;
	}

	/**
	 * This method initializes order_all_sort_date__button	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getOrder_all_sort_date__button() {
		if (order_all_sort_date__button == null) {
			order_all_sort_date__button = new JButton();
			order_all_sort_date__button.setBounds(new Rectangle(342, 423, 116, 28));
			order_all_sort_date__button.setText("Order Date");
			order_all_sort_date__button.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
			order_all_sort_date__button
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e1) {
							
								Connection con = null;
								//  ประกาศ pstmt เป็น instance ของคลาส PreparedStatement
								PreparedStatement pstmt = null;
								// ประกาศ rset เป็น instance ของคลาส ResultSet
								ResultSet rset = null;

								String name_search="     |- ORDER NO -| - DATE - | - MEMBER ID -|-- Full Name -- | -- Total -- |\n     =====================================================\n\n    ";
								order_result.setText("");
						     //ดักจับข้อผิดพลาด
								try {
						       //Registering the JDBC Drivers : MySQL
									Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
								  //Opening a Connection to a Database ชื่อ cp212 ,user : cp212,password : cp2122550
								  con = DriverManager.getConnection("jdbc:odbc:oracle","proj6","oracle");
								  //Show all records in STUDENT table
								  //Creating a Statement Object   เพื่อดูข้อมูลทั้งหมดของตาราง STUDENT
								  pstmt = con.prepareStatement ("SELECT ORDER_NO,TO_CHAR(ORDER_DATE,\'DD-MON-YYYY\'),MEM_ID,MEM_NAME,MEM_LASTNAME,TOTALAMOUNT FROM ORDER_HEAD NATURAL JOIN MEMBERS ORDER BY ORDER_HEAD.ORDER_DATE");
								  
								  //Executing a Query 
								  rset = pstmt.executeQuery(); 
								  //Processing the Result Set 
								  while (rset.next()) {
									//รับค่า String id จาก attribute ID
									  	String genre_id = rset.getString("ORDER_NO");
										name_search=name_search+genre_id+"    ";
										String order_date = rset.getString("TO_CHAR(ORDER_DATE,\'DD-MON-YYYY\')");
										name_search=name_search+order_date+"    ";
										String mem_id = rset.getString("MEM_ID");
										name_search=name_search+mem_id+"    ";
										String mem_name = rset.getString("MEM_NAME");
										name_search=name_search+mem_name+" ";
										String mem_lastname = rset.getString("MEM_LASTNAME");
										name_search=name_search+mem_lastname+"    ";
										String totalamount = rset.getString("TOTALAMOUNT");
										name_search=name_search+df.format(Integer.parseInt(totalamount))+"\n    ";
									
								  }	
								order_result.setText(name_search);
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
		return order_all_sort_date__button;
	}

	/**
	 * This method initializes addorder_send11	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAddorder_send11() {
		if (addorder_send11 == null) {
			addorder_send11 = new JButton();
			addorder_send11.setBounds(new Rectangle(776, 668, 214, 38));
			addorder_send11.setText("Back To Main Menu");
			addorder_send11.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			addorder_send11.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Order_Manage_Page.setVisible(false);
					Main_Page.setVisible(true);
				}
			});
		}
		return addorder_send11;
	}

	/**
	 * This method initializes total_amount_text	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTotal_amount_text() {
		if (total_amount_text == null) {
			total_amount_text = new JTextField();
			total_amount_text.setBounds(new Rectangle(203, 302, 242, 25));
			total_amount_text.setText("");
			total_amount_text.setEditable(false);
			total_amount_text.setForeground(new Color(255, 0, 51));
			total_amount_text.setFont(new Font("Dialog", Font.PLAIN, 14));
			total_amount_text.setVisible(true);
		}
		return total_amount_text;
	}

	/**
	 * This method initializes result_scoll	
	 * 	
	 * @return javax.swing.JScrollBar	
	 */

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */

}  //  @jve:decl-index=0:visual-constraint="-593,1606"
