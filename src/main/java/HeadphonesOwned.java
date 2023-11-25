public class HeadphonesOwned {
    public static void main(String[] args) {

        Headphones headphones1 = new Headphones("JBL", "Tune 520BT", 169.00, true);
        Headphones headphones2 = new Headphones("Superlux", "HD681 EVO", 137.99, false);

        System.out.println("Posiadane słuchawki:\n");
        System.out.println(headphones1.getHeadphonesInfo());
        System.out.println(headphones2.getHeadphonesInfo());
    }
}
