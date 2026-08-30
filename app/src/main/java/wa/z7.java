package wa;
import b.a;
import g0.b;
import p0.b;
import c2.r2;
import g0.e1;
import g0.g2;
import j1.b;
import j1.c;
import m2.g0;
import m2.k0;
import m2.m0;
import m2.p0;
import m2.q;
import z1.x;

import android.graphics.PointF;

/* loaded from: classes.dex */
public abstract class z7 {
    public static final int a(e1 e1Var, long j10, r2 r2Var) {
        long U;
        int e;
        g2 d2 = e1Var.d();
        if (d2 != null) {
            q qVar = d2.f17113a.f20525b;
            x c10 = e1Var.c();
            if (c10 != null && (e = e(qVar, (U = c10.U(j10)), r2Var)) != -1) {
                return qVar.g(b.a(U, 1, (qVar.b(e) + qVar.f(e)) / 2.0f));
            }
        }
        return -1;
    }

    public static final long b(e1 e1Var, c cVar, c cVar2, int i) {
        long f10 = f(e1Var, cVar, i);
        if (p0.b(f10)) {
            return p0.f20544b;
        }
        long f11 = f(e1Var, cVar2, i);
        if (p0.b(f11)) {
            return p0.f20544b;
        }
        int i10 = (int) (f10 >> 32);
        int i11 = (int) (f11 & 4294967295L);
        return g0.b(Math.min(i10, i10), Math.max(i11, i11));
    }

    public static final boolean c(m0 m0Var, int i) {
        q qVar = m0Var.f20525b;
        int d2 = qVar.d(i);
        if (i == m0Var.h(d2) || i == qVar.c(d2, false) ? m0Var.i(i) != m0Var.a(i) : m0Var.a(i) != m0Var.a(i - 1)) {
            return true;
        }
        return false;
    }

    public static final long d(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        return (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L);
    }

    public static final int e(q qVar, long j10, r2 r2Var) {
        float f10;
        if (r2Var != null) {
            f10 = r2Var.g();
        } else {
            f10 = 0.0f;
        }
        int i = (int) (4294967295L & j10);
        int e = qVar.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) >= qVar.f(e) - f10 && Float.intBitsToFloat(i) <= qVar.b(e) + f10) {
            int i10 = (int) (j10 >> 32);
            if (Float.intBitsToFloat(i10) >= (-f10) && Float.intBitsToFloat(i10) <= qVar.f20550d + f10) {
                return e;
            }
            return -1;
        }
        return -1;
    }

    public static final long f(e1 e1Var, c cVar, int i) {
        q qVar;
        g2 d2 = e1Var.d();
        if (d2 != null) {
            qVar = d2.f17113a.f20525b;
        } else {
            qVar = null;
        }
        x c10 = e1Var.c();
        if (qVar != null && c10 != null) {
            return qVar.h(cVar.i(c10.U(0L)), i, k0.f20511b);
        }
        return p0.f20544b;
    }

    public static final boolean g(int i) {
        int type = Character.getType(i);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }

    public static final boolean h(int i) {
        if (!Character.isWhitespace(i) && i != 160) {
            return false;
        }
        return true;
    }

    public static final boolean i(int i) {
        int type;
        if (h(i) && (type = Character.getType(i)) != 14 && type != 13 && i != 10) {
            return true;
        }
        return false;
    }
}
