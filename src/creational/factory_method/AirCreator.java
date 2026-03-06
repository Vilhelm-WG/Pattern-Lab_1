package creational.factory_method;

import creational.Factory.BasicAir;
import creational.Factory.MacBook;

public class AirCreator extends MacBookCreator {
    @Override
    public MacBook produceMacBook() {
        return new BasicAir();
    }
}
