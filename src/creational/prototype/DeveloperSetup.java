package creational.prototype;

public class DeveloperSetup implements Cloneable {
    private String osVersion;
    private String installedIde;

    public DeveloperSetup(String osVersion, String installedIde) {
        this.osVersion = osVersion;
        this.installedIde = installedIde;
    }

    public void setInstalledIde(String installedIde) {
        this.installedIde = installedIde;
    }

    public void showSetup() {
        System.out.println("Налаштування: OS " + osVersion + ", IDE: " + installedIde);
    }

    @Override
    public DeveloperSetup clone() {
        try {
            return (DeveloperSetup) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
