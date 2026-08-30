package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* loaded from: classes.dex */
public final class jg implements AppOpsManager$OnOpActiveChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7437a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7438b;

    public /* synthetic */ jg(int i, Object obj) {
        this.f7437a = i;
        this.f7438b = obj;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z3) {
        switch (this.f7437a) {
            case 0:
                kg kgVar = (kg) this.f7438b;
                if (z3) {
                    kgVar.f7733a = System.currentTimeMillis();
                    kgVar.f7736d = true;
                    return;
                }
                long j10 = kgVar.f7734b;
                long currentTimeMillis = System.currentTimeMillis();
                if (j10 > 0) {
                    long j11 = kgVar.f7734b;
                    if (currentTimeMillis >= j11) {
                        kgVar.f7735c = currentTimeMillis - j11;
                    }
                }
                kgVar.f7736d = false;
                return;
            default:
                f21 f21Var = (f21) this.f7438b;
                synchronized (f21Var) {
                    try {
                        if (z3) {
                            f21Var.f5895c = System.currentTimeMillis();
                            f21Var.f5897f = true;
                        } else {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            long j12 = f21Var.f5896d;
                            if (j12 > 0 && currentTimeMillis2 >= j12) {
                                f21Var.e = currentTimeMillis2 - j12;
                            }
                            f21Var.f5897f = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
