import java.io.IOException;
import java.util.Objects;

public class Main {

    public static void main(String [] args) throws IOException {

        Rectangle rect1 = new Rectangle(new int[]{1, 1}, new int[]{10, 5});
        Rectangle rect2 = new Rectangle(new int[]{10, 1}, new int[]{15, 5});
        OverLapCheck overLapCheck = new OverLapCheck();
        ContainedCheck containedCheck = new ContainedCheck();
        AdjacentCheck adjacentCheck = new AdjacentCheck();
        StateChecker stateChecker = new StateChecker(overLapCheck, containedCheck, adjacentCheck, rect1, rect2);

        switch (stateChecker.checkState(overLapCheck, containedCheck, adjacentCheck, rect1, rect2)) {
            case ("isOverlapping"):
                System.out.println("The rectangles are overlapping");
                break;
            case ("isAdjacent"):
                System.out.println("The rectangles are adjacent");
                break;
            case ("isContained"):
                System.out.println("One of the rectangles is inside the other one");
                break;
            default:
                System.out.println("The rectangles are completely separate from each other");
        }
    }
}
