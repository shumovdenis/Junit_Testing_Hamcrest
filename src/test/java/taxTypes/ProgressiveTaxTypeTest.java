package taxTypes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

class ProgressiveTaxTypeTest {
    ProgressiveTaxType progressiveTaxType = new ProgressiveTaxType();


    @Test
    void calculationTest(){
        // given:
        double amount1 = 100;
        double amount2 = 1000;

        // expect
        assertThat(progressiveTaxType.calculateTaxFor(amount1), equalTo(10.0));
        assertThat(progressiveTaxType.calculateTaxFor(amount2), equalTo(150.0));

    }

    @Test
    void givenSubclass_whenTypeComparable(){
        assertThat(ProgressiveTaxType.class, typeCompatibleWith(TaxType.class));
    }

}