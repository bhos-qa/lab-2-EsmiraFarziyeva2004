import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleClassTest {

    @Test
    public void testSum() {
        SimpleClass sc = new SimpleClass();
        int result = sc.sum(5, 10);
        assertEquals(15, result, "Sum of 7 and 10 should be 17.");
    }
}