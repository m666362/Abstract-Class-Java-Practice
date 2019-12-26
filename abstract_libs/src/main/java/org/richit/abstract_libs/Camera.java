package org.richit.abstract_libs;

public class Camera extends Machine implements PlayVideo{
    @Override
    public void start() {

        System.out.println("Start in Camera Class");
    }

    @Override
    public void doStuff() {

        System.out.println("doStuff in Camera Class");
    }

    @Override
    public void shutDown() {

        System.out.println("shutDown in Camera Class");
    }

    @Override
    public void riseVolume() {
        System.out.println("riseVolume from PlayVideo interface in Camera Class");
    }

    @Override
    public void seekSecond() {
        System.out.println("seekSecond from PlayVideo interface in Camera Class");

    }
}
