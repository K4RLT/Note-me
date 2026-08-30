package b2;
import b2.r0;
import j.a;
import j.c;
import l.a;
import n.c0;
import n.m0;
import z1.a1;
import z1.l0;
import z1.o0;
import z1.q0;
import z1.t;
import z1.x;

import com.google.android.gms.internal.ads.wd0;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class s0 extends r0 implements o0 {
    public final k1 I;
    public LinkedHashMap K;
    public q0 M;
    public final c0 N;
    public long J = 0;
    public final l0 L = new l0(this);

    public s0(k1 k1Var) {
        this.I = k1Var;
        c0 c0Var = m0.f20916a;
        this.N = new c0();
    }

    public static final void W0(s0 s0Var, q0 q0Var) {
        LinkedHashMap linkedHashMap;
        if (q0Var != null) {
            s0Var.x0((q0Var.getHeight() & 4294967295L) | (q0Var.getWidth() << 32));
        } else {
            s0Var.x0(0L);
        }
        if (!kotlin.jvm.internal.a(s0Var.M, q0Var) && q0Var != null && ((((linkedHashMap = s0Var.K) != null && !linkedHashMap.isEmpty()) || !q0Var.b().isEmpty()) && !kotlin.jvm.internal.a(q0Var.b(), s0Var.K))) {
            w0 w0Var = s0Var.I.I.f1478a0.f1559q;
            w0Var.getClass();
            w0Var.K.f();
            LinkedHashMap linkedHashMap2 = s0Var.K;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                s0Var.K = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(q0Var.b());
        }
        s0Var.M = q0Var;
    }

    @Override // a1, o0
    public final Object H() {
        return this.I.H();
    }

    @Override // r0
    public final r0 L0() {
        k1 k1Var = this.I.L;
        if (k1Var != null) {
            return k1Var.f1();
        }
        return null;
    }

    @Override // r0
    public final x M0() {
        return this.L;
    }

    @Override // r0
    public final boolean N0() {
        if (this.M != null) {
            return true;
        }
        return false;
    }

    @Override // r0
    public final i0 O0() {
        return this.I.I;
    }

    @Override // r0
    public final q0 P0() {
        q0 q0Var = this.M;
        if (q0Var != null) {
            return q0Var;
        }
        throw wd0.m("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // r0
    public final r0 Q0() {
        k1 k1Var = this.I.M;
        if (k1Var != null) {
            return k1Var.f1();
        }
        return null;
    }

    @Override // r0
    public final long R0() {
        return this.J;
    }

    @Override // r0
    public final void V0() {
        r0(this.J, 0.0f, null);
    }

    public final long X0() {
        return (this.f31770v & 4294967295L) | (this.f31769u << 32);
    }

    public void Y0() {
        P0().a();
    }

    public final void Z0(long j10) {
        if (!y2.a(this.J, j10)) {
            this.J = j10;
            k1 k1Var = this.I;
            w0 w0Var = k1Var.I.f1478a0.f1559q;
            if (w0Var != null) {
                w0Var.G0();
            }
            r0.T0(k1Var);
        }
        if (!this.E) {
            H0(P0());
        }
    }

    @Override // y2.c
    public final float a() {
        return this.I.a();
    }

    public final long a1(s0 s0Var, boolean z3) {
        long j10 = 0;
        s0 s0Var2 = this;
        while (!s0Var2.equals(s0Var)) {
            if (!s0Var2.C || !z3) {
                j10 = y2.c(j10, s0Var2.J);
            }
            k1 k1Var = s0Var2.I.M;
            k1Var.getClass();
            s0Var2 = k1Var.f1();
            s0Var2.getClass();
        }
        return j10;
    }

    @Override // t
    public final y2.m getLayoutDirection() {
        return this.I.I.T;
    }

    @Override // y2.c
    public final float i0() {
        return this.I.i0();
    }

    @Override // r0, t
    public final boolean j0() {
        return true;
    }

    @Override // a1
    public final void r0(long j10, float f10, df.l lVar) {
        Z0(j10);
        if (this.D) {
            return;
        }
        Y0();
    }
}
