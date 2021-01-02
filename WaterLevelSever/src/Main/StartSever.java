/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import controllerImpl.WaterLevevlControllerImpl;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nipun Lakshitha
 */
public class StartSever {
    public static void main(String[] args) {
        try {
            Registry waterLevelRegistry=LocateRegistry.createRegistry(5050);
            System.out.println("Start Sever");
            waterLevelRegistry.rebind("WaterLevelSever", new WaterLevevlControllerImpl());
        } catch (RemoteException ex) {
            Logger.getLogger(StartSever.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
