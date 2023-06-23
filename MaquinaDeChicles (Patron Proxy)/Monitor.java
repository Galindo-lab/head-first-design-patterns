/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinadechicles;
import java.net.MalformedURLException;
import java.rmi.*;

/**
 *
 * @author Eduar
 */
public class Monitor {

    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        GumballMachineRemote rm = (GumballMachineRemote) Naming.lookup("rmi://127.0.0.1/Tijuana");
        System.out.println("Numero de chiles: " + rm.getCount());
    }
}
