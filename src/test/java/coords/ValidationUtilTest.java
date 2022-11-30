package coords;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.assertj.core.api.Assertions.*;


class ValidationUtilTest {

    @DisplayName("Point 두 개 추출")
    @Test
    void test1() {
        assertThat(ValidationUtil.getPoints("(10,10)-(14,15)"))
                .containsExactly(new Point(10, 10), new Point(14, 15));
    }

    @DisplayName("Point 세 개 추출")
    @Test
    void test2() {
        assertThat(ValidationUtil.getPoints("(10,10)-(14,15)-(2,3)"))
                .containsExactly(new Point(10, 10), new Point(14, 15), new Point(2, 3));
    }
}