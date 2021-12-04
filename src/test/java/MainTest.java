import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testSum () {
        Main main = new Main();

        assertEquals(10, main.sum(2,8));
    }

}
