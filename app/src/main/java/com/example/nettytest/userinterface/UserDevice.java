package com.example.nettytest.userinterface;

public class    UserDevice {
    public int type;
    public String devid;
    public String areaId;
    public String bedName;
    public String roomId;
    public boolean isRegOk;
    public int netMode;

    public UserDevice(){
        devid = "";
        areaId = "";
        bedName = "";
        roomId = "";
        isRegOk = false;
    }
}
