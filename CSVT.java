package ga1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVT {

	public static void main(String[] args) {
		String line = "";
	        String splitBy = ",";
	        List < String[] > data = new ArrayList < > ();
	        try {
	            //parsing a CSV file into BufferedReader class constructor 
	            BufferedReader br = new BufferedReader(new FileReader( "E:\\COLLINS\\practice\\hw_200.csv"));
	            while ((line = br.readLine()) != null) //returns a Boolean value  
	            {
	                String[] cells = line.split(splitBy); // use comma as separator  
	                data.add(cells);
	            }
	            // now it can be randomly accessed like data.get(i)[i] or
	            // convert it to String [][]
	            int rows = data.size();
	            int cols = data.get(0).length;
	            String[][] arr = new String[rows][cols];
	            for (int i = 0; i < rows; i++) {
	                for (int j = 0; j < cols; j++) {
	                    arr[i][j] = data.get(i)[j];
	                }
	            }
	            // display the csv 
	            System.out.println("CSV File");
	            for (int i = 0; i < rows; i++) {
	                for (int j = 0; j < cols; j++) {
	                    System.out.print(arr[i][j]+" ");
	                }
	                System.out.println("");
	            }
	            
	            System.out.println(" Transpose of CSV File");
	            String transprac[][]= new String [cols][rows];
	    		for(int l=0; l<cols; l++) {
	    			for(int q=0; q<rows;q++) {
	    				transprac[l][q]= arr[q][l];
	    			}
	    		}
	    		for(int l=0; l<cols; l++) {
	    			for(int q =0; q<rows;q++) {
	    				System.out.println(transprac[l][q]);
	    				
	    			}
	    			System.out.println("");
	    		}


	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}
