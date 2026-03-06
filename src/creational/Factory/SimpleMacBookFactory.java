package creational.Factory;

public class SimpleMacBookFactory {
    public MacBook createMacBook(String type) {
        if (type.equalsIgnoreCase("Air")) {
            return new BasicAir();
        } else if (type.equalsIgnoreCase("Pro")) {
            return new BasicPro();
        }
        throw new IllegalArgumentException("Невідома модель: " + type);
    }
}
