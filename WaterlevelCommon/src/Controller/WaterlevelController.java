/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Observer.WaterLevelObserver;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Nipun Lakshitha
 */
public interface WaterlevelController extends Remote {

    public void sendWaterLevel(int waterLevel) throws RemoteException;

    public void addWaterLevel(WaterLevelObserver waterlevelObserver) throws RemoteException;

    public void removeWaterLevel(WaterLevelObserver waterlevelObserver) throws RemoteException;
}
