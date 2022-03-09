package com.example.nettytest.terminal.test;

import com.example.nettytest.userinterface.UserCallMessage;

class LocalAlertInfo{
    public final static int LOCAL_ALERT_STATUS_OUTGOING = 1;
    public final static int LOCAL_ALERT_STATUS_SUCC = 2;
    public final static int LOCAL_ALERT_STATUS_INCOMING = 3;
    public final static int LOCAL_ALERT_STATUS_HANDLED = 4;
    public final static int LOCAL_ALERT_STATUS_END = 5;
    public String alertDev;
    public String handler;
    public String ender;
    public int alertType;

    public int status;
    public String alertId;

    public LocalAlertInfo(){
        alertType = 1;
        alertDev = "";
        handler = "";
        ender = "";
        alertId = "";
        status = LOCAL_ALERT_STATUS_END;
    }

}


