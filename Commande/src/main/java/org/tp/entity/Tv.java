package org.tp.entity;

public class Tv extends Device{
    public Tv(String name) {
        super(name);
    }

    @Override
    public void on() {
        super.on();
        System.out.println("Tv est allumee");
    }

    @Override
    public void off() {
        super.off();
        System.out.println("Tv est eteint");
    }
}
