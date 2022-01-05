package org.tp.service;

import org.tp.commande.Command;
import org.tp.entity.Device;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoteControl {

    Map<String,Slot> slotMap = new HashMap<String,Slot>();

    public RemoteControl(Device ...devices) {
        for(Device device : devices){
            slotMap.put(device.getName(),new Slot(device));
        }
    }

    public void addSlot(String key, Slot slot){
        this.slotMap.put(key,slot);
    }

    public void buttonPressed(String key){
        Slot currentSlot = this.slotMap.get(key);
        currentSlot.buttonPressed();
    }
}
