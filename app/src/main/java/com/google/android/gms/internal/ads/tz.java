package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class tz implements pf1 {

    /* renamed from: u, reason: collision with root package name */
    public final yc1 f11488u;

    /* renamed from: v, reason: collision with root package name */
    public final long f11489v;

    /* renamed from: w, reason: collision with root package name */
    public final pf1 f11490w;

    /* renamed from: x, reason: collision with root package name */
    public long f11491x;

    /* renamed from: y, reason: collision with root package name */
    public Uri f11492y;

    public tz(yc1 yc1Var, int i, pf1 pf1Var) {
        this.f11488u = yc1Var;
        this.f11489v = i;
        this.f11490w = pf1Var;
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final long a(dj1 dj1Var) {
        dj1 dj1Var2;
        long j10;
        dj1 dj1Var3;
        dj1 dj1Var4;
        long j11;
        Uri uri = dj1Var.f5444a;
        long j12 = dj1Var.f5447d;
        this.f11492y = uri;
        long j13 = dj1Var.f5446c;
        long j14 = this.f11489v;
        if (j13 >= j14) {
            dj1Var2 = null;
        } else {
            long j15 = j14 - j13;
            if (j12 != -1) {
                j15 = Math.min(j12, j15);
            }
            dj1Var2 = new dj1(uri, j13, j15);
        }
        if (j12 != -1 && j13 + j12 <= j14) {
            dj1Var3 = dj1Var2;
            dj1Var4 = null;
        } else {
            long max = Math.max(j14, j13);
            if (j12 != -1) {
                j10 = Math.min(j12, (j13 + j12) - j14);
            } else {
                j10 = -1;
            }
            dj1Var3 = dj1Var2;
            dj1Var4 = new dj1(uri, max, j10);
        }
        long j16 = 0;
        if (dj1Var3 != null) {
            j11 = this.f11488u.a(dj1Var3);
        } else {
            j11 = 0;
        }
        if (dj1Var4 != null) {
            j16 = this.f11490w.a(dj1Var4);
        }
        this.f11491x = j13;
        if (j11 == -1 || j16 == -1) {
            return -1L;
        }
        return j11 + j16;
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final void b(as1 as1Var) {
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final Uri c() {
        return this.f11492y;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int e(byte[] bArr, int i, int i10) {
        int i11;
        long j10 = this.f11491x;
        long j11 = this.f11489v;
        if (j10 < j11) {
            int e = this.f11488u.e(bArr, i, (int) Math.min(i10, j11 - j10));
            long j12 = this.f11491x + e;
            this.f11491x = j12;
            i11 = e;
            j10 = j12;
        } else {
            i11 = 0;
        }
        if (j10 >= j11) {
            int e8 = this.f11490w.e(bArr, i + i11, i10 - i11);
            int i12 = i11 + e8;
            this.f11491x += e8;
            return i12;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final Map f() {
        return d61.A;
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final void k() {
        this.f11488u.k();
        this.f11490w.k();
    }
}
