import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

public class ClassATests {

    @Test
    public void testOneIntegerFieldInA() {
        boolean classContainsInteger = false;
        Field[] allFields = A.class.getDeclaredFields();
        for (Field a : allFields) {
            classContainsInteger = a.getType().equals(int.class) && a.getName().equals("a") && Modifier.isPrivate(a.getModifiers());
            if (classContainsInteger) {
                break;
            }
        }
        assertTrue(classContainsInteger);
    }

    //TODO make second test to check that A contains double price

}
