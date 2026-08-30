package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class hw1 extends e20 {
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f6905j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6906k;

    /* renamed from: l, reason: collision with root package name */
    public int f6907l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f6908m;

    /* renamed from: n, reason: collision with root package name */
    public int f6909n;

    /* renamed from: o, reason: collision with root package name */
    public long f6910o;

    @Override // com.google.android.gms.internal.ads.e20, com.google.android.gms.internal.ads.t10
    public final ByteBuffer b() {
        int i;
        if (super.e() && (i = this.f6909n) > 0) {
            j(i).put(this.f6908m, 0, this.f6909n).flip();
            this.f6909n = 0;
        }
        return super.b();
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final long d(long j10) {
        return Math.max(0L, j10 - bq0.v(this.f5577b.f4299a, this.f6905j + this.i));
    }

    @Override // com.google.android.gms.internal.ads.e20, com.google.android.gms.internal.ads.t10
    public final boolean e() {
        return super.e() && this.f6909n == 0;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void g(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.f6907l);
            this.f6910o += min / this.f5577b.f4302d;
            this.f6907l -= min;
            byteBuffer.position(position + min);
            if (this.f6907l <= 0) {
                int i10 = i - min;
                int length = (this.f6909n + i10) - this.f6908m.length;
                ByteBuffer j10 = j(length);
                int i11 = this.f6909n;
                String str = bq0.f4860a;
                int max = Math.max(0, Math.min(length, i11));
                j10.put(this.f6908m, 0, max);
                int max2 = Math.max(0, Math.min(length - max, i10));
                byteBuffer.limit(byteBuffer.position() + max2);
                j10.put(byteBuffer);
                byteBuffer.limit(limit);
                int i12 = i10 - max2;
                int i13 = this.f6909n - max;
                this.f6909n = i13;
                byte[] bArr = this.f6908m;
                System.arraycopy(bArr, max, bArr, 0, i13);
                byteBuffer.get(this.f6908m, this.f6909n, i12);
                this.f6909n += i12;
                j10.flip();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final a00 k(a00 a00Var) {
        if (bq0.d(a00Var.f4301c)) {
            this.f6906k = true;
            if (this.i == 0 && this.f6905j == 0) {
                return a00.e;
            }
            return a00Var;
        }
        throw new i10("Unhandled input format:", a00Var);
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final void l() {
        if (this.f6906k) {
            if (this.f6909n > 0) {
                this.f6910o += r0 / this.f5577b.f4302d;
            }
            this.f6909n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final void m() {
        if (this.f6906k) {
            this.f6906k = false;
            int i = this.f6905j;
            int i10 = this.f5577b.f4302d;
            this.f6908m = new byte[i * i10];
            this.f6907l = this.i * i10;
        }
        this.f6909n = 0;
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final void n() {
        this.f6908m = bq0.f4861b;
    }
}
