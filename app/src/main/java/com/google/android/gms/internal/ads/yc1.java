package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes.dex */
public final class yc1 extends qb1 {
    public byte[] A;
    public int B;
    public int C;
    public boolean D;

    /* renamed from: y, reason: collision with root package name */
    public final zq0 f12853y;

    /* renamed from: z, reason: collision with root package name */
    public Uri f12854z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc1(byte[] bArr) {
        super(false);
        zq0 zq0Var = new zq0(8, bArr);
        this.f12853y = zq0Var;
        b80.l(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final long a(dj1 dj1Var) {
        d(dj1Var);
        this.f12854z = dj1Var.f5444a;
        byte[] bArr = (byte[]) this.f12853y.f13255v;
        this.A = bArr;
        long j10 = dj1Var.f5446c;
        int length = bArr.length;
        if (j10 <= length) {
            int i = (int) j10;
            this.B = i;
            int i10 = length - i;
            this.C = i10;
            long j11 = dj1Var.f5447d;
            if (j11 != -1) {
                this.C = (int) Math.min(i10, j11);
            }
            this.D = true;
            g(dj1Var);
            if (j11 != -1) {
                return j11;
            }
            return this.C;
        }
        throw new pg1();
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final Uri c() {
        return this.f12854z;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int e(byte[] bArr, int i, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.C;
        if (i11 == 0) {
            return -1;
        }
        int min = Math.min(i10, i11);
        byte[] bArr2 = this.A;
        bArr2.getClass();
        System.arraycopy(bArr2, this.B, bArr, i, min);
        this.B += min;
        this.C -= min;
        i(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final void k() {
        if (this.D) {
            this.D = false;
            j();
        }
        this.f12854z = null;
        this.A = null;
    }
}
