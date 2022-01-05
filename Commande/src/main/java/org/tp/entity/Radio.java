package org.tp.entity;

public class Radio extends Device{

    public Radio(String name) {
        super(name);
    }

    @Override
    public void on() {
        super.on();
        System.out.println("Radio est allumee");
    }

    @Override
    public void off() {
        super.off();
        System.out.println("Radio est eteint");
    }
}
