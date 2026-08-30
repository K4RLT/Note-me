package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13478u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f13479v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f13480w;

    public /* synthetic */ l(Object obj, int i, Object obj2) {
        this.f13478u = i;
        this.f13479v = obj;
        this.f13480w = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean booleanValue;
        switch (this.f13478u) {
            case 0:
                n nVar = (n) this.f13479v;
                k kVar = (k) this.f13480w;
                AtomicReference atomicReference = nVar.f13497d;
                Objects.requireNonNull(atomicReference);
                kVar.a(new a6(1, atomicReference), new j4(22));
                return;
            default:
                q qVar = (q) this.f13479v;
                String str = (String) this.f13480w;
                synchronized (f0.class) {
                    if (f0.f13403a == null) {
                        try {
                            qVar.evaluateJavascript("(function(){})()", null);
                            f0.f13403a = Boolean.TRUE;
                        } catch (IllegalStateException unused) {
                            f0.f13403a = Boolean.FALSE;
                        }
                    }
                    booleanValue = f0.f13403a.booleanValue();
                }
                if (booleanValue) {
                    qVar.evaluateJavascript(str, null);
                    return;
                } else {
                    qVar.loadUrl("javascript:".concat(str));
                    return;
                }
        }
    }
}
