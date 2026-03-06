package creational.abstract_factory;

public class ModernSiliconFactory implements AppleEcosystemFactory {
    public Laptop createLaptop() { return new SiliconMacBook(); }
    public Charger createCharger() { return new MagSafe3Charger(); }
}
