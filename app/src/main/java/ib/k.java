package ib;

import com.google.android.gms.internal.ads.iv1;
import com.google.android.gms.internal.ads.pu1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k implements m, e, d, b {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18372u;

    /* renamed from: v, reason: collision with root package name */
    public final Executor f18373v;

    /* renamed from: w, reason: collision with root package name */
    public final a f18374w;

    /* renamed from: x, reason: collision with root package name */
    public final o f18375x;

    public /* synthetic */ k(Executor executor, a aVar, o oVar, int i) {
        this.f18372u = i;
        this.f18373v = executor;
        this.f18374w = aVar;
        this.f18375x = oVar;
    }

    @Override // ib.b
    public void a() {
        this.f18375x.q();
    }

    @Override // ib.m
    public final void b(o oVar) {
        switch (this.f18372u) {
            case 0:
                this.f18373v.execute(new pu1(15, this, oVar, false));
                return;
            default:
                this.f18373v.execute(new iv1(16, this, oVar, false));
                return;
        }
    }

    @Override // ib.m
    public final void c() {
        switch (this.f18372u) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // ib.e
    public void d(Object obj) {
        this.f18375x.p(obj);
    }

    @Override // ib.d
    public void w(Exception exc) {
        this.f18375x.o(exc);
    }
}
