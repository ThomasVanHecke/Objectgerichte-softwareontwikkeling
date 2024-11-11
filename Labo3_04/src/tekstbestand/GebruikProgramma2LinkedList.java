package tekstbestand;

import java.io.*;
import java.util.Scanner;

public class GebruikProgramma2LinkedList {

	public static void main(String[] args) throws IOException {
		FileReader fR = new FileReader("Programma1.txt");
		Scanner scFile = new Scanner(fR);
		Programma2LinkedList getallen = new Programma2LinkedList(); // Creating empty list (initialy with 10 spaces) to store the readed values 
		
		int getal; // Creating variable to hold the readed value
		
		// hasNext method returns a boolean
		while(scFile.hasNext()) {
			getal = scFile.nextInt();
			System.out.println("getal: " + getal);
			getallen.voegToe(getal);
		
		}
		System.out.println("LinkedList getallen: ");
		System.out.println(getallen);
		scFile.close();
	}

}
