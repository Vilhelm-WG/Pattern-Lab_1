package creational;// Файл: creational.Main.java

import creational.Factory.MacBook;
import creational.Factory.SimpleMacBookFactory;
import creational.abstract_factory.AppleEcosystemFactory;
import creational.abstract_factory.Charger;
import creational.abstract_factory.Laptop;
import creational.abstract_factory.ModernSiliconFactory;
import creational.builder.CustomMacBook;
import creational.builder.CustomMacBookBuilder;
import creational.factory_method.AirCreator;
import creational.factory_method.MacBookCreator;
import creational.factory_method.ProCreator;
import creational.prototype.DeveloperSetup;
import creational.singleton.ProductionLogger;

public class Main {
    public static void main(String[] args) {
        // 1. Singleton: Отримуємо доступ до логера
        ProductionLogger logger = ProductionLogger.getInstance();
        logger.log("Початок робочої зміни IT-відділу.");

        System.out.println("\n--- 2. Simple Factory ---");
        SimpleMacBookFactory simpleFactory = new SimpleMacBookFactory();
        MacBook simpleAir = simpleFactory.createMacBook("Air");
        simpleAir.assemble();

        System.out.println("\n--- 3. Factory Method ---");
        // Використовуємо фабричний метод через конкретних творців
        MacBookCreator airPlant = new AirCreator();
        airPlant.deliverToStore(); // Викличе BasicAir

        MacBookCreator proPlant = new ProCreator();
        proPlant.deliverToStore(); // Викличе BasicPro

        // 3. Builder: Збираємо потужний кастомний мак
        logger.log("Збираємо кастомний лептоп для тімліда.");
        CustomMacBook customPro = new CustomMacBookBuilder()
                .setChip("M3 Max")
                .setRam(128)
                .setStorage(2048)
                .build();
        System.out.println(customPro);

        // 4. Abstract Factory: Видаємо обладнання сумісне між собою
        logger.log("Комплектуємо сучасне робоче місце.");
        AppleEcosystemFactory ecosystemFactory = new ModernSiliconFactory();
        Laptop modernLaptop = ecosystemFactory.createLaptop();
        Charger modernCharger = ecosystemFactory.createCharger();
        modernLaptop.showSpecs();
        modernCharger.charge();

        // 5. Prototype: Налаштовуємо середовище розробника
        logger.log("Клонуємо налаштування для нових розробників.");
        DeveloperSetup baseSetup = new DeveloperSetup("macOS Sonoma", "IntelliJ IDEA");
        DeveloperSetup dev1Setup = baseSetup.clone();
        DeveloperSetup dev2Setup = baseSetup.clone();
        dev2Setup.setInstalledIde("WebStorm"); // Трохи змінили клон
        dev1Setup.showSetup();
        dev2Setup.showSetup();

    }
}