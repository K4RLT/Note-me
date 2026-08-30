package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.wd0;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a1 f15371b = new a1(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a1 f15372c = new a1(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a1 f15373d = new a1(2);
    public static final a1 e = new a1(3);

    /* renamed from: f, reason: collision with root package name */
    public static final a1 f15374f = new a1(4);

    /* renamed from: g, reason: collision with root package name */
    public static final a1 f15375g = new a1(5);

    /* renamed from: h, reason: collision with root package name */
    public static final a1 f15376h = new a1(6);
    public static final a1 i = new a1(7);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15377a;

    public /* synthetic */ a1(int i10) {
        this.f15377a = i10;
    }

    public final boolean a(int i10) {
        i3 i3Var;
        switch (this.f15377a) {
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
                        return true;
                    default:
                        return false;
                }
            case 1:
                switch (i10) {
                    default:
                        switch (i10) {
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
                                break;
                            default:
                                return false;
                        }
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
                        return true;
                }
            case 2:
                if (wd0.e(i10) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                i3Var = null;
                            } else {
                                i3Var = i3.ALTERNATIVE_BILLING_ACTION;
                            }
                        } else {
                            i3Var = i3.LOCAL_PURCHASES_UPDATED_ACTION;
                        }
                    } else {
                        i3Var = i3.PURCHASES_UPDATED_ACTION;
                    }
                } else {
                    i3Var = i3.BROADCAST_ACTION_UNSPECIFIED;
                }
                if (i3Var != null) {
                    return true;
                }
                return false;
            case 4:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
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
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        return true;
                    case 14:
                    case 15:
                    case 16:
                    default:
                        return false;
                }
            case 6:
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
            default:
                if (i10 == 0 || i10 == 1) {
                    return true;
                }
                return false;
        }
    }
}
