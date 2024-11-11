package tekstbestand;

import java.io.*;
import java.util.Scanner;

public class GebruikProgramma2Matrix {
	
	public static void main(String[] args) throws IOException {
		FileReader fR = new FileReader("Programma1.txt");
		Scanner scFile = new Scanner(fR);
		Programma2Matrix m = new Programma2Matrix(); // Creating object
		
		int getal; // Creating variable to hold the readed value
		int row = 0; // Initialising row to 0
		int col = 0; // Initialising col to 0
		
		// hasNext method returns a boolean
		while(scFile.hasNext()) {
			getal = scFile.nextInt();
			
			if(col < 4 && row <= 1) {
				m.setMatrix(row, col, getal);
				col ++;
				System.out.println("Col: " + col);
				System.out.println("Row: " + row);
				m.getMatrix();
			}
			
			else if(col == 4 && row <= 1) {
				m.setMatrix(row, col, getal);
				col = 0;
				row ++;
				System.out.println("Col: " + col);
				System.out.println("Row: " + row);
				m.getMatrix();
			}
			
			else {
				break;
			}
		}
		System.out.println("Matrix: ");
		m.printMatrx();
		scFile.close();
	}
}
