package g0;
import x.n;
import m2.l0;
import m2.m0;
import m2.q;
import o.a;
import q.x;

import ya.ae;
import ya.ld;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f17126a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17127b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17128c;

    public i(long j10, long j11, long j12) {
        this.f17126a = j10;
        this.f17127b = j11;
        this.f17128c = j12;
        long j13 = y2.o.f30819c;
        if (!y2.a(j10, j13)) {
            if (!y2.a(j11, j13)) {
                if (!y2.a(j12, j13)) {
                    if (y2.a(y2.o.b(j10), y2.o.b(j11))) {
                        ae.b(j10, j11);
                        if (Float.compare(y2.o.c(j10), y2.o.c(j11)) > 0) {
                            this.f17126a = j11;
                        }
                    }
                    if (y2.a(y2.o.b(j12), 4294967296L)) {
                        long f10 = ae.f(4294967296L, 1.0E-4f);
                        ae.b(j12, f10);
                        if (Float.compare(y2.o.c(j12), y2.o.c(f10)) < 0) {
                            x.n("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
                            throw null;
                        }
                    }
                    if (y2.o.c(this.f17126a) >= 0.0f) {
                        if (y2.o.c(j11) >= 0.0f) {
                            return;
                        }
                        x.n("AutoSize.StepBased: maxFontSize must not be negative");
                        throw null;
                    }
                    x.n("AutoSize.StepBased: minFontSize must not be negative");
                    throw null;
                }
                x.n("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
                throw null;
            }
            x.n("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
            throw null;
        }
        x.n("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
        throw null;
    }

    public static boolean a(m0 m0Var) {
        q qVar = m0Var.f20525b;
        long j10 = m0Var.f20526c;
        l0 l0Var = m0Var.f20524a;
        int i = l0Var.f20518f;
        if (i == 1 || i == 3) {
            if (((int) (j10 >> 32)) >= qVar.f20550d && !m0Var.d()) {
                return false;
            }
            return true;
        }
        if (i == 4 || i == 5 || i == 2) {
            int i10 = qVar.f20551f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i == 4 || i == 5) {
                        if (((int) (j10 >> 32)) >= qVar.f20550d && !m0Var.d()) {
                            return false;
                        }
                        return true;
                    }
                    if (i == 2) {
                        return m0Var.l(i10 - 1);
                    }
                } else {
                    return m0Var.l(0);
                }
            }
            return false;
        }
        throw new IllegalArgumentException("TextOverflow type " + ((Object) ld.a(l0Var.f20518f)) + " is not supported.");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (y2.a(iVar.f17126a, this.f17126a) && y2.a(iVar.f17127b, this.f17127b) && y2.a(iVar.f17128c, this.f17128c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        y2.p[] pVarArr = y2.o.f30818b;
        return Long.hashCode(this.f17128c) + a.d(this.f17127b, Long.hashCode(this.f17126a) * 31, 31);
    }
}
