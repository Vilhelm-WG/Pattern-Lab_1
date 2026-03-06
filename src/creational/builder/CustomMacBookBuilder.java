package creational.builder;

public class CustomMacBookBuilder {
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
