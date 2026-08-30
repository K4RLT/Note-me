package n0;
import f.a;
import b.a;

import android.view.ViewGroup;
import b2.l0;
import java.util.LinkedHashMap;
import k1.r;
import r.m0;
import r0.a1;
import r0.i1;
import r0.v1;
import r0.y;

/* loaded from: classes.dex */
public final class a implements v1, h, m0 {
    public final ViewGroup A;
    public g B;
    public final i1 C = y.B(null);
    public final i1 D = y.B(Boolean.TRUE);
    public long E = 0;
    public int F = -1;
    public final a2.c G = new a2.c(21, this);

    /* renamed from: u, reason: collision with root package name */
    public final boolean f20966u;

    /* renamed from: v, reason: collision with root package name */
    public final o f20967v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f20968w;

    /* renamed from: x, reason: collision with root package name */
    public final float f20969x;

    /* renamed from: y, reason: collision with root package name */
    public final a1 f20970y;

    /* renamed from: z, reason: collision with root package name */
    public final a1 f20971z;

    public a(boolean z3, float f10, a1 a1Var, a1 a1Var2, ViewGroup viewGroup) {
        this.f20966u = z3;
        this.f20967v = new o(z3, new a0.n(a1Var2, 4));
        this.f20968w = z3;
        this.f20969x = f10;
        this.f20970y = a1Var;
        this.f20971z = a1Var2;
        this.A = viewGroup;
    }

    @Override // n0.h
    public final void Q() {
        this.C.setValue(null);
    }

    @Override // r0.v1
    public final void a() {
        g gVar = this.B;
        if (gVar != null) {
            Q();
            j6.l lVar = gVar.f20984x;
            i iVar = (i) ((LinkedHashMap) lVar.f18933v).get(this);
            if (iVar != null) {
                iVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) lVar.f18933v;
                i iVar2 = (i) linkedHashMap.get(this);
                if (iVar2 != null) {
                }
                linkedHashMap.remove(this);
                gVar.f20983w.add(iVar);
            }
        }
    }

    @Override // r0.v1
    public final void b() {
        g gVar = this.B;
        if (gVar != null) {
            Q();
            j6.l lVar = gVar.f20984x;
            i iVar = (i) ((LinkedHashMap) lVar.f18933v).get(this);
            if (iVar != null) {
                iVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) lVar.f18933v;
                i iVar2 = (i) linkedHashMap.get(this);
                if (iVar2 != null) {
                }
                linkedHashMap.remove(this);
                gVar.f20983w.add(iVar);
            }
        }
    }

    @Override // r.m0
    public final void c(l0 l0Var) {
        int t02;
        float l0;
        m1.b bVar = l0Var.f1533u;
        this.E = bVar.e();
        float f10 = this.f20969x;
        if (Float.isNaN(f10)) {
            t02 = ff.a.b(f.a(l0Var, this.f20968w, bVar.e()));
        } else {
            t02 = bVar.t0(f10);
        }
        this.F = t02;
        long j10 = ((r) this.f20970y.getValue()).f19523a;
        float f11 = ((e) this.f20971z.getValue()).f20979d;
        l0Var.b();
        if (Float.isNaN(f10)) {
            l0 = f.a(l0Var, this.f20966u, bVar.e());
        } else {
            l0 = l0Var.l0(f10);
        }
        this.f20967v.a(l0Var, l0, j10);
        k1.p j11 = bVar.f20424v.j();
        ((Boolean) this.D.getValue()).booleanValue();
        i iVar = (i) this.C.getValue();
        if (iVar != null) {
            iVar.e(bVar.e(), j10, this.F, f11);
            iVar.draw(k1.b.a(j11));
        }
    }

    @Override // r0.v1
    public final void d() {
    }
}
