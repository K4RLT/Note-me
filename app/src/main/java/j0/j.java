package j0;
import a.a;
import r.f;

import g0.p0;
import k0.a1;
import n.a0;
import r0.v1;
import v1.d0;

/* loaded from: classes.dex */
public final class j implements v1 {

    /* renamed from: u, reason: collision with root package name */
    public final long f18733u;

    /* renamed from: v, reason: collision with root package name */
    public final a1 f18734v;

    /* renamed from: w, reason: collision with root package name */
    public final long f18735w;

    /* renamed from: x, reason: collision with root package name */
    public l f18736x = l.f18743c;

    /* renamed from: y, reason: collision with root package name */
    public k0.n f18737y;

    /* renamed from: z, reason: collision with root package name */
    public final d1.r f18738z;

    /* JADX WARN: Type inference failed for: r0v0, types: [k0.l, com.google.android.gms.internal.ads.d6, java.lang.Object] */
    public j(long j10, a1 a1Var, long j11) {
        this.f18733u = j10;
        this.f18734v = a1Var;
        this.f18735w = j11;
        i iVar = new i(this, 0);
        k kVar = new k(iVar, a1Var, j10);
        Object obj = new Object();
        obj.f5317w = iVar;
        obj.f5318x = a1Var;
        obj.f5316v = j10;
        obj.f5315u = 0L;
        this.f18738z = v1.f(d0.c(d1.o.f15687a, obj, kVar, new p0(obj, kVar)), g0.a1.f17012b);
    }

    @Override // r0.v1
    public final void a() {
        k0.n nVar = this.f18737y;
        if (nVar != null) {
            this.f18734v.d(nVar);
            this.f18737y = null;
        }
    }

    @Override // r0.v1
    public final void b() {
        k0.n nVar = this.f18737y;
        if (nVar != null) {
            this.f18734v.d(nVar);
            this.f18737y = null;
        }
    }

    @Override // r0.v1
    public final void d() {
        i iVar = new i(this, 1);
        i iVar2 = new i(this, 2);
        long j10 = this.f18733u;
        k0.n nVar = new k0.n(j10, iVar, iVar2);
        a1 a1Var = this.f18734v;
        a0 a0Var = a1Var.f19219c;
        if (j10 == 0) {
            w.a("The selectable contains an invalid id: " + j10);
        }
        if (a0Var.b(j10)) {
            w.a("Another selectable with the id: " + nVar + ".selectableId has already subscribed.");
        }
        a0Var.h(j10, nVar);
        a1Var.f19218b.add(nVar);
        a1Var.f19217a = false;
        this.f18737y = nVar;
    }
}