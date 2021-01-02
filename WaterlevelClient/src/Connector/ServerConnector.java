/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connector;

import Controller.WaterlevelController;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Nipun Lakshitha
 */
public class ServerConnector {

    private static ServerConnector connector;
    private WaterlevelController waterlevelController;

    private ServerConnector() throws NotBoundException, MalformedURLException, RemoteException {
        waterlevelController = (WaterlevelController) Naming.lookup("rmi://localhost:5050/WaterLevelSever");
    }

    public static ServerConnector getInstance() throws NotBoundException, MalformedURLException, RemoteException {
        if (connector == null) {
            connector = new ServerConnector();
        }
        return connector;
    }

    public WaterlevelController getWaterLevelController() {
        return waterlevelController;
    }
}
