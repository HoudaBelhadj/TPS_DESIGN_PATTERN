package org.tp.commande;

import org.tp.entity.Device;

public class CommandOn extends Command{

    public CommandOn(Device device) {
        super(device);
    }

    @Override
    public void execute() {
        device.on();
    }
}
