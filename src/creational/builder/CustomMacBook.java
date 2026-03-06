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

    public static class CustomMacBookBuilder {
        private CustomMacBook macBook;

        public CustomMacBookBuilder() {
            this.macBook = new CustomMacBook();
        }

        public CustomMacBookBuilder setChip(String chip) {
            macBook.setChip(chip);
            return this;
        }

        public CustomMacBookBuilder setRam(int ram) {
            macBook.setRam(ram);
            return this;
        }

        public CustomMacBookBuilder setStorage(int storage) {
            macBook.setStorage(storage);
            return this;
        }

        public CustomMacBook build() {
            return this.macBook;
        }
    }

}
