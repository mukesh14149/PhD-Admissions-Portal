package server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ProcessBuilder.Redirect;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Controller  {
	 static int cnt = 0;
	static private TableView table = new TableView();
	@FXML
    private Button showfiltered;
	
	@FXML
    private RadioButton T1;
	
	@FXML
    private RadioButton T2;
	
	@FXML
    private RadioButton T3;
	
    @FXML
    private ComboBox<String> department_pg;

    @FXML
    private ComboBox<String> pg_degree;

    @FXML
    private TextField university_g;

    @FXML
    private DatePicker app_dated_from;

    @FXML
    private TextField university_pg;

    @FXML
    private DatePicker app_dated_upto;

    @FXML
    private ComboBox<String> phd_stream;

    @FXML
    private HBox pg_board_marks;

    @FXML
    private ComboBox<String> graduation_from;

    @FXML
    private TextField email;

    @FXML
    private TextField enrollment_no;

    @FXML
    private HBox grad_board_marks;

    @FXML
    private HBox gate_score;

    @FXML
    private ComboBox<String> twelth_board;

    @FXML
    private HBox twelth_board_marks;

    @FXML
    private ComboBox<String> post_graduation_from;

    @FXML
    private ComboBox<String> tenth_board;

    @FXML
    private ComboBox<String> department_g;

   

    @FXML
    private TextField name;

    @FXML
    private DatePicker date_picker;

    @FXML
    private HBox tenth_board_marks;

    @FXML
    private ComboBox<String> graduation_degree;

    @FXML
    private ComboBox<String> category;
    
    
    @FXML
    private ToggleGroup physically_disabled;

    @FXML
    private ToggleGroup DOB_toggle;

    @FXML
    private ToggleGroup gender;
    
    
    @FXML
    private CheckBox grad_equals;

    @FXML
    private CheckBox post_grad_equals;

    @FXML
    private CheckBox post_grad_lesser;

    @FXML
    private CheckBox tenth_greater;
    
    @FXML
    private CheckBox grad_lesser;

    @FXML
    private CheckBox gate_lesser;
    
    @FXML
    private TabPane tabpane;
    
    @FXML
    private CheckBox tenth_equals;
    
    @FXML
    private CheckBox gate_greater;

    @FXML
    private CheckBox gate_equals;
    
    
    @FXML
    private CheckBox twelth_greater;
    
    
    @FXML
    private CheckBox twelth_equals;

    @FXML
    private CheckBox grad_greater;

    @FXML
    private TabPane result;

    @FXML
    private Tab record;

    
    @FXML
    private CheckBox post_grad_greater;
    
    @FXML
    private CheckBox twelth_lesser;
    
    @FXML
    private CheckBox tenth_lesser;
    
    @FXML
    private TextField twelth_percent;

    
    @FXML 
    private AnchorPane leftAnchorPane;
    @FXML
    private TextField gate_percent;
    
    @FXML
    private TextField ug_percent;
    
    @FXML
    private TextField grad_percent;
    
    @FXML
    private TextField tenth_percent;
    
    @FXML
    private Tab tab=new Tab();

    
    static ObservableList<Expense> data = FXCollections.observableArrayList();
    //static private TableView table=new TableView();
    //@FXML
    //private TableView<Expense> table_view =new TableView();
   
    //final static ObservableList<Expense> data = FXCollections.observableArrayList();
    
    @FXML
    void Result(ActionEvent event) throws ParseException, IOException {
    	int check=1;
    	if(grad_percent.getText().compareTo("Percent")!=0){
    		try{
    			Integer.parseInt(grad_percent.getText());
    			if(Integer.parseInt(grad_percent.getText())<0||Integer.parseInt(grad_percent.getText())>100){
    				
    				check=0;
    			}
    		}catch (Exception  e){
				check=0;
				
			}
    	}
    	if(ug_percent.getText().compareTo("Percent")!=0){
    		try{
    			Integer.parseInt(ug_percent.getText());
    		if(Integer.parseInt(ug_percent.getText())<0||Integer.parseInt(ug_percent.getText())>100){
    				
    				check=0;
    		}}catch (Exception  e){
				check=0;
				
			}
    	}
    	if(twelth_percent.getText().compareTo("Percent")!=0){
    		try{
    			Integer.parseInt(twelth_percent.getText());
    		if(Integer.parseInt(twelth_percent.getText())<0||Integer.parseInt(twelth_percent.getText())>100){
    				
    				check=0;
    		}}catch (Exception  e){
				check=0;
				
			}
    	}
    	if(tenth_percent.getText().compareTo("Percent")!=0){
    		try{
    			Integer.parseInt(twelth_percent.getText());
    		if(Integer.parseInt(tenth_percent.getText())<0||Integer.parseInt(tenth_percent.getText())>100){
    				
    				check=0;
    		}}catch (Exception  e){
				check=0;
				
			}
    	}
    	if(date_picker.getValue()!=null){
			//System.out.println("shiko");
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    		Date date = new Date();
    		String[] a=dateFormat.format(date).toString().split("-");
    		String[] b=date_picker.getValue().toString().split("-");
    		System.out.println(Arrays.toString(a));
    		System.out.println(Arrays.toString(b));
    		if(Integer.parseInt(b[0])-Integer.parseInt(a[0])>0){
    			//System.out.println("shiko1");
				check=0;
				//label.setVisible(true);
				//label.setText("DOB is in future");
			}
			else if(b[0].compareTo(a[0])==0){
				//System.out.println("shiko2");
		    	if(Integer.parseInt(b[1])-Integer.parseInt(a[1])>0){
		    		//System.out.println("shiko3");
		    		check=0;
					//label.setVisible(true);
					//label.setText("DOB is in future");
		
				}
		    	else if(b[1].compareTo(a[1])==0){
		    		System.out.println("shiko4");
		    			if(Integer.parseInt(b[2])-Integer.parseInt(a[2])>0){
		    				System.out.println("shiko5");
		    				check=0;
		    				//label.setVisible(true);
		    				//label.setText("DOB is in future");
		    			}
		    	}
		    }
			
		}
    	if(app_dated_upto.getValue()!=null){
			//System.out.println("shiko");
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    		Date date = new Date();
    		String[] a=dateFormat.format(date).toString().split("-");
    		String[] b=app_dated_upto.getValue().toString().split("-");
    		System.out.println(Arrays.toString(a));
    		System.out.println(Arrays.toString(b));
    		if(Integer.parseInt(b[0])-Integer.parseInt(a[0])>0){
    			//System.out.println("shiko1");
				check=0;
				//label.setVisible(true);
				//label.setText("DOB is in future");
			}
			else if(b[0].compareTo(a[0])==0){
				//System.out.println("shiko2");
		    	if(Integer.parseInt(b[1])-Integer.parseInt(a[1])>0){
		    		//System.out.println("shiko3");
		    		check=0;
					//label.setVisible(true);
					//label.setText("DOB is in future");
		
				}
		    	else if(b[1].compareTo(a[1])==0){
		    		System.out.println("shiko4");
		    			if(Integer.parseInt(b[2])-Integer.parseInt(a[2])>0){
		    				System.out.println("shiko5");
		    				check=0;
		    				//label.setVisible(true);
		    				//label.setText("DOB is in future");
		    			}
		    	}
		    }
			
		}
    	if(app_dated_from.getValue()!=null){
			//System.out.println("shiko");
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    		Date date = new Date();
    		String[] a=dateFormat.format(date).toString().split("-");
    		String[] b=app_dated_from.getValue().toString().split("-");
    		System.out.println(Arrays.toString(a));
    		System.out.println(Arrays.toString(b));
    		if(Integer.parseInt(b[0])-Integer.parseInt(a[0])>0){
    			//System.out.println("shiko1");
				check=0;
				//label.setVisible(true);
				//label.setText("DOB is in future");
			}
			else if(b[0].compareTo(a[0])==0){
				//System.out.println("shiko2");
		    	if(Integer.parseInt(b[1])-Integer.parseInt(a[1])>0){
		    		//System.out.println("shiko3");
		    		check=0;
					//label.setVisible(true);
					//label.setText("DOB is in future");
		
				}
		    	else if(b[1].compareTo(a[1])==0){
		    		System.out.println("shiko4");
		    			if(Integer.parseInt(b[2])-Integer.parseInt(a[2])>0){
		    				System.out.println("shiko5");
		    				check=0;
		    				//label.setVisible(true);
		    				//label.setText("DOB is in future");
		    			}
		    	}
		    }
			
		}
    	if(check==1){
    	File f=new File("./src/template.csv");
		File f1=new File("./src/Feedback.csv");
		File f2=new File("./src/helper.csv");
		
		try {
			BufferedReader bw12 = new BufferedReader(new FileReader(f1));
			BufferedWriter bw2= new BufferedWriter(new FileWriter(f));
			BufferedReader bw21 = new BufferedReader(new FileReader(f));
			BufferedWriter bw3= new BufferedWriter(new FileWriter(f2));
			String line;
			line=bw12.readLine();
			bw2.write(line);
			bw2.newLine();
			while((line=bw12.readLine())!=null){
					String[] c = line.split(",");
						bw2.write(line);
						bw2.newLine();
	    	   		//System.out.println("0"+"kh");
	    		
				}

	        bw2.close();
	        bw12.close();
	        bw3.close();
	        bw21.close();
	        
	        bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
	        line=bw21.readLine();
			bw3.write(line);
			bw3.newLine();
			if(email.getText().isEmpty()){}
			else{
				System.out.println("hulu");
				while((line=bw21.readLine())!=null){
					String[] c = line.split(",");
					if(c[0].equals(email.getText().toString())){
						bw3.write(line);
						bw3.newLine();
						//System.out.println(line);
						
						}
				}
				f.delete();
				f2.renameTo(f);
			}
			
	        bw21.close();
	        bw3.close();
	        
	        
	        bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
			if(name.getText().isEmpty()){}
			else{
				
				while((line=bw21.readLine())!=null){
					String[] c = line.split(",");
					System.out.println("yoyo"+c[1]);
					if(c[1].equals(name.getText().toString())){
						bw3.write(line);
						bw3.newLine();
						System.out.println("1"+c[1]);
					}	
					
			}
				f.delete();
				f2.renameTo(f);
				
			}
			bw21.close();
			bw3.close();
			
			
			
			bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
			if(enrollment_no.getText().isEmpty()){}
			else{
				
				while((line=bw21.readLine())!=null){
					String[] c = line.split(",");
					System.out.println("yoyo"+c[59]);
					if(c[59].equals(enrollment_no.getText().toString())){
						bw3.write(line);
						bw3.newLine();
						System.out.println("1"+c[59]);
					}	
					
			}
				f.delete();
				f2.renameTo(f);
				
			}
			bw21.close();
			bw3.close();
	        
	        bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
			if(category.getValue()!=null){
				while((line=bw21.readLine())!=null){
					String[] c = line.split(",");
					if(c[9].equals(category.getValue().toString())){
						bw3.write(line);
						bw3.newLine();
						System.out.println("1"+c[9]);}	
				}
				f.delete();
				f2.renameTo(f);
			}
	        bw21.close();
	        bw3.close();
	        
	        
	        
	        
	        
	        bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
			if(gender.getSelectedToggle()!=null){
				while((line=bw21.readLine())!=null){
					String[] c = line.split(",");
					RadioButton chk = (RadioButton)gender.getSelectedToggle();
					System.out.println(chk.getText());
					if(c[8].equals(chk.getText().toString())){
						bw3.write(line);
						bw3.newLine();
						System.out.println("1"+c[8]);}	
				}
				f.delete();
				f2.renameTo(f);
			}
			
	        bw21.close();
	        bw3.close();
	        
	        
	        
	        
	        bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
			if(physically_disabled.getSelectedToggle()!=null){
				while((line=bw21.readLine())!=null){
					String[] c = line.split(",");
					RadioButton chk = (RadioButton)physically_disabled.getSelectedToggle();
					if(c[10].equals(chk.getText().toString())){
						bw3.write(line);
						bw3.newLine();
						System.out.println("1"+c[10]);}	
				}
				f.delete();
				f2.renameTo(f);
			}
			
	        bw21.close();
	        bw3.close();
	        
	        
	        
	        bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
			if(phd_stream.getValue()!=null){
				while((line=bw21.readLine())!=null){
					String[] c = line.split(",");
					//System.out.println("noit sakdf");
					if(c[4].equals(phd_stream.getValue().toString())){
						//System.out.println("chuu");
						bw3.write(line);
						bw3.newLine();
						System.out.println("4"+c[4]);}	
				}
				f.delete();
				f2.renameTo(f);
			}
	        bw21.close();
	        bw3.close();
	        
	        
	        
	        bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
			if(graduation_degree.getValue()!=null){
				while((line=bw21.readLine())!=null){
					String[] c = line.split(",");
					//System.out.println("noit sakdf");
					if(c[23].equals(graduation_degree.getValue().toString())){
						//System.out.println("chuu");
						bw3.write(line);
						bw3.newLine();
						System.out.println("1"+c[23]);}	
				}
				f.delete();
				f2.renameTo(f);
			}
	        bw21.close();
	        bw3.close();
	        
	        
	        bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
			if(pg_degree.getValue()!=null){
				while((line=bw21.readLine())!=null){
					String[] c = line.split(",");
					//System.out.println("noit sakdf");
					if(c[37].equals(pg_degree.getValue().toString())){
						//System.out.println("chuu");
						bw3.write(line);
						bw3.newLine();
						System.out.println("1"+c[37]);}	
				}
				f.delete();
				f2.renameTo(f);
			}
	        bw21.close();
	        bw3.close();
	        
	        
	        
	        bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
			if(tenth_board.getValue()!=null){
				while((line=bw21.readLine())!=null){
					String[] c = line.split(",");
					if(c[17].equals(tenth_board.getValue().toString())){
						bw3.write(line);
						bw3.newLine();
						System.out.println("1"+c[17]);}	
				}
				f.delete();
				f2.renameTo(f);
			}
			
	        bw21.close();
	        bw3.close();
	        
	        
	        
	        
	        bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
			if(twelth_board.getValue()!=null){
				while((line=bw21.readLine())!=null){
					String[] c = line.split(",");
					if(c[20].equals(twelth_board.getValue().toString())){
						bw3.write(line);
						bw3.newLine();
						System.out.println("1"+c[20]);}	
				}
				f.delete();
				f2.renameTo(f);
			}
			
	        bw21.close();
	        bw3.close();
	        
	        
	        
	        
	        bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
			if(department_g.getValue()!=null){
				System.out.println("1"+"kh");
				while((line=bw21.readLine())!=null){
					String[] c = line.split(",");
					//System.out.println(c[38]);
					if(c[24].equals(department_g.getValue().toString())){
						//System.out.println("chuu");
						bw3.write(line);
						bw3.newLine();
						System.out.println("1"+c[24]);}	
				}
				f.delete();
				f2.renameTo(f);
			}
	        bw21.close();
	        bw3.close();
	        
	        

	        bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
			if(department_pg.getValue()!=null){
				while((line=bw21.readLine())!=null){
					String[] c = line.split(",");
					System.out.println("noit sakdf");
					if(c[38].equals(department_pg.getValue().toString())){
						
						bw3.write(line);
						bw3.newLine();
						System.out.println("1"+c[38]);}	
				}
				f.delete();
				f2.renameTo(f);
			}
	        bw21.close();
	        bw3.close();
	        
	        
	        bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
			if(university_g.getText().isEmpty()){}
			else{
				
				while((line=bw21.readLine())!=null){
					String[] c = line.split(",");
					System.out.println("yoyo"+c[25]);
					if(c[25].equals(university_g.getText().toString())){
						bw3.write(line);
						bw3.newLine();
						System.out.println("1"+c[25]);
					}	
					
			}
				f.delete();
				f2.renameTo(f);
				
			}
			bw21.close();
			bw3.close();
			
			
			
			bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
			if(university_pg.getText().isEmpty()){}
			else{
				
				while((line=bw21.readLine())!=null){
					String[] c = line.split(",");
					System.out.println("yoyo"+c[39]);
					if(c[39].equals(university_pg.getText().toString())){
						bw3.write(line);
						bw3.newLine();
						System.out.println("1"+c[39]);
					}	
					
			}
				f.delete();
				f2.renameTo(f);
				
			}
			bw21.close();
			bw3.close();
	       
	        
			bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
			if(graduation_from.getValue()!=null){
				while((line=bw21.readLine())!=null){
					String[] c = line.split(",");
					if(c[28].equals(graduation_from.getValue().toString())){
						bw3.write(line);
						bw3.newLine();
						System.out.println("1"+c[28]);}	
				}
				f.delete();
				f2.renameTo(f);
			}
			
	        bw21.close();
	        bw3.close();
	        
			
	        
	        bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
			if(post_graduation_from.getValue()!=null){
				while((line=bw21.readLine())!=null){
					String[] c = line.split(",");
					if(c[42].equals(post_graduation_from.getValue().toString())){
						bw3.write(line);
						bw3.newLine();
						System.out.println("1"+c[42]);}	
				}
				f.delete();
				f2.renameTo(f);
			}
		
	        bw21.close();
	        bw3.close();
	        
	        
	        
	        bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
			if(tenth_greater.isSelected()==true||tenth_lesser.isSelected()==true||tenth_equals.isSelected()==true){
				
				while((line=bw21.readLine())!=null){
					String[] c = line.split(",");
					String k=c[18].toString();
					 try {
					        int a = Integer.parseInt(k);
					     
					        int b=Integer.parseInt(tenth_percent.getText());
							if(tenth_greater.isSelected()==true){
							if(a>b){
								bw3.write(line);
								bw3.newLine();
								System.out.println(c[18]+"\n");}
							}
							
							if(tenth_lesser.isSelected()==true){
								//System.out.println("tenth_lesser");
								if(a<b){
								//	System.out.println("tenth_lesser1");
									bw3.write(line);
									bw3.newLine();
				    	   		System.out.println(c[18]+"\n");}	}
							
							
							if(tenth_equals.isSelected()==true){
								//System.out.println("tenth_eq");
								if(a==b){
									//System.out.println("tenth_eq1");
									bw3.write(line);
									bw3.newLine();
									System.out.println(c[18]+"\n");}
								}
							
							
							
					    } catch (NumberFormatException e) {
					        //Log it if needed
					        
					    }	
				}
				f.delete();
				f2.renameTo(f);
				
			}
			
			
	        bw21.close();
	        bw3.close();
	        
	        
	        bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
			if(twelth_greater.isSelected()==true||twelth_lesser.isSelected()==true||twelth_equals.isSelected()==true){
				
				while((line=bw21.readLine())!=null){
					String[] c = line.split(",");
					String k=c[21].toString();
					 try {
					        int a = Integer.parseInt(k);
					     
					        int b=Integer.parseInt(twelth_percent.getText());
							if(twelth_greater.isSelected()==true){
							if(a>b){
								bw3.write(line);
								bw3.newLine();
								System.out.println(c[21]+"\n");}
							}
							
							if(twelth_lesser.isSelected()==true){
								//System.out.println("tenth_lesser");
								if(a<b){
									//System.out.println("twelth_lesser1");
									bw3.write(line);
									bw3.newLine();
									System.out.println(c[21]+"\n");}	}
							
							
							if(twelth_equals.isSelected()==true){
								//System.out.println("twelth_eq");
								if(a==b){
									//System.out.println("twelth_eq1");
									bw3.write(line);
									bw3.newLine();
									System.out.println(c[21]+"\n");}	
								}
							
							
							
					    } catch (NumberFormatException e) {
					        //Log it if needed
					        
					    }	
				}
				f.delete();
				f2.renameTo(f);
				
			}
			
			
	        bw21.close();
	        bw3.close();
	        	
	        
	        
	        
	        bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
	        
			if(grad_greater.isSelected()==true||grad_lesser.isSelected()==true||grad_equals.isSelected()==true){
				 System.out.println("sdj");
				while((line=bw21.readLine())!=null){
					String[] c = line.split(",");
					String k=c[30].toString();
					String[] cc=k.split(":");
					String temp = cc[cc.length - 1];
					
						
					try {
				        int a = Integer.parseInt(temp);
				        if(a<=10)
				        	a=(int) (a* 9.5);
				        
				        int b=Integer.parseInt(grad_percent.getText());
						if(grad_greater.isSelected()==true){
						if(a>b){
							bw3.write(line);
							bw3.newLine();
		    	   		System.out.println("1"+c[30]);}
						}
						
						if(grad_lesser.isSelected()==true){
							System.out.println("grad_lesser");
							if(a<b){
								System.out.println("grad_lesser1");
								bw3.write(line);
								bw3.newLine();
			    	   		System.out.println("1"+c[30]);}	}
						
						
						if(grad_equals.isSelected()==true){
							System.out.println("grad_eq");
							if(a==b){
								System.out.println("grad_eq1");
								bw3.write(line);
								bw3.newLine();
			    	   		System.out.println("1"+c[30]);}	
							}
						
						
						
				    } catch (NumberFormatException e) {
				        //Log it if needed
				        
				    }	
					
				}
				f.delete();
				f2.renameTo(f);
				
			}
			
			
	        bw21.close();
	        bw3.close();
	        
	        
	        
	        bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
			if(post_grad_greater.isSelected()==true||post_grad_lesser.isSelected()==true||post_grad_equals.isSelected()==true){
				
				while((line=bw21.readLine())!=null){
					String[] c = line.split(",");
					String k=c[44].toString();
					String[] cc=k.split(":");
					String temp = cc[cc.length - 1];
					
					 try {
						 	int a = Integer.parseInt(temp);
					        if(a<=10)
					        a=(int) (a* 9.5);
					     
					        int b=Integer.parseInt(ug_percent.getText());
							if(post_grad_greater.isSelected()==true){
							if(a>b){
								bw3.write(line);
								bw3.newLine();
			    	   		System.out.println("1"+c[44]);}
							}
							
							if(post_grad_lesser.isSelected()==true){
								System.out.println("post_grad_lesser");
								if(a<b){
									System.out.println("post_grad_lesser1");
									bw3.write(line);
									bw3.newLine();
				    	   		System.out.println("1"+c[44]);}	}
							
							
							if(post_grad_equals.isSelected()==true){
								System.out.println("post_grad_eq");
								if(a==b){
									System.out.println("post_grad_eq1");
									bw3.write(line);
									bw3.newLine();
				    	   		System.out.println("1"+c[44]);}	
								}
							
							
							
					    } catch (NumberFormatException e) {
					        //Log it if needed
					        
					    }	
				}
				f.delete();
				f2.renameTo(f);
				
			}
			
			
	        bw21.close();
	        bw3.close();
	        
	        
	        
	        bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
			if(gate_greater.isSelected()==true||gate_lesser.isSelected()==true||gate_equals.isSelected()==true){
				
				while((line=bw21.readLine())!=null){
					String[] c = line.split(",");
					String k=c[54].toString();
					 try {
					        int a = Integer.parseInt(k);
					     
					        int b=Integer.parseInt(gate_percent.getText());
							if(gate_greater.isSelected()==true){
							if(a>b){
								bw3.write(line);
								bw3.newLine();
			    	   		System.out.println("1"+c[54]);}
							}
							
							if(gate_lesser.isSelected()==true){
								System.out.println("gate_lesser");
								if(a<b){
									System.out.println("gate_lesser1");
									bw3.write(line);
									bw3.newLine();
				    	   		System.out.println("1"+c[54]);}	}
							
							
							if(gate_equals.isSelected()==true){
								System.out.println("gate_eq");
								if(a==b){
									System.out.println("gate_eq1");
									bw3.write(line);
									bw3.newLine();
				    	   		System.out.println("1"+c[54]);}	
								}
					    } catch (NumberFormatException e) {
					        //Log it if needed
					        
					    }	
				}
				f.delete();
				f2.renameTo(f);
				
			}
	        bw21.close();
	        bw3.close();
	        
	        
	        
	        
	        bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
	        line=bw21.readLine();
	        if(app_dated_from.getValue()!=null){
	        	while((line=bw21.readLine())!=null){
	        		String[] c = line.split(",");
	        		//System.out.println(c[58]);
	        		String format = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
	        		
	        			String[] b=c[58].split("[-\\s]");
	        		    String[] a=app_dated_from.getValue().toString().split("-");
	        			
	        		    if(b[1].compareTo("Jan")==0)
	        		    	b[1]="1";
	        		    if(b[1].compareTo("Feb")==0)
	        		    	b[1]="2";
	        		    if(b[1].compareTo("Mar")==0)
	        		    	b[1]="3";
	        		    if(b[1].compareTo("Apr")==0)
	        		    	b[1]="4";
	        		    if(b[1].compareTo("May")==0)
	        		    	b[1]="5";
	        		    if(b[1].compareTo("Jun")==0)
	        		    	b[1]="6";
	        		    if(b[1].compareTo("Jul")==0)
	        		    	b[1]="7";
	        		    if(b[1].compareTo("Aug")==0)
	        		    	b[1]="8";
	        		    if(b[1].compareTo("Sep")==0)
	        		    	b[1]="9";
	        		    if(b[1].compareTo("Oct")==0)
	        		    	b[1]="10";
	        		    if(b[1].compareTo("Nov")==0)
	        		    	b[1]="11";
	        		    if(b[1].compareTo("Dec")==0)
	        		    	b[1]="12";
	        			//2-5-2015  2015-5-7
	        		   // String temp = b[b.length - 1];
	        		    System.out.println("a"+Arrays.toString(a));
	        			System.out.println("b"+Arrays.toString(b));
	        			
	        			
	        			if(b[0].compareTo(a[0])<0){
	        				System.out.println("inyear");
	        				bw3.write(line);
							bw3.newLine();
							System.out.println(Arrays.toString(b));
	        			}
	        			else if(b[0].compareTo(a[0])==0){
	        				
	        		    	if(Integer.parseInt(b[1])-Integer.parseInt(a[1])>0){
	        		    		System.out.println("inmonth");
	        		    		bw3.write(line);
								bw3.newLine();
								System.out.println(Arrays.toString(b));
									
	        				}
	        		    	else if(Integer.parseInt(b[1])-Integer.parseInt(a[1])==0){
	        		    		
	        		    			if(Integer.parseInt(b[2])-Integer.parseInt(a[2])>0){
	        		    				bw3.write(line);
	    								bw3.newLine();
	    								System.out.println("hello");
	    								System.out.println(Arrays.toString(b));
	        		    			}
	        		    			
	        		    	}
	        		    }
	        			
	        	    
	        	}
	        	f.delete();
	            f2.renameTo(f);
	        }

	        bw21.close();
	        bw3.close();
	        
	        
	        
	        
	        
	        bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
	        line=bw21.readLine();
	        if(app_dated_upto.getValue()!=null){
	        	while((line=bw21.readLine())!=null){
	        		String[] c = line.split(",");
	        		//System.out.println(c[58]);
	        		String format = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
	        		
	        			String[] b=c[58].split("[-\\s]");
	        		    String[] a=app_dated_upto.getValue().toString().split("-");
	        			
	        		    if(b[1].compareTo("Jan")==0)
	        		    	b[1]="1";
	        		    if(b[1].compareTo("Feb")==0)
	        		    	b[1]="2";
	        		    if(b[1].compareTo("Mar")==0)
	        		    	b[1]="3";
	        		    if(b[1].compareTo("Apr")==0)
	        		    	b[1]="4";
	        		    if(b[1].compareTo("May")==0)
	        		    	b[1]="5";
	        		    if(b[1].compareTo("Jun")==0)
	        		    	b[1]="6";
	        		    if(b[1].compareTo("Jul")==0)
	        		    	b[1]="7";
	        		    if(b[1].compareTo("Aug")==0)
	        		    	b[1]="8";
	        		    if(b[1].compareTo("Sep")==0)
	        		    	b[1]="9";
	        		    if(b[1].compareTo("Oct")==0)
	        		    	b[1]="10";
	        		    if(b[1].compareTo("Nov")==0)
	        		    	b[1]="11";
	        		    if(b[1].compareTo("Dec")==0)
	        		    	b[1]="12";
	        			//2-5-2015  2015-5-7
	        		   // String temp = b[b.length - 1];
	        		    System.out.println("a"+Arrays.toString(a));
	        			System.out.println("b"+Arrays.toString(b));
	        			
	        			
	        			if(b[0].compareTo(a[0])>0){
	        				System.out.println("inyear");
	        				bw3.write(line);
							bw3.newLine();
							System.out.println(Arrays.toString(b));
	        			}
	        			else if(b[0].compareTo(a[0])==0){
	        				
	        		    	if(Integer.parseInt(b[1])-Integer.parseInt(a[1])<0){
	        		    		System.out.println("inmonth");
	        		    		bw3.write(line);
								bw3.newLine();
								System.out.println(Arrays.toString(b));
									
	        				}
	        		    	else if(Integer.parseInt(b[1])-Integer.parseInt(a[1])==0){
	        		    		
	        		    			if(Integer.parseInt(b[2])-Integer.parseInt(a[2])<0){
	        		    				bw3.write(line);
	    								bw3.newLine();
	    								System.out.println("hello");
	    								System.out.println(Arrays.toString(b));
	        		    			}
	        		    			
	        		    	}
	        		    }
	        			
	        	    
	        	}
	        	f.delete();
	            f2.renameTo(f);
	        }

	        bw21.close();
	        bw3.close();
	        
	        
	        
	        

	        
	        
	        
	        
	        
	        
	        
	        bw21=new BufferedReader(new FileReader(f));
	        bw3= new BufferedWriter(new FileWriter(f2));
			if(DOB_toggle.getSelectedToggle()!=null){
				RadioButton chk = (RadioButton)gender.getSelectedToggle();
				chk = (RadioButton)T1.getToggleGroup().getSelectedToggle(); 
	    		chk = (RadioButton)T2.getToggleGroup().getSelectedToggle();
	    		chk = (RadioButton)T3.getToggleGroup().getSelectedToggle();
				System.out.print(chk.getText());
	    		if(chk.getText().toString().compareTo("On")==0){
						System.out.println("hello");
						line=bw21.readLine();
					while((line=bw21.readLine())!=null){
				  String[] c = line.split(",");
				  String[] b=c[11].split("-");
     		      String[] a=date_picker.getValue().toString().split("-");
     		     System.out.println("a"+Arrays.toString(a));
     			System.out.println("b"+Arrays.toString(b));
     		      	if(b[2].compareTo(a[0])==0){
       		       if(b[1].compareTo(a[1])==0){
    		    		
  		    			if(b[0].compareTo(a[2])==0){
  		    				bw3.write(line);
  							bw3.newLine();
  							System.out.println("hello");
  		    			}
       		       }
       		      } 
				}
				}
				else if(chk.getText().toString().compareTo("Before")==0){
					line=bw21.readLine();
					while((line=bw21.readLine())!=null){
						String[] c = line.split(",");
						String[] b=c[11].split("-");
						String temp = b[b.length - 1];
	        		       String[] a=date_picker.getValue().toString().split("-");
	        			//System.out.println(date);
	        		       //2-5-2015  2015-5-7
	        		      
	        			if(Integer.parseInt(temp)-Integer.parseInt(a[0])<0){
	        				System.out.println("inyear");
	        				bw3.write(line);
							bw3.newLine();
							
	        			}
	        			else if(temp.compareTo(a[0])==0){
	        				
	        		    	if(Integer.parseInt(b[1])-Integer.parseInt(a[1])<0){
	        		    		System.out.println("inmonth");
	        		    		bw3.write(line);
								bw3.newLine();
									
	        				}
	        		    	else if(b[1].compareTo(a[1])==0){
	        		    		
	        		    			if(Integer.parseInt(b[0])-Integer.parseInt(a[2])==0){
	        		    				bw3.write(line);
	    								bw3.newLine();
	    								System.out.println("hello");
	        		    			}
	        		    	}
	        		    }
					}
				}
				else if(chk.getText().toString().compareTo("After")==0){
					line=bw21.readLine();
					System.out.println("hello");
					while((line=bw21.readLine())!=null){
						String[] c = line.split(",");
						String[] b=c[11].split("-");
						String temp = b[b.length - 1];
	        		       String[] a=date_picker.getValue().toString().split("-");
	        			//System.out.println(date);
	        		       //2-5-2015  2015-5-7
	        		      
	        			if(Integer.parseInt(temp)-Integer.parseInt(a[0])>0){
	        				System.out.println("inyear");
	        				bw3.write(line);
							bw3.newLine();
							
	        			}
	        			else if(temp.compareTo(a[0])==0){
	        				
	        		    	if(Integer.parseInt(b[1])-Integer.parseInt(a[1])>0){
	        		    		System.out.println("inmonth");
	        		    		bw3.write(line);
								bw3.newLine();
					
	        				}
	        		    	else if(b[1].compareTo(a[1])==0){
	        		    		
	        		    			if(Integer.parseInt(b[0])-Integer.parseInt(a[2])==0){
	        		    				bw3.write(line);
	    								bw3.newLine();
	    								System.out.println("hello");
	        		    			}
	        		    	}
	        		    }
	        			
					}
				}
				f.delete();
				f2.renameTo(f);
			}
			
	        bw21.close();
	        bw3.close();
	        
	        
	       
	        
	        
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		try {
			data.clear();
			BufferedReader bw21=new BufferedReader(new FileReader(f));
			String line;
			int no1=0;
			//bw21.readLine();
			while((line=bw21.readLine())!=null){
				String[] c = line.split(",");
				no1++;
	        	File f3=new File("./src/files/Enrollement"+no1+".txt");
	        	BufferedWriter c1 = new BufferedWriter(new FileWriter(f3));
	        	c1.write("Name:-"+c[1]);
				c1.newLine();
				c1.write("Email id:-"+c[0]);
				c1.newLine();
				c1.write("Address:-"+c[2]);
				c1.newLine();
				c1.write("Mobile no:-"+c[3]);
				c1.newLine();
				c1.write("PhD Stream:-"+c[4]);
				c1.newLine();
				c1.write("PhD Area Preference 1:-"+c[5]);
				c1.newLine();
				c1.write("PhD Area Preference 2"+c[6]);
				c1.newLine();
				c1.write("PhD Area Preference 3:-"+c[7]);
				c1.newLine();
				c1.write("Gender:-"+c[8]);
				c1.newLine();
				c1.write("Category"+c[9]);
				c1.newLine();
				c1.write("Physically Disabled"+c[10]);
				c1.newLine();
				c1.write("DOB:-"+c[11]);
				c1.newLine();
				c1.write("Children/War Widows of Defence Personnel killed/Disabled:-"+c[12]);
				c1.newLine();
				c1.write("-"+c[13]);
				c1.newLine();
				c1.write("Father's Name:-"+c[14]);
				c1.newLine();
				c1.write("Nationality:-"+c[15]);
				c1.newLine();
				c1.write("Permanent Address:-"+c[16]);
				c1.newLine();
				c1.write("Pin Code:-"+c[17]);
				c1.newLine();
				c1.write("Xth Board:-"+c[18]);
				c1.newLine();
				c1.write("Xth Marks (%):-"+c[19]);
				c1.newLine();
				c1.write("Year of Passing Xth:-"+c[20]);
				c1.newLine();
				c1.write("XIIth Board:-"+c[21]);
				c1.newLine();
				c1.write("XIIth Marks (%):-"+c[22]);
				c1.newLine();
				c1.write("Year of Passing XIIth:-"+c[23]);
				c1.newLine();
				c1.write("Graduation Degree:-"+c[24]);
				c1.newLine();
				c1.write("Graduation Department:-"+c[25]);
				c1.newLine();
				c1.write("Graduation College:-"+c[26]);
				c1.newLine();
				c1.write("Graduation University:-"+c[27]);
				c1.newLine();
				c1.write("Graduation City:-"+c[28]);
				c1.newLine();
				c1.write("Graduation State:-"+c[29]);
				c1.newLine();
				c1.write("Year of Graduation:-"+c[30]);
				c1.newLine();
				c1.write("Grad CGPA or Marks:-"+c[31]);
				c1.newLine();
				c1.write("Applying for ECE PhD:-"+c[32]);
				c1.newLine();
				c1.write("ECE PhD Subject Preference 1:-"+c[33]);
				c1.newLine();
				c1.write("ECE PhD Subject Preference 2:-"+c[34]);
				c1.newLine();
				c1.write("ECE PhD Subject Preference 3:-"+c[35]);
				c1.newLine();
				c1.write("ECE PhD Subject Preference 4:-"+c[36]);
				c1.newLine();
				c1.write("Completed Post Grad:-"+c[37]);
				c1.newLine();
				c1.write("Post Grad Degree:-"+c[38]);
				c1.newLine();
				c1.write("Post Grad Department:-"+c[39]);
				c1.newLine();
				c1.write("Post Grad College:-"+c[40]);
				c1.newLine();
				c1.write("Post Grad Thesis:-"+c[41]);
				c1.newLine();
				c1.write("Post Grad City:-"+c[42]);
				c1.newLine();
				c1.write("Post Grad State:-"+c[43]);
				c1.newLine();
				c1.write("Year of Post Grad:-"+c[44]);
				c1.newLine();
				c1.write("Post Grad CGPA or Marks:-"+c[45]);
				c1.newLine();
				c1.write("Other Academic Degrees:-"+c[46]);
				c1.newLine();
				c1.write("Exam Name:-"+c[47]);
				c1.newLine();
				c1.write("Subject:-"+c[48]);
				c1.newLine();
				c1.write("Year:-"+c[49]);
				c1.newLine();
				c1.write("Score:-"+c[50]);
				c1.newLine();
				c1.write("Rank:-"+c[51]);
				c1.newLine();
				c1.write("Taken:-"+c[52]);
				c1.newLine();
				c1.write("Gate:-"+c[53]);
				c1.newLine();
				c1.write("Exam:-"+c[54]);
				c1.newLine();
				c1.write("GATE:-"+c[55]);
				c1.newLine();
				c1.write("Area:-"+c[56]);
				c1.newLine();
				c1.write("Year of Graduation:-"+c[57]);
				c1.newLine();
				/*c1.write("Marks:-"+c[58]);
				c1.newLine();
				c1.write("Score:-"+c[59]);
				c1.newLine();
				c1.write("Rank:-"+c[60]);
				c1.newLine();*/
	
				data.add(new Expense(c[59],c[1],"/home/mukesh/coding_stuff/Java_Project/src/files/Enrollement"+no1+".txt"));
				c1.close();
			}
			bw21.close();
			
	    	System.out.println("done");
			//record();
			}
			catch(NullPointerException e) {}
			//tabpane.getTabs().add(tab);
		Parent parent=FXMLLoader.load(getClass().getResource("/server/FilteredResult.fxml"));
		Scene scene =new Scene(parent);
		Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		
    	
		stage.setScene(scene);
		stage.show();
	  			
	    //Scene scene1 = new Scene(tabPane,300,300);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		//tab=new Tab();
    	}
		
    }
    @FXML
    public void initialize() {
       System.out.println(cnt);
    	if(cnt==1){
    	 
        TableColumn firstName = new TableColumn("Enrollment id");
        firstName.setMinWidth(165);
        TableColumn lastName = new TableColumn("name");
        lastName.setMinWidth(165);
        TableColumn link = new TableColumn("Links");
        link.setMinWidth(165);
        
        	
    	table.getColumns().clear();
        table.setItems(data);
        table.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            	
            	System.out.println("cell clicked!");
                 Hyperlink link=new Hyperlink();
                 try{
                	 Expense person = (Expense) table.getSelectionModel().getSelectedItem();
                	 String k=person.linkProperty().getValue().toString();   
                	 
                	 System.out.println(k);
                	 Process p=Runtime.getRuntime().exec("gedit "+ k);
                	 
                 }catch (IOException e) {
 	    			
 					e.printStackTrace();
 				}
            }
        });
        //System.out.println(cnt);
        //cnt++;
        firstName.setCellValueFactory(new PropertyValueFactory<>("firstName") );
        lastName.setCellValueFactory( new PropertyValueFactory<>("lastName")	);
        link.setCellValueFactory(new PropertyValueFactory<>("link"));
        //dt.setCellValueFactory( new PropertyValueFactory<>("dt"));
        
        
      
        	
        	
        
        table.getColumns().addAll(firstName,lastName,link);
 
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
       // vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll( table);
       try{
        record.setContent(vbox);
       }catch(NullPointerException e){}
        
  //return vbox;
    	}
    	cnt=1;
    	}
	
    @FXML
    void back(ActionEvent event) throws IOException {
    		File dir=new File("/home/mukesh/coding_stuff/Java_Project/src/files");
    		for(File file:dir.listFiles()) file.delete();
    		File dir1=new File("/home/mukesh/coding_stuff/Java_Project/src/template.csv");
    		File dir2=new File("/home/mukesh/coding_stuff/Java_Project/src/helper.csv");
    		dir1.delete();
    		dir2.delete();
    		Parent parent=FXMLLoader.load(getClass().getResource("/server/Fxml.fxml"));
    		Scene scene =new Scene(parent,800,800);
    		Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
    		stage.setScene(scene);
    		stage.show();
    		
    }
    
    
	
	
}
