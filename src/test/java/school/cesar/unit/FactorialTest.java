package school.cesar.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class FactorialTest {


    @Test
    public void calculate_callAmountForEight() {
        class FactoriaSpy extends Factorial {
            public int countCalls = 0;

            @Override
            public int calculate(int number) {
                countCalls++;
                return super.calculate(number);
            }

        }

        FactoriaSpy spy = new FactoriaSpy();
        spy.calculate(8);

        Assertions.assertEquals(8, spy.countCalls);
    }
}
