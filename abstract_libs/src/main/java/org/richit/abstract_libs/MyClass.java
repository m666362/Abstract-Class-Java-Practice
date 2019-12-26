package org.richit.abstract_libs;

import java.io.FileNotFoundException;

public class MyClass {
    static String dot = "----------------";
    private static void startProgramme() {
        String start = "Programme started";
        System.out.println("");
        System.out.println(dot+start+dot);
        System.out.println("");
    }
    public static void endProgramme(){

        String end = "Programme ended";
        System.out.println("");
        System.out.println(dot+end+dot);
        System.out.println();
    }

    static Camera camera1 = new Camera();
    static Car car1 = new Car();
    //abstract makes this line incorrect
    //static Machine machine1 = new Machine();

    public static void main(String[] args) throws FileNotFoundException {

        startProgramme();

        setIdOfMachineClass();
        workWithCameraClass();
        workWithCarClass();

        endProgramme();
    }

    private static void workWithCarClass() {
        System.out.println(dot + " Printing from Car Class " + dot);
        car1.seekSecond();
        car1.riseVolume();
        car1.android();
        car1.java();
        car1.run();
    }

    private static void workWithCameraClass() {

        System.out.println(dot + " Printing from Camera Class " + dot);
        camera1.seekSecond();
        camera1.riseVolume();
        camera1.run();
    }

    private static void setIdOfMachineClass() {

        camera1.setId( 12 );
        car1.setId( 20 );
        //System.out.println( machine1.getId());
        System.out.println(camera1.getId());
        System.out.println(car1.getId());
    }
}
