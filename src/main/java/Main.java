import java.util.Objects;

public class Main {

    public static void main(String [] args){

        Rectangle rect1 = new Rectangle(new int[]{1, 1}, new int[]{3, 3});
        Rectangle rect2 = new Rectangle(new int[]{1, 1}, new int[]{15, 3});
        OverLapCheck overLapCheck = new OverLapCheck();
        ContainedCheck containedCheck = new ContainedCheck();
        AdjacentCheck adjacentCheck = new AdjacentCheck();
        StateChecker stateChecker = new StateChecker(overLapCheck, containedCheck, adjacentCheck, rect1, rect2);


        switch (stateChecker.checkState(overLapCheck, containedCheck, adjacentCheck, rect1, rect2)){
            case ("isOverlapping"):
                System.out.println("The rectangles are overlapping");
                break;
            case("isAdjacent"):
                System.out.println("The rectangles are adjacent");
                break;
            case("isContained"):
                System.out.println("One of the rectangles is inside the other one");
                break;
            default:
                System.out.println("Something went wrong, did you put in both rectangles?");
        }


    }
}
