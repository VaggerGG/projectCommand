/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectCommand;

/**
 *
 * @author camilo
 */
public class OpenDoorCommand implements Command {
    private Door door;

    public OpenDoorCommand(Door door) {
        this.door = door;
    }

    public void execute() {
        door.open();
    }
}
