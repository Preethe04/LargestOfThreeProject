import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestOfThreeTest {
    @Test
    public void testLargest() {
        LargestOfThree obj = new LargestOfThree();
        assertEquals(30, obj.largest(10, 30, 20));
        assertEquals(8, obj.largest(8, 8, 3));
        assertEquals(-1, obj.largest(-5, -1, -9));
    }
}
