package com.example.nettytest.pub;

public class AlertConfig {

    public static final int USE_DEVICE_NAME = 1;
    public static final int USE_BED_NAME = 2;
    public static final int USE_ROOM_NAME = 3;

    public int alertType;
    public int nameType;
    public String voiceInfo;
    public String displayInfo;

    public AlertConfig(){
        alertType = 0;
        nameType = USE_DEVICE_NAME;
        voiceInfo = "";
        displayInfo = "";
    }
}
