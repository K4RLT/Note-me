package c2;
import t0.a;
import b.c;
import d0.a;
import a0.k0;
import b2.u1;
import j1.b;
import k1.d0;
import k1.l0;
import k1.t0;
import k1.y;
import n0.o;
import n1.d;
import y2.j;
import y2.l;
import y2.m;

import android.os.Build;
import android.view.ViewParent;
import java.util.ArrayList;
import wa.u8;
import ya.rd;
import ya.vd;

/* loaded from: classes.dex */
public final class y1 implements u1 {
    public boolean A;
    public float[] C;
    public boolean D;
    public int H;
    public l0 J;
    public boolean K;
    public boolean L;
    public boolean N;

    /* renamed from: u, reason: collision with root package name */
    public b f3727u;

    /* renamed from: v, reason: collision with root package name */
    public final y f3728v;

    /* renamed from: w, reason: collision with root package name */
    public final x f3729w;

    /* renamed from: x, reason: collision with root package name */
    public df.p f3730x;

    /* renamed from: y, reason: collision with root package name */
    public df.a f3731y;

    /* renamed from: z, reason: collision with root package name */
    public long f3732z;
    public final float[] B = d0.a();
    public c E = rd.a();
    public m F = m.f30814u;
    public final b G = new b();
    public long I = t0.f19529b;
    public boolean M = true;
    public final k0 O = new k0(13, this);

    public y1(b bVar, y yVar, x xVar, df.p pVar, df.a aVar) {
        this.f3727u = bVar;
        this.f3728v = yVar;
        this.f3729w = xVar;
        this.f3730x = pVar;
        this.f3731y = aVar;
        long j10 = Integer.MAX_VALUE;
        this.f3732z = (j10 & 4294967295L) | (j10 << 32);
    }

    public final float[] a() {
        float[] fArr = this.C;
        if (fArr == null) {
            fArr = d0.a();
            this.C = fArr;
        }
        if (!this.L) {
            if (Float.isNaN(fArr[0])) {
                return null;
            }
        } else {
            this.L = false;
            float[] b10 = b();
            if (this.M) {
                return b10;
            }
            if (!o(b10, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        }
        return fArr;
    }

    public final float[] b() {
        boolean z3 = this.K;
        float[] fArr = this.B;
        if (z3) {
            b bVar = this.f3727u;
            long j10 = bVar.f21032v;
            d dVar = bVar.f21013a;
            if ((9223372034707292159L & j10) == 9205357640488583168L) {
                j10 = u8.b(vd.c(this.f3732z));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
            float B = dVar.B();
            float t3 = dVar.t();
            float D = dVar.D();
            float m4 = dVar.m();
            float o10 = dVar.o();
            float b10 = dVar.b();
            float K = dVar.K();
            double d2 = D * 0.017453292519943295d;
            float sin = (float) Math.sin(d2);
            float cos = (float) Math.cos(d2);
            float f10 = -sin;
            float f11 = (t3 * cos) - (1.0f * sin);
            float f12 = (1.0f * cos) + (t3 * sin);
            double d10 = m4 * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d10);
            float cos2 = (float) Math.cos(d10);
            float f13 = -sin2;
            float f14 = sin * sin2;
            float f15 = sin * cos2;
            float f16 = cos * sin2;
            float f17 = cos * cos2;
            float f18 = (f12 * sin2) + (B * cos2);
            float f19 = (f12 * cos2) + ((-B) * sin2);
            double d11 = o10 * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d11);
            float cos3 = (float) Math.cos(d11);
            float f20 = -sin3;
            float f21 = (cos3 * f14) + (f20 * cos2);
            float f22 = ((f14 * sin3) + (cos2 * cos3)) * b10;
            float f23 = sin3 * cos * b10;
            float f24 = ((sin3 * f15) + (cos3 * f13)) * b10;
            float f25 = f21 * K;
            float f26 = cos * cos3 * K;
            float f27 = ((cos3 * f15) + (f20 * f13)) * K;
            float f28 = f16 * 1.0f;
            float f29 = f10 * 1.0f;
            float f30 = f17 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f22;
                fArr[1] = f23;
                fArr[2] = f24;
                fArr[3] = 0.0f;
                fArr[4] = f25;
                fArr[5] = f26;
                fArr[6] = f27;
                fArr[7] = 0.0f;
                fArr[8] = f28;
                fArr[9] = f29;
                fArr[10] = f30;
                fArr[11] = 0.0f;
                float f31 = -intBitsToFloat;
                fArr[12] = ((f22 * f31) - (intBitsToFloat2 * f25)) + f18 + intBitsToFloat;
                fArr[13] = ((f23 * f31) - (intBitsToFloat2 * f26)) + f11 + intBitsToFloat2;
                fArr[14] = ((f31 * f24) - (intBitsToFloat2 * f27)) + f19;
                fArr[15] = 1.0f;
            }
            this.K = false;
            this.M = l0.s(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (!this.D && !this.A) {
            this.f3729w.invalidate();
            f(true);
        }
    }

    public final void d(long j10) {
        x xVar = this.f3729w;
        if (xVar.f3716z) {
            xVar.L(-4.0f);
        }
        b bVar = this.f3727u;
        if (!j.a(bVar.f21030t, j10)) {
            bVar.f21030t = j10;
            bVar.f21013a.A(bVar.f21031u, (int) (j10 >> 32), (int) (j10 & 4294967295L));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ViewParent parent = xVar.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(xVar, xVar);
                return;
            }
            return;
        }
        xVar.invalidate();
    }

    public final void e(long j10) {
        if (!l.c(j10, this.f3732z)) {
            x xVar = this.f3729w;
            if (xVar.f3716z) {
                xVar.L(-4.0f);
            }
            this.f3732z = j10;
            c();
        }
    }

    public final void f(boolean z3) {
        if (z3 != this.D) {
            this.D = z3;
            x xVar = this.f3729w;
            ArrayList arrayList = xVar.R;
            boolean z9 = xVar.T;
            if (!z3) {
                if (!z9) {
                    arrayList.remove(this);
                    ArrayList arrayList2 = xVar.S;
                    if (arrayList2 != null) {
                        arrayList2.remove(this);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!z9) {
                arrayList.add(this);
                return;
            }
            ArrayList arrayList3 = xVar.S;
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                xVar.S = arrayList3;
            }
            arrayList3.add(this);
        }
    }

    public final void g() {
        if (this.D) {
            if (!t0.a(this.I, t0.f19529b) && !l.c(this.f3727u.f21031u, this.f3732z)) {
                b bVar = this.f3727u;
                float intBitsToFloat = Float.intBitsToFloat((int) (this.I >> 32)) * ((int) (this.f3732z >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (this.I & 4294967295L)) * ((int) (this.f3732z & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                if (!b.c(bVar.f21032v, floatToRawIntBits)) {
                    bVar.f21032v = floatToRawIntBits;
                    bVar.f21013a.p(floatToRawIntBits);
                }
            }
            this.f3727u.e(this.E, this.F, this.f3732z, this.O);
            f(false);
        }
    }
}
