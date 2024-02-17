package org.alan.effective.provider;

public class ConnectionA implements Connection{
    @Override
    public String getResult(String input) {
        return "ConnectionA result";
    }
}
