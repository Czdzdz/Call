package com.example.nettytest.pub.protocol;

public class InviteReqPack extends ProtocolPacket{
    public int callType;
    public int callDirect;
    public String callID;

    // add by caller
    public String caller;
    public int callerType;   
    public String patientName;
    public String patientAge;

    // add by server    
    public String bedName;
    public String roomId;
    public String roomName;
    public String deviceName;
    public String areaId;
    public String areaName;
    public boolean isTransfer;
   
    public String callee;

    public int codec;
    public int pTime;
    public int sample;

    public String callerRtpIP;
    public int callerRtpPort;

    public int autoAnswerTime;

    public static final int USE_DEVICE_NAME = 1;
    public static final int USE_BED_NAME = 2;
    public static final int USE_ROOM_NAME = 3;

    public int nameType;
    public String voiceInfo;
    public String displayInfo;
    public String handler;

    public InviteReqPack(){

        super();
        voiceInfo = "";
        displayInfo = "";
        handler = "";
    }

    protected void CopyInviteData(InviteReqPack invitePack){
        callType = invitePack.callType;
        callDirect = invitePack.callDirect;
        callID = invitePack.callID;

        caller = invitePack.caller;
        callerType = invitePack.callerType;
        patientName = invitePack.patientName;
        patientAge = invitePack.patientAge;

        bedName = invitePack.bedName;
        roomId = invitePack.roomId;
        roomName = invitePack.roomName;
        deviceName = invitePack.deviceName;
        areaId = invitePack.areaId;
        areaName = invitePack.areaName;
        isTransfer = invitePack.isTransfer;

        callee = invitePack.callee;

        codec = invitePack.codec;
        pTime = invitePack.pTime;
        sample = invitePack.sample;

        callerRtpPort = invitePack.callerRtpPort;
        callerRtpIP = invitePack.callerRtpIP;

        autoAnswerTime = invitePack.autoAnswerTime;

        nameType = invitePack.nameType;
        voiceInfo = invitePack.voiceInfo;
        displayInfo = invitePack.displayInfo;
    }

    public int ExchangeCopyData(InviteReqPack pack){
        super.ExchangeCopyData(pack);

        CopyInviteData(pack);

        return 1;
    }

    public int Clone(InviteReqPack pack){
        
        type = pack.type;
        msgID = pack.msgID;
        sender = pack.sender;
        receiver = pack.receiver;
        
        CopyInviteData(pack);
        return 0;
    }
}
