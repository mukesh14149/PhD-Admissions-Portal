import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Import {
	public static void main(String[] args){
		//System.out.println("hello");
		File f=new File("./src/Data_to_Import_with.csv");
		File f1=new File("./src/Feedback.csv");
		try {
			BufferedReader bw12 = new BufferedReader(new FileReader(f));
			BufferedWriter bw2= new BufferedWriter(new FileWriter(f1));
			String line;
			while((line=bw12.readLine())!=null){
				bw2.write(line);
				bw2.newLine();
			}
			bw2.close();
			bw12.close();
		}catch (IOException e) {
			// TODO Auto-generated catch block
	        
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
