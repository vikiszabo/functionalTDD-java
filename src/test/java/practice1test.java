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

    @Test
    public void TestGetFirstEvenNumberStringNotFound() {
        String firstEven = practice1.getFirstEvenString(Arrays.asList(1, 3, 5).stream());
        assertEquals("NONE", firstEven);
    }

    @Test
    public void TestGetFirstOddNumberStringNotFound() {
        String firstOdd = practice1.getFirstOddString(Arrays.asList(2, 4, 6).stream());
        assertEquals("NONE", firstOdd);
    }

    @Test
    public void TestGetOddCount1() {
        long count = practice1.getOddCount(Arrays.asList(2, 4).stream());
        assertEquals(0, count);
    }

    @Test
    public void TestGetOddCount2() {
        long count = practice1.getOddCount(Arrays.asList(1, 3, 4, 5, 6).stream());
        assertEquals(3, count);
    }

}