public class ElectronicItem extends CISItem{
    int storageCapacity;
    String model;
    String maker;
    String operatingSystem;

    public ElectronicItem(String name, String location, int price,String description, int storageCapacity, String model, String operatingSystem,String maker) {
        super(name, location, price, description);
        this.storageCapacity = storageCapacity;
        this.model = model;
        this.maker = maker;
        this.operatingSystem = operatingSystem;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }


}
