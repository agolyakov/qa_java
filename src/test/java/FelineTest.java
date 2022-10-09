import com.example.Feline;
import org.junit.Test;


import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void getKittensTest() {
        Integer expected = 1;
        assertEquals(expected, feline.getKittens());
    }

    @Test
    public void getKittensCountTest() {
        int n = 10;
        Integer expected = 10;
        assertEquals(expected, feline.getKittens(n));
    }

    @Test
    public void getFamilyTest() {
        String expected = "Кошачьи";
        assertEquals(expected, feline.getFamily());
    }
}
