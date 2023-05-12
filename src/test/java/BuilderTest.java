import org.example.builder.Builder;
import org.example.builder.Director;
import org.example.builder.Weapon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuilderTest {
    @Test
    void TestBowBuilder() {
        Builder builder = new Builder();
        Director director = new Director(builder);

        director.constructBow();

        Weapon bow = builder.getResult();

        Assertions.assertTrue(bow.isRanged() && bow.getDamage() == 10 && bow.getDurability() == 5);
    }
}
