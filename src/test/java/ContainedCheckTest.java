import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ContainedCheckTest {

    @Test
    public void shouldReturnTrueWithFirstRectangleContainingSecondRectangle() throws IOException {
        Rectangle rect1 = new Rectangle(new int[]{4, 0}, new int[]{11, 6});
        Rectangle rect2 = new Rectangle(new int[]{5, 1}, new int[]{10, 5});
        ContainedCheck containedCheck = new ContainedCheck();

        assertEquals(true, containedCheck.isContained(rect1, rect2));
    }

    @Test
    public void shouldReturnTrueWithSecondRectangleContainingFirstRectangle() throws IOException {
        Rectangle rect1 = new Rectangle(new int[]{5, 1}, new int[]{10, 5});
        Rectangle rect2 = new Rectangle(new int[]{4, 0}, new int[]{11, 6});
        ContainedCheck containedCheck = new ContainedCheck();

        assertEquals(true, containedCheck.isContained(rect1, rect2));
    }

    @Test
    public void shouldReturnTrueEvenWithNegativeNumbers() throws IOException {
        Rectangle rect1 = new Rectangle(new int[]{-5, 1}, new int[]{-1, 5});
        Rectangle rect2 = new Rectangle(new int[]{-4, 2}, new int[]{-2, 4});
        ContainedCheck containedCheck = new ContainedCheck();

        assertEquals(true, containedCheck.isContained(rect1, rect2));
    }

    @Test
    public void shouldReturnFalseWithNeitherRectangleContainingTheOther() throws IOException {
        Rectangle rect1 = new Rectangle(new int[]{1, 1}, new int[]{10, 5});
        Rectangle rect2 = new Rectangle(new int[]{12, 1}, new int[]{17, 5});
        ContainedCheck containedCheck = new ContainedCheck();

        assertEquals(false, containedCheck.isContained(rect1, rect2));
    }

    @Test
    public void shouldReturnFalseWhenFirstRectangleIsDirectlyMirroredBelowSecondRectangle() throws IOException {
        Rectangle rect1 = new Rectangle(new int[]{5, -10}, new int[]{10, -1});
        Rectangle rect2 = new Rectangle(new int[]{5, 0}, new int[]{10, 10});
        ContainedCheck containedCheck = new ContainedCheck();

        assertEquals(false, containedCheck.isContained(rect1, rect2));
    }

    @Test
    public void shouldReturnFalseWhenSecondRectangleIsDirectlyMirroredBelowFirstRectangle() throws IOException {
        Rectangle rect1 = new Rectangle(new int[]{5, 0}, new int[]{10, 10});
        Rectangle rect2 = new Rectangle(new int[]{5, -10}, new int[]{10, -1});
        ContainedCheck containedCheck = new ContainedCheck();

        assertEquals(false, containedCheck.isContained(rect1, rect2));
    }


}