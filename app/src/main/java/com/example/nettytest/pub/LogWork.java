package com.example.nettytest.pub;

import android.util.Log;

public class LogWork {

    public final static int TERMINAL_PHONE_MODULE = 1;
    public final static int TERMINAL_DEVICE_MODULE = 2;
    public final static int TERMINAL_CALL_MODULE = 3;
    public final static int TERMINAL_NET_MODULE = 4;
    public final static int TERMINAL_USER_MODULE = 5;

    public final static int BACKEND_PHONE_MODULE = 101;
    public final static int BACKEND_DEVICE_MODULE = 102;
    public final static int BACKEND_CALL_MODULE = 103;
    public final static int BACKEND_NET_MODULE = 104;

    public final static int TRANSACTION_MODULE = 201;

    public final static int DEBUG_MODULE = 301;

    public final static int LOG_VERBOSE = 1;
    public final static int LOG_DEBUG = 2;
    public final static int LOG_INFO = 3;
    public final static int LOG_WARN = 4;
    public final static int LOG_ERROR = 5;
    public final static int LOG_FATAL = 6;

    public static int Print(int module,int degLevel,String buf){
        return Print(module,degLevel,buf,"");
    }

    public static int Print(int module,int degLevel,String format,Object...param){
        boolean isPrint = false;
        String tag = "";
        if (degLevel >= LOG_VERBOSE) {
            boolean terminalPhoneModuleLogEnable = true;
            boolean terminalDeviceModuleLogEnable = true;
            boolean terminalNetModuleLogEnable = true;
            boolean terminalCallModuleLogEnable = true;
            boolean terminalUserModuleLogEnable = true;
            boolean backEndPhoneModuleLogEnable = true;
            boolean backEndDeviceModuleLogEnable = true;
            boolean backEndCallModuleLogEnable = true;
            boolean backEndNetModuleLogEnable = true;
            boolean transactionModuleLogEnable = true;
            boolean debugModuleLogEnable = true;
            switch (module) {
                case TERMINAL_PHONE_MODULE:
                    isPrint = terminalPhoneModuleLogEnable;
                    tag = "HT500_TERMINAL_PHONE";
                    break;
                case TERMINAL_DEVICE_MODULE:
                    isPrint = terminalDeviceModuleLogEnable;
                    tag = "HT500_TERMINAL_DEVICE";
                    break;
                case TERMINAL_CALL_MODULE:
                    isPrint = terminalCallModuleLogEnable;
                    tag = "HT500_TERMINAL_CALL";
                    break;
                case TERMINAL_NET_MODULE:
                    isPrint = terminalNetModuleLogEnable;
                    tag = "HT500_TERMINAL_NET";
                    break;
                case TERMINAL_USER_MODULE:
                    isPrint = terminalUserModuleLogEnable;
                    tag = "HT500_TERMINAL_USER";
                    break;
                case BACKEND_PHONE_MODULE:
                    isPrint = backEndPhoneModuleLogEnable;
                    tag = "HT500_BACKEND_PHONE";
                    break;
                case BACKEND_DEVICE_MODULE:
                    isPrint = backEndDeviceModuleLogEnable;
                    tag = "HT500_BACKEND_DEVICE";
                    break;
                case BACKEND_CALL_MODULE:
                    isPrint = backEndCallModuleLogEnable;
                    tag = "HT500_BACKEND_CALL";
                    break;
                case BACKEND_NET_MODULE:
                    isPrint = backEndNetModuleLogEnable;
                    tag = "HT500_BACKEND_NET";
                    break;
                case TRANSACTION_MODULE:
                    isPrint = transactionModuleLogEnable;
                    tag = "HT500_TRANSACTION";
                    break;
                case DEBUG_MODULE:
                    isPrint = debugModuleLogEnable;
                    tag = "HT500_DEBUG";
                    break;
            }
            if (isPrint) {
                switch (degLevel) {
                    case LOG_VERBOSE:
                        Log.v(tag, String.format(format, param));
                        break;
                    case LOG_DEBUG:
                        Log.d(tag, String.format(format, param));
                        break;
                    case LOG_INFO:
                        Log.i(tag, String.format(format, param));
                        break;
                    case LOG_WARN:
                        Log.w(tag, String.format(format, param));
                        break;
                    case LOG_ERROR:
                        Log.e(tag, String.format(format, param));
                        break;
                    case LOG_FATAL:
                        Log.e(tag, String.format(format, param));
                        break;
                }
            }
        }
        return 0;
    }

}
