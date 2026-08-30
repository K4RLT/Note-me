package vb;

import com.google.android.gms.internal.ads.x90;

/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ib.h f27515v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ub.d f27516w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f27517x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, ib.h hVar2, ib.h hVar3, ub.d dVar) {
        super(hVar2);
        this.f27515v = hVar3;
        this.f27516w = dVar;
        this.f27517x = hVar;
    }

    @Override // vb.e
    public final void a() {
        synchronized (this.f27517x.f27525f) {
            try {
                h hVar = this.f27517x;
                ib.h hVar2 = this.f27515v;
                hVar.e.add(hVar2);
                hVar2.f18363a.b(new x90(hVar, 20, hVar2));
                if (this.f27517x.f27529k.getAndIncrement() > 0) {
                    this.f27517x.f27522b.n("Already connected to the service.", new Object[0]);
                }
                h.b(this.f27517x, this.f27516w);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
