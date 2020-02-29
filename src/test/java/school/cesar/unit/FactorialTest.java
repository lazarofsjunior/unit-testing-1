package school.cesar.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class FactorialTest {


    @Mock
    Factorial factorial;


    @Test
    public void calculate_callAmountForEight() {

        factorial.calculate(8);
        verify(factorial, times(8)).calculate(8);

        /*class FactoriaSpy extends Factorial {
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

    }*/
    }

}
