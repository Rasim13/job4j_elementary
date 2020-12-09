package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then() {
        int result = Max.findMax(5, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax10To17Then() {
        int result = Max.findMax(10, 17);
        assertThat(result, is(17));
    }

    @Test
    public void whenMax10To10Then() {
        int result = Max.findMax(10, 10);
        assertThat(result, is(10));
    }
}