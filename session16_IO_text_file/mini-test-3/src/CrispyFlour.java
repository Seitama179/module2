import java.time.LocalDate;

public class CrispyFlour extends Material {
    private double quantity;
    public CrispyFlour(String id, String name, LocalDate manufactureDate, double cost, double quantity){
        super(id, name, manufactureDate, cost);
        this.quantity = quantity;
    }

    public double getQuantity(){
        return quantity;
    }
    public void setQuantity(double quantity){
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return getQuantity() * getCost();
    }

    @Override
    public LocalDate getExpireDate() {
        return getManufactureDate().plusYears(1);
    }
    @Override
    public double getRealMoney(){
        long monthsUntilExpiry = LocalDate.now().until(getExpireDate()).toTotalMonths();
        if(monthsUntilExpiry <= 4){
            return getAmount() * 0.8;
        } else {
            return getAmount()*0.95;
        }
    }

}
