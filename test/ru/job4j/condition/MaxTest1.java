package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest1 {

    @Test
    public void whenMax67To4Then() {
        int result = Max.findMax(5, 3, 67, 9);
        assertThat(result, is(67));
    }
}