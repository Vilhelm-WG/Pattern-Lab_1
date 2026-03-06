package creational;// Файл: creational.Main.java

import creational.ObjectPool.MacBookPool;
import creational.ObjectPool.TestMacBook;
import creational.abstract_factory.AppleEcosystemFactory;
import creational.abstract_factory.Charger;
import creational.abstract_factory.Laptop;
import creational.abstract_factory.ModernSiliconFactory;
import creational.builder.CustomMacBook;
import creational.builder.CustomMacBookBuilder;
import creational.factory_method.MacBookFactory;
import creational.factory_method.StandardMacBook;
import creational.prototype.DeveloperSetup;
import creational.singleton.ProductionLogger;

public class Main {
    public static void main(String[] args) {
        // 1. Singleton: Отримуємо доступ до логера
        ProductionLogger logger = ProductionLogger.getInstance();
        logger.log("Початок робочої зміни IT-відділу.");

        // 2. Factory Method: Випускаємо стандартний Air M3
        logger.log("Замовляємо стандартний лептоп.");
        MacBookFactory factory = new MacBookFactory();
        StandardMacBook myAir = factory.createMacBook("Air");
        myAir.powerOn();

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

        // 6. Object Pool: Беремо девайс для тестів і повертаємо
        logger.log("Беремо тестовий девайс із пулу.");
        MacBookPool pool = new MacBookPool();
        TestMacBook testDevice = pool.acquire();
        testDevice.runTest();
        pool.release(testDevice);

        logger.log("Робочу зміну завершено.");
    }
}