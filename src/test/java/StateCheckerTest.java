import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class StateCheckerTest {

    @Mock
    OverLapCheck overLapCheck;
    AdjacentCheck adjacentCheck;
    ContainedCheck containedCheck;
    Rectangle rect1;
    Rectangle rect2;

    @Test
    public void shouldReturnIsAdjacent() {

        when(adjacentCheck.isAdjacent(rect1, rect2)).thenReturn(true);
        when(containedCheck.isContained(rect1, rect2)).thenReturn(false);
        when(overLapCheck.isOverLapping(rect1, rect2)).thenReturn(false);

        StateChecker stateChecker = new StateChecker(overLapCheck, containedCheck, adjacentCheck, rect1, rect2);
        String expected = "isAdjacent";

        assertEquals(expected, stateChecker);
        
    }
}