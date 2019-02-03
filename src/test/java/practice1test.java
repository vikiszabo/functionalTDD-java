import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class practice1test {

    @Test
    public void TestGetFirstEvenNumber() {
        Integer firstEven = practice1.getFirstEven(Arrays.asList(1, 3, 4, 7, 6).stream());
        assertEquals(new Integer(4), firstEven);
    }

    @Test
    public void TestGetFirstEvenNumberString() {
        String firstEven = practice1.getFirstEvenString(Arrays.asList(1, 3, 4, 7).stream());
        assertEquals("4", firstEven);
    }

}