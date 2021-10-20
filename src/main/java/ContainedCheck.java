import java.util.HashMap;

public class ContainedCheck {

    public Boolean isContained(Rectangle firstRect, Rectangle secondRect){

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


        int rect1Area = (rectangleOnePoints.get("x2") - rectangleOnePoints.get("x1")) * (rectangleOnePoints.get("y2") - rectangleOnePoints.get("y1"));
        int rect2Area = (rectangleTwoPoints.get("y2") - rectangleTwoPoints.get("y1")) * (rectangleTwoPoints.get("x2") - rectangleTwoPoints.get("x1"));

        int rect1PointsAdded = rectangleOnePoints.get("x1") + rectangleOnePoints.get("y1") + rectangleOnePoints.get("x2") + rectangleOnePoints.get("y2");
        int rect2PointsAdded = rectangleTwoPoints.get("x1") + rectangleTwoPoints.get("y1") + rectangleTwoPoints.get("x2") + rectangleTwoPoints.get("y2");

        if(rect1PointsAdded >= rect2PointsAdded && rect2Area < rect1Area && rectangleOnePoints.get("x1") < rectangleTwoPoints.get("x1")){
            return true;
        }

        if(rect2PointsAdded >= rect1PointsAdded  && rect1Area < rect2Area && rectangleOnePoints.get("x1") > rectangleTwoPoints.get("x1")){
            return true;
        }

        return false;
    }

}
