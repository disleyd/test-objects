package com.javatest.event.receiver;

import com.javatest.event.queue.EventQueue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class EventReceiverTest {

    public void shouldPutAnEventOnTheQueue() {
        //given

        //when
        //then
        EventQueue eventQueue = new EventQueue();
        assertThat(eventQueue.count(), is(1));
    }


}
