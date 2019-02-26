package com.javatest.helloworld;

import org.junit.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HelloMarsTest {

    @Test
    public void shouldPrintHelloWorld() {
        //given
        final String message = "hello Mars";
        HelloWorld helloMars = new HelloMars();

        //when
        helloMars.message(message);

        //then
        assertThat(helloMars.say(), is(message));
    }
}
