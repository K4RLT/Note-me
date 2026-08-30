package va;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ de.k f27502b;

    public /* synthetic */ o(de.k kVar, int i) {
        this.f27501a = i;
        this.f27502b = kVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f27501a) {
            case 0:
                return this.f27502b.a();
            case 1:
                return this.f27502b.a();
            default:
                return this.f27502b.a();
        }
    }
}
