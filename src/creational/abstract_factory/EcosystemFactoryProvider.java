package creational.abstract_factory;

public class EcosystemFactoryProvider {

    // Статичний метод, який повертає потрібну фабрику
    public static AppleEcosystemFactory getFactory(String type) {
        if (type.equalsIgnoreCase("Modern")) {
            return new ModernSiliconFactory();
        } else if (type.equalsIgnoreCase("Legacy")) {
            return new LegacyIntelFactory();
        }
        throw new IllegalArgumentException("Невідомий тип екосистеми: " + type);
    }
}