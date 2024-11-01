package tekstbestand;

import java.io.*;
import java.util.Scanner;

public class Programma1 {
	public static void main (String[] args) throws IOException{
		FileWriter fW = new FileWriter("Programma1.txt");
		PrintWriter pW = new PrintWriter(fW);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Geef eerste integer: ");
		pW.println(sc.nextInt());
		
		System.out.print("Geef tweede integer: ");
		pW.println(sc.nextInt());
		
		System.out.print("Geef derde integer: ");
		pW.println(sc.nextInt());
		
		System.out.print("Geef vierde integer: ");
		pW.println(sc.nextInt());
		
		System.out.print("Geef vijfde integer: ");
		pW.println(sc.nextInt());
		
		System.out.print("Geef zesde integer: ");
		pW.println(sc.nextInt());
		
		System.out.print("Geef zevende integer: ");
		pW.println(sc.nextInt());
		
		System.out.print("Geef achtste integer: ");
		pW.println(sc.nextInt());
		
		System.out.print("Geef negende integer: ");
		pW.println(sc.nextInt());
		
		System.out.print("Geef tiende integer: ");
		pW.println(sc.nextInt());
		
		pW.close();
		sc.close();
	}
}
