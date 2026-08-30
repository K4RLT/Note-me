package eb;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class y1 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16461u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f16462v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t1 f16463w;

    public /* synthetic */ y1(t1 t1Var, AtomicReference atomicReference, int i) {
        this.f16461u = i;
        this.f16462v = atomicReference;
        this.f16463w = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16461u) {
            case 0:
                synchronized (this.f16462v) {
                    try {
                        try {
                            AtomicReference atomicReference = this.f16462v;
                            d1 d1Var = (d1) this.f16463w.f3443v;
                            e eVar = d1Var.A;
                            String B = d1Var.m().B();
                            eVar.getClass();
                            atomicReference.set(Boolean.valueOf(eVar.F(B, v.K)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.f16462v) {
                    try {
                        try {
                            AtomicReference atomicReference2 = this.f16462v;
                            d1 d1Var2 = (d1) this.f16463w.f3443v;
                            atomicReference2.set(Long.valueOf(d1Var2.A.A(d1Var2.m().B(), v.M)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
