/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverImpl;

import Observer.WaterLevelObserver;
import View.AlarmForm;
import View.DisplayForm;
import View.SmsSenderForm;
import View.SplierForm;
import View.SuperView;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Nipun Lakshitha
 */
public class WaterLevelObserverImpl extends UnicastRemoteObject implements WaterLevelObserver {

    private SuperView superView;

    public WaterLevelObserverImpl(SuperView superView) throws RemoteException {
        this.superView = superView;

    }

    @Override
    public void update(int waterlevel) throws RemoteException {
        superView.setValue(waterlevel);
    }

}
