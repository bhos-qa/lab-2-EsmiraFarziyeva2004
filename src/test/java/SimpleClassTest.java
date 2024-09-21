import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleClassTest {

    @Test
    public void testSum() {
        SimpleClass sc = new SimpleClass();
        int result = sc.sum(2, 10);
        assertEquals(12, result, "Sum of 2 and 10 should be 12.");
    }
}