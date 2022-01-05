package org.tp.commande;

import org.tp.entity.Device;

public abstract class Command {

    // Composition Attribute ==> With Bridge Pattern
    protected Device device;
    public abstract void execute();

    // Constructor
    public Command(Device device){
        this.device = device;
    }
}
