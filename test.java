import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class test {

    public static void main(String[] args) {
        //
    }

    public static void zero_plus_0_test() {
        app app_test = new app();
        assertEquals(app_test.addition(0, 0), 0);
    }
}
