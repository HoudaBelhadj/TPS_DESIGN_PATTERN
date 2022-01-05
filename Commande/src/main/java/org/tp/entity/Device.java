package org.tp.entity;

public abstract class Device {
    private String name;
    private boolean isOn = false;

    public Device(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void on(){
        setOn(true);
    }
    public void off(){
        setOn(false);
    }
}
