package mb;

import c7.a0;

/* loaded from: classes.dex */
public final class m extends l {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f20777v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f20778w;

    public /* synthetic */ m(int i, Object obj) {
        this.f20777v = i;
        this.f20778w = obj;
    }

    @Override // mb.l
    public final void a() {
        switch (this.f20777v) {
            case 0:
                synchronized (((n) this.f20778w).f20784f) {
                    try {
                        if (((n) this.f20778w).f20788k.get() > 0 && ((n) this.f20778w).f20788k.decrementAndGet() > 0) {
                            ((n) this.f20778w).f20781b.e("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        n nVar = (n) this.f20778w;
                        if (nVar.f20790m != null) {
                            nVar.f20781b.e("Unbind from service.", new Object[0]);
                            n nVar2 = (n) this.f20778w;
                            nVar2.f20780a.unbindService(nVar2.f20789l);
                            n nVar3 = (n) this.f20778w;
                            nVar3.f20785g = false;
                            nVar3.f20790m = null;
                            nVar3.f20789l = null;
                        }
                        ((n) this.f20778w).e();
                        return;
                    } finally {
                    }
                }
            default:
                n nVar4 = (n) ((a0) this.f20778w).f3898v;
                nVar4.f20781b.e("unlinkToDeath", new Object[0]);
                nVar4.f20790m.asBinder().unlinkToDeath(nVar4.f20787j, 0);
                nVar4.f20790m = null;
                nVar4.f20785g = false;
                return;
        }
    }
}
