package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.wd0;

/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: b, reason: collision with root package name */
    public static final a2 f13629b = new a2(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a2 f13630c = new a2(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a2 f13631d = new a2(2);
    public static final a2 e = new a2(3);

    /* renamed from: f, reason: collision with root package name */
    public static final a2 f13632f = new a2(4);

    /* renamed from: g, reason: collision with root package name */
    public static final a2 f13633g = new a2(5);

    /* renamed from: h, reason: collision with root package name */
    public static final a2 f13634h = new a2(6);
    public static final a2 i = new a2(7);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13635a;

    public /* synthetic */ a2(int i10) {
        this.f13635a = i10;
    }

    public final boolean a(int i10) {
        switch (this.f13635a) {
            case 0:
                if (wd0.b(i10) != 0) {
                    return true;
                }
                return false;
            case 1:
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
            case 2:
                if (i10 == 0 || i10 == 1 || i10 == 2) {
                    return true;
                }
                return false;
            case 3:
                if (wd0.c(i10) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                    return true;
                }
                return false;
            case 5:
                if (i10 == 0 || i10 == 1) {
                    return true;
                }
                return false;
            case 6:
                if (i10 == 1 || i10 == 2) {
                    return true;
                }
                return false;
            default:
                if (wd0.d(i10) != 0) {
                    return true;
                }
                return false;
        }
    }
}
