package r;
import j1.e;
import k1.l0;
import l.b;
import l.c;
import r.f;
import r0.i1;
import r0.v0;
import t.y1;
import x.j0;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import wa.u8;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final y2.c f24064a;

    /* renamed from: b, reason: collision with root package name */
    public long f24065b = 9205357640488583168L;

    /* renamed from: c, reason: collision with root package name */
    public final z f24066c;

    /* renamed from: d, reason: collision with root package name */
    public final i1 f24067d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24068f;

    /* renamed from: g, reason: collision with root package name */
    public long f24069g;

    /* renamed from: h, reason: collision with root package name */
    public long f24070h;
    public final b2.k i;

    public f(Context context, y2.c cVar, long j10, j0 j0Var) {
        e0 e0Var;
        this.f24064a = cVar;
        z zVar = new z(context, l0.F(j10));
        this.f24066c = zVar;
        this.f24067d = new i1(pe.z.f22715a, v0.f24418w);
        this.e = true;
        this.f24069g = 0L;
        this.f24070h = -1L;
        b8.s sVar = new b8.s(4, this);
        v1.k kVar = v1.d0.f27293a;
        v1.h0 h0Var = new v1.h0(null, null, null, sVar);
        if (Build.VERSION.SDK_INT >= 31) {
            e0Var = new e0(h0Var, this, zVar);
        } else {
            e0Var = new e0(h0Var, this, zVar, j0Var);
        }
        this.i = e0Var;
    }

    public final void a() {
        boolean z3;
        z zVar = this.f24066c;
        EdgeEffect edgeEffect = zVar.f24169d;
        boolean z9 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z3 = !edgeEffect.isFinished();
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = zVar.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            if (edgeEffect2.isFinished() && !z3) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        EdgeEffect edgeEffect3 = zVar.f24170f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            if (edgeEffect3.isFinished() && !z3) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        EdgeEffect edgeEffect4 = zVar.f24171g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z3) {
                z9 = false;
            }
            z3 = z9;
        }
        if (z3) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r18, y1 r20, ve.c r21) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r.f.b(long, y1, ve.c):java.lang.Object");
    }

    public final long c() {
        long j10 = this.f24065b;
        if ((9223372034707292159L & j10) == 9205357640488583168L) {
            j10 = u8.b(this.f24069g);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (this.f24069g >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) / Float.intBitsToFloat((int) (this.f24069g & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void d() {
        if (this.e) {
            this.f24067d.setValue(pe.z.f22715a);
        }
    }

    public final float e(long j10) {
        float f10;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j10 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f24069g & 4294967295L));
        EdgeEffect b10 = this.f24066c.b();
        float f11 = -intBitsToFloat2;
        float f12 = 1 - intBitsToFloat;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            f11 = f3.c(b10, f11, f12);
        } else {
            b10.onPull(f11, f12);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & this.f24069g)) * (-f11);
        if (i10 >= 31) {
            f10 = f3.b(b10);
        } else {
            f10 = 0.0f;
        }
        if (f10 == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    public final float f(long j10) {
        float f10;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j10 >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f24069g >> 32));
        EdgeEffect c10 = this.f24066c.c();
        float f11 = 1 - intBitsToFloat;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            intBitsToFloat2 = f3.c(c10, intBitsToFloat2, f11);
        } else {
            c10.onPull(intBitsToFloat2, f11);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.f24069g >> 32)) * intBitsToFloat2;
        if (i10 >= 31) {
            f10 = f3.b(c10);
        } else {
            f10 = 0.0f;
        }
        if (f10 == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    public final float g(long j10) {
        float f10;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j10 >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f24069g >> 32));
        EdgeEffect d2 = this.f24066c.d();
        float f11 = -intBitsToFloat2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            f11 = f3.c(d2, f11, intBitsToFloat);
        } else {
            d2.onPull(f11, intBitsToFloat);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.f24069g >> 32)) * (-f11);
        if (i10 >= 31) {
            f10 = f3.b(d2);
        } else {
            f10 = 0.0f;
        }
        if (f10 == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    public final float h(long j10) {
        float f10;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j10 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f24069g & 4294967295L));
        EdgeEffect e = this.f24066c.e();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            intBitsToFloat2 = f3.c(e, intBitsToFloat2, intBitsToFloat);
        } else {
            e.onPull(intBitsToFloat2, intBitsToFloat);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.f24069g & 4294967295L)) * intBitsToFloat2;
        if (i10 >= 31) {
            f10 = f3.b(e);
        } else {
            f10 = 0.0f;
        }
        if (f10 == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    public final void i(long j10) {
        boolean a10 = e.a(this.f24069g, 0L);
        boolean a11 = e.a(j10, this.f24069g);
        this.f24069g = j10;
        if (!a11) {
            long b10 = (ff.a.b(Float.intBitsToFloat((int) (j10 & 4294967295L))) & 4294967295L) | (ff.a.b(Float.intBitsToFloat((int) (j10 >> 32))) << 32);
            z zVar = this.f24066c;
            zVar.f24168c = b10;
            EdgeEffect edgeEffect = zVar.f24169d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (b10 >> 32), (int) (b10 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = zVar.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (b10 >> 32), (int) (b10 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = zVar.f24170f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (b10 & 4294967295L), (int) (b10 >> 32));
            }
            EdgeEffect edgeEffect4 = zVar.f24171g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (b10 & 4294967295L), (int) (b10 >> 32));
            }
            EdgeEffect edgeEffect5 = zVar.f24172h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (b10 >> 32), (int) (b10 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = zVar.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (b10 >> 32), (int) (b10 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = zVar.f24173j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (b10 & 4294967295L), (int) (b10 >> 32));
            }
            EdgeEffect edgeEffect8 = zVar.f24174k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & b10), (int) (b10 >> 32));
            }
        }
        if (!a10 && !a11) {
            a();
        }
    }
}
