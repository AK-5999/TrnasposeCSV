package ga1;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
	public static void main(String[] args) {
		
		String path = "E:\\COLLINS\\practice\\AK4.csv";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line = "";
			while((line =br.readLine() )!= null) { 
				/*System.out.println(line);
				break;*/
				//to print the values of csv rowwise
				
				
				String[] values = line.split(",");//to print the values of csv column wise
				System.out.println(values[0]);
				
				
			}
	
		}catch(FileNotFoundException e) {
			e.printStackTrace();;
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
    
}
