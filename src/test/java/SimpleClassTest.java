import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleClassTest {

    @Test
    public void testSum() {
        SimpleClass sc = new SimpleClass();
        int result = sc.sum(8, 10);
        assertEquals(18, result, "Sum of 8 and 10 should be 18.");
    }
}