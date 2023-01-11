import com.charles.module1.four.Circle;
import com.charles.module1.four.Colour;
import com.charles.module1.four.Triangle;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {


    //partition
    /*
    radius is positive
    radius is 0


    Boundary Case
    radius < 0

     */

    @Test
    public void positiveradius() {
        // 1
        // 10
        Circle testCircle = new Circle(1, Colour.NONE);
        assertEquals(3.14159, testCircle.getArea(), 0.2);
        Circle testCircle1 = new Circle(10, Colour.NONE);
        assertEquals(314.15926, testCircle1.getArea(), 0.2);
    }
    @Test
    public void zeroradius() {
        // 0
        Circle testCircle = new Circle(0, Colour.NONE);
        assertEquals(0, testCircle.getArea(), 0.2);
    }
}

