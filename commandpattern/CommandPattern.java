/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package commandpattern;

/**
 *
 * @author galindo
 */
public class CommandPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();

        CeilingFan fan = new CeilingFan("Cuarto");
        Light bathroom = new Light("Baño");
        Stereo estereo = new Stereo();

        LightOnCommand bathroomOn = new LightOnCommand(bathroom);
        LightOffCommand bathroomOff = new LightOffCommand(bathroom);

        StereoOffCommand stereoOff = new StereoOffCommand(estereo);
        StereoOnCommand stereoOn = new StereoOnCommand(estereo);

        CeilingFanLowCommand fanlow = new CeilingFanLowCommand(fan);
        CeilingFanMediumCommand fanmedium = new CeilingFanMediumCommand(fan);
        CeilingFanHighCommand fanhigh = new CeilingFanHighCommand(fan);
        CeilingFanOffCommand fanoff = new CeilingFanOffCommand(fan);

        Command[] macroseq = {fanoff, stereoOff, bathroomOff};
        MacroCommand macro = new MacroCommand(macroseq);
        
        control.setCommand(0, bathroomOn, bathroomOff);
        control.setCommand(1, stereoOn, stereoOff);

        control.setCommand(2, fanlow, fanoff);
        control.setCommand(3, fanmedium, fanoff);
        control.setCommand(4, fanhigh, fanoff);
        
        control.setCommand(5, macro, macro);
        

        System.out.println(control);
        control.onButtonWasPushed(0);
        control.undoButtonWasPushed();

        control.onButtonWasPushed(1);

        control.offButtonWasPushed(0);
        control.undoButtonWasPushed();
        control.offButtonWasPushed(1);
    }

}
