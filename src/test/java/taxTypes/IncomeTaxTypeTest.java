package taxTypes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

class IncomeTaxTypeTest {
    IncomeTaxType incomeTaxType = new IncomeTaxType();

    @Test
    void calculationTest(){
        // given:
        double amount1 = 100;

        // expect
        assertThat(incomeTaxType.calculateTaxFor(amount1), equalTo(13.0));
    }

    @Test
    void givenSubclass_whenTypeComparable(){
        assertThat(IncomeTaxType.class, typeCompatibleWith(TaxType.class));
    }


}