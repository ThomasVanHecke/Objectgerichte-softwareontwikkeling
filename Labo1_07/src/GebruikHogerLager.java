import java.util.Scanner;

public class GebruikHogerLager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("doe een gok: ");
		HogerLager hl = new HogerLager(1, 10, sc.nextInt());
		hl.aantalPoging();
		sc.close();
	}

}
