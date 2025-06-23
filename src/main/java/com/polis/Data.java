package com.polis;

public class Data {

    private int state = 1;

    public int getState() {
        return state;
    }

    public synchronized void Tic() {
        System.out.print("Tic(" + Thread.currentThread().getName() + ")-");
        state = 2;
    }

    public synchronized void Tak() {
        System.out.print("Tak(" + Thread.currentThread().getName() + ")-");
        state = 3;
    }

    public synchronized void Toy() {
        System.out.println("Toy(" + Thread.currentThread().getName() + ")");
        state = 1;
    }

}
