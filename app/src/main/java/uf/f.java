package uf;
import l.a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pf.b0;
import pf.j0;
import pf.q0;
import pf.u1;

/* loaded from: classes.dex */
public final class f extends j0 implements ve.d, te.c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    public final Object A;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: x, reason: collision with root package name */
    public final pf.v f27213x;

    /* renamed from: y, reason: collision with root package name */
    public final ve.c f27214y;

    /* renamed from: z, reason: collision with root package name */
    public Object f27215z;

    public f(pf.v vVar, ve.c cVar) {
        super(-1);
        this.f27213x = vVar;
        this.f27214y = cVar;
        this.f27215z = a.f27203b;
        this.A = a.k(cVar.getContext());
    }

    @Override // ve.d
    public final ve.d getCallerFrame() {
        return this.f27214y;
    }

    @Override // te.c
    public final te.g getContext() {
        return this.f27214y.getContext();
    }

    @Override // pf.j0
    public final Object j() {
        Object obj = this.f27215z;
        this.f27215z = a.f27203b;
        return obj;
    }

    @Override // te.c
    public final void resumeWith(Object obj) {
        Object tVar;
        Throwable a10 = pe.a(obj);
        if (a10 == null) {
            tVar = obj;
        } else {
            tVar = new pf.t(a10, false);
        }
        ve.c cVar = this.f27214y;
        te.g context = cVar.getContext();
        pf.v vVar = this.f27213x;
        if (vVar.Y(context)) {
            this.f27215z = tVar;
            this.f22757w = 0;
            vVar.W(cVar.getContext(), this);
            return;
        }
        q0 a11 = u1.a();
        if (a11.f22781w >= 4294967296L) {
            this.f27215z = tVar;
            this.f22757w = 0;
            a11.b0(this);
            return;
        }
        a11.c0(true);
        try {
            te.g context2 = cVar.getContext();
            Object l10 = a.l(context2, this.A);
            try {
                cVar.resumeWith(obj);
                do {
                } while (a11.e0());
            } finally {
                a.g(context2, l10);
            }
        } catch (Throwable th) {
            try {
                f(th);
            } finally {
                a11.a0(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f27213x + ", " + b0.F(this.f27214y) + ']';
    }

    @Override // pf.j0
    public final te.c c() {
        return this;
    }
}
