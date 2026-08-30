package z1;
import a.a;
import n.i0;
import t0.b;
import t0.e;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b0 implements l1, r0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e0 f31775u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j0 f31776v;

    public b0(j0 j0Var) {
        this.f31776v = j0Var;
        this.f31775u = j0Var.B;
    }

    @Override // y2.c
    public final long B0(long j10) {
        return this.f31775u.B0(j10);
    }

    @Override // y2.c
    public final float D0(long j10) {
        return this.f31775u.D0(j10);
    }

    @Override // y2.c
    public final long R(float f10) {
        return this.f31775u.R(f10);
    }

    @Override // z1.l1
    public final List V(df.p pVar, Object obj) {
        c0 c0Var;
        j0 j0Var = this.f31776v;
        b2.i0 i0Var = j0Var.f31828u;
        b2.i0 i0Var2 = (b2.i0) j0Var.A.g(obj);
        if (i0Var2 != null && ((b) i0Var.o()).f25611u.l(i0Var2) < j0Var.f31831x) {
            return i0Var2.m();
        }
        i0 i0Var3 = j0Var.D;
        e eVar = j0Var.G;
        if (eVar.f25619w < j0Var.f31832y) {
            y1.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int i = eVar.f25619w;
        int i10 = j0Var.f31832y;
        if (i == i10) {
            eVar.b(obj);
        } else {
            Object[] objArr = eVar.f25617u;
            Object obj2 = objArr[i10];
            objArr[i10] = obj;
        }
        j0Var.f31832y++;
        if (!i0Var3.b(obj)) {
            j0Var.F.m(obj, j0Var.f(pVar, obj));
            if (i0Var.f1478a0.f1548d == b2.e0.f1445w) {
                i0Var.S(true);
            } else {
                b2.i0.T(i0Var, true, 6);
            }
        } else {
            b2.i0 i0Var4 = (b2.i0) i0Var3.g(obj);
            if (i0Var4 != null) {
                c0Var = (c0) j0Var.f31833z.g(i0Var4);
            } else {
                c0Var = null;
            }
            if (c0Var != null && c0Var.f31785d) {
                j0Var.h(i0Var4, obj, pVar);
            }
        }
        b2.i0 i0Var5 = (b2.i0) i0Var3.g(obj);
        if (i0Var5 != null) {
            List C0 = i0Var5.f1478a0.f1558p.C0();
            int size = C0.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((b2.a1) ((b) C0).get(i11)).f1420z.f1546b = true;
            }
            return C0;
        }
        return qe.s.f24023u;
    }

    @Override // y2.c
    public final float Y(int i) {
        return this.f31775u.Y(i);
    }

    @Override // y2.c
    public final float a() {
        return this.f31775u.f31802v;
    }

    @Override // y2.c
    public final float a0(float f10) {
        return f10 / this.f31775u.a();
    }

    @Override // z1.t
    public final y2.m getLayoutDirection() {
        return this.f31775u.f31801u;
    }

    @Override // y2.c
    public final float i0() {
        return this.f31775u.f31803w;
    }

    @Override // z1.t
    public final boolean j0() {
        return this.f31775u.j0();
    }

    @Override // y2.c
    public final float l0(float f10) {
        return this.f31775u.a() * f10;
    }

    @Override // y2.c
    public final long o(float f10) {
        return this.f31775u.o(f10);
    }

    @Override // y2.c
    public final long p(long j10) {
        return this.f31775u.p(j10);
    }

    @Override // y2.c
    public final int t0(float f10) {
        return this.f31775u.t0(f10);
    }

    @Override // z1.r0
    public final q0 u0(int i, int i10, Map map, df.l lVar) {
        return this.f31775u.y(i, i10, map, null, lVar);
    }

    @Override // y2.c
    public final float x(long j10) {
        return this.f31775u.x(j10);
    }

    @Override // z1.r0
    public final q0 y(int i, int i10, Map map, df.l lVar, df.l lVar2) {
        return this.f31775u.y(i, i10, map, lVar, lVar2);
    }
}
