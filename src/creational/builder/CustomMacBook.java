package creational.builder;

public class CustomMacBook {
    private String chip;
    private int ram;
    private int storage;

    public void setChip(String chip) { this.chip = chip; }
    public void setRam(int ram) { this.ram = ram; }
    public void setStorage(int storage) { this.storage = storage; }

    @Override
    public String toString() {
        return "Кастомний MacBook [Chip=" + chip + ", RAM=" + ram + "GB, SSD=" + storage + "GB]";
    }
}
