import com.charles.module1.four.Colour;
import com.charles.module1.four.Triangle;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {

    //partition
    /*
    side1 & side2 & side3 are all positive

    Boundary Case
    a side = 0
    a side < 0
    side3 > (side 2*side1)
     */

    @Test
    public void allsidespositive() {
        // 3, 4, 5
        Triangle testTriangle = new Triangle(3, 4, 5, Colour.NONE);
        assertEquals(6.0, testTriangle.getArea(), 0.1);
        assertEquals(3.0, testTriangle.heronsHeight(),0.1);
    }



}
