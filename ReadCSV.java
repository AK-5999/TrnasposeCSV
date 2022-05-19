package csvtranspose;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    public static String[][] transposeMatrix(String[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        String[][] transposedMatrix = new String[n][m];

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                transposedMatrix[x][y] = matrix[y][x];
            }
        }

        return transposedMatrix;
    }
    public static void display(String[][] arr, int rows, int cols){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        String line = "";
        String splitBy = ",";
        List < String[] > data = new ArrayList < > ();
        try {
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("E:\\COLLINS\\practice\\hw_200.CSV"));
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
            System.out.println("Original csv");
            display(arr, rows, cols);
            String[][] tArr = transposeMatrix(arr);
            System.out.println(" ");
            System.out.println("Transpose of csv");
            display(tArr, cols, rows);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}