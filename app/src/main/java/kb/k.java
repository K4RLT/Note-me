package kb;

import c7.a0;

/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f19750v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f19751w;

    public /* synthetic */ k(int i, Object obj) {
        this.f19750v = i;
        this.f19751w = obj;
    }

    @Override // kb.i
    public final void a() {
        switch (this.f19750v) {
            case 0:
                synchronized (((m) this.f19751w).f19759f) {
                    try {
                        if (((m) this.f19751w).f19763k.get() > 0 && ((m) this.f19751w).f19763k.decrementAndGet() > 0) {
                            ((m) this.f19751w).f19756b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        m mVar = (m) this.f19751w;
                        if (mVar.f19765m != null) {
                            mVar.f19756b.a("Unbind from service.", new Object[0]);
                            m mVar2 = (m) this.f19751w;
                            mVar2.f19755a.unbindService(mVar2.f19764l);
                            m mVar3 = (m) this.f19751w;
                            mVar3.f19760g = false;
                            mVar3.f19765m = null;
                            mVar3.f19764l = null;
                        }
                        ((m) this.f19751w).d();
                        return;
                    } finally {
                    }
                }
            default:
                m mVar4 = (m) ((a0) this.f19751w).f3898v;
                mVar4.f19756b.a("unlinkToDeath", new Object[0]);
                mVar4.f19765m.asBinder().unlinkToDeath(mVar4.f19762j, 0);
                mVar4.f19765m = null;
                mVar4.f19760g = false;
                return;
        }
    }
}
