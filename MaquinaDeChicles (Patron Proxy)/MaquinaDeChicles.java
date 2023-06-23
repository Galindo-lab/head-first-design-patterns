/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maquinadechicles;

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.registry.LocateRegistry;


/**
 *
 * @author Eduar
 */
public class MaquinaDeChicles {

    /**
     * @param args the command line arguments
     * @throws java.rmi.RemoteException
     * @throws java.net.MalformedURLException
     */
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        GumballMachineRemote gumballMachine;

        try {
            LocateRegistry.createRegistry(8080);
            gumballMachine = new GumballMachine("Tijuana", 10);
            
            Registry reg = LocateRegistry.getRegistry();
            Naming.rebind("tijuana",gumballMachine);
            
            System.out.println("Listo!");
            
        } catch (NumberFormatException | RemoteException e) {
        }

//        GumballMachine gumballMachine = new GumballMachine("test", 2);
//
//        System.out.println(gumballMachine);
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        System.out.println(gumballMachine);
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        gumballMachine.refill(5);
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        System.out.println(gumballMachine);
    }

}
