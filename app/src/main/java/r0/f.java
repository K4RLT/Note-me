package r0;
import a1.c;
import n.d0;
import r0.d;
import r0.w0;
import z0.a;

import java.util.concurrent.atomic.AtomicInteger;
import ya.lc;
import ya.rc;

/* loaded from: classes.dex */
public final class f implements w0 {

    /* renamed from: u, reason: collision with root package name */
    public final c f24239u;

    /* renamed from: w, reason: collision with root package name */
    public Throwable f24241w;

    /* renamed from: v, reason: collision with root package name */
    public final Object f24240v = new Object();

    /* renamed from: x, reason: collision with root package name */
    public final a f24242x = new AtomicInteger(0);

    /* renamed from: y, reason: collision with root package name */
    public d0 f24243y = new d0();

    /* renamed from: z, reason: collision with root package name */
    public d0 f24244z = new d0();

    /* JADX WARN: Type inference failed for: r2v2, types: [a, java.util.concurrent.atomic.AtomicInteger] */
    public f(c cVar) {
        this.f24239u = cVar;
    }

    @Override // te.g
    public final Object H(df.p pVar, Object obj) {
        return pVar.invoke(obj, this);
    }

    @Override // te.g
    public final te.e L(te.f fVar) {
        return lc.a(this, fVar);
    }

    @Override // te.g
    public final te.g N(te.f fVar) {
        return lc.b(this, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r9v2, types: [d, java.lang.Object] */
    @Override // w0
    public final Object R(df.l lVar, te.c cVar) {
        int i;
        int i10;
        boolean z3;
        int i11;
        pf.l lVar2 = new pf.l(1, rc.b(cVar));
        lVar2.s();
        Object obj = new Object();
        obj.f24203a = lVar;
        obj.f24204b = lVar2;
        Object obj2 = new Object();
        obj2.f19785u = -1;
        synchronized (this.f24240v) {
            Throwable th = this.f24241w;
            if (th != null) {
                lVar2.resumeWith(new pe.k(th));
            } else {
                a aVar = this.f24242x;
                do {
                    i = aVar.get();
                    i10 = i + 1;
                } while (!aVar.compareAndSet(i, i10));
                if ((134217727 & i10) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                obj2.f19785u = (i10 >>> 27) & 15;
                this.f24243y.a(obj);
                lVar2.u(new e(0, obj, this, obj2));
                if (z3) {
                    try {
                        this.f24239u.invoke();
                    } catch (Throwable th2) {
                        synchronized (this.f24240v) {
                            try {
                                if (this.f24241w == null) {
                                    this.f24241w = th2;
                                    d0 d0Var = this.f24243y;
                                    Object[] objArr = d0Var.f20855a;
                                    int i12 = d0Var.f20856b;
                                    for (int i13 = 0; i13 < i12; i13++) {
                                        pf.l lVar3 = ((d) objArr[i13]).f24204b;
                                        if (lVar3 != null) {
                                            lVar3.resumeWith(new pe.k(th2));
                                        }
                                    }
                                    this.f24243y.c();
                                    a aVar2 = this.f24242x;
                                    do {
                                        i11 = aVar2.get();
                                    } while (!aVar2.compareAndSet(i11, ((((i11 >>> 27) & 15) + 1) & 15) << 27));
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        return lVar2.r();
    }

    @Override // te.g
    public final te.g V(te.g gVar) {
        return lc.c(this, gVar);
    }

    public final void a(long j10) {
        int i;
        pf.l lVar;
        Object kVar;
        synchronized (this.f24240v) {
            try {
                d0 d0Var = this.f24243y;
                this.f24243y = this.f24244z;
                this.f24244z = d0Var;
                a aVar = this.f24242x;
                do {
                    i = aVar.get();
                } while (!aVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i10 = d0Var.f20856b;
                for (int i11 = 0; i11 < i10; i11++) {
                    d dVar = (d) d0Var.e(i11);
                    df.l lVar2 = dVar.f24203a;
                    if (lVar2 != null && (lVar = dVar.f24204b) != null) {
                        try {
                            kVar = lVar2.invoke(Long.valueOf(j10));
                        } catch (Throwable th) {
                            kVar = new pe.k(th);
                        }
                        lVar.resumeWith(kVar);
                    }
                }
                d0Var.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}