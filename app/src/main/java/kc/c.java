package kc;

import c7.t;
import com.google.android.gms.internal.ads.hz;
import nd.o;
import oc.n;
import oc.q;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final q f19770a;

    public c(q qVar) {
        this.f19770a = qVar;
    }

    public final void a(Throwable th) {
        n nVar = this.f19770a.f21922g;
        Thread currentThread = Thread.currentThread();
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        o oVar = nVar.e;
        hz hzVar = new hz(nVar, currentTimeMillis, th, currentThread);
        oVar.getClass();
        oVar.t(new t(4, hzVar));
    }
}
