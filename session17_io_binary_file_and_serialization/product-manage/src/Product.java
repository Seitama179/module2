public class Product {
    private String id;
    private String name;
    private double price;
    private String manufacturer;
    private String description;
    public Product(String id, String name, double price, String manufacturer, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String toString() {
        return "Product{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", price='" + getPrice() + '\'' +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", description='" + getDescription() + '\'' +
                '}';
    }
}
