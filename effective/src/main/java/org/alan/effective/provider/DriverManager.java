package org.alan.effective.provider;

import java.util.ArrayList;
import java.util.List;

public class DriverManager {
    List<Connection> connectionList= new ArrayList<>();

    /**
     * Bring a connection from saving
     * @param option
     * @return
     */
    public Connection getConnection(String option) {
        return null;
    }

    /**
     * Create Connection instance and save it
     * @param properties
     * @return
     */
    public Connection registerDriver(String properties) {
        Connection connectionA = new ConnectionA();
        connectionList.add(connectionA);
        return connectionA;
    }
}
