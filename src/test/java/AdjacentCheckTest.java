import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AdjacentCheckTest {

    private Rectangle rect1;
    private Rectangle rect2;
    private AdjacentCheck adjacentCheck;


    @Test
    public void shouldReturnTrueWhenRectanglesAreAdjacent() throws IOException {
        AdjacentCheck adjacentCheck = new AdjacentCheck();
        Rectangle rect1 = new Rectangle(new int[]{1, 1}, new int[]{10, 5});
        Rectangle rect2 = new Rectangle(new int[]{10, 1}, new int[]{15, 5});

        assertEquals(true, adjacentCheck.isAdjacent(rect1, rect2));
    }

    @Test
    public void shouldReturnFalseWhenRectanglesAreNotAdjacent() throws IOException {
        AdjacentCheck adjacentCheck = new AdjacentCheck();
        Rectangle rect1 = new Rectangle(new int[]{5, 1}, new int[]{10, 5});
        Rectangle rect2 = new Rectangle(new int[]{1, 1}, new int[]{3, 5});

        assertEquals(false, adjacentCheck.isAdjacent(rect1, rect2));
    }

}