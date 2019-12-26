package org.richit.abstract_libs;

public class Car extends Machine implements PlayVideo, Gear {
    @Override
    public void start() {

        System.out.println("Start in Car Class");
    }

    @Override
    public void doStuff() {

        System.out.println("doStuff in Car Class");
    }

    @Override
    public void shutDown() {

        System.out.println("shutDown in Car Class");
    }

    @Override
    public void riseVolume() {

        System.out.println("riseVolume from PlayVideo interface in Car Class");
    }

    @Override
    public void seekSecond() {

        System.out.println("seekSecond from PlayVideo interface in Car Class");
    }

    @Override
    public void android() {

        System.out.println("android from Gear interface in Car Class");
    }

    @Override
    public void java() {

        System.out.println("java from Gear interface in Car Class");
    }
}
