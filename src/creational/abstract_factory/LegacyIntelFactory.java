package creational.abstract_factory;

public class LegacyIntelFactory implements AppleEcosystemFactory {
    public Laptop createLaptop() { return new IntelMacBook(); }
    public Charger createCharger() { return new MagSafe2Charger(); }
}
