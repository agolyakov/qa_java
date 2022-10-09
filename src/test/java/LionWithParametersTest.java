import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionWithParametersTest {

        private final String sex;
        private final Boolean hasMane;

        public LionWithParametersTest(String sex, Boolean hasMane) {
            this.sex = sex;
            this.hasMane = hasMane;
        }

        @Parameterized.Parameters
        public static Object[][] doesHaveMane() {
            return new Object[][]{
                    {"Самец", true},
                    {"Самка", false}
            };
        }

        @Test
        public void doesHaveManeTest() throws Exception {
            Lion lion = new Lion(sex);
            assertEquals(hasMane, lion.doesHaveMane());
        }
}