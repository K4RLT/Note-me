package com.google.android.gms.internal.ads;
import q.x;

/* loaded from: classes.dex */
public final class rz implements ht1 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.i f10395a = new androidx.datastore.preferences.protobuf.i(1);

    /* renamed from: b, reason: collision with root package name */
    public long f10396b = 15000000;

    /* renamed from: c, reason: collision with root package name */
    public long f10397c = 30000000;

    /* renamed from: d, reason: collision with root package name */
    public long f10398d = 2500000;
    public long e = 5000000;

    /* renamed from: f, reason: collision with root package name */
    public int f10399f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10400g;

    @Override // com.google.android.gms.internal.ads.ht1
    public final void a(gt1 gt1Var, r[] rVarArr) {
        int i;
        this.f10399f = 0;
        for (r rVar : rVarArr) {
            if (rVar != null) {
                int i10 = this.f10399f;
                int i11 = rVar.zza().f6821c;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            i = 131072;
                            if (i11 != 3 && i11 != 5 && i11 != 6) {
                                q.x.m();
                                return;
                            }
                        } else {
                            i = 131072000;
                        }
                    } else {
                        i = 13107200;
                    }
                } else {
                    i = 144310272;
                }
                this.f10399f = i10 + i;
            }
        }
        this.f10395a.b1(this.f10399f);
    }

    @Override // com.google.android.gms.internal.ads.ht1
    public final long b() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.ht1
    public final void c(tu1 tu1Var) {
        this.f10399f = 0;
        this.f10400g = false;
    }

    @Override // com.google.android.gms.internal.ads.ht1
    public final boolean d(gt1 gt1Var) {
        char c10;
        int i;
        long j10 = gt1Var.f6453d;
        boolean z3 = true;
        if (j10 > this.f10397c) {
            c10 = 0;
        } else if (j10 < this.f10396b) {
            c10 = 2;
        } else {
            c10 = 1;
        }
        androidx.datastore.preferences.protobuf.i iVar = this.f10395a;
        synchronized (iVar) {
            i = iVar.f735w * 65536;
        }
        int i10 = this.f10399f;
        if (c10 != 2 && (c10 != 1 || !this.f10400g || i >= i10)) {
            z3 = false;
        }
        this.f10400g = z3;
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.ht1
    public final void e(tu1 tu1Var) {
        this.f10399f = 0;
        this.f10400g = false;
        androidx.datastore.preferences.protobuf.i iVar = this.f10395a;
        synchronized (iVar) {
            iVar.b1(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.ht1
    public final void g(tu1 tu1Var) {
        this.f10399f = 0;
        this.f10400g = false;
        androidx.datastore.preferences.protobuf.i iVar = this.f10395a;
        synchronized (iVar) {
            iVar.b1(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.ht1
    public final boolean h(gt1 gt1Var) {
        long j10 = gt1Var.f6454f ? this.e : this.f10398d;
        return j10 <= 0 || gt1Var.f6453d >= j10;
    }

    @Override // com.google.android.gms.internal.ads.ht1
    public final w i(tu1 tu1Var) {
        return this.f10395a;
    }
}
