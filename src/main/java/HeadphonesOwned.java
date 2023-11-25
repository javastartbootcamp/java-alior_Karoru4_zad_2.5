public class HeadphonesOwned {
    public static void main(String[] args) {

        Headphones headphones1 = new Headphones();
        headphones1.producer = "JBL";
        headphones1.model = "Tune 520BT";
        headphones1.price = 169.00;
        headphones1.areWireless = true;

        Headphones headphones2 = new Headphones();
        headphones2.producer = "Superlux";
        headphones2.model = "HD681 EVO";
        headphones2.price = 137.99;
        headphones2.areWireless = false;

        System.out.println("Posiadane słuchawki:\n");
        System.out.println("Producent: " + " " + headphones1.producer + ", model" + headphones1.model + ". Cena: "
                + headphones1.price + "zł " + "\nCzy są bezprzewodowe: " + headphones1.areWireless);
        System.out.println("Producent: " + " " + headphones2.producer + ", model" + headphones2.model + ". Cena: "
                + headphones2.price + "zł " + "\nCzy są bezprzewodowe: " + headphones2.areWireless);
    }
}
