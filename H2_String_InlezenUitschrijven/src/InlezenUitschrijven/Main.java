package InlezenUitschrijven;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException, FileNotFoundException { // Catch-Specify-eis
		FileReader fr = new FileReader("Inlezen.txt");
		Scanner sc1 = new Scanner(fr);
		
		FileWriter fw = new FileWriter("Uitschrijven.txt");
		PrintWriter pw = new PrintWriter(fw);
		fr = new FileReader("Inlezen.txt");
		Scanner sc2 = new Scanner(fr);
		
		
		int counter = 0;
		
		while(sc1.hasNext()) {
			System.out.println(sc1.next());
			counter ++;
			//System.out.println("Counter: " + counter);
		}
		sc1.close();
		System.out.println("Counter: " + counter);
		
		while(sc2.hasNextLine()) {
			String lowerCaseLine = sc2.nextLine().toLowerCase();
			pw.println(lowerCaseLine);
		}
		
		
		pw.close();
		sc2.close();
	}
}
