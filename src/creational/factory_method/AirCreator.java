package creational.factory_method;

public class AirCreator extends MacBookCreator {
    @Override
    public MacBook produceMacBook() {
        return new BasicAir();
    }
}
