package creational.factory_method;

public class MacBookAir implements StandardMacBook {
    @Override
    public void powerOn() {
        System.out.println("MacBook Air M3 запускається. Легкий та безшумний.");
    }
}
