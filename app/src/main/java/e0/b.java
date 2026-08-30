package e0;

import df.l;
import j2.g;
import j2.j;
import j2.s;
import j2.u;
import j2.v;
import r.q;
import v.i;

/* loaded from: classes.dex */
public final class b extends q {

    /* renamed from: b0, reason: collision with root package name */
    public boolean f15866b0;

    /* renamed from: c0, reason: collision with root package name */
    public l f15867c0;

    /* renamed from: d0, reason: collision with root package name */
    public final a2.c f15868d0;

    public b(boolean z3, i iVar, boolean z9, g gVar, l lVar) {
        super(iVar, null, z9, null, gVar, new a(lVar, z3, 0));
        this.f15866b0 = z3;
        this.f15867c0 = lVar;
        this.f15868d0 = new a2.c(9, this);
    }

    @Override // r.d
    public final void b1(j jVar) {
        l2.a aVar;
        if (this.f15866b0) {
            aVar = l2.a.f19880u;
        } else {
            aVar = l2.a.f19881v;
        }
        kf.g[] gVarArr = u.f18865a;
        v vVar = s.I;
        kf.g gVar = u.f18865a[24];
        jVar.k(vVar, aVar);
    }
}
