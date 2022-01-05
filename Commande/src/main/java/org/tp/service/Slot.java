package org.tp.service;

import org.tp.commande.Command;
import org.tp.commande.CommandOff;
import org.tp.commande.CommandOn;
import org.tp.entity.Device;

public class Slot {
    private Command commandOn;
    private Command commandOff;
    private Device device;

    public Slot(Device device){
        this.device = device;
        this.commandOn = new CommandOn(device);
        this.commandOff = new CommandOff(device);
    }

    public void buttonPressed(){
        if(this.device.isOn()){
            commandOff.execute();
        }else{
            commandOn.execute();
        }
    }
}
