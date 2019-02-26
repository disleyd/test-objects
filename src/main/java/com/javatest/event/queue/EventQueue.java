package com.javatest.event.queue;

import java.util.ArrayList;

public class EventQueue {

    private ArrayList<Integer> queue = new ArrayList<Integer>(10);

    public int count() {
        return queue.size();
    }

    public void add(int i) {
        queue.add(i);
    }

    public int remove() {
        return queue.remove(queue.size()-1);
    }
}
