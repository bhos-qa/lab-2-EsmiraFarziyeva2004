import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleClassTest {

    @Test
    public void testSum() {
        SimpleClass sc = new SimpleClass();
        int result = sc.sum(9, 10);
        assertEquals(19, result, "Sum of 9 and 10 should be 19.");
    }
}