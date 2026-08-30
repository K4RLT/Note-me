package c2;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class z0 implements Choreographer.FrameCallback {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ pf.l f3737u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.l f3738v;

    public z0(pf.l lVar, a1 a1Var, df.l lVar2) {
        this.f3737u = lVar;
        this.f3738v = lVar2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        Object kVar;
        try {
            kVar = this.f3738v.invoke(Long.valueOf(j10));
        } catch (Throwable th) {
            kVar = new pe.k(th);
        }
        this.f3737u.resumeWith(kVar);
    }
}
