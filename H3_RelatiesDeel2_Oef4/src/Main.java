
public class Main {
    public static void main(String[] args) {
        Dier dier1 = new Dier("Hond");
        Dier dier2 = new Dier("Kat");

        ComparatorDier naamComparator = new NaamComparator();

        boolean result = dier1.komtVoor(dier2, naamComparator);
        System.out.println("Result: " + result);
    }
}
