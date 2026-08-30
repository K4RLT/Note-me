package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class nd implements gn1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8672a;

    /* renamed from: b, reason: collision with root package name */
    public static final nd f8649b = new nd(0);

    /* renamed from: c, reason: collision with root package name */
    public static final nd f8650c = new nd(1);

    /* renamed from: d, reason: collision with root package name */
    public static final nd f8651d = new nd(2);
    public static final nd e = new nd(3);

    /* renamed from: f, reason: collision with root package name */
    public static final nd f8652f = new nd(4);

    /* renamed from: g, reason: collision with root package name */
    public static final nd f8653g = new nd(5);

    /* renamed from: h, reason: collision with root package name */
    public static final nd f8654h = new nd(6);
    public static final nd i = new nd(7);

    /* renamed from: j, reason: collision with root package name */
    public static final nd f8655j = new nd(8);

    /* renamed from: k, reason: collision with root package name */
    public static final nd f8656k = new nd(9);

    /* renamed from: l, reason: collision with root package name */
    public static final nd f8657l = new nd(10);

    /* renamed from: m, reason: collision with root package name */
    public static final nd f8658m = new nd(11);

    /* renamed from: n, reason: collision with root package name */
    public static final nd f8659n = new nd(12);

    /* renamed from: o, reason: collision with root package name */
    public static final nd f8660o = new nd(13);

    /* renamed from: p, reason: collision with root package name */
    public static final nd f8661p = new nd(14);

    /* renamed from: q, reason: collision with root package name */
    public static final nd f8662q = new nd(15);

    /* renamed from: r, reason: collision with root package name */
    public static final nd f8663r = new nd(16);

    /* renamed from: s, reason: collision with root package name */
    public static final nd f8664s = new nd(17);

    /* renamed from: t, reason: collision with root package name */
    public static final nd f8665t = new nd(18);

    /* renamed from: u, reason: collision with root package name */
    public static final nd f8666u = new nd(19);

    /* renamed from: v, reason: collision with root package name */
    public static final nd f8667v = new nd(20);

    /* renamed from: w, reason: collision with root package name */
    public static final nd f8668w = new nd(21);

    /* renamed from: x, reason: collision with root package name */
    public static final nd f8669x = new nd(22);

    /* renamed from: y, reason: collision with root package name */
    public static final nd f8670y = new nd(23);

    /* renamed from: z, reason: collision with root package name */
    public static final nd f8671z = new nd(24);
    public static final nd A = new nd(25);
    public static final nd B = new nd(26);
    public static final nd C = new nd(27);
    public static final nd D = new nd(28);
    public static final nd E = new nd(29);

    public /* synthetic */ nd(int i10) {
        this.f8672a = i10;
    }

    @Override // com.google.android.gms.internal.ads.gn1
    public final boolean e(int i10) {
        kj kjVar;
        tj tjVar;
        wk wkVar;
        switch (this.f8672a) {
            case 0:
                if (i10 == 0 || i10 == 1 || i10 == 2) {
                    return true;
                }
                return false;
            case 1:
                if (i10 == 0 || i10 == 1 || i10 == 2) {
                    return true;
                }
                return false;
            case 2:
                switch (i10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 3:
                if (i10 == 0 || i10 == 1 || i10 == 2) {
                    return true;
                }
                return false;
            case 4:
                switch (i10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 5:
                switch (i10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        return true;
                    default:
                        return false;
                }
            case 6:
                if (i10 == 0 || i10 == 1) {
                    return true;
                }
                return false;
            case 7:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                    return true;
                }
                return false;
            case 8:
                if (ed1.o(i10) != 0) {
                    return true;
                }
                return false;
            case 9:
                switch (i10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        return true;
                    default:
                        return false;
                }
            case 10:
                switch (i10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 11:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 1000) {
                    return true;
                }
                return false;
            case 12:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                    return true;
                }
                return false;
            case 13:
                if (hh.a(i10) != null) {
                    return true;
                }
                return false;
            case 14:
                switch (i10) {
                    case 0:
                        kjVar = kj.AD_INITIATER_UNSPECIFIED;
                        break;
                    case 1:
                        kjVar = kj.BANNER;
                        break;
                    case 2:
                        kjVar = kj.DFP_BANNER;
                        break;
                    case 3:
                        kjVar = kj.INTERSTITIAL;
                        break;
                    case 4:
                        kjVar = kj.DFP_INTERSTITIAL;
                        break;
                    case 5:
                        kjVar = kj.NATIVE_EXPRESS;
                        break;
                    case 6:
                        kjVar = kj.AD_LOADER;
                        break;
                    case 7:
                        kjVar = kj.REWARD_BASED_VIDEO_AD;
                        break;
                    case 8:
                        kjVar = kj.BANNER_SEARCH_ADS;
                        break;
                    case 9:
                        kjVar = kj.GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                        break;
                    case 10:
                        kjVar = kj.APP_OPEN;
                        break;
                    case 11:
                        kjVar = kj.REWARDED_INTERSTITIAL;
                        break;
                    default:
                        kjVar = null;
                        break;
                }
                if (kjVar != null) {
                    return true;
                }
                return false;
            case 15:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 4) {
                    return true;
                }
                return false;
            case 16:
                if (i10 == 0 || i10 == 1 || i10 == 2) {
                    return true;
                }
                return false;
            case 17:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 != 5) {
                                        tjVar = null;
                                    } else {
                                        tjVar = tj.SUSPENDED;
                                    }
                                } else {
                                    tjVar = tj.DISCONNECTED;
                                }
                            } else {
                                tjVar = tj.DISCONNECTING;
                            }
                        } else {
                            tjVar = tj.CONNECTED;
                        }
                    } else {
                        tjVar = tj.CONNECTING;
                    }
                } else {
                    tjVar = tj.UNSPECIFIED;
                }
                if (tjVar != null) {
                    return true;
                }
                return false;
            case 18:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
                    return true;
                }
                return false;
            case 19:
                if (i10 == 0 || i10 == 1) {
                    return true;
                }
                return false;
            case 20:
                switch (i10) {
                    case 0:
                        wkVar = wk.AD_FORMAT_TYPE_UNSPECIFIED;
                        break;
                    case 1:
                        wkVar = wk.BANNER;
                        break;
                    case 2:
                        wkVar = wk.INTERSTITIAL;
                        break;
                    case 3:
                        wkVar = wk.NATIVE_EXPRESS;
                        break;
                    case 4:
                        wkVar = wk.NATIVE_CONTENT;
                        break;
                    case 5:
                        wkVar = wk.NATIVE_APP_INSTALL;
                        break;
                    case 6:
                        wkVar = wk.NATIVE_CUSTOM_TEMPLATE;
                        break;
                    case 7:
                        wkVar = wk.DFP_BANNER;
                        break;
                    case 8:
                        wkVar = wk.DFP_INTERSTITIAL;
                        break;
                    case 9:
                        wkVar = wk.REWARD_BASED_VIDEO_AD;
                        break;
                    case 10:
                        wkVar = wk.BANNER_SEARCH_ADS;
                        break;
                    default:
                        wkVar = null;
                        break;
                }
                if (wkVar != null) {
                    return true;
                }
                return false;
            case gl.zzm /* 21 */:
                if (i10 == 0 || i10 == 1 || i10 == 2) {
                    return true;
                }
                return false;
            case 22:
                if (i10 == 0 || i10 == 1 || i10 == 1000) {
                    return true;
                }
                return false;
            case 23:
                if (i10 == 1 || i10 == 2) {
                    return true;
                }
                return false;
            case 24:
                if (i10 == 0 || i10 == 1) {
                    return true;
                }
                return false;
            case 25:
                if (b80.c(i10) != 0) {
                    return true;
                }
                return false;
            case 26:
                if (x21.a(i10) != 0) {
                    return true;
                }
                return false;
            case 27:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
                    return true;
                }
                return false;
            case 28:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 1999) {
                    return true;
                }
                switch (i10) {
                    case AdError.NETWORK_ERROR_CODE /* 1000 */:
                    case AdError.NO_FILL_ERROR_CODE /* 1001 */:
                    case AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE /* 1002 */:
                    case 1003:
                    case 1004:
                    case 1005:
                    case 1006:
                    case 1007:
                    case 1008:
                    case 1009:
                    case 1010:
                        return true;
                    default:
                        return false;
                }
            default:
                if (i10 == 0 || i10 == 1) {
                    return true;
                }
                return false;
        }
    }
}
