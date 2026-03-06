package creational.factory_method;

public abstract class MacBookCreator {
    // Той самий Фабричний Метод
    public abstract MacBook produceMacBook();

    // Якась загальна бізнес-логіка, яка використовує фабричний метод
    public void deliverToStore() {
        MacBook mac = produceMacBook();
        mac.assemble();
        System.out.println("Ноутбук запаковано і відправлено в Apple Store!");
    }
}