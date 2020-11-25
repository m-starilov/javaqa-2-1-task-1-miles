public class Main {
    public static void main(String[] args) {
        long ticketPrice = 14025_10;
        int everyRuble = 20;
        long bonusMiles = ticketPrice /100 / everyRuble;

        System.out.println(bonusMiles);
    }
}
