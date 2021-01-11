package taxTypes;


import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.typeCompatibleWith;

class VATaxTypeTest {
    VATaxType vaTaxType = new VATaxType();

    @Test
    void calculationTest(){
        // given:
        double amount = 100;

        // expect
        assertThat(vaTaxType.calculateTaxFor(amount), equalTo(18.0));
    }

    @Test
    void givenSubclass_whenTypeComparable(){
        assertThat(VATaxType.class, typeCompatibleWith(TaxType.class));
    }
}