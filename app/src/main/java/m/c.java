package m;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f20401u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f20402v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Bundle f20403w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f20404x;

    public /* synthetic */ c(e eVar, String str, Bundle bundle, int i) {
        this.f20401u = i;
        this.f20404x = eVar;
        this.f20402v = str;
        this.f20403w = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20401u) {
            case 0:
                this.f20404x.f20411v.a(this.f20402v, this.f20403w);
                return;
            default:
                this.f20404x.f20411v.f(this.f20402v, this.f20403w);
                return;
        }
    }
}
