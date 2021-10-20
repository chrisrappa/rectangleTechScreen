import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OverLapCheckTest {

    @Test
    public void shouldReturnTrueWhenRectanglesAreOverlapping(){
        Rectangle rect1 = new Rectangle(new int[]{5, 1}, new int[]{10, 5});
        Rectangle rect2 = new Rectangle(new int[]{5, 1}, new int[]{10, 5});
        OverLapCheck overLapCheck = new OverLapCheck();

        assertEquals(true, overLapCheck.isOverLapping(rect1, rect2));
    }

    @Test
    public void shouldReturnFalseWhenRectanglesAreNotOverlapping(){
        Rectangle rect1 = new Rectangle(new int[]{5, 1}, new int[]{10, 5});
        Rectangle rect2 = new Rectangle(new int[]{5, 1}, new int[]{1, 5});
        OverLapCheck overLapCheck = new OverLapCheck();

        assertEquals(false, overLapCheck.isOverLapping(rect1, rect2));
    }

}