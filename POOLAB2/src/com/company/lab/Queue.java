package com.company.lab;
import java.util.LinkedList;

public class Queue {
    private int value, i, size, num;
    LinkedList<Integer> myQueue1 = new LinkedList<>();


    public Queue(int value) {
        this.value = value;
    }

    public Queue() {
    }


    public void afis() {
        for (int i = 0; i < value; i++) {
            myQueue1.add(i);

        }
        int removeQu = myQueue1.remove();
        System.out.println("Removed element: " + removeQu);
    }

    public void sz() {
        int size = myQueue1.size();
        System.out.println("Size of queue: " + size);
    }


    public void checkk() {
        int size = myQueue1.size();
        if (size > 0)
            System.out.println("Queue isn't empty");
        else {
            System.out.println("Queue is empty");
        }
    }

    public static boolean isNull(Object obj) {
        if (obj == null)
        return true;
        else
            return false;

    }

}

