package vb;

import c7.a0;

/* loaded from: classes.dex */
public final class g extends e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f27518v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f27519w;

    public /* synthetic */ g(int i, Object obj) {
        this.f27518v = i;
        this.f27519w = obj;
    }

    @Override // vb.e
    public final void a() {
        switch (this.f27518v) {
            case 0:
                synchronized (((h) this.f27519w).f27525f) {
                    try {
                        if (((h) this.f27519w).f27529k.get() > 0 && ((h) this.f27519w).f27529k.decrementAndGet() > 0) {
                            ((h) this.f27519w).f27522b.n("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        h hVar = (h) this.f27519w;
                        if (hVar.f27531m != null) {
                            hVar.f27522b.n("Unbind from service.", new Object[0]);
                            h hVar2 = (h) this.f27519w;
                            hVar2.f27521a.unbindService(hVar2.f27530l);
                            h hVar3 = (h) this.f27519w;
                            hVar3.f27526g = false;
                            hVar3.f27531m = null;
                            hVar3.f27530l = null;
                        }
                        ((h) this.f27519w).c();
                        return;
                    } finally {
                    }
                }
            default:
                h hVar4 = (h) ((a0) this.f27519w).f3898v;
                hVar4.f27522b.n("unlinkToDeath", new Object[0]);
                hVar4.f27531m.asBinder().unlinkToDeath(hVar4.f27528j, 0);
                hVar4.f27531m = null;
                hVar4.f27526g = false;
                return;
        }
    }
}
