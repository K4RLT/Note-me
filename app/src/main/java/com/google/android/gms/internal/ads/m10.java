package com.google.android.gms.internal.ads;
import f9.e;
import f9.k;
import k9.f0;
import l9.a;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class m10 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8201a;

    /* renamed from: b, reason: collision with root package name */
    public final k10 f8202b;

    public /* synthetic */ m10(k10 k10Var, int i) {
        this.f8201a = i;
        this.f8202b = k10Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f8201a) {
            case 0:
                k10 k10Var = this.f8202b;
                return new j10((Context) k10Var.f7600c, (a) k10Var.f7599b);
            case 1:
                Context context = (Context) this.f8202b.f7600c;
                lo1.b(context);
                return context;
            case 2:
                WeakReference weakReference = (WeakReference) this.f8202b.e;
                lo1.b(weakReference);
                return weakReference;
            case 3:
                return new ju0((Context) this.f8202b.f7600c);
            case 4:
                k10 k10Var2 = this.f8202b;
                return new e((Context) k10Var2.f7600c, (a) k10Var2.f7599b);
            case 5:
                f0 f0Var = k.C.f16813c;
                k10 k10Var3 = this.f8202b;
                String E = f0Var.E((Context) k10Var3.f7600c, ((a) k10Var3.f7599b).f20029u);
                lo1.b(E);
                return E;
            default:
                return Long.valueOf(this.f8202b.f7601d);
        }
    }
}
