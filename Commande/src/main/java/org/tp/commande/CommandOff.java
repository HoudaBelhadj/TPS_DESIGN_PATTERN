package org.tp.commande;

import org.tp.entity.Device;

public class CommandOff extends Command{

    public CommandOff(Device device) {
        super(device);
    }

    @Override
    public void execute() {
        device.off();
    }
}
