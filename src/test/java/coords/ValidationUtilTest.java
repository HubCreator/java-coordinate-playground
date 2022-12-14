package coords;

import org.junit.jupiter.api.DisplayName;
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
    void 직선의_길이_구하기() {
        List<Point> points = Arrays.asList(new Point(10, 10), new Point(14, 15));
        double distance = ValidationUtil.getDistance(new Line(points));
        assertThat(distance).isEqualTo(6.403124);
    }
}