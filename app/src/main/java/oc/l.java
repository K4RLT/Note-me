package oc;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class l implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f21893a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f21894b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f21895c;

    public l(n nVar, long j10, String str) {
        this.f21895c = nVar;
        this.f21893a = j10;
        this.f21894b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        n nVar = this.f21895c;
        s sVar = nVar.f21910n;
        if (sVar == null || !sVar.e.get()) {
            ((pc.c) nVar.i.f22657v).i(this.f21893a, this.f21894b);
            return null;
        }
        return null;
    }
}
