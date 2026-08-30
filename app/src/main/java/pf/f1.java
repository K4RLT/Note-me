package pf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class f1 extends k1 implements r {

    /* renamed from: w, reason: collision with root package name */
    public final boolean f22746w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(d1 d1Var) {
        super(true);
        p pVar;
        p pVar2;
        boolean z3 = true;
        S(d1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k1.f22763v;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        if (oVar instanceof p) {
            pVar = (p) oVar;
        } else {
            pVar = null;
        }
        if (pVar != null) {
            k1 j10 = pVar.j();
            while (!j10.I()) {
                o oVar2 = (o) atomicReferenceFieldUpdater.get(j10);
                if (oVar2 instanceof p) {
                    pVar2 = (p) oVar2;
                } else {
                    pVar2 = null;
                }
                if (pVar2 != null) {
                    j10 = pVar2.j();
                }
            }
            this.f22746w = z3;
        }
        z3 = false;
        this.f22746w = z3;
    }

    @Override // pf.k1
    public final boolean I() {
        return this.f22746w;
    }

    @Override // pf.k1
    public final boolean J() {
        return true;
    }
}
