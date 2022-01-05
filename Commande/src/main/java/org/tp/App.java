package org.tp;

import org.tp.commande.Command;
import org.tp.entity.Device;
import org.tp.entity.Light;
import org.tp.entity.Radio;
import org.tp.entity.Tv;
import org.tp.service.RemoteControl;
import org.tp.service.Slot;

public class App {
    public static void main(String[] args) {
        Device tv = new Tv("Tv");
        Device radio = new Radio("Radio");
        Device light = new Light("Light");

        RemoteControl remoteControl = new RemoteControl(tv,radio,light);

        remoteControl.buttonPressed("Tv");

        remoteControl.buttonPressed("Tv");


    }
}
