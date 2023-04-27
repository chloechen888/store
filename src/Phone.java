public class Phone extends ElectronicItem{
    String networkType;
    int screenSize;

    public Phone(String name, String location, int price,String description, int storageCapacity, String model, String operatingSystem, String maker,String networkType,int screenSize) {
        super(name, location, price,description, storageCapacity, model, operatingSystem, maker);
        this.networkType = networkType;
        this.screenSize = screenSize;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
