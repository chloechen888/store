public class Arduino extends ElectronicItem {
    String version;

    public Arduino(String name, String location, int price,String description, int storageCapacity, String model, String operatingSystem, String maker,String version) {
        super(name, location, price,description, storageCapacity, model, operatingSystem, maker);
        this.version = version;
    }


    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
