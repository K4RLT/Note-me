package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class vy1 extends uh {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f12071g = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f12072b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12073c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12074d;
    public final y4 e;

    /* renamed from: f, reason: collision with root package name */
    public final v1 f12075f;

    static {
        b51 b51Var = d51.f5314v;
        y51 y51Var = y51.f12781y;
        List list = Collections.EMPTY_LIST;
        y51 y51Var2 = y51.f12781y;
        o3 o3Var = o3.f8931a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new j2(uri, y51Var2);
        }
        new n();
        a7 a7Var = a7.C;
    }

    public vy1(long j10, long j11, boolean z3, y4 y4Var, v1 v1Var) {
        this.f12072b = j10;
        this.f12073c = j11;
        this.f12074d = z3;
        y4Var.getClass();
        this.e = y4Var;
        this.f12075f = v1Var;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final ah b(int i, ah ahVar, long j10) {
        b80.N(i, 1);
        Object obj = ah.f4496m;
        ahVar.a(this.e, this.f12074d, false, this.f12075f, this.f12073c);
        return ahVar;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final qg d(int i, qg qgVar, boolean z3) {
        Object obj;
        b80.N(i, 1);
        if (z3) {
            obj = f12071g;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        eu euVar = eu.f5807b;
        qgVar.a(null, obj2, 0, this.f12072b, false);
        return qgVar;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int e(Object obj) {
        if (f12071g.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final Object f(int i) {
        b80.N(i, 1);
        return f12071g;
    }
}
