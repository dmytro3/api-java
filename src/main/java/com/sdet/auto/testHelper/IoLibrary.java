package com.sdet.auto.testHelper;

public class IoLibrary {

    public static void writeLine(String text){
        System.out.println(" ");
        System.out.println(String.format("### %s ###", text));
    }

    public static void writelineEnd() {
        System.out.println(("############"));
        System.out.println(" ");
    }
}
