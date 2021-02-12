package com.xuebinduan.zxing.wifi;

enum NetworkType {
    WEP,
    WPA,
    NO_PASSWORD,
    WPA2_EAP;

    static NetworkType forIntentValue(String networkTypeString) {
        if (networkTypeString == null) {
            return NO_PASSWORD;
        }
        switch (networkTypeString) {
            case "WPA":
            case "WPA2":
                return WPA;
            case "WPA2-EAP":
                return WPA2_EAP;
            case "WEP":
                return WEP;
            case "nopass":
                return NO_PASSWORD;
            default:
                throw new IllegalArgumentException(networkTypeString);
        }
    }
}
