package oc;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class m implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f21896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f21897b;

    public m(n nVar, long j10) {
        this.f21897b = nVar;
        this.f21896a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f21896a);
        this.f21897b.f21907k.k(bundle);
        return null;
    }
}
