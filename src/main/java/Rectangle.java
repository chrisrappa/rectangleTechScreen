import java.io.IOException;

public class Rectangle {

    public int [] cornerOne = {0, 0};
    public int [] cornerTwo = {0, 0};

    public Rectangle(int [] cornerOne, int [] cornerTwo) throws IOException {
        if((cornerOne[0] + cornerOne[1]) < (cornerTwo[0] + cornerTwo[1])){
            this.cornerOne = cornerOne;
            this.cornerTwo = cornerTwo;
        } else {
            throw new IOException("Corner one must be the bottom left point of the rectangle");
        }

    }
}
