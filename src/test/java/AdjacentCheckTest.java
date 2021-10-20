import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdjacentCheckTest {

    private Rectangle rect1;
    private Rectangle rect2;
    private AdjacentCheck adjacentCheck;


    @Test
    public void shouldReturnTrue(){
        AdjacentCheck adjacentCheck = new AdjacentCheck();
        Rectangle rect1 = new Rectangle(new int[]{5, 1}, new int[]{10, 5});
        Rectangle rect2 = new Rectangle(new int[]{5, 1}, new int[]{1, 5});

        assertEquals(true, adjacentCheck.isAdjacent(rect1, rect2));
    }

}