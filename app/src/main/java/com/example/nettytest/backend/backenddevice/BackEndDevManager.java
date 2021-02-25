package com.example.nettytest.backend.backenddevice;

import com.example.nettytest.pub.commondevice.NetDeviceManager;

public class BackEndDevManager extends NetDeviceManager {

    public void AddDevice(String id){
        BackEndDevice matchedDev;

        synchronized (NetDeviceManager.class) {
            matchedDev = (BackEndDevice)devLists.get(id);
            if (matchedDev == null) {
                matchedDev = new BackEndDevice(id);
                devLists.put(id,matchedDev);
            }
        }
    }

    public void RemoveDevice(String id){
        BackEndDevice matchedDev;
        synchronized (NetDeviceManager.class){
            matchedDev = (BackEndDevice)devLists.get(id);
            if(matchedDev!=null) {
                matchedDev.Close();
                devLists.remove(matchedDev);
            }
        }
    }


}
