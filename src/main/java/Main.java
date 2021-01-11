import taxTypes.*;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();

        Bill[] payments = new Bill[]{
                new Bill(1000, new IncomeTaxType(),taxService),
                new Bill(100, new ProgressiveTaxType(),taxService),
                new Bill(1000, new VATaxType(),taxService),
        };

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}