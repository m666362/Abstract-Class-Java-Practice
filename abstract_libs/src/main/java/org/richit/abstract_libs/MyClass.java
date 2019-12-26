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
    static Camera camera2 = new Camera();
    static Machine machine1 = new Machine();

    public static void main(String[] args) throws FileNotFoundException {

        startProgramme();

        camera1.setId( 12 );
        camera2.setId( 20 );
        System.out.println( machine1.getId());
        System.out.println(camera1.getId());
        System.out.println(camera2.getId());

        endProgramme();
    }
}
