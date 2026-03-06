package creational.ObjectPool;

import java.util.ArrayList;
import java.util.List;

public class MacBookPool {
    private List<TestMacBook> available = new ArrayList<>();
    private List<TestMacBook> inUse = new ArrayList<>();

    public MacBookPool() {
        // Створюємо пул з 2 ноутбуків
        available.add(new TestMacBook(1));
        available.add(new TestMacBook(2));
    }

    public TestMacBook acquire() {
        if (available.isEmpty()) {
            System.out.println("Немає вільних макбуків у пулі!");
            return null;
        }
        TestMacBook mac = available.remove(0);
        inUse.add(mac);
        return mac;
    }

    public void release(TestMacBook mac) {
        inUse.remove(mac);
        available.add(mac);
        System.out.println("MacBook повернуто в пул.");
    }
}
