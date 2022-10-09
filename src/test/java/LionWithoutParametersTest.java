import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionWithoutParametersTest {
    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion(feline);
        int expectedKittens = 1;
        assertEquals(expectedKittens, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(food);
        Lion lion = new Lion(feline);
        assertEquals(food, lion.getFood());
    }

    @Test
    public void getExceptionTest() {
        Exception exception = assertThrows(Exception.class, () -> new Lion("Сомец"));
        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}
