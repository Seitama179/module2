package models;

import services.Discount;

import java.time.LocalDate;

public class Meat extends Material implements Discount {
    private double weight;

    public Meat(String id, String name, LocalDate manufactureDate, double cost, double weight) {
        super(id, name, manufactureDate, cost);
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return getCost()*getWeight();
    }

    @Override
    public LocalDate getExpireDate() {
        return getManufactureDate().plusDays(7);
    }

    @Override
    public double getRealMoney(){
        long daysUntilExpiry = LocalDate.now().until(getExpireDate()).getDays();
        if(daysUntilExpiry <= 5){
            return getAmount() * 0.7;
        } else {
            return getAmount()*0.9;
        }
    }
}
