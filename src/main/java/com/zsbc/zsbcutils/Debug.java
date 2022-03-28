package com.zsbc.zsbcutils;

public class Debug {

    private boolean on;

    public Debug(boolean enable) {
        this.on = enable;
    }

    private boolean isOn() {
        return on;
    }

    public void print(String message) {
        if(isOn())
            System.out.println("[Debug] " + message);
    }
}
