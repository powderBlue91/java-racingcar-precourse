package racinggame.car;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NameTest {

    @Test
    @DisplayName("생성 테스트")
    public void ConstructNameTest() {
        Name name = new Name("c1");

        Assertions.assertThat(name).isNotNull();
    }

    @Test
    @DisplayName("이름 길이는 1~5 사이 값인지 테스트")
    public void NameLengthTest() {
        assertDoesNotThrow(() -> {
            new Name("yong");
        });

        assertDoesNotThrow(() -> {
            new Name("hi");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Name("");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Name("yongkwon");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Name("hellobro");
        });
    }
}
