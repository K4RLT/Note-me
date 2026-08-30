package a0;
import b0.p;

import java.util.Collection;
import t.z0;

/* loaded from: classes.dex */
public final class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f37a;

    public e(l0 l0Var) {
        this.f37a = l0Var;
    }

    @Override // p
    public final int a() {
        return this.f37a.g().f173o;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    @Override // p
    public final int b() {
        return ((a0) qe.l.C(this.f37a.g().f170l)).f3a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List, java.lang.Object] */
    @Override // p
    public final int c() {
        long e;
        boolean z3;
        int i;
        int i10;
        int i11;
        boolean z9;
        long j10;
        l0 l0Var = this.f37a;
        int i12 = 0;
        if (l0Var.g().f170l.isEmpty()) {
            return 0;
        }
        z g8 = l0Var.g();
        z0 z0Var = g8.f174p;
        z0 z0Var2 = z0.f25597u;
        if (z0Var == z0Var2) {
            e = g8.e() & 4294967295L;
        } else {
            e = g8.e() >> 32;
        }
        int i13 = (int) e;
        z g10 = l0Var.g();
        z0 z0Var3 = g10.f174p;
        Object r92 = g10.f170l;
        if (z0Var3 == z0Var2) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < r92.size()) {
            a0 a0Var = (a0) r92.get(i14);
            if (z3) {
                i10 = a0Var.f16p;
            } else {
                i10 = a0Var.f17q;
            }
            if (i10 == -1) {
                i14++;
            } else {
                int i17 = i12;
                while (i14 < r92.size()) {
                    a0 a0Var2 = (a0) r92.get(i14);
                    if (z3) {
                        i11 = a0Var2.f16p;
                    } else {
                        i11 = a0Var2.f17q;
                    }
                    if (i11 != i10) {
                        break;
                    }
                    if (z3) {
                        z9 = z3;
                        j10 = ((a0) r92.get(i14)).f14n & 4294967295L;
                    } else {
                        z9 = z3;
                        j10 = ((a0) r92.get(i14)).f14n >> 32;
                    }
                    i17 = Math.max(i17, (int) j10);
                    i14++;
                    z3 = z9;
                }
                i15 += i17;
                i16++;
                z3 = z3;
                i12 = 0;
            }
        }
        int i18 = (i15 / i16) + g10.f176r;
        if (i18 == 0 || (i = i13 / i18) < 1) {
            return 1;
        }
        return i;
    }

    @Override // p
    public final boolean d() {
        return !((Collection) this.f37a.g().f170l).isEmpty();
    }

    @Override // p
    public final int e() {
        return this.f37a.f89d.f28b.h();
    }
}