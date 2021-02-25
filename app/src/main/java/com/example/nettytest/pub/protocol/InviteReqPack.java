package com.example.nettytest.pub.protocol;

public class InviteReqPack extends ProtocolPacket{
    public int callType;
    public int callDirect;
    public String callID;

    public String caller;
    public int callerType;
    public String bedName;
    public String patientName;
    public int patientAge;
    public String roomId;
    public String deviceName;


    public String callee;

    public int codec;
    public int pTime;
    public int sample;

    public String callerRtpIP;
    public int callerRtpPort;

    public String broadcastIP;
    public int broadcastPort;

    private void CopyInviteData(InviteReqPack invitePack){
        callType = invitePack.callType;
        callDirect = invitePack.callDirect;
        callID = invitePack.callID;

        caller = invitePack.caller;
        callerType = invitePack.callerType;
        callee = invitePack.callee;

        bedName = invitePack.bedName;
        deviceName = invitePack.deviceName;
        patientAge = invitePack.patientAge;
        patientName = invitePack.patientName;
        roomId = invitePack.roomId;

        codec = invitePack.codec;
        pTime = invitePack.pTime;
        sample = invitePack.sample;

        callerRtpPort = invitePack.callerRtpPort;
        callerRtpIP = invitePack.callerRtpIP;

        broadcastPort = invitePack.broadcastPort;
        broadcastIP = invitePack.broadcastIP;
    }

    public int ExchangeCopyData(InviteReqPack pack){
        super.ExchangeCopyData(pack);

        CopyInviteData(pack);

        return 1;
    }
}
