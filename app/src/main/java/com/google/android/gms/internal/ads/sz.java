package com.google.android.gms.internal.ads;
import ac.b;
import f9.k;
import g9.r;
import la.b;
import q.x;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class sz extends qb1 {
    public final lx0 A;
    public final String B;
    public final int C;
    public final boolean D;
    public InputStream E;
    public boolean F;
    public Uri G;
    public volatile dj H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public long M;
    public b N;
    public final AtomicLong O;

    /* renamed from: y, reason: collision with root package name */
    public final Context f11198y;

    /* renamed from: z, reason: collision with root package name */
    public final pf1 f11199z;

    public sz(Context context, pf1 pf1Var, String str, int i, as1 as1Var, lx0 lx0Var) {
        super(false);
        this.f11198y = context;
        this.f11199z = pf1Var;
        this.A = lx0Var;
        this.B = str;
        this.C = i;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = 0L;
        this.O = new AtomicLong(-1L);
        this.N = null;
        this.D = ((Boolean) r.e.f17698c.a(sl.f11010x2)).booleanValue();
        b(as1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0244  */
    /* JADX WARN: Type inference failed for: r2v23, types: [k] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.String] */
    @Override // com.google.android.gms.internal.ads.pf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.google.android.gms.internal.ads.dj1 r18) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sz.a(com.google.android.gms.internal.ads.dj1):long");
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final Uri c() {
        return this.G;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int e(byte[] bArr, int i, int i10) {
        int e;
        if (this.F) {
            InputStream inputStream = this.E;
            if (inputStream != null) {
                e = inputStream.read(bArr, i, i10);
            } else {
                e = this.f11199z.e(bArr, i, i10);
            }
            if (this.D && this.E == null) {
                return e;
            }
            i(e);
            return e;
        }
        x.p("Attempt to read closed GcacheDataSource.");
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final void k() {
        if (this.F) {
            boolean z3 = false;
            this.F = false;
            this.G = null;
            if (!this.D || this.E != null) {
                z3 = true;
            }
            InputStream inputStream = this.E;
            if (inputStream != null) {
                b.d(inputStream);
                this.E = null;
            } else {
                this.f11199z.k();
            }
            if (z3) {
                j();
                return;
            }
            return;
        }
        x.p("Attempt to close an already closed GcacheDataSource.");
    }

    public final boolean l() {
        if (this.D) {
            nl nlVar = sl.f10836m5;
            r rVar = r.e;
            if (!((Boolean) rVar.f17698c.a(nlVar)).booleanValue() || this.K) {
                if (((Boolean) rVar.f17698c.a(sl.f10853n5)).booleanValue() && !this.L) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
