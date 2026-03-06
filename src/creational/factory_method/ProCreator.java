package creational.factory_method;

public class ProCreator extends MacBookCreator {
    @Override
    public MacBook produceMacBook() {
        return new BasicPro();
    }
}
