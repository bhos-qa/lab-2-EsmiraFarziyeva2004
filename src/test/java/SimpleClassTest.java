import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleClassTest {

    @Test
    public void testSum() {
        SimpleClass sc = new SimpleClass();
        int result = sc.sum(7, 10);
        assertEquals(17, result, "Sum of 7 and 10 should be 17.");
    }
}