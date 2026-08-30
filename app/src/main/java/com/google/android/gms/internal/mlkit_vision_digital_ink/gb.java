package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class gb extends xa {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f14370w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ hb f14371x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f14372y;

    public gb(hb hbVar, Callable callable) {
        this.f14371x = hbVar;
        callable.getClass();
        this.f14372y = callable;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.xa
    public final Object a() {
        switch (this.f14370w) {
            case 0:
                da daVar = (da) this.f14372y;
                ya zza = daVar.zza();
                pa.o(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", daVar);
                return zza;
            default:
                return ((Callable) this.f14372y).call();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.xa
    public final String b() {
        switch (this.f14370w) {
            case 0:
                return ((da) this.f14372y).toString();
            default:
                return ((Callable) this.f14372y).toString();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.xa
    public final void d(Throwable th) {
        switch (this.f14370w) {
            case 0:
                this.f14371x.o(th);
                return;
            default:
                this.f14371x.o(th);
                return;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.xa
    public final void e(Object obj) {
        switch (this.f14370w) {
            case 0:
                this.f14371x.f((ya) obj);
                return;
            default:
                this.f14371x.n(obj);
                return;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.xa
    public final boolean f() {
        switch (this.f14370w) {
            case 0:
                return this.f14371x.isDone();
            default:
                return this.f14371x.isDone();
        }
    }

    public gb(hb hbVar, da daVar) {
        this.f14371x = hbVar;
        this.f14372y = daVar;
    }
}
