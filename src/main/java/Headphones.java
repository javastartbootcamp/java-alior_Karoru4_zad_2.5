public class Headphones {

    String producer;
    String model;
    Double price;
    Boolean areWireless;

    public Headphones(String producer, String model, Double price, Boolean areWireless) {
        this.producer = producer;
        this.model = model;
        this.price = price;
        this.areWireless = areWireless;
    }

    String getHeadphonesInfo() {
        return "Producent: " + " " + producer + ", model" + model + ". Cena: "
                + price + "zł " + "\nCzy są bezprzewodowe: " + areWireless;
    }
}
