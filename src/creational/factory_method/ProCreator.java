package creational.factory_method;

import creational.Factory.BasicPro;
import creational.Factory.MacBook;

public class ProCreator extends MacBookCreator {
    @Override
    public MacBook produceMacBook() {
        return new BasicPro();
    }
}
