package com.google.android.gms.internal.ads;
import q.x;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class xy0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yy0 f12664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12665b;

    public /* synthetic */ xy0(yy0 yy0Var, int i) {
        this.f12664a = yy0Var;
        this.f12665b = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.f12665b - 1;
        yy0 yy0Var = this.f12664a;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return (wy0) yy0Var.f13010c.zzb();
                }
                x.m();
                return null;
            }
            return (wy0) yy0Var.f13009b.zzb();
        }
        return (wy0) yy0Var.f13008a.zzb();
    }
}
