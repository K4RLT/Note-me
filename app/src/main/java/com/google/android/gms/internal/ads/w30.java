package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class w30 implements t10 {

    /* renamed from: b, reason: collision with root package name */
    public int f12115b;

    /* renamed from: c, reason: collision with root package name */
    public float f12116c;

    /* renamed from: d, reason: collision with root package name */
    public float f12117d;
    public a00 e;

    /* renamed from: f, reason: collision with root package name */
    public a00 f12118f;

    /* renamed from: g, reason: collision with root package name */
    public a00 f12119g;

    /* renamed from: h, reason: collision with root package name */
    public a00 f12120h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public f30 f12121j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f12122k;

    /* renamed from: l, reason: collision with root package name */
    public ByteBuffer f12123l;

    /* renamed from: m, reason: collision with root package name */
    public long f12124m;

    /* renamed from: n, reason: collision with root package name */
    public long f12125n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12126o;

    @Override // com.google.android.gms.internal.ads.t10
    public final void a() {
        f30 f30Var = this.f12121j;
        if (f30Var != null) {
            int i = f30Var.f5908j;
            int i10 = f30Var.f5913o;
            int i11 = f30Var.f5909k;
            float f10 = f30Var.f5903c;
            float f11 = f30Var.f5904d;
            int i12 = i11 + ((int) (((((((i - i10) / (f10 / f11)) + i10) + f30Var.f5915q) + f30Var.f5910l) / (f30Var.e * f11)) + 0.5d));
            f30Var.f5915q = 0.0d;
            int i13 = f30Var.f5907h;
            int i14 = i13 + i13;
            t20 t20Var = f30Var.i;
            t20Var.b(i + i14);
            t20Var.m(i * f30Var.f5902b, i14);
            f30Var.f5908j += i14;
            f30Var.b();
            if (f30Var.f5909k > i12) {
                f30Var.f5909k = Math.max(i12, 0);
            }
            f30Var.f5908j = 0;
            f30Var.f5913o = 0;
            f30Var.f5910l = 0;
        }
        this.f12126o = true;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final ByteBuffer b() {
        boolean z3;
        f30 f30Var = this.f12121j;
        if (f30Var != null) {
            t20 t20Var = f30Var.i;
            int i = f30Var.f5902b;
            boolean z9 = true;
            if (f30Var.f5909k >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            b80.K(z3);
            int zza = t20Var.zza() * f30Var.f5909k * i;
            if (zza > 0) {
                if (this.f12122k.capacity() < zza) {
                    this.f12122k = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                } else {
                    this.f12122k.clear();
                }
                ByteBuffer byteBuffer = this.f12122k;
                if (f30Var.f5909k < 0) {
                    z9 = false;
                }
                b80.K(z9);
                int min = Math.min(byteBuffer.remaining() / (t20Var.zza() * i), f30Var.f5909k);
                t20Var.o(min, byteBuffer);
                f30Var.f5909k -= min;
                System.arraycopy(t20Var.j(), min * i, t20Var.j(), 0, f30Var.f5909k * i);
                this.f12122k.flip();
                this.f12125n += zza;
                this.f12123l = this.f12122k;
            }
        }
        ByteBuffer byteBuffer2 = this.f12123l;
        this.f12123l = t10.f11228a;
        return byteBuffer2;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final boolean c() {
        if (this.f12118f.f4299a != -1) {
            if (Math.abs(this.f12116c - 1.0f) >= 1.0E-4f || Math.abs(this.f12117d - 1.0f) >= 1.0E-4f || this.f12118f.f4299a != this.e.f4299a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final long d(long j10) {
        if (this.f12125n >= 1024) {
            long j11 = this.f12124m;
            this.f12121j.getClass();
            long zza = j11 - (r2.i.zza() * (r2.f5908j * r2.f5902b));
            int i = this.f12120h.f4299a;
            int i10 = this.f12119g.f4299a;
            long j12 = this.f12125n;
            if (i == i10) {
                return bq0.w(j10, j12, zza, RoundingMode.DOWN);
            }
            return bq0.w(j10, j12 * i10, zza * i, RoundingMode.DOWN);
        }
        return (long) (j10 / this.f12116c);
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final boolean e() {
        boolean z3;
        if (this.f12126o) {
            f30 f30Var = this.f12121j;
            if (f30Var != null) {
                if (f30Var.f5909k >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                b80.K(z3);
                if (f30Var.i.zza() * f30Var.f5909k * f30Var.f5902b != 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void f() {
        this.f12116c = 1.0f;
        this.f12117d = 1.0f;
        a00 a00Var = a00.e;
        this.e = a00Var;
        this.f12118f = a00Var;
        this.f12119g = a00Var;
        this.f12120h = a00Var;
        ByteBuffer byteBuffer = t10.f11228a;
        this.f12122k = byteBuffer;
        this.f12123l = byteBuffer;
        this.f12115b = -1;
        this.i = false;
        this.f12121j = null;
        this.f12124m = 0L;
        this.f12125n = 0L;
        this.f12126o = false;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void g(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        f30 f30Var = this.f12121j;
        f30Var.getClass();
        this.f12124m += byteBuffer.remaining();
        t20 t20Var = f30Var.i;
        int remaining = byteBuffer.remaining();
        int zza = remaining / (t20Var.zza() * f30Var.f5902b);
        t20Var.b(zza);
        t20Var.l(remaining, byteBuffer);
        f30Var.f5908j += zza;
        f30Var.b();
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final a00 h(a00 a00Var) {
        int i = a00Var.f4301c;
        if (i != 2 && i != 4) {
            throw new i10("Unhandled input format:", a00Var);
        }
        int i10 = this.f12115b;
        if (i10 == -1) {
            i10 = a00Var.f4299a;
        }
        this.e = a00Var;
        a00 a00Var2 = new a00(i10, a00Var.f4300b, i);
        this.f12118f = a00Var2;
        this.i = true;
        return a00Var2;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void i(w00 w00Var) {
        boolean z3;
        if (c()) {
            a00 a00Var = this.e;
            this.f12119g = a00Var;
            a00 a00Var2 = this.f12118f;
            this.f12120h = a00Var2;
            if (this.i) {
                int i = a00Var.f4299a;
                int i10 = a00Var.f4300b;
                float f10 = this.f12116c;
                float f11 = this.f12117d;
                int i11 = a00Var2.f4299a;
                if (a00Var.f4301c == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f12121j = new f30(i, i10, f10, f11, i11, z3);
            } else {
                f30 f30Var = this.f12121j;
                if (f30Var != null) {
                    f30Var.f5908j = 0;
                    f30Var.f5909k = 0;
                    f30Var.f5910l = 0;
                    f30Var.f5911m = 0;
                    f30Var.f5912n = 0;
                    f30Var.f5913o = 0;
                    f30Var.f5914p = 0;
                    f30Var.f5915q = 0.0d;
                    f30Var.i.e();
                }
            }
        }
        this.f12123l = t10.f11228a;
        this.f12124m = 0L;
        this.f12125n = 0L;
        this.f12126o = false;
    }
}
