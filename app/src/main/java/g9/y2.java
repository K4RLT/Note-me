package g9;

import com.google.android.gms.internal.ads.pq;

/* loaded from: classes.dex */
public final class y2 extends z {

    /* renamed from: u, reason: collision with root package name */
    public final z8.u f17719u;

    /* renamed from: v, reason: collision with root package name */
    public final pq f17720v;

    public y2(z8.u uVar, pq pqVar) {
        this.f17719u = uVar;
        this.f17720v = pqVar;
    }

    @Override // g9.a0
    public final void X0(y1 y1Var) {
        z8.u uVar = this.f17719u;
        if (uVar != null) {
            uVar.a(y1Var.b());
        }
    }

    @Override // g9.a0
    public final void l() {
        pq pqVar;
        z8.u uVar = this.f17719u;
        if (uVar != null && (pqVar = this.f17720v) != null) {
            uVar.b(pqVar);
        }
    }
}
