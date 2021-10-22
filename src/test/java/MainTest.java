import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MainTest {

    @Mock
    public static OverLapCheck overLapCheck;
    public static AdjacentCheck adjacentCheck;
    public static ContainedCheck containedCheck;
    public static Rectangle rect1;
    public static Rectangle rect2;
    public static StateChecker stateChecker;

    @BeforeEach
    public void setUp(){
        overLapCheck = mock(OverLapCheck.class);
        adjacentCheck = mock(AdjacentCheck.class);
        containedCheck = mock(ContainedCheck.class);
        rect1 = mock(Rectangle.class);
        rect2 = mock(Rectangle.class);
        stateChecker = mock(StateChecker.class);
    }

    @Test
    public void shouldCreateRectangleAndReturnXCoordinateOfFirstCorner() throws IOException {
        Rectangle testRectangle = new Rectangle(new int[]{1, 2}, new int[]{3, 3});
        assertEquals(1, testRectangle.cornerOne[0]);
    }
    

}