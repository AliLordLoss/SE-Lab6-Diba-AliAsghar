import org.example.prototype.HelicopterPrototype;
import org.example.prototype.PlanePrototype;
import org.example.prototype.Prototype;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class PrototypeTest {
    @Test
    void testPlanePrototype() {
        Prototype plane = new PlanePrototype("F14");
        Prototype planeCopy = plane.clone();

        Assertions.assertTrue(!Objects.equals(plane, planeCopy) && plane.getName().equals(planeCopy.getName()));
    }

    @Test
    void testHelicopterPrototype() {
        Prototype helicopter = new HelicopterPrototype("Black Hawk");
        Prototype helicopterCopy = helicopter.clone();

        Assertions.assertTrue(!Objects.equals(helicopter, helicopterCopy) && helicopter.getName().equals(helicopterCopy.getName()));
    }
}
