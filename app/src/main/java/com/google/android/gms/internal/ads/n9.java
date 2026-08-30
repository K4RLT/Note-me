package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class n9 {

    /* renamed from: a, reason: collision with root package name */
    public final i3 f8593a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8594b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8595c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8596d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f8597f;

    /* renamed from: g, reason: collision with root package name */
    public long f8598g;

    /* renamed from: h, reason: collision with root package name */
    public long f8599h;

    public n9(i3 i3Var) {
        this.f8593a = i3Var;
    }

    public final void a(byte[] bArr, int i, int i10) {
        boolean z3;
        if (this.f8595c) {
            int i11 = this.f8597f;
            int i12 = (i + 1) - i11;
            if (i12 < i10) {
                if (((bArr[i12] & 192) >> 6) == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f8596d = z3;
                this.f8595c = false;
                return;
            }
            this.f8597f = (i10 - i) + i11;
        }
    }

    public final void b(int i, long j10, boolean z3) {
        boolean z9;
        if (this.f8599h != -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        b80.K(z9);
        if (this.e == 182 && z3 && this.f8594b) {
            long j11 = j10 - this.f8598g;
            boolean z10 = this.f8596d;
            this.f8593a.c(this.f8599h, z10 ? 1 : 0, (int) j11, i, null);
        }
        if (this.e != 179) {
            this.f8598g = j10;
        }
    }
}
