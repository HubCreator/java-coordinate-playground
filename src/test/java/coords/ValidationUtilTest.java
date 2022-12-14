package coords;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ValidationUtilTest {

    @Test
    void Point_두_개_추출() {
        assertThat(ValidationUtil.getPoints("(10,10)-(14,15)"))
                .containsExactly(new Point(10, 10), new Point(14, 15));
    }

    @Test
    void Point_세_개_추출() {
        assertThat(ValidationUtil.getPoints("(10,10)-(14,15)-(2,3)"))
                .containsExactly(new Point(10, 10), new Point(14, 15), new Point(2, 3));
    }

    @Test
    void Point_네_개_추출() {
        assertThat(ValidationUtil.getPoints("(10,10)-(22,10)-(22,18)-(10,18)"))
                .containsExactly(new Point(10, 10), new Point(22, 10), new Point(22, 18), new Point(10, 18));
    }

    @Test
    void 직선의_길이_구하기() {
        List<Point> points = Arrays.asList(new Point(10, 10), new Point(14, 15));
        double distance = ValidationUtil.getResult(new Line(points));
        assertThat(String.format("%6f", distance)).isEqualTo("6.403124");
    }

    @Test
    void 사각형_넓이_구하기() {
        List<Point> points = ValidationUtil.getPoints("(10,10)-(22,10)-(22,18)-(10,18)");
        double distance = ValidationUtil.getResult(new Rectangle(points));
        assertThat(distance).isEqualTo(96);
    }

    @Test
    void 삼각형_넓이_구하기() {
        List<Point> points = ValidationUtil.getPoints("(10,10)-(14,15)-(20,8)");
        double distance = ValidationUtil.getResult(new Rectangle(points));
        assertThat(distance).isEqualTo(96);
    }
}