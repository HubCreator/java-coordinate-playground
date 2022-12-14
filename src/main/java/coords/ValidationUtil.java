package coords;

import java.util.ArrayList;
import java.util.List;

public class ValidationUtil {

    public static List<Point> getPoints(String input) {
        List<Point> result = new ArrayList<>();
        String[] split = input.split("-");
        for (String chunk : split) {
            int[] validated = validate(chunk);
            result.add(new Point(validated[0], validated[1]));
        }
        return result;
    }

    private static int[] validate(String input) {
        if (!input.matches("\\([0-9]+,[0-9]+\\)")) {
            throw new IllegalArgumentException("error!");
        }
        String[] split = input.substring(1, input.length() - 1).split(",");
        return new int[]{Integer.parseInt(split[0]), Integer.parseInt(split[1])};
    }

    public static double getDistance(DistanceStrategy strategy) {
        return strategy.getDistance();
    }
}
