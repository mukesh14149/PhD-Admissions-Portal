package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.scene.shape.Path;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Controller implements Initializable {
	
	static int cv=0,sop=0;;
	@FXML
    private Label label;
	 @FXML
	    private TextField Email;

	    @FXML
	    private RadioButton Category_sc;

	    @FXML
	    private TextField Address;

	    @FXML
	    private TextField tenth_marks;

	    @FXML
	    private ComboBox<String> pg_state;

	    @FXML
	    private TextArea achievement;

	    @FXML
	    private ToggleGroup children_toggle;

	    @FXML
	    private TextField name_of_uni;

	    @FXML
	    private TextField permanent_address;

	    @FXML
	    private RadioButton children_yes;

	    @FXML
	    private TextField Name;

	    @FXML
	    private RadioButton children_no;

	    @FXML
	    private TextField pg_marks;

	    @FXML
	    private ToggleGroup phd_toggle;

	    @FXML
	    private RadioButton phd_CB;

	    @FXML
	    private DatePicker DOB;

	    @FXML
	    private TextField cgpa_text;

	    @FXML
	    private ComboBox<String> state;

	    @FXML
	    private TextField exam_name;

	    @FXML
	    private TextField pg_college;

	    @FXML
	    private TextField pg_department;

	    @FXML
	    private RadioButton phd_CS;

	    @FXML
	    private TextField twelth_marks;

	    @FXML
	    private ToggleGroup gender_toggle;

	    @FXML
	    private ToggleGroup cgpa_marks;

	    @FXML
	    private TextField degree;

	    @FXML
	    private TextField twelth_board;

	    @FXML
	    private TitledPane title1;

	    @FXML
	    private CheckBox title1_handle;
	    
	    @FXML
	    private CheckBox title3_handle;
	    
	    @FXML
	    private CheckBox title4_handle;

	    @FXML
	    private TitledPane title2;

	    @FXML
	    private TitledPane title3;

	    @FXML
	    private TitledPane title4;

	    @FXML
	    private RadioButton Category_st;

	    @FXML
	    private TextField tenth_board;

	    @FXML
	    private ComboBox<String> nationality;

	    @FXML
	    private TextField father_name;

	    @FXML
	    private ComboBox<String> twelvth_year_passing;

	    @FXML
	    private ToggleGroup physically_disabled_toggle;

	    @FXML
	    private RadioButton Category_general;

	    @FXML
	    private RadioButton gender_female;

	    @FXML
	    private TextField city;

	    @FXML
	    private TextField pg_title;

	    @FXML
	    private TextField pin_code;

	    @FXML
	    private Label cv_label;

	    @FXML
	    private TextField mobile_no;

	    @FXML
	    private ComboBox<String> pg_division;

	    @FXML
	    private TextField pg_degree;

	    @FXML
	    private ToggleGroup number1;

	    @FXML
	    private RadioButton phd_ECE;

	    @FXML
	    private ComboBox<String> gate_year;

	    @FXML
	    private ComboBox<String> Pref3;

	    @FXML
	    private ComboBox<String> Pref4;

	    @FXML
	    private ComboBox<String> phd_ref1;

	    @FXML
	    private ComboBox<String> phd_ref2;

	    @FXML
	    private ComboBox<String> Pref1;

	    @FXML
	    private ComboBox<String> phd_ref3;

	    @FXML
	    private ComboBox<String> Pref2;

	    @FXML
	    private TextField pg_city;

	    @FXML
	    private TextField gate_rank;

	    @FXML
	    private ComboBox<String> cgpa_combo;

	    @FXML
	    private TextField name_of_clg;

	    @FXML
	    private TextField department;

	    @FXML
	    private Label sop_label;

	    @FXML
	    private ComboBox<String> exam_year;

	    @FXML
	    private TextField Enrollment_no;

	    @FXML
	    private TextField marks_text;

	    @FXML
	    private ComboBox<String> year_of_graduation;

	    @FXML
	    private RadioButton physically_disabled_yes;

	    @FXML
	    private CheckBox title2_handle;

	    @FXML
	    private TextField gate_score;

	    @FXML
	    private RadioButton marks;

	    @FXML
	    private RadioButton gender_male;

	    @FXML
	    private TextField gate_area;

	    @FXML
	    private RadioButton physically_disabled_no;

	    @FXML
	    private TextField gate_marks;

	    @FXML
	    private Button CV;

	    @FXML
	    private TextField exam_score;

	    @FXML
	    private ComboBox<String> pg_year;

	    @FXML
	    private TextField exam_rank;

	    @FXML
	    private Button SOP;

	    @FXML
	    private Button personal_save1;

	    @FXML
	    private RadioButton Category_obc;

	    @FXML
	    private TextField exam_subject;

	    @FXML
	    private RadioButton cgpa;
	    @FXML
	    private RadioButton cgpa1;
	    @FXML
	    private RadioButton  marks1;

	    @FXML
	    private TextField pg_cgpa;

	    @FXML
	    private ToggleGroup category_toggle;

	    @FXML
	    private ComboBox<String> ten_year_passing;
    
    
    
    int t1=0;
    @FXML
    void title1_handle(ActionEvent event) {
		if(t1==0)
		{
			title1.setDisable(false);
			title1.setExpanded(true);
			title1.setPrefHeight(300);
			t1 = 1;
		}
		else
		{
			title1.setDisable(true);
			title1.setExpanded(false);
			title1.setPrefHeight(0);
			t1=0;
		}
    }
    int t2=0;
    @FXML
    void title2_handle(ActionEvent event) {
    	
    	if(t2==0)
		{
			title2.setDisable(false);
			title2.setExpanded(true);
			title2.setPrefHeight(900);
			t2 = 1;
		}
		else
		{
			title2.setDisable(true);
			title2.setExpanded(false);
			title2.setPrefHeight(0);
			t2=0;
		}
    }

    

    int t3=0;
    @FXML
    void title3_handle(ActionEvent event) {
    	if(t3==0)
		{
			title3.setDisable(false);
			title3.setExpanded(true);
			title3.setPrefHeight(300);
			t3 = 1;
		}
		else
		{
			title3.setDisable(true);
			title3.setExpanded(false);
			title3.setPrefHeight(0);
			t3=0;
		}
    }

    int t4=0;
    @FXML
    void title4_handle(ActionEvent event) {
    	if(t4==0)
		{
			title4.setDisable(false);
			title4.setExpanded(true);
			title4.setPrefHeight(300);
			t4 = 1;
		}
		else
		{
			title4.setDisable(true);
			title4.setExpanded(false);
			title4.setPrefHeight(0);
			t4=0;
		}
    }
   
    @FXML
    void marks_disable1(ActionEvent event) {
    		//System.out.println("jek");
    		pg_marks.setDisable(true);
    		pg_cgpa.setDisable(false);
    }

    @FXML
    void cgpa_disable1(ActionEvent event) {
    	pg_cgpa.setDisable(true);
    	pg_marks.setDisable(false);
    }
    
    @FXML
    void SOP_handle(ActionEvent event) {

    }

    
    
    @FXML
    void upload(ActionEvent event) throws IOException {
    	 FileChooser chooser = new FileChooser();
    	    chooser.setTitle("Open File");
    	    File file = chooser.showOpenDialog(new Stage());
    	    System.out.println(file.getAbsolutePath());
    	    File file2=new File("/home/mukesh/coding_stuff/Java_Project/src/upload_cv/abc"+cv+".pdf");
    	    Files.copy(file.toPath(),file2.toPath() );
    	    cv++;
    	    
    	    
    }
    @FXML
    void upload1(ActionEvent event) throws IOException {
    	 FileChooser chooser = new FileChooser();
    	    chooser.setTitle("Open File");
    	    File file = chooser.showOpenDialog(new Stage());
    	    System.out.println(file.getAbsolutePath());
    	    File file2=new File("/home/mukesh/coding_stuff/Java_Project/src/upload_sop/abc"+sop+".pdf");
    	    Files.copy(file.toPath(),file2.toPath() );
    	    sop++;
    	    
    }


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		Enrollment_no.setDisable(true);	
		phd_ref1.getItems().addAll("Information Security"," VLSI"," Image Processing"," Mobile Computing","Compilers","BioSimulations");
			phd_ref1.setValue(null);
			phd_ref2.getItems().addAll("Data Processing","Distributed Systems","Data Processing","VLSI","Embedded Systems","Mathematical Biology","Embedded Systems");
			phd_ref2.setValue(null);
			phd_ref3.getItems().addAll("Mobile Computing","Embedded System","Molecular Biology","Embedded System");
			phd_ref3.setValue(null);
			nationality.getItems().addAll("Indian","Saudi","French","Pakistani","Nepalese");
			nationality.setValue(null);
			twelvth_year_passing.getItems().addAll("2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012");
			twelvth_year_passing.setValue(null);
			ten_year_passing.getItems().addAll("2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012");
			ten_year_passing.setValue(null);
			state.getItems().addAll("Delhi","Andhra Pradesh","Uttar Pradesh","Maharashtra","Madhya Pradesh","West Bengal","Tamil Nadu","Jharkhand","Karnataka");
			state.setValue(null);
			year_of_graduation.getItems().addAll("2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015");
			year_of_graduation.setValue(null);
			Pref1.getItems().addAll("BioSimulations"," Information Security"," VLSI"," Image Processing"," Mobile Computing","Compilers","BioSimulations");
			Pref1.setValue(null);
			Pref2.getItems().addAll("BioSimulations","Data Processing","Distributed Systems","Data Processing","VLSI","Embedded Systems","Mathematical Biology","Embedded Systems");
			Pref2.setValue(null);
			Pref3.getItems().addAll("BioSimulations","Mobile Computing","Embedded System","Molecular Biology","Embedded System");
			Pref3.setValue(null);
			Pref4.getItems().addAll("Network Security","Image Analyis","Wireless Network");
			Pref4.setValue(null);
			pg_state.getItems().addAll("Delhi","Andhra Pradesh","Uttar Pradesh","Maharashtra","Madhya Pradesh","West Bengal","Tamil Nadu","Jharkhand","Karnataka");
			pg_state.setValue(null);
			pg_year.getItems().addAll("2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015");
			pg_year.setValue(null);
			pg_division.getItems().addAll("9.5","4.6");
			pg_division.setValue(null);
			cgpa_combo.getItems().addAll("9.5","4.6");
			cgpa_combo.setValue("9.5");
			exam_year.getItems().addAll("2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015");
			exam_year.setValue(null);
			gate_year.getItems().addAll("2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015");
			gate_year.setValue(null);
	}
	
	
	
	   
	@FXML
    void Personal_Information_save(ActionEvent event) 
	{
		RadioButton chk=null,chk1=null,chk2=null,chk3=null,chk4=null,chk5=null,chk6=null;
		chk = (RadioButton)phd_CS.getToggleGroup().getSelectedToggle(); 
		chk = (RadioButton)phd_ECE.getToggleGroup().getSelectedToggle();
		chk = (RadioButton)phd_CB.getToggleGroup().getSelectedToggle();
		chk1 = (RadioButton)gender_male.getToggleGroup().getSelectedToggle(); 
		chk1 = (RadioButton)gender_female.getToggleGroup().getSelectedToggle();
		chk2 = (RadioButton)Category_general.getToggleGroup().getSelectedToggle(); 
		chk2 = (RadioButton)Category_obc.getToggleGroup().getSelectedToggle();
		chk2 = (RadioButton)Category_st.getToggleGroup().getSelectedToggle(); 
		chk2 = (RadioButton)Category_sc.getToggleGroup().getSelectedToggle();
		chk3 = (RadioButton)physically_disabled_no.getToggleGroup().getSelectedToggle(); 
		chk3 = (RadioButton)physically_disabled_no.getToggleGroup().getSelectedToggle();
		chk4 = (RadioButton)children_yes.getToggleGroup().getSelectedToggle(); 
		chk4 = (RadioButton)children_no.getToggleGroup().getSelectedToggle();
		chk5 = (RadioButton)cgpa.getToggleGroup().getSelectedToggle();
		chk5 = (RadioButton)marks.getToggleGroup().getSelectedToggle();
		chk6 = (RadioButton)cgpa1.getToggleGroup().getSelectedToggle();
		chk6 = (RadioButton)marks1.getToggleGroup().getSelectedToggle();
		
		int check=1;

		if(Email.getText().isEmpty()|| Name.getText().isEmpty() || Address.getText().isEmpty() || mobile_no.getText().isEmpty() ||chk==null ||phd_ref1.getValue()==null ||chk1==null||chk2==null||chk3==null||DOB.getValue()==null
				||chk4==null||father_name.getText().isEmpty()||nationality.getValue()==null||permanent_address.getText().isEmpty()||pin_code.getText().isEmpty()||
				tenth_board.getText().isEmpty()||tenth_marks.getText().isEmpty()||ten_year_passing.getValue()==null||
				twelth_board.getText().isEmpty()||twelth_marks.getText().isEmpty()||twelvth_year_passing.getValue()==null||
				degree.getText().isEmpty()||department.getText().isEmpty()||name_of_clg.getText().isEmpty()||name_of_uni.getText().isEmpty()||
				city.getText().isEmpty()||state.getValue()==null||year_of_graduation.getValue()==null||chk5==null){
			check=0;
			
			
		}	
		if(title1_handle.isSelected()){
			if(Pref1.getValue()==null||Pref2.getValue()==null||Pref3.getValue()==null||Pref3.getValue()==null)
				check=0;
		}
		if(title2_handle.isSelected()){
			if(pg_degree.getText().isEmpty()||pg_department.getText().isEmpty()||pg_college.getText().isEmpty()||pg_title.getText().isEmpty()||pg_city.getText().isEmpty()||pg_state.getValue()==null||pg_year.getValue()==null||chk6==null){
				check=0;
			}
		}
		
		if(title3_handle.isSelected())
		{
			if(exam_name.getText().isEmpty()||exam_subject.getText().isEmpty()||exam_year.getValue()==null||exam_score.getText().isEmpty()||exam_rank.getText().isEmpty())
			{
				check=0;
			}
		}
		if(title4_handle.isSelected()){
			if(gate_area.getText().isEmpty()||gate_year.getValue()==null||gate_marks.getText().isEmpty()||gate_score.getText().isEmpty()||gate_rank.getText().isEmpty()){
				check=0;
			}
		}
		
		if(check==0){
			label.setVisible(true);
			label.setText("Error Some feilds are not filled");
			label.setTextFill(Color.web("#FF0000"));
		}
		if(tenth_marks.getText().isEmpty()==false||twelth_marks.getText().isEmpty()==false ){
			
			try{
				Double.parseDouble(tenth_marks.getText());
				Double.parseDouble(twelth_marks.getText());
				
				if(Integer.parseInt(tenth_marks.getText())<0||Integer.parseInt(tenth_marks.getText())>100){
					check=0;
					label.setVisible(true);
					label.setText("10th marks are not in format");
					label.setTextFill(Color.web("#FF0000"));
					
				}
				
				if(Integer.parseInt(twelth_marks.getText())<0||Integer.parseInt(twelth_marks.getText())>100){
					check=0;
					label.setVisible(true);
					label.setText("12th marks are not in format");
					label.setTextFill(Color.web("#FF0000"));
					
				}
				
			}catch (Exception  e){
				check=0;
				label.setVisible(true);
				label.setText("Marks are not in proper format");
				label.setTextFill(Color.web("#FF0000"));
			}
		}
		try{
		if(cgpa_text.getText().isEmpty()==false){
			Double.parseDouble(cgpa_text.getText());
			if(Integer.parseInt(cgpa_text.getText())<0||Integer.parseInt(cgpa_text.getText())>10){
				check=0;
				label.setVisible(true);
				label.setText("Cgpa Marks is not in proper format");
				label.setTextFill(Color.web("#FF0000"));
			}
		}}catch (Exception  e){
			check=0;
			label.setVisible(true);
			label.setText("Cgpa Marks is not in proper format");
			label.setTextFill(Color.web("#FF0000"));
		}
		try{
		if(pg_cgpa.getText().isEmpty()==false){
			System.out.println("cfgh");
			Double.parseDouble(pg_cgpa.getText());
			if(Integer.parseInt(pg_cgpa.getText())<0||Integer.parseInt(pg_cgpa.getText())>10){
				check=0;
				label.setVisible(true);
				label.setText("postgraduate cgpa marks is not in proper format");
				label.setTextFill(Color.web("#FF0000"));
			}
		}}catch (Exception  e){
			check=0;
			label.setVisible(true);
			label.setText("postgraduate cgpa marks is not in proper format");
			label.setTextFill(Color.web("#FF0000"));
		}
		try{
		if(marks_text.getText().isEmpty()==false){
			Double.parseDouble(marks_text.getText());
			if(Integer.parseInt(marks_text.getText())<0||Integer.parseInt(marks_text.getText())>100){
				check=0;
				label.setVisible(true);
				label.setText("Marks is not in proper format");
				label.setTextFill(Color.web("#FF0000"));
			}
		}}catch (Exception  e){
			check=0;
			label.setVisible(true);
			label.setText("Marks is not in proper format");
			label.setTextFill(Color.web("#FF0000"));
		}
		try{

			if(pg_marks.getText().isEmpty()==false){
				Double.parseDouble(pg_marks.getText());
				if(Integer.parseInt(pg_marks.getText())>100||Integer.parseInt(pg_marks.getText())<0){
					check=0;
					label.setVisible(true);
					label.setText("undergraduate Marks is not in proper format");
					label.setTextFill(Color.web("#FF0000"));
				}
			}
		}catch (Exception  e){
			check=0;
			label.setVisible(true);
			label.setText("undergraduate Marks is not in proper format");
			label.setTextFill(Color.web("#FF0000"));
		}
		
		if(mobile_no.getText().length()!=10 && mobile_no.getText().isEmpty()==false){
			check=0;
			label.setVisible(true);
			label.setText("Mobile no. is not correct");
		}
		if(mobile_no.getText().length()==10){
			try{
				Double.parseDouble(mobile_no.getText());
				
			}catch (Exception  e){
				check=0;
				label.setVisible(true);
				label.setText("Mobile no. is not correct");
			}
		}
		if(DOB.getValue()!=null){
			//System.out.println("shiko");
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    		Date date = new Date();
    		String[] a=dateFormat.format(date).toString().split("-");
    		String[] b=DOB.getValue().toString().split("-");
    		System.out.println(Arrays.toString(a));
    		System.out.println(Arrays.toString(b));
    		if(Integer.parseInt(b[0])-Integer.parseInt(a[0])>0){
    			//System.out.println("shiko1");
				check=0;
				label.setVisible(true);
				label.setText("DOB is in future");
			}
			else if(b[0].compareTo(a[0])==0){
				//System.out.println("shiko2");
		    	if(Integer.parseInt(b[1])-Integer.parseInt(a[1])>0){
		    		//System.out.println("shiko3");
		    		check=0;
					label.setVisible(true);
					label.setText("DOB is in future");
		
				}
		    	else if(b[1].compareTo(a[1])==0){
		    		System.out.println("shiko4");
		    			if(Integer.parseInt(b[2])-Integer.parseInt(a[2])>0){
		    				//System.out.println("shiko5");
		    				check=0;
		    				label.setVisible(true);
		    				label.setText("DOB is in future");
		    			}
		    	}
		    }
			
		}
		if(check==1){
		System.out.println("hello");
		File f=new File("./src/template.csv");
		File f1=new File("./src/Feedback.csv");
		try {
			
			BufferedReader bw12 = new BufferedReader(new FileReader(f1));
			BufferedWriter bw2= new BufferedWriter(new FileWriter(f));
			String line,Enrollement_id ="0";
			line=bw12.readLine();
			if(Integer.parseInt(Enrollement_id)==0){
				bw2.write(line);
				bw2.newLine();
			}
			while((line=bw12.readLine())!=null){
				String[] c = line.split(",");
				bw2.write(line);
				bw2.newLine();
				
				Enrollement_id=c[59];
    	   	//	System.out.println(Enrollement_id.substring(3));
			}	
			String text="";
			text=text+Email.getText()+",";
			text=text+Name.getText()+",";
			text=text+Address.getText()+",";
			text=text+mobile_no.getText()+",";
			
    		text=text+chk.getText()+",";
    		text=text+phd_ref1.getValue()+",";
    		text=text+phd_ref2.getValue()+",";
    		text=text+phd_ref3.getValue()+",";
    		
    		text=text+chk1.getText()+",";
    		
    		text=text+chk2.getText()+",";
    		
    		text=text+chk3.getText()+",";
    		String[] dob=DOB.getValue().toString().split("-");
    		
    		String dob1=dob[2]+"-"+dob[1]+"-"+dob[0];
    		text=text+dob1+",";
    		
    		text=text+chk4.getText()+",";
    		
    		text=text+father_name.getText()+",";
    		
    		text=text+nationality.getValue().toString()+",";
    		text=text+permanent_address.getText()+",";
    		text=text+pin_code.getText()+",";
    		

    		text=text+tenth_board.getText()+",";
    		text=text+tenth_marks.getText()+",";
    		text=text+ten_year_passing.getValue()+",";
    		text=text+twelth_board.getText()+",";
    		text=text+twelth_marks.getText()+",";
    		text=text+twelvth_year_passing.getValue()+",";
    		text=text+degree.getText()+",";
    		text=text+department.getText()+",";
    		text=text+name_of_clg.getText()+",";
    		text=text+name_of_uni.getText()+",";
    		text=text+city.getText()+",";
    		text=text+state.getValue()+",";
    		text=text+year_of_graduation.getValue()+",";
			//RadioButton chk5;
    		
    		//System.out.println(Integer.parseInt(cgpa_text.getText()));
    		if(cgpa.isSelected())
    		{	
    			
    			Float a=Float.parseFloat(cgpa_combo.getValue().toString());
    			//System.out.println(a+Float.parseFloat(cgpa_text.getText()));
    			text=text+"CGPA:"+Float.toString(Float.parseFloat(cgpa_text.getText())*a)+",";
    		}
    		else if(marks.isSelected()){
    			text=text+"Marks:"+marks_text.getText().toString()+",";
    		}
    		
    		if(title1_handle.isSelected()){
    			text=text+"Yes"+",";
    			text=text+Pref1.getValue()+",";
        		text=text+Pref2.getValue()+",";
        		text=text+Pref3.getValue()+",";
        		text=text+Pref4.getValue()+",";
    		}
    		else
    			text=text+"No"+","+","+","+","+",";
    		if(title2_handle.isSelected()){
    			text=text+"Yes"+",";
    			text=text+pg_degree.getText()+",";
    			text=text+pg_department.getText()+",";
    			text=text+pg_college.getText()+",";
    			text=text+pg_title.getText()+",";
        		text=text+pg_city.getText()+",";
        		text=text+pg_state.getValue()+",";
        		
        		
        		
        		text=text+pg_year.getValue()+",";
        		
        		System.out.println("aasdf"+pg_marks.isDisable());
        		
        		if(pg_marks.isDisable())
        		{	
        		
        			Float a=Float.parseFloat(pg_division.getValue().toString());
        			//System.out.println(a+Float.parseFloat(cgpa_text.getText()));
        			text=text+"CGPA:"+Float.toString(Float.parseFloat(pg_cgpa.getText())*a)+",";
        		}
        		else if(pg_cgpa.isDisable()){
        			text=text+"Marks:"+pg_marks.getText().toString()+",";
        		}
    		}
    		else
    			text=text+"No"+","+","+","+","+","+","+","+","+",";
    		if(title3_handle.isSelected()){
    			text=text+"Yes"+",";
    			text=text+exam_name.getText()+",";
        		text=text+exam_subject.getText()+",";
        		text=text+exam_year.getValue()+",";
        		text=text+exam_score.getText()+",";
        		text=text+exam_rank.getText()+",";
    			
    		}
    		else
    			text=text+"No"+","+","+","+","+","+",";
    		if(title4_handle.isSelected()){
    			text=text+"Yes"+",";
    			text=text+gate_area.getText()+",";
        		text=text+gate_year.getValue()+",";
        		text=text+gate_marks.getText()+",";
        		text=text+gate_score.getText()+",";
        		text=text+gate_rank.getText()+",";
    		}
    		else
    		text=text+"No"+","+","+","+","+","+",";
    		text=text+achievement.getText()+",";
    		DateFormat dateFormat = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");
    		Date date = new Date();
    		text=text+dateFormat.format(date).toString()+",";
    		text=text+"PHD"+(Integer.parseInt(Enrollement_id.substring(3))+1)+",";
			System.out.println(text);
			
			
			/*
			
			
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		*/
    		bw2.write(text);	
			bw2.newLine();
			f1.delete();
			f.renameTo(f1);
	        bw2.close();
	        bw12.close();
	        label.setVisible(true);
			label.setText("Database updated");
			label.setTextFill(Color.web("#FF0000"));
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    
		}
		}

}
