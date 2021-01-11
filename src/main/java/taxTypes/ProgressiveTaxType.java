package taxTypes;

public class ProgressiveTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount){
        return (amount < 1000) ?  amount * 0.1 : amount * 0.15;
    }
}
