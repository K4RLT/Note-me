package f4;

import j6.n;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16704u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f16705v;

    public /* synthetic */ a(d dVar, int i) {
        this.f16704u = i;
        this.f16705v = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16704u) {
            case 0:
                this.f16705v.E.onDismiss(null);
                return;
            default:
                d dVar = this.f16705v;
                if (dVar.f16713y != null) {
                    if (dVar.f16713y == null) {
                        n nVar = new n(5);
                        Object obj = d.J;
                        nVar.f18938v = obj;
                        nVar.f18939w = obj;
                        nVar.f18940x = obj;
                        nVar.f18941y = null;
                        dVar.f16713y = nVar;
                    }
                    dVar.f16713y.getClass();
                    return;
                }
                return;
        }
    }
}
