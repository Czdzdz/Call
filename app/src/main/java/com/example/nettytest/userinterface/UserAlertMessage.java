package com.example.nettytest.userinterface;

import com.example.nettytest.pub.AlertConfig;
import com.example.nettytest.pub.phonecall.CommonCall;
import com.example.nettytest.pub.result.FailReason;

public class UserAlertMessage extends UserMessage{
    public int alertType;
    public String alertID;

    public int alertDevType;
    public String alertDevId;
    public String alertHandleDevId;
    public String alertEndDevId;

    public String deviceName;
    public String patientName;
    public String patientAge;
    public String bedName;
    public String roomId;
    public String roomName;

    public String areaId;
    public String areaName;
    public boolean isTransfer;

    public int nameType;
    public String voiceInfo;
    public String displayInfo;

    public int endReason;

    public UserAlertMessage(){
        super();
        type =
        alertType = CommonCall.ALERT_TYPE_BEGIN;
        reason = FailReason.FAIL_REASON_NO;

        alertID = "";
        alertDevId = "";
        alertHandleDevId = "";
        alertEndDevId = "";
        deviceName = "";
        patientName = "";
        patientAge = "";
        bedName = "";
        roomId = "";
        roomName="";

        areaId = "";
        areaName = "";
        isTransfer = false;

        voiceInfo = "";
        displayInfo = "";
        nameType = AlertConfig.USE_BED_NAME;

    }

}
