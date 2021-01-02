/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerImpl;

import Controller.WaterlevelController;
import Observer.WaterLevelObserver;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Nipun Lakshitha
 */
public class WaterLevevlControllerImpl extends UnicastRemoteObject implements WaterlevelController {

    private ArrayList<WaterLevelObserver> waterLevelObserver = new ArrayList<>();

    public WaterLevevlControllerImpl() throws RemoteException {
        
    }

    @Override
    public void sendWaterLevel(int waterLevel) throws RemoteException {
        for (WaterLevelObserver waterLevelObserver : waterLevelObserver) {
            waterLevelObserver.update(waterLevel);
        }
    }
    
    @Override
    public void addWaterLevel(WaterLevelObserver waterlevelObserver) throws RemoteException {
        waterLevelObserver.add(waterlevelObserver);
    }
    
    @Override
    public void removeWaterLevel(WaterLevelObserver waterlevelObserver) throws RemoteException {
        waterLevelObserver.remove(waterlevelObserver);
    }
    
}
