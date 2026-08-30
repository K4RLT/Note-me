package pf;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class c extends g1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    public final /* synthetic */ e A;
    private volatile /* synthetic */ Object _disposer$volatile;

    /* renamed from: y, reason: collision with root package name */
    public final l f22733y;

    /* renamed from: z, reason: collision with root package name */
    public n0 f22734z;

    public c(e eVar, l lVar) {
        this.A = eVar;
        this.f22733y = lVar;
    }

    @Override // pf.g1
    public final boolean k() {
        return false;
    }

    @Override // pf.g1
    public final void l(Throwable th) {
        l lVar = this.f22733y;
        if (th != null) {
            lVar.getClass();
            c4.s E = lVar.E(new t(th, false), null);
            if (E != null) {
                lVar.n(E);
                d dVar = (d) B.get(this);
                if (dVar != null) {
                    dVar.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f22740b;
        e eVar = this.A;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            e0[] e0VarArr = eVar.f22741a;
            ArrayList arrayList = new ArrayList(e0VarArr.length);
            for (e0 e0Var : e0VarArr) {
                arrayList.add(e0Var.k());
            }
            lVar.resumeWith(arrayList);
        }
    }
}
