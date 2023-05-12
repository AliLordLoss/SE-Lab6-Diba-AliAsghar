import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuilderTest {
    @Test
    void TestBowBuilder() {
        Builder builder = new Builder();
        Director director = new Director(builder);

        director.constructBow();

        Weapon bow = bulider.getResult();

        Assertions.assertTrue(bow instanceof Bow && bow.getDamage() == 10 && bow.getDurability() == 5);
    }
}
