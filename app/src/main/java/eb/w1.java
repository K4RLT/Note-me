package eb;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class w1 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16445u = 0;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ AtomicReference f16446v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ t1 f16447w;

    public w1(t1 t1Var, AtomicReference atomicReference) {
        this.f16446v = atomicReference;
        this.f16447w = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16445u) {
            case 0:
                t1 t1Var = this.f16447w;
                AtomicReference atomicReference = this.f16446v;
                Bundle n10 = t1Var.s().J.n();
                n2 p10 = ((d1) t1Var.f3443v).p();
                if (n10 == null) {
                    n10 = new Bundle();
                }
                p10.u();
                p10.y();
                p10.D(new b9.a(p10, atomicReference, p10.P(false), n10, 3, false));
                return;
            default:
                synchronized (this.f16446v) {
                    try {
                        try {
                            AtomicReference atomicReference2 = this.f16446v;
                            d1 d1Var = (d1) this.f16447w.f3443v;
                            atomicReference2.set(Double.valueOf(d1Var.A.v(d1Var.m().B(), v.O)));
                        } finally {
                            this.f16446v.notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public /* synthetic */ w1() {
    }
}
