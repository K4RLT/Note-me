package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public class l51 extends m41 implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    public final transient d61 f7950x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f7951y;

    /* renamed from: z, reason: collision with root package name */
    public transient k51 f7952z;

    public l51(d61 d61Var, int i) {
        this.f7950x = d61Var;
        this.f7951y = i;
        Object[] objArr = e61.C;
    }

    @Override // com.google.android.gms.internal.ads.l41
    public final /* synthetic */ Collection a() {
        return new h51(this);
    }

    @Override // com.google.android.gms.internal.ads.l41
    public final Map b() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.ads.l41
    public final boolean c(Object obj) {
        if (obj != null && super.c(obj)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.l41
    public /* synthetic */ Map d() {
        return this.f7950x;
    }
}
