public class CISItem {
    String name;
    String location;
    int price;
    String descpription;

    public CISItem(String name,String location,int price,String description)
    {
        this.name =name;
        this.location = location;
        this.price = price;
        this.descpription = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescpription() {
        return descpription;
    }

    public void setDescpription(String descpription) {
        this.descpription = descpription;
    }


}
