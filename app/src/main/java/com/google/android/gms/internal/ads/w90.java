package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class w90 implements b50 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f12174a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f12175b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f12176c;

    /* renamed from: d, reason: collision with root package name */
    public final rr1 f12177d;
    public final wa0 e;

    public w90(Map map, Map map2, Map map3, rr1 rr1Var, wa0 wa0Var) {
        this.f12174a = map;
        this.f12175b = map2;
        this.f12176c = map3;
        this.f12177d = rr1Var;
        this.e = wa0Var;
    }

    @Override // com.google.android.gms.internal.ads.b50
    public final di0 a(int i, String str) {
        di0 a10;
        di0 di0Var = (di0) this.f12174a.get(str);
        if (di0Var != null) {
            return di0Var;
        }
        if (i != 1) {
            if (i == 4) {
                gj0 gj0Var = (gj0) this.f12176c.get(str);
                if (gj0Var != null) {
                    return new ei0(gj0Var, i6.f7003g);
                }
                a10 = (di0) this.f12175b.get(str);
                if (a10 == null) {
                    return null;
                }
            } else {
                return null;
            }
        } else if (this.e.f12201d == null || (a10 = ((b50) this.f12177d.zzb()).a(i, str)) == null) {
            return null;
        }
        return new ei0(a10, i6.f7002f);
    }
}
