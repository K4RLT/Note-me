package com.google.android.gms.internal.ads;
import ab.b;
import g5.q;
import i1.o;
import i5.h;
import y1.a;

import android.util.Log;
import androidx.ink.brush.color.colorspace.ColorSpace;
import com.facebook.ads.internal.api.AdSizeApi;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public abstract /* synthetic */ class wd0 {
    public static /* bridge */ /* synthetic */ int a(Object obj) {
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (obj instanceof Double) {
            return 4;
        }
        q.f("invalid tag type: ".concat(String.valueOf(obj.getClass())));
        return 0;
    }

    public static int b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return 0;
        }
        return 5;
    }

    public static int c(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return 0;
        }
        return 5;
    }

    public static int d(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return 0;
        }
        return 5;
    }

    public static int e(int i) {
        if (i != 90) {
            if (i != 91) {
                if (i != 93) {
                    if (i != 94) {
                        switch (i) {
                            case 0:
                                return 1;
                            case 1:
                                return 2;
                            case 2:
                                return 3;
                            case 3:
                                return 4;
                            case 4:
                                return 5;
                            case 5:
                                return 6;
                            case 6:
                                return 7;
                            case 7:
                                return 8;
                            case 8:
                                return 9;
                            case 9:
                                return 10;
                            case 10:
                                return 11;
                            case 11:
                                return 12;
                            case 12:
                                return 13;
                            case 13:
                                return 14;
                            case 14:
                                return 15;
                            case 15:
                                return 16;
                            case 16:
                                return 17;
                            case 17:
                                return 18;
                            case 18:
                                return 19;
                            case 19:
                                return 20;
                            case 20:
                                return 21;
                            case gl.zzm /* 21 */:
                                return 22;
                            case 22:
                                return 23;
                            case 23:
                                return 24;
                            case 24:
                                return 25;
                            case 25:
                                return 26;
                            case 26:
                                return 27;
                            case 27:
                                return 28;
                            case 28:
                                return 29;
                            case 29:
                                return 30;
                            case 30:
                                return 31;
                            case 31:
                                return 32;
                            case 32:
                                return 33;
                            case 33:
                                return 34;
                            case 34:
                                return 35;
                            case 35:
                                return 36;
                            case 36:
                                return 37;
                            case 37:
                                return 38;
                            case 38:
                                return 39;
                            case 39:
                                return 40;
                            case 40:
                                return 41;
                            case 41:
                                return 42;
                            case 42:
                                return 43;
                            case 43:
                                return 44;
                            case 44:
                                return 45;
                            case 45:
                                return 46;
                            case 46:
                                return 47;
                            case 47:
                                return 48;
                            case 48:
                                return 49;
                            case 49:
                                return 50;
                            case 50:
                                return 51;
                            case 51:
                                return 52;
                            case 52:
                                return 53;
                            case 53:
                                return 54;
                            case 54:
                                return 55;
                            case 55:
                                return 56;
                            case 56:
                                return 57;
                            case 57:
                                return 58;
                            case 58:
                                return 59;
                            case 59:
                                return 60;
                            case 60:
                                return 61;
                            case 61:
                                return 62;
                            case 62:
                                return 63;
                            case ColorSpace.MAX_ID /* 63 */:
                                return 64;
                            case 64:
                                return 65;
                            case 65:
                                return 66;
                            case 66:
                                return 67;
                            case 67:
                                return 68;
                            case 68:
                                return 69;
                            case 69:
                                return 70;
                            case 70:
                                return 71;
                            case 71:
                                return 72;
                            case 72:
                                return 73;
                            case 73:
                                return 74;
                            case 74:
                                return 75;
                            case 75:
                                return 76;
                            case 76:
                                return 77;
                            case 77:
                                return 78;
                            case 78:
                                return 79;
                            case 79:
                                return 80;
                            default:
                                switch (i) {
                                    case 96:
                                        return 87;
                                    case 97:
                                        return 88;
                                    case 98:
                                        return 89;
                                    case 99:
                                        return 90;
                                    case AdSizeApi.INTERSTITIAL /* 100 */:
                                        return 91;
                                    case FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS /* 101 */:
                                        return 92;
                                    case FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH /* 102 */:
                                        return 83;
                                    case FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT /* 103 */:
                                        return 86;
                                    case FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION /* 104 */:
                                        return 93;
                                    case FacebookMediationAdapter.ERROR_REQUIRES_UNIFIED_NATIVE_ADS /* 105 */:
                                        return 94;
                                    case FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE /* 106 */:
                                        return 95;
                                    case FacebookMediationAdapter.ERROR_NULL_CONTEXT /* 107 */:
                                        return 96;
                                    case FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS /* 108 */:
                                        return 97;
                                    case FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD /* 109 */:
                                        return 98;
                                    case FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD /* 110 */:
                                        return 99;
                                    case FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION /* 111 */:
                                        return 100;
                                    case 112:
                                        return FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS;
                                    case 113:
                                        return FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH;
                                    case 114:
                                        return FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT;
                                    case 115:
                                        return FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION;
                                    case 116:
                                        return FacebookMediationAdapter.ERROR_REQUIRES_UNIFIED_NATIVE_ADS;
                                    case ModuleDescriptor.MODULE_VERSION /* 117 */:
                                        return FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE;
                                    case 118:
                                        return FacebookMediationAdapter.ERROR_NULL_CONTEXT;
                                    case 119:
                                        return FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS;
                                    case 120:
                                        return FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD;
                                    case 121:
                                        return FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD;
                                    case 122:
                                        return FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION;
                                    case 123:
                                        return 112;
                                    case 124:
                                        return 113;
                                    case 125:
                                        return 114;
                                    case 126:
                                        return ModuleDescriptor.MODULE_VERSION;
                                    case 127:
                                        return 119;
                                    case 128:
                                        return 120;
                                    case 129:
                                        return 121;
                                    case 130:
                                        return 122;
                                    case 131:
                                        return 123;
                                    case 132:
                                        return 124;
                                    case 133:
                                        return 125;
                                    case 134:
                                        return 126;
                                    case 135:
                                        return 127;
                                    case 136:
                                        return 128;
                                    case 137:
                                        return 129;
                                    case 138:
                                        return 130;
                                    case 139:
                                        return 131;
                                    case 140:
                                        return 132;
                                    case 141:
                                        return 133;
                                    case 142:
                                        return 134;
                                    case 143:
                                        return 135;
                                    case 144:
                                        return 136;
                                    case 145:
                                        return 115;
                                    case 146:
                                        return 116;
                                    case 147:
                                        return 118;
                                    case 148:
                                        return 137;
                                    case 149:
                                        return 138;
                                    case 150:
                                        return 139;
                                    default:
                                        return 0;
                                }
                        }
                    }
                    return 85;
                }
                return 84;
            }
            return 82;
        }
        return 81;
    }

    public static /* synthetic */ String f(int i) {
        switch (i) {
            case 1:
                return "api-call";
            case 2:
                return "dynamite-enter";
            case 3:
                return "read-from-disk-start";
            case 4:
                return "read-from-disk-end";
            case 5:
                return "client-signals-start";
            case 6:
                return "client-signals-end";
            case 7:
                return "service-connected";
            case 8:
                return "gms-signals-start";
            case 9:
                return "gms-signals-end";
            case 10:
                return "get-signals-sdkcore-start";
            case 11:
                return "get-signals-sdkcore-end";
            case 12:
                return "get-ad-dictionary-sdkcore-start";
            case 13:
                return "get-ad-dictionary-sdkcore-end";
            case 14:
                return "http-response-ready";
            case 15:
                return "scar-preloader-ready";
            case 16:
                return "scar-preloader-processing-done";
            case 17:
                return "normalize-ad-response-start";
            case 18:
                return "normalize-ad-response-end";
            case 19:
                return "binder-call-start";
            case 20:
                return "server-response-parse-start";
            case gl.zzm /* 21 */:
                return "rendering-start";
            case 22:
                return "public-api-callback";
            case 23:
                return "rendering-native-ads-native-js-webview-start";
            case 24:
                return "rendering-native-ads-preprocess-start";
            case 25:
                return "rendering-native-ads-preprocess-end";
            case 26:
                return "rendering-native-assets-loading-start";
            case 27:
                return "rendering-native-assets-loading-end";
            case 28:
                return "rendering-webview-creation-start";
            case 29:
                return "rendering-webview-creation-end";
            case 30:
                return "rendering-ad-component-creation-end";
            case 31:
                return "rendering-configure-webview-start";
            case 32:
                return "rendering-configure-webview-end";
            case 33:
                return "rendering-webview-load-html-start";
            case 34:
                return "rendering-webview-load-html-end";
            case 35:
                return "type2-fetch-start";
            case 36:
                return "type2-fetch-end";
            case 37:
                return "sod-validation-start";
            case 38:
                return "sod-validation-end";
            case 39:
                return "sod-cache-key-start";
            case 40:
                return "sod-cache-key-end";
            case 41:
                return "sod-read-and-remove-start";
            case 42:
                return "sod-read-and-remove-end";
            case 43:
                return "sod-decode-start";
            case 44:
                return "sod-decode-end";
            case 45:
                return "native-assets-loading-basic-start";
            case 46:
                return "native-assets-loading-basic-end";
            case 47:
                return "native-assets-loading-image-start";
            case 48:
                return "native-assets-loading-image-end";
            case 49:
                return "native-assets-loading-image-composition-start";
            case 50:
                return "native-assets-loading-image-composition-end";
            case 51:
                return "native-assets-loading-logo-start";
            case 52:
                return "native-assets-loading-logo-end";
            case 53:
                return "native-assets-loading-icon-start";
            case 54:
                return "native-assets-loading-icon-end";
            case 55:
                return "native-assets-loading-attribution-start";
            case 56:
                return "native-assets-loading-attribution-end";
            case 57:
                return "native-assets-loading-video-start";
            case 58:
                return "native-assets-loading-video-end";
            case 59:
                return "native-assets-loading-video-composition-start";
            case 60:
                return "native-assets-loading-media-start";
            case 61:
                return "native-assets-loading-media-end";
            case 62:
                return "native-assets-loading-custom-start";
            case ColorSpace.MAX_ID /* 63 */:
                return "native-assets-loading-custom-end";
            case 64:
                return "native-assets-loading-omid-start";
            case 65:
                return "native-assets-loading-omid-end";
            default:
                throw null;
        }
    }

    public static /* synthetic */ int g(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case gl.zzm /* 21 */:
                return 20;
            case 22:
                return 21;
            case 23:
                return 22;
            case 24:
                return 23;
            case 25:
                return 24;
            case 26:
                return 25;
            case 27:
                return 26;
            case 28:
                return 27;
            case 29:
                return 28;
            case 30:
                return 29;
            case 31:
                return 30;
            case 32:
                return 31;
            case 33:
                return 32;
            case 34:
                return 33;
            case 35:
                return 34;
            case 36:
                return 35;
            case 37:
                return 36;
            case 38:
                return 37;
            case 39:
                return 38;
            case 40:
                return 39;
            case 41:
                return 40;
            case 42:
                return 41;
            case 43:
                return 42;
            case 44:
                return 43;
            case 45:
                return 44;
            case 46:
                return 45;
            case 47:
                return 46;
            case 48:
                return 47;
            case 49:
                return 48;
            case 50:
                return 49;
            case 51:
                return 50;
            case 52:
                return 51;
            case 53:
                return 52;
            case 54:
                return 53;
            case 55:
                return 54;
            case 56:
                return 55;
            case 57:
                return 56;
            case 58:
                return 57;
            case 59:
                return 58;
            case 60:
                return 59;
            case 61:
                return 60;
            case 62:
                return 61;
            case ColorSpace.MAX_ID /* 63 */:
                return 62;
            case 64:
                return 63;
            case 65:
                return 64;
            case 66:
                return 65;
            case 67:
                return 66;
            case 68:
                return 67;
            case 69:
                return 68;
            case 70:
                return 69;
            case 71:
                return 70;
            case 72:
                return 71;
            case 73:
                return 72;
            case 74:
                return 73;
            case 75:
                return 74;
            case 76:
                return 75;
            case 77:
                return 76;
            case 78:
                return 77;
            case 79:
                return 78;
            case 80:
                return 79;
            case 81:
                return 90;
            case 82:
                return 91;
            case 83:
                return FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH;
            case 84:
                return 93;
            case 85:
                return 94;
            case 86:
                return FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT;
            case 87:
                return 96;
            case 88:
                return 97;
            case 89:
                return 98;
            case 90:
                return 99;
            case 91:
                return 100;
            case 92:
                return FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS;
            case 93:
                return FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION;
            case 94:
                return FacebookMediationAdapter.ERROR_REQUIRES_UNIFIED_NATIVE_ADS;
            case 95:
                return FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE;
            case 96:
                return FacebookMediationAdapter.ERROR_NULL_CONTEXT;
            case 97:
                return FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS;
            case 98:
                return FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD;
            case 99:
                return FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD;
            case AdSizeApi.INTERSTITIAL /* 100 */:
                return FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION;
            case FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS /* 101 */:
                return 112;
            case FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH /* 102 */:
                return 113;
            case FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT /* 103 */:
                return 114;
            case FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION /* 104 */:
                return 115;
            case FacebookMediationAdapter.ERROR_REQUIRES_UNIFIED_NATIVE_ADS /* 105 */:
                return 116;
            case FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE /* 106 */:
                return ModuleDescriptor.MODULE_VERSION;
            case FacebookMediationAdapter.ERROR_NULL_CONTEXT /* 107 */:
                return 118;
            case FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS /* 108 */:
                return 119;
            case FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD /* 109 */:
                return 120;
            case FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD /* 110 */:
                return 121;
            case FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION /* 111 */:
                return 122;
            case 112:
                return 123;
            case 113:
                return 124;
            case 114:
                return 125;
            case 115:
                return 145;
            case 116:
                return 146;
            case ModuleDescriptor.MODULE_VERSION /* 117 */:
                return 126;
            case 118:
                return 147;
            case 119:
                return 127;
            case 120:
                return 128;
            case 121:
                return 129;
            case 122:
                return 130;
            case 123:
                return 131;
            case 124:
                return 132;
            case 125:
                return 133;
            case 126:
                return 134;
            case 127:
                return 135;
            case 128:
                return 136;
            case 129:
                return 137;
            case 130:
                return 138;
            case 131:
                return 139;
            case 132:
                return 140;
            case 133:
                return 141;
            case 134:
                return 142;
            case 135:
                return 143;
            case 136:
                return 144;
            case 137:
                return 148;
            case 138:
                return 149;
            case 139:
                return 150;
            default:
                throw null;
        }
    }

    public static /* synthetic */ String h(int i) {
        if (i == 1) {
            return "htmlDisplay";
        }
        if (i == 2) {
            return "nativeDisplay";
        }
        if (i == 3) {
            return "video";
        }
        throw null;
    }

    public static /* synthetic */ String i(int i) {
        if (i == 1) {
            return "beginToRender";
        }
        if (i == 2) {
            return "definedByJavascript";
        }
        if (i == 3) {
            return "onePixel";
        }
        if (i == 4) {
            return "unspecified";
        }
        throw null;
    }

    public static int j(int i, int i10, int i11) {
        int i12 = i / i10;
        return i12 + i12 + i11;
    }

    public static int k(int i, int i10, int i11, int i12) {
        return um1.T(i) + i10 + i11 + i12;
    }

    public static int l(int i, int i10, int i11, int i12, int i13) {
        return Math.max(((i * i10) / i11) + i12, i13);
    }

    public static b m(String str) {
        a.c(str);
        return new b(14, (byte) 0);
    }

    public static String n(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static void o(String str, String str2, String str3) {
        Log.w(str3, str + str2);
    }

    public static int p(int i, int i10, int i11) {
        return um1.T(i) + i10 + i11;
    }

    public static int q(int i, int i10, int i11, int i12) {
        return com.google.android.gms.internal.consent_sdk.h(i) + i10 + i11 + i12;
    }

    public static int r(int i, int i10, int i11) {
        return com.google.android.gms.internal.consent_sdk.h(i) + i10 + i11;
    }

    public static int s(int i, int i10, int i11, int i12) {
        return com.google.android.gms.internal.mlkit_vision_digital_ink.ym.c(i) + i10 + i11 + i12;
    }

    public static int t(int i, int i10, int i11) {
        return com.google.android.gms.internal.measurement.t4.t(i) + i10 + i11;
    }

    public static int u(int i, int i10, int i11, int i12) {
        return com.google.android.gms.internal.play_billing.o(i) + i10 + i11 + i12;
    }

    public static int v(int i, int i10, int i11) {
        return com.google.android.gms.internal.mlkit_vision_digital_ink.ym.c(i) + i10 + i11;
    }

    public static int w(int i, int i10, int i11) {
        return com.google.android.gms.internal.play_billing.o(i) + i10 + i11;
    }

    public static /* synthetic */ String x(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "VIDEO" : "NATIVE_DISPLAY" : "HTML_DISPLAY";
    }
}
