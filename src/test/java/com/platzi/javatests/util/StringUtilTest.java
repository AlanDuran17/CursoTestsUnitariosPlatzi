package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeat_string_three_times() {
        Assert.assertEquals("Hola Bro!Hola Bro!Hola Bro!", StringUtil.repeat("Hola Bro!", 3));
    }

    @Test
    public void repeat_string_once() {
        Assert.assertEquals("Hola Bro!", StringUtil.repeat("Hola Bro!", 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        Assert.assertEquals("", StringUtil.repeat("Hola Bro!", -10));
    }

    @Test
    public void isEmpty_string_not_empty() {
        Assert.assertEquals(false, StringUtil.isEmpty("Aserejé"));
    }

    @Test
    public void isEmpty_string_null() {
        Assert.assertEquals(true, StringUtil.isEmpty(null));
    }

    @Test
    public void isEmpty_string_multiple_blank_spaces() {
        Assert.assertEquals(true, StringUtil.isEmpty("       "));
    }

    @Test
    public void isEmpty_string_blank_space() {
        Assert.assertEquals(true, StringUtil.isEmpty(""));
    }
}