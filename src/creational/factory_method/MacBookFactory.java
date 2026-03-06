package creational.factory_method;

public class MacBookFactory {
    public StandardMacBook createMacBook(String type) {
        if (type.equalsIgnoreCase("Air")) {
            return new MacBookAir();
        } else if (type.equalsIgnoreCase("Pro")) {
            return new MacBookPro();
        }
        throw new IllegalArgumentException("Невідома модель: " + type);
    }
}
