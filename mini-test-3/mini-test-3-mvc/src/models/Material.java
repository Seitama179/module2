package models;
import services.Discount;

import java.time.LocalDate;

public abstract class Material implements Discount {
    private String id;
    private String name;
    private LocalDate manufactureDate;
    private double cost;
    public Material(String id, String name, LocalDate manufactureDate, double cost) {
        this.id = id;
        this.name = name;
        this.manufactureDate = manufactureDate;
        this.cost = cost;
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

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    public abstract double getAmount();
    public abstract LocalDate getExpireDate();

}
