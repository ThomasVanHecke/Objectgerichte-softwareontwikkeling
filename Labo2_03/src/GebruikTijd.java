import java.util.Scanner;

public class GebruikTijd {
	
  public static void main(String[] args)   {
	  
  	Tijd t1 = new Tijd();        // defaultconstructor, nl. geen argumenten
  	
  	int uurWaarde, minuutWaarde, secondWaarde;
	Scanner sc = new Scanner( System.in);
	  
	System.out.print("uren : ");
	uurWaarde = sc.nextInt();
	System.out.print("minuten : ");
	minuutWaarde = sc.nextInt() ;
	System.out.print("seconden : ");
	secondWaarde = sc.nextInt() ;
	  	
	Tijd t2 = new Tijd(uurWaarde, minuutWaarde, secondWaarde);// constructor met 3 argumenten
	
  	Tijd t3 = new Tijd(t2);      // constructor met 1 argument, nl. een object van klasse Tijd
  	
  	System.out.println("Tijd t1: ");
    t1.schrijfTijd();
    System.out.println("Tijd t2: ");
    t2.schrijfTijd();
    System.out.println("Tijd t3: ");
    t3.schrijfTijd();
    sc.close();
    
    }
}