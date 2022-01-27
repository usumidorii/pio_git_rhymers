package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class FIFORhymerTest{

    @Test
    public void testCountOut() {
        FIFORhymer fifoRhymer = new FIFORhymer();
        fifoRhymer.countIn(2);
        fifoRhymer.countIn(6);

        int result = fifoRhymer.countOut();
        Assert.assertEquals(2, result);

        result = fifoRhymer.countOut();
        Assert.assertEquals(6, result);
    }
}