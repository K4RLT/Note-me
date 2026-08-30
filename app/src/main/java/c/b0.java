package c;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df.a f3213b;

    public /* synthetic */ b0(int i, df.a aVar) {
        this.f3212a = i;
        this.f3213b = aVar;
    }

    public final void onBackInvoked() {
        switch (this.f3212a) {
            case 0:
                ((a0) this.f3213b).invoke();
                return;
            default:
                df.a aVar = this.f3213b;
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
        }
    }
}
