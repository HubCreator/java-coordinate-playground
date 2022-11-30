package coords;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ValidationUtil {

    public static List<Point> getPoints(String input) {
        List<Point> result = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(input, "(),-");
        int size = stringTokenizer.countTokens();

        for (int index = 0; index < size / 2; index++) {
            int y = Integer.parseInt(stringTokenizer.nextToken());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            result.add(new Point(y, x));
        }
        return result;
    }
}
