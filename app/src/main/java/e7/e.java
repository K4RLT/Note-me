package e7;

import android.util.Log;

/* loaded from: classes.dex */
public final /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f15944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d7.a f15945b;

    public /* synthetic */ e(kotlin.jvm.internal.u uVar, d7.a aVar) {
        this.f15944a = uVar;
        this.f15945b = aVar;
    }

    public final void a(c7.a aVar) {
        if (aVar != null) {
            Log.d("AdsConsent", "formulario: " + aVar.f3896v);
        }
        kotlin.jvm.internal.u uVar = this.f15944a;
        if (!uVar.f19783u) {
            uVar.f19783u = true;
            this.f15945b.invoke();
        }
    }
}
