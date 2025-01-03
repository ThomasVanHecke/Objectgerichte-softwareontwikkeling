import Punt.Punt;

public class Main {
    public static void main(String[] args) {
        // Maak enkele Punt-objecten aan
        Punt puntA = new Punt(1, 2);
        Punt puntB = new Punt(4, 6);
        Punt puntC = new Punt(7, 8);
        
        // Maak een Lijnstuk aan met puntA en puntB
        Lijnstuk lijnstuk1 = new Lijnstuk(puntA, puntB);
        
        // Maak een ander Lijnstuk aan met puntB en puntC
        Lijnstuk lijnstuk2 = new Lijnstuk(puntB, puntC);
        
        // Test of de punten correct zijn
        System.out.println("Punt A: " + puntA);
        System.out.println("Punt B: " + puntB);
        System.out.println("Punt C: " + puntC);
        
        // Test of de lijnstukken correct zijn
        System.out.println("Lijnstuk 1: " + lijnstuk1);
        System.out.println("Lijnstuk 2: " + lijnstuk2);
        
        // Test de lengte van de lijnstukken
        System.out.println("Lengte van Lijnstuk 1: " + lijnstuk1.getLengte());
        System.out.println("Lengte van Lijnstuk 2: " + lijnstuk2.getLengte());
        
        // Extra tests
        assert lijnstuk1.getLengte() == 5.0 : "Fout: Lijnstuk 1 lengte klopt niet!";
        assert lijnstuk2.getLengte() == 2.828427 : "Fout: Lijnstuk 2 lengte klopt niet!";
    }
}

