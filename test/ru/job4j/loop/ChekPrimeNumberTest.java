package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ChekPrimeNumberTest {
    @Test
    public void when5() {
        boolean rsl = ChekPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        boolean rsl = ChekPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when1() {
        boolean rsl = ChekPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }
}