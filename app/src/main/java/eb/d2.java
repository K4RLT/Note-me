package eb;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d2 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16108u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f16109v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t1 f16110w;

    public /* synthetic */ d2(t1 t1Var, AtomicReference atomicReference, int i) {
        this.f16108u = i;
        this.f16109v = atomicReference;
        this.f16110w = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16108u) {
            case 0:
                synchronized (this.f16109v) {
                    try {
                        try {
                            AtomicReference atomicReference = this.f16109v;
                            d1 d1Var = (d1) this.f16110w.f3443v;
                            e eVar = d1Var.A;
                            String B = d1Var.m().B();
                            eVar.getClass();
                            atomicReference.set(eVar.C(B, v.L));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.f16109v) {
                    try {
                        try {
                            AtomicReference atomicReference2 = this.f16109v;
                            d1 d1Var2 = (d1) this.f16110w.f3443v;
                            atomicReference2.set(Integer.valueOf(d1Var2.A.z(d1Var2.m().B(), v.N)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
