package ala.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Lida on 3/6/2016.
 */
public class PointTests {
    @Test
    public void testDistance(){
        Point p1 = new Point(0, 0);
        Point p2 = new Point (0, 1);
        assert p1.distance(p2) == 1;
    }

    @Test
    public void testDistance1(){
        Point p1 = new Point(0, 0);
        Point p2 = new Point (1, 0);
        Assert.assertEquals(p1.distance(p2), 1.0);
    }

    @Test
    public void testDistance2(){
        Point p1 = new Point(0, 0);
        Point p2 = new Point (0, 0);
        Assert.assertEquals(p1.distance(p2), 0.0);
    }
}
