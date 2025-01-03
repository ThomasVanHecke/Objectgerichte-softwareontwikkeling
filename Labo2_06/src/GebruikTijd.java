import java.util.Scanner;

public class GebruikTijd {
	
  public static void main(String[] args)   {
	  
	  int uurWaarde, minuutWaarde, secondWaarde;
	  Scanner sc = new Scanner( System.in);
	  
	  System.out.print("uren: ");
	  uurWaarde = sc.nextInt();
	  System.out.print("minuten: ");
	  minuutWaarde = sc.nextInt() ;
	  System.out.print("seconden : ");
	  secondWaarde = sc.nextInt() ;
	  	
	  Tijd t1 = new Tijd(uurWaarde, minuutWaarde, secondWaarde);        
	  Tijd t2 = new Tijd();
	 
	  System.out.println("Tijd t1: ");
	  t1.schrijfTijd();												// ingegeven tijd komt op scherm
	  System.out.println("Tijd t2: ");
	  t2.schrijfTijd(); 	
	  
	  t2.setTijd(t1);      											
	  
	  System.out.println("Tijd t1: ");
	  t1.schrijfTijd();												// ingegeven tijd komt op scherm
	  System.out.println("Tijd t2: ");
	  t2.schrijfTijd(); 		

	  t2.resetOpNul();
	  
	  System.out.println("Tijd t1: ");
	  t1.schrijfTijd();  											// 0 u 0 m 0 s komt op scherm ???
	  System.out.println("Tijd t2: ");
	  t2.schrijfTijd();
	  
	  t2 = t1.modulo12Tijd();										// omzetten naar 12 uren stelsel
	  System.out.println("Tijd t1: ");
	  t1.schrijfTijd();
	  System.out.println("Tijd t2: ");
	  t2.schrijfTijd();
	  sc.close();
	  sc.close();
	
  }
}