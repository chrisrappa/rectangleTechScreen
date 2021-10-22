import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class StateCheckerTest {

    StateChecker stateChecker;

    @Mock
    public static OverLapCheck overLapCheck;
    public static AdjacentCheck adjacentCheck;
    public static ContainedCheck containedCheck;
    public static Rectangle rect1;
    public static Rectangle rect2;


    @BeforeEach
    public void setUp(){
        overLapCheck = mock(OverLapCheck.class);
        adjacentCheck = mock(AdjacentCheck.class);
        containedCheck = mock(ContainedCheck.class);
        rect1 = mock(Rectangle.class);
        rect2 = mock(Rectangle.class);
        stateChecker = new StateChecker(overLapCheck, containedCheck, adjacentCheck, rect1, rect2);

    }

    @Test
    public void shouldReturnIsAdjacent() {
        when(adjacentCheck.isAdjacent(rect1, rect2)).thenReturn(true);
        String returnValue = stateChecker.checkState(overLapCheck, containedCheck, adjacentCheck, rect1, rect2);

        String expected = "isAdjacent";
        assertEquals(expected, returnValue);
    }

    @Test
    public void shouldReturnIsContained() {
        when(containedCheck.isContained(rect1, rect2)).thenReturn(true);
        String returnValue = stateChecker.checkState(overLapCheck, containedCheck, adjacentCheck, rect1, rect2);

        String expected = "isContained";
        assertEquals(expected, returnValue);
    }

    @Test
    public void shouldReturnIsOverlapping() {
        when(overLapCheck.isOverLapping(rect1, rect2)).thenReturn(true);
        String returnValue = stateChecker.checkState(overLapCheck, containedCheck, adjacentCheck, rect1, rect2);

        String expected = "isOverlapping";
        assertEquals(expected, returnValue);
    }

    @Test
    public void shouldReturnEmptyString() {
        String returnValue = stateChecker.checkState(overLapCheck, containedCheck, adjacentCheck, rect1, rect2);
        String expected = "";

        assertEquals(expected, returnValue);
    }
}