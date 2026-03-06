package creational.singleton;

public class ProductionLogger {
    private static ProductionLogger instance;

    private ProductionLogger() {
        // Приватний конструктор, щоб не можна було створити через new
    }

    public static ProductionLogger getInstance() {
        if (instance == null) {
            instance = new ProductionLogger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}