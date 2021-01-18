package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when000to400then4() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(4, 0, 0);
        double dist = a.distance3d(b);
        Assert.assertEquals(4, dist, 0.01);
    }
}