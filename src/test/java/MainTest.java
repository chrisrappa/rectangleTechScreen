import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void shouldCreateRectangleAndReturnXCoordinateOfFirstCorner() throws IOException {
        Rectangle testRectangle = new Rectangle(new int[]{1, 2}, new int[]{3, 3});
        assertEquals(1, testRectangle.cornerOne[0]);
    }

}