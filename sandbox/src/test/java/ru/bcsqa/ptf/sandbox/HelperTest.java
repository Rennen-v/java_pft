package ru.bcsqa.ptf.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HelperTest {

    @Test
    public void testArea(){
        point p1 = new point(1,1);
        point p2 = new point(10,10);
        Assert.assertEquals( p1.distance(p2), 12.727922061357855);
    }
}
