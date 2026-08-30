package z1;
import a.a;
import n.i0;
import t0.b;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e0 implements l1 {

    /* renamed from: u, reason: collision with root package name */
    public y2.m f31801u = y2.m.f30815v;

    /* renamed from: v, reason: collision with root package name */
    public float f31802v;

    /* renamed from: w, reason: collision with root package name */
    public float f31803w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j0 f31804x;

    public e0(j0 j0Var) {
        this.f31804x = j0Var;
    }

    @Override // z1.l1
    public final List V(df.p pVar, Object obj) {
        j0 j0Var = this.f31804x;
        j0Var.d();
        b2.i0 i0Var = j0Var.f31828u;
        b2.e0 e0Var = i0Var.f1478a0.f1548d;
        b2.e0 e0Var2 = b2.e0.f1445w;
        b2.e0 e0Var3 = b2.e0.f1443u;
        if (e0Var != e0Var3 && e0Var != e0Var2 && e0Var != b2.e0.f1444v && e0Var != b2.e0.f1446x) {
            y1.a.b("subcompose can only be used inside the measure or layout blocks");
        }
        i0 i0Var2 = j0Var.A;
        Object g8 = i0Var2.g(obj);
        if (g8 == null) {
            g8 = (b2.i0) j0Var.D.k(obj);
            if (g8 != null) {
                if (j0Var.I <= 0) {
                    y1.a.b("Check failed.");
                }
                j0Var.I--;
            } else {
                g8 = j0Var.i(obj);
                if (g8 == null) {
                    int i = j0Var.f31831x;
                    b2.i0 i0Var3 = new b2.i0(2);
                    i0Var.K = true;
                    i0Var.B(i, i0Var3);
                    i0Var.K = false;
                    g8 = i0Var3;
                }
            }
            i0Var2.m(obj, g8);
        }
        b2.i0 i0Var4 = (b2.i0) g8;
        if (qe.l.y(j0Var.f31831x, i0Var.o()) != i0Var4) {
            int l10 = ((b) i0Var.o()).f25611u.l(i0Var4);
            if (l10 < j0Var.f31831x) {
                y1.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i10 = j0Var.f31831x;
            if (i10 != l10) {
                i0Var.K = true;
                i0Var.M(l10, i10, 1);
                i0Var.K = false;
            }
        }
        j0Var.f31831x++;
        j0Var.h(i0Var4, obj, pVar);
        if (e0Var != e0Var3 && e0Var != e0Var2) {
            return i0Var4.l();
        }
        return i0Var4.m();
    }

    @Override // y2.c
    public final float a() {
        return this.f31802v;
    }

    @Override // z1.t
    public final y2.m getLayoutDirection() {
        return this.f31801u;
    }

    @Override // y2.c
    public final float i0() {
        return this.f31803w;
    }

    @Override // z1.t
    public final boolean j0() {
        b2.e0 e0Var = this.f31804x.f31828u.f1478a0.f1548d;
        if (e0Var != b2.e0.f1446x && e0Var != b2.e0.f1444v) {
            return false;
        }
        return true;
    }

    @Override // z1.r0
    public final q0 y(int i, int i10, Map map, df.l lVar, df.l lVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i10) != 0) {
            y1.a.b("Size(" + i + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new d0(i, i10, map, lVar, this, this.f31804x, lVar2);
    }
}
