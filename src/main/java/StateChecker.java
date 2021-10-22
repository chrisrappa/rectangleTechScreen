public class StateChecker {

    private final OverLapCheck overLapCheck;
    private final ContainedCheck containedCheck;
    private final AdjacentCheck adjacentCheck;
    private final Rectangle rect1;
    private final Rectangle rect2;

    public StateChecker(OverLapCheck overLapCheck,
                        ContainedCheck containedCheck,
                        AdjacentCheck adjacentCheck,
                        Rectangle rect1,
                        Rectangle rect2) {

        this.overLapCheck = overLapCheck;
        this.containedCheck = containedCheck;
        this.adjacentCheck = adjacentCheck;
        this.rect1 = rect1;
        this.rect2 = rect2;
    }

    public String checkState(OverLapCheck overLapCheck,
                             ContainedCheck containedCheck,
                             AdjacentCheck adjacentCheck,
                             Rectangle rect1,
                             Rectangle rect2) {

        if (adjacentCheck.isAdjacent(rect1, rect2)) {
            return "isAdjacent";
        }

        if (containedCheck.isContained(rect1, rect2)) {
            return "isContained";
        }

        if (overLapCheck.isOverLapping(rect1, rect2)) {
            return "isOverlapping";
        }

        return "";
    }
}
