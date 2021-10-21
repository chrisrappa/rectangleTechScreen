import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    public void shouldThrowExceptionWhenUserDrawsRectangleFromBottomRightToTopLeft() {
        Exception exception = assertThrows(IOException.class, () -> {
            new Rectangle(new int[]{5, 1}, new int[]{1, 5});
        });

        String expectedMessage = "Corner one must be the bottom left point of the rectangle";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}