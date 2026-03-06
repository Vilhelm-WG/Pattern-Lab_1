package creational.factory_method;

public class MacBookPro implements StandardMacBook {
    @Override
    public void powerOn() {
        System.out.println("MacBook Pro запускається. Кулери готові до важкої роботи.");
    }
}