import org.example.factory.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactoryTest {
    @Test
    void persianGardenTreeTest() {
        AbstractGardenFactory factory = new PersianGardenFactory();

        Assertions.assertTrue(factory.createTree() instanceof Chenar);
    }

    @Test
    void persianGardenFlowerTest() {
        AbstractGardenFactory factory = new PersianGardenFactory();

        Assertions.assertTrue(factory.createFlower() instanceof Khatmi);
    }

    @Test
    void japaneseGardenTreeTest() {
        AbstractGardenFactory factory = new JapaneseGardenFactory();

        Assertions.assertTrue(factory.createTree() instanceof Maple);
    }

    @Test
    void japaneseGardenFlowerTest() {
        AbstractGardenFactory factory = new JapaneseGardenFactory();

        Assertions.assertTrue(factory.createTree() instanceof Maple);
    }
}
