package org.alan.java.starter;

public interface InterfaceStart {

    default int starterProcedure(int startParameter) {
        System.out.println("Running default method of an interface.");
        return 713;
    }
}
