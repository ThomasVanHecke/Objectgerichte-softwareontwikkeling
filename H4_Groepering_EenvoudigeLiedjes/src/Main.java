import java.util.Scanner;

public class Main {
	public static void schrijfKeuzes() {
		System.out.println("0 : stop");
		System.out.println("1 : ingeven nieuw lied");
		System.out.println("2 : uitschrijven alle liedjes");
		System.out.println("3 : sorteren op titel");
		System.out.println("4 : sorteren op duur Comparator");
		System.out.println("5 : sorteren op duur lamda");
		System.out.println("6 : zoeken op woord in titel");
	}
	
	public static void main(String[] args) {
		Liedjes mijnLiedjes = new Liedjes();
		Liedjes geselecteerdeLiedjes;
		Scanner sc = new Scanner(System.in);
		int keuze;
		String titel;
		double duur;
		
		do{
			schrijfKeuzes();
			keuze = Integer.parseInt(sc.nextLine());
			switch (keuze){
			case 1: System.out.println("Geef titel in: ");
					titel = sc.nextLine();
					System.out.println("Geef duur in: ");
					duur = Double.parseDouble(sc.nextLine());
					mijnLiedjes.voegLiedToe(new Lied(titel,duur));
					break;
			case 2: System.out.println(mijnLiedjes); break;
			case 3: mijnLiedjes.sorteerOpTitel(); break;
			case 4: mijnLiedjes.sorteerOpDuurMetComparator(); break;
			case 5: mijnLiedjes.sorteerOpDuurMetLambda(); break;
			case 6: System.out.print("geef woord: ");
					String woord = sc.nextLine();
					geselecteerdeLiedjes = mijnLiedjes.getGeselecteerdeLiedjesMetInTitel(woord);
					System.out.println(geselecteerdeLiedjes);
					break;
			}
		} 
		while (keuze != 0);
		sc.close();
	}
}
