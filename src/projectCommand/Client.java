/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectCommand;

/**
 *
 * @author camilo
 */

public class Client {
    public static void main(String[] args) {
        
        Light light = new Light();
        Door door = new Door();
        TV tv = new TV();

        Command lightOn = new TurnOnLightCommand(light);
        Command doorOpen = new OpenDoorCommand(door);
        Command tvOn = new TurnOnTVCommand(tv);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(doorOpen);
        remote.pressButton();

        remote.setCommand(tvOn);
        remote.pressButton();
    }
}
