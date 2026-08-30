package uf;

import com.google.android.gms.internal.ads.pu;
import pf.b0;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27216u = 0;

    /* renamed from: v, reason: collision with root package name */
    public Object f27217v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f27218w;

    public /* synthetic */ g(z8.k kVar, z8.g gVar) {
        this.f27217v = kVar;
        this.f27218w = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27216u) {
            case 0:
                h hVar = (h) this.f27218w;
                pf.v vVar = hVar.f27220x;
                int i = 0;
                while (true) {
                    try {
                        ((Runnable) this.f27217v).run();
                    } catch (Throwable th) {
                        b0.r(th, te.h.f25707u);
                    }
                    Runnable a02 = hVar.a0();
                    if (a02 != null) {
                        this.f27217v = a02;
                        i++;
                        if (i >= 16 && vVar.Y(hVar)) {
                            vVar.W(hVar, this);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
            default:
                z8.g gVar = (z8.g) this.f27218w;
                z8.k kVar = (z8.k) this.f27217v;
                try {
                    kVar.f31994u.g(gVar.f31983a);
                    return;
                } catch (IllegalStateException e) {
                    pu.a(kVar.getContext()).c("BaseAdView.loadAd", e);
                    return;
                }
        }
    }

    public g(h hVar, Runnable runnable) {
        this.f27218w = hVar;
        this.f27217v = runnable;
    }
}
