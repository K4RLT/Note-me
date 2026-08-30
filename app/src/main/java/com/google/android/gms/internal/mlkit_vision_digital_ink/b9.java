package com.google.android.gms.internal.mlkit_vision_digital_ink;
import zb.a;

/* loaded from: classes.dex */
public final class b9 implements rn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14093a;

    /* renamed from: b, reason: collision with root package name */
    public static final b9 f14070b = new b9(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b9 f14071c = new b9(1);

    /* renamed from: d, reason: collision with root package name */
    public static final b9 f14072d = new b9(2);
    public static final b9 e = new b9(3);

    /* renamed from: f, reason: collision with root package name */
    public static final b9 f14073f = new b9(4);

    /* renamed from: g, reason: collision with root package name */
    public static final b9 f14074g = new b9(5);

    /* renamed from: h, reason: collision with root package name */
    public static final b9 f14075h = new b9(6);
    public static final b9 i = new b9(7);

    /* renamed from: j, reason: collision with root package name */
    public static final b9 f14076j = new b9(8);

    /* renamed from: k, reason: collision with root package name */
    public static final b9 f14077k = new b9(9);

    /* renamed from: l, reason: collision with root package name */
    public static final b9 f14078l = new b9(10);

    /* renamed from: m, reason: collision with root package name */
    public static final b9 f14079m = new b9(11);

    /* renamed from: n, reason: collision with root package name */
    public static final b9 f14080n = new b9(12);

    /* renamed from: o, reason: collision with root package name */
    public static final b9 f14081o = new b9(13);

    /* renamed from: p, reason: collision with root package name */
    public static final b9 f14082p = new b9(14);

    /* renamed from: q, reason: collision with root package name */
    public static final b9 f14083q = new b9(15);

    /* renamed from: r, reason: collision with root package name */
    public static final b9 f14084r = new b9(16);

    /* renamed from: s, reason: collision with root package name */
    public static final b9 f14085s = new b9(17);

    /* renamed from: t, reason: collision with root package name */
    public static final b9 f14086t = new b9(18);

    /* renamed from: u, reason: collision with root package name */
    public static final b9 f14087u = new b9(19);

    /* renamed from: v, reason: collision with root package name */
    public static final b9 f14088v = new b9(20);

    /* renamed from: w, reason: collision with root package name */
    public static final b9 f14089w = new b9(21);

    /* renamed from: x, reason: collision with root package name */
    public static final b9 f14090x = new b9(22);

    /* renamed from: y, reason: collision with root package name */
    public static final b9 f14091y = new b9(23);

    /* renamed from: z, reason: collision with root package name */
    public static final b9 f14092z = new b9(24);
    public static final b9 A = new b9(25);
    public static final b9 B = new b9(26);
    public static final b9 C = new b9(27);
    public static final b9 D = new b9(28);
    public static final b9 E = new b9(29);

    public /* synthetic */ b9(int i10) {
        this.f14093a = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.rn
    public final boolean e(int i10) {
        c9 c9Var;
        switch (this.f14093a) {
            case 0:
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
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case com.google.android.gms.internal.ads.gl.zzm /* 21 */:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        return true;
                    default:
                        return false;
                }
            case 1:
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
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case com.google.android.gms.internal.ads.gl.zzm /* 21 */:
                    case 22:
                        return true;
                    default:
                        return false;
                }
            case 2:
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
            case 3:
                switch (i10) {
                    case 0:
                        c9Var = c9.UNKNOWN;
                        break;
                    case 1:
                        c9Var = c9.GROUP_NOT_FOUND;
                        break;
                    case 2:
                        c9Var = c9.NEW_BUILD_ID;
                        break;
                    case 3:
                        c9Var = c9.NEW_VARIANT_ID;
                        break;
                    case 4:
                        c9Var = c9.NEW_VERSION_NUMBER;
                        break;
                    case 5:
                        c9Var = c9.DIFFERENT_FILES;
                        break;
                    case 6:
                        c9Var = c9.DIFFERENT_STALE_LIFETIME;
                        break;
                    case 7:
                        c9Var = c9.DIFFERENT_EXPIRATION_DATE;
                        break;
                    case 8:
                        c9Var = c9.DIFFERENT_DOWNLOAD_CONDITIONS;
                        break;
                    case 9:
                        c9Var = c9.DIFFERENT_ALLOWED_READERS;
                        break;
                    case 10:
                        c9Var = c9.DIFFERENT_DOWNLOAD_POLICY;
                        break;
                    case 11:
                        c9Var = c9.DIFFERENT_EXPERIMENT_INFO;
                        break;
                    case 12:
                        c9Var = c9.DIFFERENT_CUSTOM_METADATA;
                        break;
                    default:
                        c9Var = null;
                        break;
                }
                if (c9Var != null) {
                    return true;
                }
                return false;
            case 4:
                if (a(i10) != null) {
                    return true;
                }
                return false;
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
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) {
                    return true;
                }
                switch (i10) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        return true;
                    default:
                        return false;
                }
            case 7:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
                    return true;
                }
                return false;
            case 8:
                if (i10 == 0 || i10 == 1 || i10 == 2) {
                    return true;
                }
                return false;
            case 9:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                    return true;
                }
                return false;
            case 10:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
                    return true;
                }
                return false;
            case 11:
                if (i10 == 0 || i10 == 1 || i10 == 2) {
                    return true;
                }
                return false;
            case 12:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
                    return true;
                }
                return false;
            case 13:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                    return true;
                }
                return false;
            case 14:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
                    return true;
                }
                return false;
            case 15:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                    return true;
                }
                return false;
            case 16:
                switch (i10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case 17:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                    return true;
                }
                return false;
            case 18:
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
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case com.google.android.gms.internal.ads.gl.zzm /* 21 */:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                        return true;
                    default:
                        return false;
                }
            case 19:
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
            case 20:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
                    return true;
                }
                return false;
            case com.google.android.gms.internal.ads.gl.zzm /* 21 */:
                if (i10 == 0 || i10 == 1 || i10 == 2) {
                    return true;
                }
                return false;
            case 22:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
                    return true;
                }
                return false;
            case 23:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
                    return true;
                }
                return false;
            case 24:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
                    return true;
                }
                return false;
            case 25:
                if (i10 == 0 || i10 == 1 || i10 == 2) {
                    return true;
                }
                return false;
            case 26:
                if (i10 == 0 || i10 == 1 || i10 == 2) {
                    return true;
                }
                return false;
            case 27:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
                    return true;
                }
                return false;
            case 28:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                    return true;
                }
                return false;
            default:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                    return true;
                }
                return false;
        }
    }
}
