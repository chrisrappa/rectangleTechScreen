

public class OverLapCheck {


    public Boolean isOverLapping(Rectangle firstRect, Rectangle secondRect){


        int rect1XFirstPoint = firstRect.cornerOne[0];
        int rect1YFirstPoint = firstRect.cornerOne[1];
        int rect1XSecondPoint = firstRect.cornerTwo[0];
        int rect1YSecondPoint = firstRect.cornerTwo[1];

        int rect2XFirstPoint = secondRect.cornerOne[0];
        int rect2YFirstPoint = secondRect.cornerOne[1];
        int rect2XSecondPoint = secondRect.cornerTwo[0];
        int rect2YSecondPoint = secondRect.cornerTwo[1];

        if (
            rect2XFirstPoint > rect1XSecondPoint ||
            rect2YFirstPoint > rect1YSecondPoint ||
            rect1XFirstPoint > rect2XSecondPoint ||
            rect1YFirstPoint > rect2YSecondPoint){

            return false;
        }

        return true;
    }

}
