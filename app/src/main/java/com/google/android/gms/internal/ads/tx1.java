package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tx1 extends uh {

    /* renamed from: b, reason: collision with root package name */
    public final y4 f11485b;

    public tx1(y4 y4Var) {
        this.f11485b = y4Var;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final ah b(int i, ah ahVar, long j10) {
        Object obj = ah.f4496m;
        ahVar.a(this.f11485b, false, true, null, -9223372036854775807L);
        ahVar.i = true;
        return ahVar;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final qg d(int i, qg qgVar, boolean z3) {
        Integer num;
        Object obj = null;
        if (z3) {
            num = 0;
        } else {
            num = null;
        }
        if (z3) {
            obj = sx1.e;
        }
        Object obj2 = obj;
        eu euVar = eu.f5807b;
        qgVar.a(num, obj2, 0, -9223372036854775807L, true);
        return qgVar;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int e(Object obj) {
        if (obj == sx1.e) {
            return 0;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final Object f(int i) {
        return sx1.e;
    }
}
