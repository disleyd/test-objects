package com.javatest.event.queue;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class EventQueueTest {

    @Test
    public void shouldReturnACountOfZeroWhenNoElementsInTheQueue() {
        EventQueue eventQueue = new EventQueue();

        assertThat(eventQueue.count(), is(0));
    }

    @Test
    public void shouldReturnACountOfOneWhenOnlyOneElementInTheQueue() {
        EventQueue eventQueue = new EventQueue();

        eventQueue.add(0);

        assertThat(eventQueue.count(), is(1));
    }

    @Test
    public void shouldReturnAnElementFromTheQueue() {
        EventQueue eventQueue = new EventQueue();

        eventQueue.add(2);

        assertThat(eventQueue.remove(), is(2));
    }
}
