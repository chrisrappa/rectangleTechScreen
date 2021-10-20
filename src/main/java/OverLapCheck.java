import java.util.HashMap;

public class OverLapCheck {


    public Boolean isOverLapping(Rectangle firstRect, Rectangle secondRect){


        HashMap<String, Integer> rectangleOnePoints = new HashMap<>();
        HashMap<String, Integer> rectangleTwoPoints = new HashMap<>();

        rectangleOnePoints.put("x1", firstRect.cornerOne[0]);
        rectangleOnePoints.put("x2", firstRect.cornerTwo[0]);
        rectangleOnePoints.put("y1", firstRect.cornerOne[1]);
        rectangleOnePoints.put("y2", firstRect.cornerTwo[1]);

        rectangleTwoPoints.put("x1", secondRect.cornerOne[0]);
        rectangleTwoPoints.put("x2", secondRect.cornerTwo[0]);
        rectangleTwoPoints.put("y1", secondRect.cornerOne[1]);
        rectangleTwoPoints.put("y2", secondRect.cornerTwo[1]);

        if (
            rectangleTwoPoints.get("x1") > rectangleOnePoints.get("x2") ||
            rectangleTwoPoints.get("y1") > rectangleOnePoints.get("y2") ||
            rectangleOnePoints.get("x1") > rectangleTwoPoints.get("x2") ||
            rectangleOnePoints.get("y1") > rectangleTwoPoints.get("y1")){

            return false;
        }

        return true;
    }

}
