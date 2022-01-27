package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRhymerTest {

    @Test
    public void testCountIn() {
        HanoiRhymer hanoiRhymer = new HanoiRhymer();

        hanoiRhymer.countIn(3);

        Assert.assertEquals(3, hanoiRhymer.peekaboo());
    }
}