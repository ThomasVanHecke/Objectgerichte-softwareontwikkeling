package tekstbestand;

import java.io.*;
import java.util.Scanner;

public class Programma2 {

	public static void main(String[] args) throws IOException {
		FileReader fR = new FileReader("Programma1.txt");
		Scanner scFile = new Scanner(fR);
		
		int getal; // Creating variable to hold the readed value
		int getallenLijst[][]; // Creating empty list to store the readed values in a 2D matrix
		int index = 0; // Creating a variable index to hold the index value we want to store the readed values
		// hasNext method returns a boolean
		while(scFile.hasNext()) {
			getal = scFile.nextInt();
			System.out.println(getal);
			
			index ++;
		}
		scFile.close();
	}

}
