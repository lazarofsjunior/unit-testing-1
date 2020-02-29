package school.cesar.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    private Palindrome palindrome = new Palindrome();

    @Test
    public void check_stringLength1_true() {
        Assertions.assertTrue(palindrome.check("a"));
    }

    @Test
    public void check_stringWithSameStartEnd_true() {
        Assertions.assertTrue(palindrome.check("aa"));
    }

    @Test
    public void check_nonPalindromeWord_false() {
        Assertions.assertFalse(palindrome.check("ab"));
    }

    @Test
    public void check_countPalindromeCalls_true() {

        class PalindromeSpy extends Palindrome {
            public int countCalls = 0;

            @Override
            public boolean check(String word) {
                countCalls++;
                return super.check(word);
            }

        }

        PalindromeSpy spy = new PalindromeSpy();
        spy.check("aa");

        Assertions.assertEquals(2, spy.countCalls);

    }

}
